package com.example.sirius

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_pengingat.*
import java.util.*

class Pengingat : AppCompatActivity() {

    var mAlarmManager : AlarmManager? = null
    var mPendingIntent : PendingIntent? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengingat)

        mAlarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

        setAlarm.setOnClickListener {
            var alarmTimer = Calendar.getInstance()
            alarmTimer.add(Calendar.HOUR_OF_DAY,24)

            var sendIntent = Intent(this, myAlarmReceiver::class.java)
            sendIntent.putExtra(EXTRA_PESAN, myMessage.text.toString())


            var mPendingIntent = PendingIntent.getBroadcast(this,101,sendIntent,0)
            mAlarmManager?.set(AlarmManager.RTC,alarmTimer.timeInMillis,mPendingIntent)
            Toast.makeText(this, "Alarm Start", Toast.LENGTH_SHORT).show()
        }
        cancelAlarm.setOnClickListener {
            if (mPendingIntent != null) {
                mAlarmManager?.cancel(mPendingIntent)
                mPendingIntent?.cancel()
                Toast.makeText(this, "Alarm Start", Toast.LENGTH_SHORT).show()
            }
            cancelAlarm.setOnClickListener {
                if (mPendingIntent != null) {
                    mAlarmManager?.cancel(mPendingIntent)
                    mPendingIntent?.cancel()
                }
            }
        }
    }
}