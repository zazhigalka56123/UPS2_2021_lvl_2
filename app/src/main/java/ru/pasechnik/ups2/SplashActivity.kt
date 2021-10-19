package ru.pasechnik.ups2

import android.animation.Animator
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity.apply
import com.airbnb.lottie.LottieAnimationView
import kotlin.random.Random

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val anim = findViewById<LottieAnimationView>(R.id.anim)
        var first = false

        anim.apply {
            setAnimation("loading.json")
            repeatCount = 1
            loop(false)
            playAnimation()
        }

        anim.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator) {
                val sp = getSharedPreferences("isFirst", Context.MODE_PRIVATE)
                first = sp.getBoolean("first", true)
            }

            override fun onAnimationEnd(animation: Animator) {
                if(first){
                    val sp = getSharedPreferences("isFirst", Context.MODE_PRIVATE)
                    val edit = sp.edit()
                    edit.putBoolean("first", false)
                    startActivity(Intent(this@SplashActivity, EducationActivity::class.java))
                    finish()
                }else{
                    startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                    finish()
                }
            }
            override fun onAnimationCancel(animation: Animator) {}
            override fun onAnimationRepeat(animation: Animator) {
                if(first){
                    val sp = getSharedPreferences("isFirst", Context.MODE_PRIVATE)
                    val edit = sp.edit()
                    edit.putBoolean("first", false)
                    startActivity(Intent(this@SplashActivity, EducationActivity::class.java))
                    finish()
                }else{
                    startActivity(Intent(this@SplashActivity, MainActivity::class.java))
                    finish()
                }

            }
        })
    }
}