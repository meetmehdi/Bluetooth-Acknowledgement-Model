package com.pitb.bluetoothmodel;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by BrOlLy on 01/03/2017.
 */

public class BluetoothService extends Service {

    BluetoothChatService chatService = null;
    BluetoothManager manager;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
//        Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
//        chatService = new BluetoothChatService(this, mHandler);
//        chatService.start();
        manager = new BluetoothManager(BluetoothService.this);
        manager.onStart();
        manager.onResume();
        Toast.makeText(this, "Service started", Toast.LENGTH_SHORT).show();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //Toast.makeText(this, "Service destroyed", Toast.LENGTH_SHORT).show();
    }

//    private final Handler mHandler = new Handler() {
//        @Override
//        public void handleMessage(Message msg) {
//            switch (msg.what) {
//                case Constants.MESSAGE_STATE_CHANGE:
//                    switch (msg.arg1) {
//                        case BluetoothChatService.STATE_CONNECTED:
//                        case BluetoothChatService.STATE_CONNECTING:
//                        case BluetoothChatService.STATE_LISTEN:
//                        case BluetoothChatService.STATE_NONE:
//                    }
//                    break;
//                case Constants.MESSAGE_WRITE:
//                case Constants.MESSAGE_READ:
//                case Constants.MESSAGE_DEVICE_NAME:
//                    // save the connected device's name
//                    String mConnectedDeviceName = msg.getData().getString(Constants.DEVICE_NAME);
//                    if (mConnectedDeviceName != null) {
//                        Toast.makeText(BluetoothService.this, "Service Connected to "
//                                + mConnectedDeviceName, Toast.LENGTH_SHORT).show();
//                    }
//                    break;
//                case Constants.MESSAGE_TOAST:
//                    Toast.makeText(BluetoothService.this, "Service " + msg.getData().getString(Constants.TOAST),
//                            Toast.LENGTH_SHORT).show();
//                    break;
//                case Constants.MESSAGE_TOAST_SENT_ACKNOWLEDGMENT:
//                    Toast.makeText(BluetoothService.this, "Service Data Sent Successfully",
//                            Toast.LENGTH_SHORT).show();
//                    break;
//                case Constants.MESSAGE_TOAST_RECIEVED_ACKNOWLEDGMENT:
//                    Toast.makeText(BluetoothService.this, "Service Data Received Successfully",
//                            Toast.LENGTH_SHORT).show();
//                    break;
//            }
//        }
//    };
}
