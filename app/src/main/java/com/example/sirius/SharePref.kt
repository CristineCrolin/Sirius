package com.example.sirius

import android.content.Context
import android.content.SharedPreferences

class SharePref(context: Context, fileName : String) {
    val ISI_REVIEW = "REVIEW"

    private var myPreference : SharedPreferences
    init {
        myPreference = context.getSharedPreferences(fileName, Context.MODE_PRIVATE)
    }

    var isi : String?
    get() = myPreference.getString(ISI_REVIEW, "Kosong")
        set(value) {
            myPreference.edit().putString(ISI_REVIEW,value).apply()
        }
}