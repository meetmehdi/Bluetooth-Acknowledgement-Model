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
    public static NotificationManager mNotifyManager;
    public static NotificationCompat.Builder mBuilder;
    public static int id = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSendButton = (Button) findViewById(R.id.btn);

        bluetoothManager = new BluetoothManager(this);
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
    
    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        bluetoothManager.onResume();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case REQUEST_CONNECT_DEVICE_SECURE:
                // When DeviceListActivity returns with a device to connect
                if (resultCode == Activity.RESULT_OK) {
                    if(ChatService.getState() == ChatService.STATE_LISTEN){
                        Log.v("soc string length", dataToSend.length() + "");
                        new SendDataAsyncTask(data, true, dataToSend).execute();
                    }else if(ChatService.getState() == ChatService.STATE_CONNECTED){
                        bluetoothManager.sendMessage(dataToSend);
                    }else if(ChatService.getState() == ChatService.STATE_NONE){
                        Log.v("soc string length", dataToSend.length() + "");
                        new SendDataAsyncTask(data, true, dataToSend).execute();
                    }
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
    }

    public class SendDataAsyncTask extends AsyncTask<Void, Void, Void> {
        
        private Intent data;
        private boolean b;
        private String dataToSend;
        

        public SendDataAsyncTask(Intent data, boolean b, String dataToSend) {
            this.data = data;
            this.b = b;
            this.dataToSend = dataToSend;
        }

        @Override
        protected void onPreExecute() {
            
        }

        @Override
        protected Void doInBackground(Void... params) {
            bluetoothManager.connectDevice(data, b);
            bluetoothManager.sendMessage(dataToSend);
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
        }

    }
    
}
