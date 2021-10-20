package ru.pasechnik.ups2.getCleaning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.google.android.material.textview.MaterialTextView
import ru.pasechnik.ups2.Cleaning
import ru.pasechnik.ups2.R

class DopUslugiActivity : AppCompatActivity() {

    private lateinit var btnBack: ImageButton
    private lateinit var tvRoomsToiltet: MaterialTextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dop_uslugi)

        btnBack = findViewById(R.id.btnBack)
        tvRoomsToiltet = findViewById(R.id.tvRoomsToilets)

        setTopText()

        btnBack.setOnClickListener {
            startActivity(Intent(this, GetCleaningActivity::class.java))
            finish()
        }
    }

    private fun setTopText(){

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

        tvRoomsToiltet.text = str
    }
}