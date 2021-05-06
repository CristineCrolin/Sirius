package com.example.sirius

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_reviews1.*

class Reviews1 : AppCompatActivity(), View.OnClickListener{
    private  val prefFileName = "MYFILEPREF01"

//    private lateinit var notificationManager: NotificationManagerCompat

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reviews1)

        btnSend1.setOnClickListener(this)

        //NOTIFIKASI
//        notificationManager = NotificationManagerCompat.from(this)
//
//        btnSend1.setOnClickListener {
//            val message = etMessage.text.toString()
//            val Builder = NotificationCompat.Builder(this, myNotification.CHANNEL1)
//                .setSmallIcon(R.drawable.ic_book)
//                .setContentTitle("Berhasil memberi ulasan")
//                .setContentText("Terima kasih, ulasan anda telah diterima")
//                .setPriority(NotificationCompat.PRIORITY_HIGH)
//                .setCategory(NotificationCompat.CATEGORY_MESSAGE)
//                .setBadgeIconType(NotificationCompat.BADGE_ICON_SMALL)
//
//            val notification = Builder.build()
//            notificationManager.notify(1,notification)
//        }



//        btnSend2.setOnClickListener {
//            val message = etMessage.text.toString()
//            val Builder = NotificationCompat.Builder(this, myNotification.CHANNEL2)
//                .setSmallIcon(R.drawable.ic_book)
//                .setContentTitle(title)
//                .setContentText(message)
//                .setPriority(NotificationCompat.PRIORITY_LOW)
//
//            val notification = Builder.build()
//            notificationManager.notify(2,notification)
//        }
    }

    override fun onClick(p0: View?) {
        var mySharePref = SharePref(this, prefFileName)
        when (p0?.id) {
            R.id.btnSend1 -> {
                mySharePref.isi = etMessage.text.toString()
                Toast.makeText(this, "Berhasil memberi review", Toast.LENGTH_SHORT).show()
                var Intentkirim = Intent (this,Terimakasih::class.java)
                startActivity(Intentkirim)
            }
        }
    }
//    public fun btnK(view: View) {
//
//    }

}