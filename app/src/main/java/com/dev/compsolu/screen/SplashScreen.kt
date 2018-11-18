package com.dev.compsolu.screen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class SplashScreen : AppCompatActivity(){

    private var mHandler : Handler? = null;
    private val SPLASHDELAY : Long = 1000;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen);

        mHandler = Handler();
        mHandler!!.postDelayed(mRunnable,SPLASHDELAY);
    }

    val mRunnable : Runnable = Runnable{

        if(!isFinishing){
            val intent = Intent(applicationContext, NavigationMenu::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onDestroy() {
        if(mHandler != null)
        {
            mHandler!!.removeCallbacks(mRunnable)
        }
        super.onDestroy()
    }
}