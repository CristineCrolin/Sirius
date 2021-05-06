package com.example.sirius

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.app.NotificationCompat

class myAlarmReceiver : BroadcastReceiver() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onReceive(context: Context, intent: Intent) {
       val notifyId = 1234
        val channel_Id = "my channel 01"
        val name = "ON/OFF"
        val importance = NotificationManager.IMPORTANCE_HIGH
        val nNotifyChannel = NotificationChannel (channel_Id, name, importance)

        val mBuilder = NotificationCompat.Builder(context, channel_Id)
            .setSmallIcon(R.drawable.ic_book)
            .setContentText(intent.getStringExtra(EXTRA_PESAN) ?: "Tidak ada pesan")
            .setContentTitle("Ayo membaca")
                .setContentText("Lanjutkan bacaanmu")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        var mNotificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        for (s in mNotificationManager.notificationChannels) {
            mNotificationManager.deleteNotificationChannel(s.id)
        }
        mNotificationManager.createNotificationChannel(nNotifyChannel)
        mNotificationManager.notify(notifyId,mBuilder.build())

    }
}