package com.example.sirius

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_reviews1.*
import kotlinx.android.synthetic.main.activity_terimakasih.*

class Terimakasih : AppCompatActivity(), View.OnClickListener{
    private val prefFileName = "MYFILEPREF01"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terimakasih)

        bacaReview.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var mySharePref = SharePref(this, prefFileName)
        when(p0?.id){
            R.id.bacaReview -> textViewIsi.setText(mySharePref.isi)
        }
    }

}