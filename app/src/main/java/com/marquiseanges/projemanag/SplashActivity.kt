package com.marquiseanges.projemanag

import android.content.Intent
import android.graphics.Typeface
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowInsets
import android.view.WindowInsetsController
import android.view.WindowManager
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {

    private var tv_app_name: TextView? = null

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        tv_app_name = findViewById(R.id.tv_app_name)

        val insetsController = window.insetsController
        insetsController?.hide(WindowInsets.Type.statusBars() or WindowInsets.Type.navigationBars())
        insetsController?.systemBarsBehavior = WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE

        val typeFace:Typeface = Typeface.createFromAsset(assets, "carbon bl.otf")
        tv_app_name?.typeface = typeFace

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, IntroActivity::class.java))
            finish()
        }, 2500)
    }
}