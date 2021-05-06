package com.example.sirius

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.intent.matcher.IntentMatchers.hasAction
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.EnumSet.allOf

@RunWith(AndroidJUnit4::class)
class MainTest{
    @Rule @JvmField
    var activityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun launchInfo(){
        onView(withId(R.id.Info)).perform(click())
    }

    @Test
    fun launchBorrow(){
        onView(withId(R.id.borrowEbook)).perform(click())
    }
}