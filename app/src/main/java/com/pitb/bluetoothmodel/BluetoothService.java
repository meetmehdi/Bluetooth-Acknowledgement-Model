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

    BluetoothManager manager;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        manager = new BluetoothManager(BluetoothService.this);
        manager.onStart();
        manager.onResume();
        Toast.makeText(this, "Service started", Toast.LENGTH_SHORT).show();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
