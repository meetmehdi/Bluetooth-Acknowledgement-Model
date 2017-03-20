package com.pitb.bluetoothmodel;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

/**
 * Created by BrOlLy on 01/03/2017.
 */

public class BluetoothReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        switch (action) {
            case BluetoothDevice.ACTION_ACL_CONNECTED:
//                if (!MainActivity.isInForeground()) {
//                    PackageManager pm = context.getPackageManager();
//                    Intent launchIntent = pm.getLaunchIntentForPackage("com.pitb.bluetoothmodel");
//                    launchIntent.putExtra("some_data", "value");
    //                    Toast.makeText(context, "Inside the case1", Toast.LENGTH_SHORT).show();
                    context.startService(new Intent(context, BluetoothService.class));
//                }
                break;
            case BluetoothDevice.ACTION_ACL_DISCONNECTED:
                //context.stopService(new Intent(context, BluetoothService.class));
//                Toast.makeText(context, "Inside the case2", Toast.LENGTH_SHORT).show();
                //context.unregisterReceiver(BluetoothReciever.this);
                break;
            default:
//                Toast.makeText(context, "Default", Toast.LENGTH_SHORT).show();
        }
    }
}
