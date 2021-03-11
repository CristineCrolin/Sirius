package com.example.sirius

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Borrow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_borrow)
    }
    public fun ok(view: View) {
        var Intentoke = Intent(this,bukti::class.java)
        startActivity(Intentoke)
    }
}