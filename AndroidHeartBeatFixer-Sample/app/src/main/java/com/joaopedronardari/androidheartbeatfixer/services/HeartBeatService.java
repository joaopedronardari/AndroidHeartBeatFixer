package com.joaopedronardari.androidheartbeatfixer.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 *
 * Call this service when you want to send a HEART BEAT
 * It's a simple implementation, shows how to sendBroadcast intents to keep alive or restabilize connection with GCM
 * Hints: You can use to sendbroadcast() in a schedule alarm or use this
 * service with a time interval and START_STICKY.
 *
 * Created by Joao Pedro Nardari.
 */
public class HeartBeatService extends Service {

    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        getApplicationContext().sendBroadcast(new Intent("com.google.android.intent.action.GTALK_HEARTBEAT"));
        getApplicationContext().sendBroadcast(new Intent("com.google.android.intent.action.MCS_HEARTBEAT"));
        return super.onStartCommand(intent, flags, startId);
    }
}
