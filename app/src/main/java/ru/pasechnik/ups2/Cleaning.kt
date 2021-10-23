package ru.pasechnik.ups2

import kotlin.math.abs


object Cleaning {
    var toilets = 0
    var rooms = 0
    var cost = 650
    var timeH = 0
    var timeM = 0

    var adr = ""
    var data = ""
    var time = ""
    var dopUslugi = ""
    var zakazNumber = ""

    var isActive = false


    fun editTime(){
        if (timeM > 0) {
            timeH += timeM / 60
            timeM %= 60
        }else{
            val dM = abs(timeM)
            var htm = timeH * 60

            if (htm > dM){
                htm -= dM

                timeH = htm / 60
                timeM = htm - timeH * 60

            }
        }
    }
}