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
                    context.startService(new Intent(context, BluetoothService.class));
                break;
            case BluetoothDevice.ACTION_ACL_DISCONNECTED:
                break;
            default:
        }
    }
}
