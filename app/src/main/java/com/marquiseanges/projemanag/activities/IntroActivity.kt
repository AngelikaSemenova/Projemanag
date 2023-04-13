package com.marquiseanges.projemanag.activities

import android.content.Intent
import android.graphics.Typeface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowInsetsController
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.marquiseanges.projemanag.R

class IntroActivity : BaseActivity() {

    private lateinit var btn_sign_up_intro : Button
    private lateinit var btn_sign_in_intro : Button

    private var tv_app_name_intro: TextView? = null


    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)


        tv_app_name_intro = findViewById(R.id.tv_app_name_intro)
        val typeFace: Typeface = Typeface.createFromAsset(assets, "carbon bl.otf")
        tv_app_name_intro?.typeface = typeFace

        btn_sign_up_intro = findViewById(R.id.btn_sign_up_intro)
        btn_sign_in_intro = findViewById(R.id.btn_sign_in_intro)

        val insetsController = window.insetsController
        insetsController?.hide(WindowInsets.Type.statusBars() or WindowInsets.Type.navigationBars())
        insetsController?.systemBarsBehavior = WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE

        btn_sign_up_intro.setOnClickListener {
            startActivity(Intent(this@IntroActivity, SignUpActivity::class.java))
        }

        btn_sign_in_intro.setOnClickListener {
            startActivity(Intent(this@IntroActivity, SignInActivity::class.java))
        }
    }
}