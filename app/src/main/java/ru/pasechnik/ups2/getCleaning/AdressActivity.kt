package ru.pasechnik.ups2.getCleaning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.transition.AutoTransition
import androidx.transition.TransitionManager
import com.google.android.material.card.MaterialCardView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textview.MaterialTextView
import com.google.android.material.transition.MaterialSharedAxis
import ru.pasechnik.ups2.Cleaning
import ru.pasechnik.ups2.R

class AdressActivity : AppCompatActivity() {

    private lateinit var et_city: TextInputEditText
    private lateinit var et_street: TextInputEditText
    private lateinit var et_home: TextInputEditText
    private lateinit var et_kvartira: TextInputEditText
    private lateinit var et_korpus: TextInputEditText
    private lateinit var et_podezd: TextInputEditText
    private lateinit var card: MaterialCardView

    private lateinit var tvRoomsToiltet: MaterialTextView
    private lateinit var btnBack: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_adress)

        et_city = findViewById(R.id.et_city)
        et_street = findViewById(R.id.et_street)
        et_home = findViewById(R.id.et_home)
        et_kvartira = findViewById(R.id.et_kvartira)
        et_korpus = findViewById(R.id.et_korpus)
        et_podezd = findViewById(R.id.et_podezd)
        card = findViewById(R.id.cardNext)
        tvRoomsToiltet = findViewById(R.id.tvRoomsToilets)
        btnBack = findViewById(R.id.btnBack)

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



        btnBack.setOnClickListener {
            startActivity(Intent(this, DopUslugiActivity::class.java))
            finish()
        }

        card.setOnClickListener {
            if (et_city.text.toString() != "" &&
                et_street.text.toString() != "" &&
                et_home.text.toString() != "" &&
                et_korpus.text.toString() != "" &&
                et_podezd.text.toString() != ""){

                Cleaning.adr = "г ${et_city.text}, ул ${et_street.text}, д ${et_home.text}, корп ${et_korpus.text}, кв ${et_kvartira.text}"
                TransitionManager.beginDelayedTransition(card, AutoTransition())
                startActivity(Intent(this, DataTimeActivity::class.java))
            }else{
                Toast.makeText(this, "Заполните все поля для ввода!", Toast.LENGTH_LONG).show()
            }

        }

    }
}