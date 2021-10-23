package ru.pasechnik.ups2.getCleaning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.airbnb.lottie.LottieAnimationView
import com.google.android.material.textview.MaterialTextView
import ru.pasechnik.ups2.Cleaning
import ru.pasechnik.ups2.MainActivity
import ru.pasechnik.ups2.R
import kotlin.random.Random

class ResultActivity : AppCompatActivity() {

    private lateinit var anim: LottieAnimationView
    private lateinit var textZakaz: MaterialTextView
    private lateinit var tvRoomsToilets: MaterialTextView
    private lateinit var tvDopUslugi: MaterialTextView
    private lateinit var tvData: MaterialTextView
    private lateinit var tvTime: MaterialTextView
    private lateinit var tvAdres: MaterialTextView
    private lateinit var btnBack: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        anim = findViewById(R.id.anim)
        btnBack = findViewById(R.id.btnBack)
        textZakaz = findViewById(R.id.tvZakaz)
        tvRoomsToilets = findViewById(R.id.tvRoomsToilets)
        tvDopUslugi = findViewById(R.id.tvDopUslugi)
        tvAdres = findViewById(R.id.tvAdres)
        tvData = findViewById(R.id.tvData)
        tvTime = findViewById(R.id.tvTime)

        anim.apply {
            setAnimation("hour_loader.json")
            loop(true)
            playAnimation()
        }

        Cleaning.zakazNumber = "Заказ #${Random.nextInt(1000) + 10000}"
        textZakaz.text = Cleaning.zakazNumber
        var str = ""

        when(Cleaning.rooms){
            1 -> str += "1 Комната, "
            2 -> str += "2 Комнаты, "
            3 -> str += "3 Комнаты, "
            4 -> str += "4 Комнаты, "
        }

        when(Cleaning.toilets){
            1 -> str += "1 Санузел"
            2 -> str += "2 Санузла"
            3 -> str += "3 Санузла"
            4 -> str += "4 Санузла"
        }

        tvData.text = Cleaning.data
        tvTime.text = Cleaning.time
        Cleaning.isActive = true

        tvRoomsToilets.text = str
        tvAdres.text = Cleaning.adr
        tvDopUslugi.text = Cleaning.dopUslugi

        btnBack.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    override fun onBackPressed() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}