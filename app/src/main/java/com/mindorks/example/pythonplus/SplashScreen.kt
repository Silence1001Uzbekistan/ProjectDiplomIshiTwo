package uz.widvan.example.pythonplus

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import uz.widvan.example.pythonplus.MainActivity
import uz.widvan.example.pythonplus.R


class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.black))

        //Splash oynadan Intro oynaga o'tish
        Handler().postDelayed({
            val intent = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(intent)
            /*TODO: Boshqa oynaga otganda orqa tugmani bosganimizda
        orqadagi oyna ishga tushmasligi uchun kerak bolmasa u oynani
            yoqotib yuborgan maqul */
            finish()
            fileList()
        }, 1200)
    }
}