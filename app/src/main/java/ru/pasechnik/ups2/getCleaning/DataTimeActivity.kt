package ru.pasechnik.ups2.getCleaning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.google.android.material.card.MaterialCardView
import com.google.android.material.textview.MaterialTextView
import ru.pasechnik.ups2.Cleaning
import ru.pasechnik.ups2.R

class DataTimeActivity : AppCompatActivity() {

    private lateinit var tvRoomsToiltet: MaterialTextView
    private lateinit var btnBack: ImageButton
    private lateinit var card: MaterialCardView

    private lateinit var btnD1: TextView
    private lateinit var btnD2: TextView
    private lateinit var btnD3: TextView
    private lateinit var btnD4: TextView
    private lateinit var btnD5: TextView
    private lateinit var btnD6: TextView
    private lateinit var btnD7: TextView

    private lateinit var btnT1: TextView
    private lateinit var btnT2: TextView
    private lateinit var btnT3: TextView
    private lateinit var btnT4: TextView
    private lateinit var btnT5: TextView
    private lateinit var btnT6: TextView
    private lateinit var btnT7: TextView

    private var btD = 0
    private var date = ""
    private var dates = mutableListOf<String>("25 Октября, пн", "27 Октября, вт", "26 Октября, ср", "28 Октября, чт", "29 Октября, пт", "30 Октября, сб", "31 Октября, вс")
    private lateinit var lastBtnD: TextView

