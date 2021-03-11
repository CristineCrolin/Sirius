package com.example.sirius

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.Sampler
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
        /*Intentinfo.putExtra(EXTRA_NAMAPENULIS,"Setiawan Agung Pamungkas")
        Intentinfo.putExtra(EXTRA_TAHUNTERBIT,"2010")
        Intentinfo.putExtra(EXTRA_NAMAPENERBIT,"Gramedia Pustaka")
        Intentinfo.putExtra(EXTRA_GENRE,"Bahasa")*/

//        Mengirimkan beberapa data dalam 1 baris
        Intentinfo.putExtra(EXTRA_BUKU, b)
        startActivity(Intentinfo)
    }
}