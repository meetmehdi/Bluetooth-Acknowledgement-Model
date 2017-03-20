package com.pitb.bluetoothmodel;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.Toast;

import com.pitb.bluetoothmodel.constants.Constants;


/**
 * Created by BrOlLy on 28/02/2017.
 */

public class BluetoothManager {

    public static final int REQUEST_CONNECT_DEVICE_SECURE = 1;
    public static final int REQUEST_ENABLE_BT = 3;
    private BluetoothAdapter mBluetoothAdapter = null;
    //private ChatService mChatService = null;
    private ChatService mChatService = null;
    private Context mContext;
//    private Activity mActivity;

    public BluetoothManager(Context context
//            , Activity activity
    ) {
        mContext = context;
//        mActivity = activity;
        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        if (mBluetoothAdapter == null) {
            Toast.makeText(mContext, "Bluetooth is not available", Toast.LENGTH_LONG).show();
        }
    }


    protected void onStart() {
        if (!mBluetoothAdapter.isEnabled()) {
            Intent enableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            try {
                ((Activity) mContext).startActivityForResult(enableIntent, REQUEST_ENABLE_BT);
            } catch (ClassCastException e) {
                e.printStackTrace();
            }
        } else if (mChatService == null) {
            setupChat();
        }
    }

    public void onDestroy() {
        if (mChatService != null) {
            mChatService.stop();
        }
    }

    public void onResume() {
        Log.e("Resume", "On resume Called");
        // Performing this check in onResume() covers the case in which BT was
        // not enabled during onStart(), so we were paused to enable it...
        // onResume() will be called when ACTION_REQUEST_ENABLE activity returns.
        if (mChatService != null) {
            // Only if the state is STATE_NONE, do we know that we haven't started already
            if (mChatService.getState() == ChatService.STATE_NONE) {
                // Start the Bluetooth chat services
                mChatService.start();
            }
        }
    }

    protected void send() {
        Intent serverIntent = new Intent(mContext, DeviceListActivity.class);
        try {
            ((Activity) mContext).startActivityForResult(serverIntent, REQUEST_CONNECT_DEVICE_SECURE);
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    public void setupChat() {
        // Initialize the ChatService to perform bluetooth connections
        //mChatService = new ChatService(mContext, mHandler);
        mChatService = new ChatService(mContext, mHandler);

    }

    public void sendMessage(String message) {
        //message = message.length() + message + Constants.HEADER;

        int count = 0;
        while (mChatService.getState() != ChatService.STATE_CONNECTED) {
            try {
                Thread.sleep(1000);
                count++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count > 5) {
                return;
            }
        }
        // Check that there's actually something to send
        if (message.length() > 0) {
            message = message.length() + "~" + message + Constants.HEADER;
            // Get the message bytes and tell the ChatService to write
            byte[] send = message.getBytes();

            mChatService.write(send);
        }
    }

    private final Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            Context activity = mContext;
            switch (msg.what) {
                case Constants.MESSAGE_STATE_CHANGE:
                    switch (msg.arg1) {
                        case ChatService.STATE_CONNECTED:
                        case ChatService.STATE_CONNECTING:
                        case ChatService.STATE_LISTEN:
                        case ChatService.STATE_NONE:
                    }
                    break;
                case Constants.MESSAGE_WRITE:
                case Constants.MESSAGE_READ:
                case Constants.MESSAGE_DEVICE_NAME:
                    // save the connected device's name
                    String mConnectedDeviceName = msg.getData().getString(Constants.DEVICE_NAME);
                    if (mConnectedDeviceName != null) {
                        if (null != activity) {
                            Toast.makeText(activity, "Connected to "
                                    + mConnectedDeviceName, Toast.LENGTH_SHORT).show();
                        }
                    }
                    break;
                case Constants.MESSAGE_TOAST:
                    if (null != activity) {
                        Toast.makeText(activity, msg.getData().getString(Constants.TOAST),
                                Toast.LENGTH_SHORT).show();
                    }
                    break;
                case Constants.MESSAGE_TOAST_SENT_ACKNOWLEDGMENT:
                    if (null != activity) {
                        Toast.makeText(activity, "Data Sent Successfully",
                                Toast.LENGTH_SHORT).show();
                        //progressDialog.dismiss();
                    }
                    break;
                case Constants.MESSAGE_TOAST_RECIEVED_ACKNOWLEDGMENT:
                    if (null != activity) {
                        Toast.makeText(activity, "Data Recieved Successfully",
                                Toast.LENGTH_SHORT).show();
                        //progressDialog.dismiss();
                    }
                    break;
            }
        }
    };

    public void onResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case REQUEST_CONNECT_DEVICE_SECURE:
                // When DeviceListActivity returns with a device to connect
                if (resultCode == Activity.RESULT_OK) {
//                    new SendDataAsyncTask(data, true, dataToSend).execute();
//                    connectDevice(data, true);
//                    sendMessage(dataToSend);
                }
                break;
            case REQUEST_ENABLE_BT:
                // When the request to enable Bluetooth returns
                if (resultCode == Activity.RESULT_OK) {
                    // Bluetooth is now enabled, so set up a chat session
                    setupChat();
                } else {
                    // User did not enable Bluetooth or an error occurred
                    Toast.makeText(mContext, R.string.bt_not_enabled_leaving,
                            Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                sendMessage(new String("hello"));
        }
    }

    public void connectDevice(Intent data, boolean secure) {
        // Get the device MAC address
        String address = data.getExtras()
                .getString(DeviceListActivity.EXTRA_DEVICE_ADDRESS);
        // Get the BluetoothDevice object
        BluetoothDevice device = mBluetoothAdapter.getRemoteDevice(address);
        // Attempt to connect to the device
        mChatService.connect(device, secure);
        //sendMessage(msg);
    }

    public class SendDataAsyncTask extends AsyncTask<Void, Void, Void> {

        //        private ProgressDialog progressDialog;
        private DataSentListener dataSentListener;
        private Intent data;
        private boolean b;
        private String dataToSend;

        public SendDataAsyncTask(DataSentListener dataSentListener) {
            this.dataSentListener = dataSentListener;
        }

        public SendDataAsyncTask(Intent data, boolean b, String dataToSend) {
            this.data = data;
            this.b = b;
            this.dataToSend = dataToSend;
        }

        @Override
        protected void onPreExecute() {
//            try {
//                progressDialog = new ProgressDialog(mContext);
//                progressDialog.setMessage("Loading Reports ...");
//                progressDialog.setCancelable(false);
//                progressDialog.show();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
        }

        @Override
        protected Void doInBackground(Void... params) {
            connectDevice(data, b);
            sendMessage(dataToSend);
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
//            progressDialog.dismiss();
        }

    }

    public interface DataSentListener {
        void onSentComplete();
    }
}
