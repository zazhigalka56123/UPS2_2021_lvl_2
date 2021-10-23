package ru.pasechnik.ups2.getCleaning

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.transition.AutoTransition
import androidx.transition.TransitionManager
import com.google.android.material.card.MaterialCardView
import com.google.android.material.textview.MaterialTextView
import ru.pasechnik.ups2.Cleaning
import ru.pasechnik.ups2.MainActivity
import ru.pasechnik.ups2.R

class GetCleaningActivity : AppCompatActivity() {

    private lateinit var icBackHome: ImageButton

    private lateinit var tvK1: TextView
    private lateinit var tvK2: TextView
    private lateinit var tvK3: TextView
    private lateinit var tvK4: TextView

    private lateinit var tvS1: TextView
    private lateinit var tvS2: TextView
    private lateinit var tvS3: TextView
    private lateinit var tvS4: TextView


    private lateinit var textTime: MaterialTextView
    private lateinit var textCount: MaterialTextView

    private lateinit var card: MaterialCardView

    private var room = 0
    private var toilet = 0

    private var isPickR = false
    private var isPickT = false

    private lateinit var lk: LinearLayout
    private lateinit var lt: LinearLayout

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_cleaning)


        icBackHome = findViewById(R.id.icBackAboutHome)

        tvK1 = findViewById(R.id.btnK1)
        tvK2 = findViewById(R.id.btnK2)
        tvK3 = findViewById(R.id.btnK3)
        tvK4 = findViewById(R.id.btnK4)

        tvS1 = findViewById(R.id.btnS1)
        tvS2 = findViewById(R.id.btnS2)
        tvS3 = findViewById(R.id.btnS3)
        tvS4 = findViewById(R.id.btnS4)

        lk = findViewById(R.id.lk)
        lt = findViewById(R.id.lt)

        textTime = findViewById(R.id.textTime)
        textCount = findViewById(R.id.textCount)

        card = findViewById(R.id.cardNext)

        tvK1.setOnClickListener {
            if (room != 1) {
                tvK1.setBackgroundDrawable(getDrawable(R.drawable.shape_active_btn))
                tvK1.setTextColor(getColor(R.color.activeColor))
                editBtn(room)
                isPickR = true
                room = 1

                if(isPickR == isPickT) {
                    setData()
                }
            }
        }
        tvK2.setOnClickListener {
            if (room != 2) {
                tvK2.setBackgroundDrawable(getDrawable(R.drawable.shape_active_btn))
                tvK2.setTextColor(getColor(R.color.activeColor))

                editBtn(room)
                isPickR = true
                room = 2

                if(isPickR == isPickT) {
                    setData()
                }
            }
        }
        tvK3.setOnClickListener {
            if (room != 3) {
                tvK3.setBackgroundDrawable(getDrawable(R.drawable.shape_active_btn))
                tvK3.setTextColor(getColor(R.color.activeColor))
                editBtn(room)
                isPickR = true
                room = 3

                if(isPickR == isPickT) {
                    setData()
                }
            }
        }
        tvK4.setOnClickListener {
            if (room != 4) {
                tvK4.setBackgroundDrawable(getDrawable(R.drawable.shape_active_btn))
                tvK4.setTextColor(getColor(R.color.activeColor))
                editBtn(room)
                isPickR = true
                room = 4

                if(isPickR == isPickT) {
                    setData()
                }
            }
        }


        tvS1.setOnClickListener {
            if (toilet != 1) {
                tvS1.setBackgroundDrawable(getDrawable(R.drawable.shape_active_btn))
                tvS1.setTextColor(getColor(R.color.activeColor))
                editBtn2(toilet)
                isPickT = true
                toilet = 1

                if(isPickR == isPickT) {
                    setData()
                }
            }
        }
        tvS2.setOnClickListener {
            if (toilet != 2) {
                tvS2.setBackgroundDrawable(getDrawable(R.drawable.shape_active_btn))
                tvS2.setTextColor(getColor(R.color.activeColor))
                editBtn2(toilet)

                isPickT = true
                toilet = 2

                if(isPickR == isPickT) {
                    setData()
                }
            }
        }
        tvS3.setOnClickListener {
            if (toilet != 3) {
                tvS3.setBackgroundDrawable(getDrawable(R.drawable.shape_active_btn))
                tvS3.setTextColor(getColor(R.color.activeColor))
                editBtn2(toilet)

                isPickT = true
                toilet = 3

                if(isPickR == isPickT) {
                    setData()
                }
            }
        }
        tvS4.setOnClickListener {
            if (toilet != 4) {
                tvS4.setBackgroundDrawable(getDrawable(R.drawable.shape_active_btn))
                tvS4.setTextColor(getColor(R.color.activeColor))
                editBtn2(toilet)
                isPickT = true
                toilet = 4

                if(isPickR == isPickT) {
                    setData()
                }
            }
        }

        icBackHome.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        card.setOnClickListener {
            Cleaning.rooms = room
            Cleaning.toilets = toilet


            startActivity(Intent(this, DopUslugiActivity::class.java))
            finish()


        }

    }

    private fun editBtn(x: Int) {
        when(x){
            1 -> {
                tvK1.setBackgroundDrawable(getDrawable(R.drawable.shape_inactive_btn))
                tvK1.setTextColor(getColor(R.color.inactiveColor))
                TransitionManager.beginDelayedTransition(lk, AutoTransition())
            }
            2 -> {
                tvK2.setBackgroundDrawable(getDrawable(R.drawable.shape_inactive_btn))
                tvK2.setTextColor(getColor(R.color.inactiveColor))
            }
            3 -> {
                tvK3.setBackgroundDrawable(getDrawable(R.drawable.shape_inactive_btn))
                tvK3.setTextColor(getColor(R.color.inactiveColor))
            }
            4 -> {
                tvK4.setBackgroundDrawable(getDrawable(R.drawable.shape_inactive_btn))
                tvK4.setTextColor(getColor(R.color.inactiveColor))
            }
        }
        TransitionManager.beginDelayedTransition(lk, AutoTransition())
    }
    private fun editBtn2(x: Int) {
        when(x){
            1 -> {
                tvS1.setBackgroundDrawable(getDrawable(R.drawable.shape_inactive_btn))
                tvS1.setTextColor(getColor(R.color.inactiveColor))
            }
            2 -> {
                tvS2.setBackgroundDrawable(getDrawable(R.drawable.shape_inactive_btn))
                tvS2.setTextColor(getColor(R.color.inactiveColor))
            }
            3 -> {
                tvS3.setBackgroundDrawable(getDrawable(R.drawable.shape_inactive_btn))
                tvS3.setTextColor(getColor(R.color.inactiveColor))
            }
            4 -> {
                tvS4.setBackgroundDrawable(getDrawable(R.drawable.shape_inactive_btn))
                tvS4.setTextColor(getColor(R.color.inactiveColor))
            }
        }
        TransitionManager.beginDelayedTransition(lt, AutoTransition())
    }
    private fun setData(){
        Cleaning.cost = room * 250 + toilet * 150
        Cleaning.timeH = room
        Cleaning.timeM = toilet * 30
        Cleaning.editTime()

        if (Cleaning.timeM == 0) {
            textTime.text = "≈ ${Cleaning.timeH} часа"
        }else{
            textTime.text = "≈ ${Cleaning.timeH} ч. ${Cleaning.timeM} мин."
        }

        textCount.text = "${Cleaning.cost} ₽"
        TransitionManager.beginDelayedTransition(card, AutoTransition())
        card.visibility = View.VISIBLE
    }
}