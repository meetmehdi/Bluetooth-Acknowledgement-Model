package com.pitb.bluetoothmodel;

import android.Manifest;
import android.app.Activity;
import android.app.NotificationManager;
import android.app.ProgressDialog;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.pitb.bluetoothmodel.BluetoothManager.REQUEST_CONNECT_DEVICE_SECURE;
import static com.pitb.bluetoothmodel.BluetoothManager.REQUEST_ENABLE_BT;
import static com.pitb.bluetoothmodel.constants.Constants.dataToSend;

public class MainActivity extends AppCompatActivity {

    private Button mSendButton;
    private BluetoothManager bluetoothManager;
    private ProgressDialogClass progress;
//    private BluetoothReciever reciever;
    public static boolean mIsInForeground;
    public static NotificationManager mNotifyManager;
    public static NotificationCompat.Builder mBuilder;
    public static int id = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSendButton = (Button) findViewById(R.id.btn);

        bluetoothManager = new BluetoothManager(this);
        mNotifyManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        mBuilder = new NotificationCompat.Builder(this);
        //progress = new ProgressDialogClass(getApplicationContext());

//        reciever = new BluetoothReciever();
//        IntentFilter intentFilter1 = new IntentFilter(BluetoothDevice.ACTION_ACL_CONNECTED);
//        intentFilter1.addAction(BluetoothDevice.ACTION_ACL_DISCONNECTED);
//        this.registerReceiver(reciever, intentFilter1);

        mSendButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                bluetoothManager.send();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        bluetoothManager.onStart();
        permission();
    }

    public void permission() {
        int MY_PERMISSION = 1;
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, MY_PERMISSION);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        bluetoothManager.onDestroy();
    }

    public static boolean isInForeground() {
        return mIsInForeground;
    }

    @Override
    protected void onPause() {
        super.onPause();
        mIsInForeground = false;
    }

    @Override
    public void onResume() {
        super.onResume();
        bluetoothManager.onResume();
        mIsInForeground = true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case REQUEST_CONNECT_DEVICE_SECURE:
                // When DeviceListActivity returns with a device to connect
                if (resultCode == Activity.RESULT_OK) {
                    if(BluetoothChatService.mState == BluetoothChatService.STATE_LISTEN){
                        Log.v("soc string length", dataToSend.length() + "");
                        new SendDataAsyncTask(data, true, dataToSend).execute();
                    }else if(BluetoothChatService.mState == BluetoothChatService.STATE_CONNECTED){
                        bluetoothManager.sendMessage(dataToSend);
                    }else if(BluetoothChatService.mState == BluetoothChatService.STATE_NONE){
                        //bluetoothManager.onResume();
                        Log.v("soc string length", dataToSend.length() + "");
                        new SendDataAsyncTask(data, true, dataToSend).execute();
                    }

//                    connectDevice(data, true);
//                    sendMessage(dataToSend);
                }
                break;
            case REQUEST_ENABLE_BT:
                // When the request to enable Bluetooth returns
                if (resultCode == Activity.RESULT_OK) {
                    // Bluetooth is now enabled, so set up a chat session
                    bluetoothManager.onStart();
                } else {
                    // User did not enable Bluetooth or an error occurred
                    Toast.makeText(getApplicationContext(), R.string.bt_not_enabled_leaving,
                            Toast.LENGTH_SHORT).show();
                }
                break;
        }
//        bluetoothManager.onResult(requestCode, resultCode, data);
    }

    public class SendDataAsyncTask extends AsyncTask<Void, Void, Void> {

        private ProgressDialog progressDialog;
        private BluetoothManager.DataSentListener dataSentListener;
        private Intent data;
        private boolean b;
        private String dataToSend;

        public SendDataAsyncTask(BluetoothManager.DataSentListener dataSentListener) {
            this.dataSentListener = dataSentListener;
        }

        public SendDataAsyncTask(Intent data, boolean b, String dataToSend) {
            this.data = data;
            this.b = b;
            this.dataToSend = dataToSend;
        }

        @Override
        protected void onPreExecute() {
            /*try {
                progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setMessage("Loading Reports ...");
                progressDialog.setCancelable(false);
                progressDialog.show();
            } catch (Exception e) {
                e.printStackTrace();
            }*/
        }

        @Override
        protected Void doInBackground(Void... params) {
            bluetoothManager.connectDevice(data, b);
            bluetoothManager.sendMessage(dataToSend);
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            //progressDialog.dismiss();
        }

    }

    public interface DataSentListener {
        void onSentComplete();
    }
}
