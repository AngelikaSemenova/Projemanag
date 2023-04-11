package com.marquiseanges.projemanag

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowInsetsController
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.Toolbar


class SignUpActivity : AppCompatActivity() {

    private var toolbar_sign_up_activity: Toolbar? = null

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        toolbar_sign_up_activity = findViewById(R.id.toolbar_sign_up_activity)

        val insetsController = window.insetsController
        insetsController?.hide(WindowInsets.Type.statusBars() or WindowInsets.Type.navigationBars())
        insetsController?.systemBarsBehavior = WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE

        setupActionBar()

    }

    private fun setupActionBar() {
        setSupportActionBar(toolbar_sign_up_activity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_black_color_back_24dp)
        }

        toolbar_sign_up_activity?.setNavigationOnClickListener { onBackPressed() }
    }
}