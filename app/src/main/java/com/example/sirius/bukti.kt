package com.example.sirius

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class bukti : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bukti)
    }
    public fun Baca(view: View) {
        var Intentbaca = Intent(this,Pengingat::class.java)
        startActivity(Intentbaca)
    }
}