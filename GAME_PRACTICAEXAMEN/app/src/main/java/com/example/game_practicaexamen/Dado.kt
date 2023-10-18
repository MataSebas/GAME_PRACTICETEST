package com.example.game_practicaexamen

import java.lang.Thread.sleep

class Dado {
    private val diceRange = 0..17
    private var vector: IntArray = IntArray(18)

    init {
        vector[0] = R.drawable.baseline_1k_24
        vector[1] = R.drawable.baseline_2k_24
        vector[2] = R.drawable.baseline_3k_24
        vector[3] = R.drawable.baseline_4k_24
        vector[4] = R.drawable.baseline_5k_24
        vector[5] = R.drawable.baseline_6k_24
        vector[6] = R.drawable.baseline_7k_24
        vector[7] = R.drawable.baseline_8k_24
        vector[8] = R.drawable.baseline_9k_24
        vector[9] = R.drawable.baseline_10k_24
        vector[10] = R.drawable.baseline_11mp_24
        vector[11] = R.drawable.baseline_12mp_24
        vector[12] = R.drawable.baseline_13mp_24
        vector[13] = R.drawable.baseline_14mp_24
        vector[14] = R.drawable.baseline_15mp_24
        vector[15] = R.drawable.baseline_16mp_24
        vector[16] = R.drawable.baseline_17mp_24
        vector[17] = R.drawable.baseline_18mp_24
    }

    fun obtener(): Int {
        sleep(1000)
        val randomNumber = diceRange.random()
        sleep(300)
        return vector[randomNumber]
    }
}