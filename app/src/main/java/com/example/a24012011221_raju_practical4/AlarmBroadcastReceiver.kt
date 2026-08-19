package com.example.a24012011221_raju_practical4

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmBroadcastReceiver : BroadcastReceiver() {
    companion object{
        const val SERVICE_KEY = "service1"
        const val START_VAL = "start"
        const val STOP_VAL = "stop"
    }

    override fun onReceive(context: Context, intent: Intent) {
        val action = intent.getStringExtra(SERVICE_KEY)
        if (action == START_VAL) {
            val serviceIntent = Intent(context, AlarmService::class.java)
            context.startService(serviceIntent)
        } else if (action == STOP_VAL) {
            val serviceIntent = Intent(context, AlarmService::class.java)
            context.stopService(serviceIntent)
        }
    }
}
