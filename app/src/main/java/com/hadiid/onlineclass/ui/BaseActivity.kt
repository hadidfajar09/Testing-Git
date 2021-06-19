package com.hadiid.onlineclass.ui

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate

open class BaseActivity : AppCompatActivity() { //activity untuk ke splash awal dengan open
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)//mengutr tema awal utk fokus ke satu saja
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT // mngtur orientasi utama tdk bisa ke lanscape
    }
}