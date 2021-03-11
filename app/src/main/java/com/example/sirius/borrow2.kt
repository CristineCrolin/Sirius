package com.example.sirius

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class borrow2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_borrow2)
    }
    public fun ok2(view: View) {
        var Intentoke2 = Intent(this, bukti::class.java)
        startActivity(Intentoke2)
    }
}