package com.example.sirius


import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import android.se.omapi.Channel

class myNotification : Application() {

    companion object{
        const val CHANNEL1 = "Channel1"
//        const val CHANNEL2 = "Channel2"

    }
    override fun onCreate() {
        super.onCreate()
        createNotificationChannels()
    }

    private fun createNotificationChannels() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val Channel1 = NotificationChannel(
                    CHANNEL1,
                    "Channel Satu",
                    NotificationManager.IMPORTANCE_HIGH
            )
            Channel1.description = "Ini adalah channel 1"

//            val Channel2 = NotificationChannel(
//                    CHANNEL2,
//                    "Channel Dua",
//                    NotificationManager.IMPORTANCE_LOW
//            )
//            Channel2.description = "Ini adalah channel 2"

            val manager= getSystemService(NotificationManager::class.java)
            manager?.createNotificationChannel(Channel1)
//            manager?.createNotificationChannel(Channel2)
        }
    }
}