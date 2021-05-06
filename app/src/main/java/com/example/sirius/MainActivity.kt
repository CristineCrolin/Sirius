package com.example.sirius

import android.app.*
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.*
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationCompat.BADGE_ICON_SMALL
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_pengingat.*
import java.lang.StringBuilder
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var AirplaneReceiver = MyAirplaneReceiver()
        var filter = IntentFilter()
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        registerReceiver(AirplaneReceiver, filter)

}

    //    Intent atau berpindah Activity
    public fun ebook(view: View) {
        var Intentborrow = Intent(this,Borrow::class.java)
        startActivity(Intentborrow)
    }

    public fun book(view: View) {
        var Intentborrow2 = Intent(this,borrow2::class.java)
        startActivity(Intentborrow2)
    }

    public fun Info(view: View) {
        var Intentinfo = Intent(this,infoBuku::class.java)

//        Berisi data
        var b = Buku (Penulis = "Setiawan Agung Pamungkas", Tahun = 2010, Penerbit = "Gramedia Pustaka", Genre = "Bahasa")
        Intentinfo.putExtra(EXTRA_NAMAPENULIS,"Setiawan Agung Pamungkas")
        Intentinfo.putExtra(EXTRA_TAHUNTERBIT,"2010")
        Intentinfo.putExtra(EXTRA_NAMAPENERBIT,"Gramedia Pustaka")
        Intentinfo.putExtra(EXTRA_GENRE,"Bahasa")

//      Mengirimkan beberapa data dalam 1 baris
        Intentinfo.putExtra(EXTRA_BUKU, b)
        startActivity(Intentinfo)
    }

    public fun hst(view: View) {
        var Intenthistory = Intent(this,ktkReviews::class.java)
        startActivity(Intenthistory)
    }



}