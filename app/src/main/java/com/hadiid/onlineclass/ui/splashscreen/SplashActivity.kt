package com.hadiid.onlineclass.ui.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.hadiid.onlineclass.ui.home.HomeActivity
import com.hadiid.onlineclass.R
import com.hadiid.onlineclass.ui.BaseActivity

class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.myLooper()!!).postDelayed({ // membuat delay perpindahan
            startActivity(Intent(this, HomeActivity::class.java)) // untuk pindah aktiviti dari splash ke home
            finish()
        }, 3000)


    }
}