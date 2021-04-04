package com.example.sirius

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_reviews1.*

class Reviews1 : AppCompatActivity() {

    private lateinit var notificationManager: NotificationManagerCompat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reviews1)

        notificationManager = NotificationManagerCompat.from(this)

        btnSend1.setOnClickListener {
            val message = etMessage.text.toString()
            val Builder = NotificationCompat.Builder(this, myNotification.CHANNEL1)
                .setSmallIcon(R.drawable.ic_book)
                .setContentTitle("Berhasil memberi ulasan")
                .setContentText("Terima kasih, ulasan anda telah diterima")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
                .setBadgeIconType(NotificationCompat.BADGE_ICON_SMALL)

            val notification = Builder.build()
            notificationManager.notify(1,notification)
        }


////        btnSend2.setOnClickListener {
////            val message = etMessage.text.toString()
////            val Builder = NotificationCompat.Builder(this, myNotification.CHANNEL2)
////                .setSmallIcon(R.drawable.ic_book)
////                .setContentTitle(title)
////                .setContentText(message)
////                .setPriority(NotificationCompat.PRIORITY_LOW)
////
////            val notification = Builder.build()
////            notificationManager.notify(2,notification)
//        }
    }
}