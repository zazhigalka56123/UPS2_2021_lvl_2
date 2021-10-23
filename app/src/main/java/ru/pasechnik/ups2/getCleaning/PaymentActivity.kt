package ru.pasechnik.ups2.getCleaning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import com.google.android.material.card.MaterialCardView
import com.google.android.material.textview.MaterialTextView
import ru.pasechnik.ups2.Cleaning
import ru.pasechnik.ups2.R

class PaymentActivity : AppCompatActivity() {
    private lateinit var tvRoomsToiltet: MaterialTextView
    private lateinit var btnBack: ImageButton
    private lateinit var card: MaterialCardView
    private lateinit var card2: MaterialCardView
    private lateinit var ib1: ImageView
    private lateinit var ib2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        tvRoomsToiltet = findViewById(R.id.tvRoomsToilets)
        card = findViewById(R.id.cardNext)
        card2 = findViewById(R.id.cardNext2)
        ib1 = findViewById(R.id.ibGoogle)
        ib2 = findViewById(R.id.ibApple)
        btnBack = findViewById(R.id.btnBack)

        var str = ""

        when (Cleaning.rooms) {
            1 -> str += "1 Комната, "
            2 -> str += "2 Комнаты, "
            3 -> str += "3 Комнаты, "
            4 -> str += "4 Комнаты, "
        }

        when (Cleaning.toilets) {
            1 -> str += "1 Санузел"
            2 -> str += "2 Санузла"
            3 -> str += "3 Санузла"
            4 -> str += "4 Санузла"
        }

        tvRoomsToiltet.text = str

        btnBack.setOnClickListener {
            startActivity(Intent(this, DataTimeActivity::class.java))
            finish()
        }

        card.setOnClickListener {
            startActivity(Intent(this, ResultActivity::class.java))
            finish()
        }
        card2.setOnClickListener {
            startActivity(Intent(this, ResultActivity::class.java))
            finish()
        }
        ib1.setOnClickListener {
            startActivity(Intent(this, ResultActivity::class.java))
            finish()
        }
        ib2.setOnClickListener {
            startActivity(Intent(this, ResultActivity::class.java))
            finish()
        }
    }
}