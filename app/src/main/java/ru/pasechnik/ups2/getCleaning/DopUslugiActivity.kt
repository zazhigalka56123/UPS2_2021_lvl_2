package ru.pasechnik.ups2.getCleaning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.transition.AutoTransition
import androidx.transition.TransitionManager
import com.google.android.material.card.MaterialCardView
import com.google.android.material.textview.MaterialTextView
import ru.pasechnik.ups2.Cleaning
import ru.pasechnik.ups2.R

class DopUslugiActivity : AppCompatActivity() {

    private lateinit var btnBack: ImageButton
    private lateinit var tvRoomsToiltet: MaterialTextView

    private lateinit var cardPlita: MaterialCardView
    private lateinit var cardMicrowave: MaterialCardView
    private lateinit var cardZapax: MaterialCardView

    private lateinit var cardClothes: MaterialCardView

    private lateinit var cardVanna: MaterialCardView
    private lateinit var cardNakip: MaterialCardView
    private lateinit var cardToilet: MaterialCardView

    private lateinit var cardPit1: MaterialCardView
    private lateinit var cardPit2: MaterialCardView
    private lateinit var cardPit3: MaterialCardView

    private lateinit var cardSmthElse: MaterialCardView
    private lateinit var cardСloth: MaterialCardView
    private lateinit var cardMebel: MaterialCardView

    private lateinit var textTime: MaterialTextView
    private lateinit var textCount: MaterialTextView

    private lateinit var card: MaterialCardView

    private var txt = mutableListOf<String>("", "", "", "", "", "", "", "", "", "", "", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dop_uslugi)

        btnBack = findViewById(R.id.btnBack)
        tvRoomsToiltet = findViewById(R.id.tvRoomsToilets)

        textCount = findViewById(R.id.textCount)
        textTime = findViewById(R.id.textTime)
        card = findViewById(R.id.cardNext)

        setTopText()
        initCards()
        setListeners()

