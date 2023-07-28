package com.desailly.sensuadesires

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class splashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        MostrarBienvenida()
    }

    fun MostrarBienvenida(){
        object :CountDownTimer(3000,1000){
            override fun onTick(millisUntilFinished: Long) {
                //
            }

            override fun onFinish() {
               val intent = Intent(applicationContext,MainActivity::class.java)
                startActivity(intent)
                finish()
            }

        }.start()
    }
}