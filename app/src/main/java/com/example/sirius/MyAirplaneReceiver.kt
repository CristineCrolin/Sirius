package com.example.sirius

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Settings
import android.widget.Toast
import kotlin.system.exitProcess

class MyAirplaneReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if(Settings.System.getInt(context.contentResolver,
                Settings.Global.AIRPLANE_MODE_ON, 0)==0) {
            Toast.makeText(context,"Flight Mode : OFF", Toast.LENGTH_SHORT).show()
        }
        else
            Toast.makeText(context,"Flight Mode : ON \n No Internet Connection", Toast.LENGTH_SHORT).show()
    }

    private fun exitProcess() {
        TODO("Not yet implemented")
    }
}