        btnBack.setOnClickListener {
            startActivity(Intent(this, GetCleaningActivity::class.java))
            finish()
        }
    }

    private fun initCards(){
        cardPlita     = findViewById(R.id.cardPlita)
        cardMicrowave = findViewById(R.id.cardMicrowave)
        cardZapax     = findViewById(R.id.cardZapax)

        cardClothes = findViewById(R.id.cardClothes)

        cardVanna  = findViewById(R.id.cardVanna)
        cardNakip  = findViewById(R.id.cardNakip)
        cardToilet = findViewById(R.id.cardToilet)

        cardPit1 = findViewById(R.id.cardPit1)
        cardPit2 = findViewById(R.id.cardPit2)
        cardPit3 = findViewById(R.id.cardPit3)

        cardSmthElse = findViewById(R.id.cardSmthElse)
        cardСloth    = findViewById(R.id.cardСloth)
        cardMebel    = findViewById(R.id.cardMebel)
    }

    private fun setListeners(){
        val ic_pick1 = findViewById<ImageView>(R.id.ic_pick1)
        val ic_pick2 = findViewById<ImageView>(R.id.ic_pick2)
        val ic_pick3 = findViewById<ImageView>(R.id.ic_pick3)
        val ic_pick4 = findViewById<ImageView>(R.id.ic_pick4)
        val ic_pick5 = findViewById<ImageView>(R.id.ic_pick5)
        val ic_pick6 = findViewById<ImageView>(R.id.ic_pick6)
        val ic_pick7 = findViewById<ImageView>(R.id.ic_pick7)
        val ic_pick8 = findViewById<ImageView>(R.id.ic_pick8)
        val ic_pick9 = findViewById<ImageView>(R.id.ic_pick9)
        val ic_pick10 = findViewById<ImageView>(R.id.ic_pick10)
        val ic_pick11 = findViewById<ImageView>(R.id.ic_pick11)
        val ic_pick12 = findViewById<ImageView>(R.id.ic_pick12)
        val ic_pick13 = findViewById<ImageView>(R.id.ic_pick13)

        cardPlita.setOnClickListener {
            TransitionManager.beginDelayedTransition(cardPlita, AutoTransition())

            if (ic_pick1.visibility == View.GONE) {
                ic_pick1.visibility = View.VISIBLE
                cardPlita.setCardBackgroundColor(resources.getColor(R.color.colorBgYellow))
                editData(0, 20, 320)
                txt[0] = "Помыть плиту"
            }else {
                ic_pick1.visibility = View.GONE
                editData(0, -20, -320)
                cardPlita.setCardBackgroundColor(resources.getColor(R.color.white))
                txt[0] = ""
            }
        }
        cardMicrowave.setOnClickListener {
            TransitionManager.beginDelayedTransition(cardMicrowave, AutoTransition())

            if (ic_pick2.visibility == View.GONE) {
                ic_pick2.visibility = View.VISIBLE
                cardMicrowave.setCardBackgroundColor(resources.getColor(R.color.colorBgYellow))
                editData(0, 20, 120)
                txt[1] = "Помыть внутри микроволновки"
            }else {
                ic_pick2.visibility = View.GONE
                editData(0, -20, -120)
                cardMicrowave.setCardBackgroundColor(resources.getColor(R.color.white))
                txt[1] = ""
            }
        }
        cardZapax.setOnClickListener {
            TransitionManager.beginDelayedTransition(cardZapax, AutoTransition())

            if (ic_pick3.visibility == View.GONE) {
                ic_pick3.visibility = View.VISIBLE
                cardZapax.setCardBackgroundColor(resources.getColor(R.color.colorBgYellow))
                editData(0, 20, 500)
                txt[2] = "Вывести запахи"
            }else {
                ic_pick3.visibility = View.GONE
                editData(0, -20, -500)
                cardZapax.setCardBackgroundColor(resources.getColor(R.color.white))
                txt[2] = ""
            }
        }

        cardClothes.setOnClickListener {
            TransitionManager.beginDelayedTransition(cardClothes, AutoTransition())

            if (ic_pick4.visibility == View.GONE) {
                ic_pick4.visibility = View.VISIBLE
                cardClothes.setCardBackgroundColor(resources.getColor(R.color.colorBgBlack))
                editData(0, 20, 320)
                txt[3] = "Химчистка одежды"
            }else {
                ic_pick4.visibility = View.GONE
                editData(0, -20, -320)
                cardClothes.setCardBackgroundColor(resources.getColor(R.color.white))
                txt[3] = ""
            }
        }

        cardVanna.setOnClickListener {
            TransitionManager.beginDelayedTransition(cardVanna, AutoTransition())

            if (ic_pick5.visibility == View.GONE) {
                ic_pick5.visibility = View.VISIBLE
                cardVanna.setCardBackgroundColor(resources.getColor(R.color.colorBgBlue))
                editData(0, 15, 320)
                txt[4] = "Помыть ванну"
            }else {
                ic_pick5.visibility = View.GONE
                editData(0, -15, -320)
                cardVanna.setCardBackgroundColor(resources.getColor(R.color.white))
                txt[4] = ""
            }
        }
        cardNakip.setOnClickListener {
            TransitionManager.beginDelayedTransition(cardNakip, AutoTransition())

            if (ic_pick6.visibility == View.GONE) {
                ic_pick6.visibility = View.VISIBLE
                cardNakip.setCardBackgroundColor(resources.getColor(R.color.colorBgBlue))
                editData(0, 32, 800)
                txt[5] = "Убрать накипь"
            }else {
                ic_pick6.visibility = View.GONE
                editData(0, -32, -800)
                cardNakip.setCardBackgroundColor(resources.getColor(R.color.white))
                txt[5] = ""
            }
        }
        cardToilet.setOnClickListener {
            TransitionManager.beginDelayedTransition(cardToilet, AutoTransition())

            if (ic_pick7.visibility == View.GONE) {
                ic_pick7.visibility = View.VISIBLE
                cardToilet.setCardBackgroundColor(resources.getColor(R.color.colorBgBlue))
                editData(0, 40, 500)
                txt[6] = "Глубокая чистка унитаза"
            }else {
                ic_pick7.visibility = View.GONE
                editData(0, -40, -500)
                cardToilet.setCardBackgroundColor(resources.getColor(R.color.white))
                txt[6] = ""
            }
        }


        cardPit1.setOnClickListener {
            TransitionManager.beginDelayedTransition(cardPit1, AutoTransition())

            if (ic_pick8.visibility == View.GONE) {
                ic_pick8.visibility = View.VISIBLE
                cardPit1.setCardBackgroundColor(resources.getColor(R.color.colorBgYellow))
                editData(0, 10, 320)
                txt[7] = "Мытье лотка питомца"
            }else {
                ic_pick8.visibility = View.GONE
                editData(0, -10, -320)
                cardPit1.setCardBackgroundColor(resources.getColor(R.color.white))
                txt[7] = ""
            }
        }
        cardPit2.setOnClickListener {
            TransitionManager.beginDelayedTransition(cardPit2, AutoTransition())

            if (ic_pick9.visibility == View.GONE) {
                ic_pick9.visibility = View.VISIBLE
                cardPit2.setCardBackgroundColor(resources.getColor(R.color.colorBgYellow))
                editData(0, 10, 120)
                txt[8] = "Очистка от шерсти"
            }else {
                ic_pick9.visibility = View.GONE
                editData(0, -10, 120)
                cardPit2.setCardBackgroundColor(resources.getColor(R.color.white))
                txt[8] = ""
            }
        }
        cardPit3.setOnClickListener {
            TransitionManager.beginDelayedTransition(cardPit3, AutoTransition())

            if (ic_pick10.visibility == View.GONE) {
                ic_pick10.visibility = View.VISIBLE
                cardPit3.setCardBackgroundColor(resources.getColor(R.color.colorBgYellow))
                editData(0, 10, 120)
                txt[9] = "Восстановление после укусов"
            }else {
                ic_pick10.visibility = View.GONE
                editData(0, -10, 120)
                cardPit3.setCardBackgroundColor(resources.getColor(R.color.white))
                txt[9] = ""
            }
        }

        cardSmthElse.setOnClickListener {
            TransitionManager.beginDelayedTransition(cardSmthElse, AutoTransition())

            if (ic_pick11.visibility == View.GONE) {
                ic_pick11.visibility = View.VISIBLE
                cardSmthElse.setCardBackgroundColor(resources.getColor(R.color.colorBgBlack))
                editData(0, 10, 320)
                txt[10] = "Убрать что-то ещё"
            }else {
                ic_pick11.visibility = View.GONE
                editData(0, -10, -320)
                cardSmthElse.setCardBackgroundColor(resources.getColor(R.color.white))
                txt[10] = ""
            }
        }
        cardСloth.setOnClickListener {
            TransitionManager.beginDelayedTransition(cardСloth, AutoTransition())

            if (ic_pick12.visibility == View.GONE) {
                ic_pick12.visibility = View.VISIBLE
                cardСloth.setCardBackgroundColor(resources.getColor(R.color.colorBgBlack))
                editData(0, 20, 500)
                txt[3] = "Химчистка одежды"
            }else {
                ic_pick12.visibility = View.GONE
                editData(0, -20, 500)
                cardСloth.setCardBackgroundColor(resources.getColor(R.color.white))
                txt[3] = ""
            }
        }
        cardMebel.setOnClickListener {
            TransitionManager.beginDelayedTransition(cardMebel, AutoTransition())

            if (ic_pick13.visibility == View.GONE) {
                ic_pick13.visibility = View.VISIBLE
                cardMebel.setCardBackgroundColor(resources.getColor(R.color.colorBgBlack))
                editData(0, 20, 500)
                txt[11] = "Химчистка мебели"
            }else {
                ic_pick13.visibility = View.GONE
                editData(0, -20, 500)
                cardMebel.setCardBackgroundColor(resources.getColor(R.color.white))
                txt[11] = ""
            }
        }

        card.setOnClickListener {
            for (i in 0..11){
                if(txt[i] != ""){
                    Cleaning.dopUslugi += txt[i]
                    if (i != 11)
                        Cleaning.dopUslugi += ", "
                }
            }



            startActivity(Intent(this@DopUslugiActivity, AdressActivity::class.java))
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

    private fun editData(dH: Int = 0, dM: Int = 0, dC: Int = 0){
        Cleaning.timeH += dH
        Cleaning.timeM += dM
        Cleaning.cost += dC
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