    private var btT = 0
    private var time = ""
    private var times = mutableListOf<String>("11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00")
    private lateinit var lastBtnT: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_time)

        tvRoomsToiltet = findViewById(R.id.tvRoomsToilets)
        card = findViewById(R.id.cardNext)
        btnBack = findViewById(R.id.btnBack)

        btnD1 = findViewById(R.id.btnD1)
        btnD2 = findViewById(R.id.btnD2)
        btnD3 = findViewById(R.id.btnD3)
        btnD4 = findViewById(R.id.btnD4)
        btnD5 = findViewById(R.id.btnD5)
        btnD6 = findViewById(R.id.btnD6)
        btnD7 = findViewById(R.id.btnD7)

        btnT1 = findViewById(R.id.btnT1)
        btnT2 = findViewById(R.id.btnT2)
        btnT3 = findViewById(R.id.btnT3)
        btnT4 = findViewById(R.id.btnT4)
        btnT5 = findViewById(R.id.btnT5)
        btnT6 = findViewById(R.id.btnT6)
        btnT7 = findViewById(R.id.btnT7)

        lastBtnD = btnD1
        lastBtnT = btnT1


        setListenersData()
        setListenersTime()


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
            startActivity(Intent(this, AdressActivity::class.java))
            finish()
        }

        card.setOnClickListener {
            Cleaning.data = date
            Cleaning.time = time
            startActivity(Intent(this, PaymentActivity::class.java))
        }
    }



    private fun setListenersData(){
        btnD1.setOnClickListener {
            if (btD != 1){
                btnD1.setBackgroundResource(R.drawable.shape_active_btn_date)
                date = dates[0]
                if (lastBtnD != btnD1){
                    lastBtnD.setBackgroundResource(R.drawable.shape_inactive_btn_date)
                    lastBtnD = btnD1
                }
            }
        }
        btnD2.setOnClickListener {
            if (btD != 2){
                btnD2.setBackgroundResource(R.drawable.shape_active_btn_date)
                date = dates[1]
                if (lastBtnD != btnD2){
                    lastBtnD.setBackgroundResource(R.drawable.shape_inactive_btn_date)
                    lastBtnD = btnD2
                }
            }
        }
        btnD3.setOnClickListener {
            if (btD != 3){
                btnD3.setBackgroundResource(R.drawable.shape_active_btn_date)
                date = dates[2]
                if (lastBtnD != btnD3){
                    lastBtnD.setBackgroundResource(R.drawable.shape_inactive_btn_date)
                    lastBtnD = btnD3
                }
            }
        }
        btnD4.setOnClickListener {
            if (btD != 4){
                btnD4.setBackgroundResource(R.drawable.shape_active_btn_date)
                date = dates[3]
                if (lastBtnD != btnD4){
                    lastBtnD.setBackgroundResource(R.drawable.shape_inactive_btn_date)
                    lastBtnD = btnD4
                }
            }
        }
        btnD5.setOnClickListener {
            if (btD != 5){
                btnD5.setBackgroundResource(R.drawable.shape_active_btn_date)
                date = dates[4]
                if (lastBtnD != btnD5){
                    lastBtnD.setBackgroundResource(R.drawable.shape_inactive_btn_date)
                    lastBtnD = btnD5
                }
            }
        }
        btnD6.setOnClickListener {
            if (btD != 6){
                btnD6.setBackgroundResource(R.drawable.shape_active_btn_date)
                date = dates[5]
                if (lastBtnD != btnD6){
                    lastBtnD.setBackgroundResource(R.drawable.shape_inactive_btn_date)
                    lastBtnD = btnD6
                }
            }
        }
        btnD7.setOnClickListener {
            if (btD != 7){
                btnD7.setBackgroundResource(R.drawable.shape_active_btn_date)
                date = dates[6]
                if (lastBtnD != btnD7){
                    lastBtnD.setBackgroundResource(R.drawable.shape_inactive_btn_date)
                    lastBtnD = btnD7
                }
            }
        }
    }
    private fun setListenersTime(){
        btnT1.setOnClickListener {
            if (btT != 1){
                btnT1.setBackgroundResource(R.drawable.shape_active_btn_date)
                time = times[0]
                if (lastBtnT != btnT1){
                    lastBtnT.setBackgroundResource(R.drawable.shape_inactive_btn_date)
                    lastBtnT = btnT1
                }
            }
        }
        btnT2.setOnClickListener {
            if (btT != 2){
                btnT2.setBackgroundResource(R.drawable.shape_active_btn_date)
                time = times[1]
                if (lastBtnT != btnT2){
                    lastBtnT.setBackgroundResource(R.drawable.shape_inactive_btn_date)
                    lastBtnT = btnT2
                }
            }
        }
        btnT3.setOnClickListener {
            if (btT != 3){
                btnT3.setBackgroundResource(R.drawable.shape_active_btn_date)
                time = times[2]
                if (lastBtnT != btnT3){
                    lastBtnT.setBackgroundResource(R.drawable.shape_inactive_btn_date)
                    lastBtnT = btnT3
                }
            }
        }
        btnT4.setOnClickListener {
            if (btT != 4){
                btnT4.setBackgroundResource(R.drawable.shape_active_btn_date)
                time = times[3]
                if (lastBtnT != btnT4){
                    lastBtnT.setBackgroundResource(R.drawable.shape_inactive_btn_date)
                    lastBtnT = btnT4
                }
            }
        }
        btnT5.setOnClickListener {
            if (btT != 5){
                btnT5.setBackgroundResource(R.drawable.shape_active_btn_date)
                time = times[4]
                if (lastBtnT != btnT5){
                    lastBtnT.setBackgroundResource(R.drawable.shape_inactive_btn_date)
                    lastBtnT = btnT5
                }
            }
        }
        btnT6.setOnClickListener {
            if (btT != 6){
                btnT6.setBackgroundResource(R.drawable.shape_active_btn_date)
                time = times[5]
                if (lastBtnT != btnT6){
                    lastBtnT.setBackgroundResource(R.drawable.shape_inactive_btn_date)
                    lastBtnT = btnT6
                }
            }
        }
        btnT7.setOnClickListener {
            if (btT != 7){
                btnT7.setBackgroundResource(R.drawable.shape_active_btn_date)
                time = times[6]
                if (lastBtnT != btnT7){
                    lastBtnT.setBackgroundResource(R.drawable.shape_inactive_btn_date)
                    lastBtnT = btnT7
                }
            }
        }
    }
}