package com.example.sirius

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class ktkReviews : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ktk_reviews)
    }

    public fun btnR(view: View) {
        var intenRev = Intent(this,Reviews::class.java)
        startActivity(intenRev)
    }
}