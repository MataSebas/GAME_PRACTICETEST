package com.example.game_practicaexamen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.Toast

class GameScreen : AppCompatActivity() {
    private lateinit var lblPlayerName: EditText
    private val dado1 = Dado()
    private val dado2 = Dado()
    private val dado3 = Dado()

    private lateinit var btnJugar: Button
    private lateinit var img01: ImageView
    private lateinit var img02: ImageView
    private lateinit var img03: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_screen)
        val radio01: RadioButton = findViewById(R.id.Radio01)
        val radio02: RadioButton = findViewById(R.id.Radio02)
        val radio03: RadioButton = findViewById(R.id.Radio03)
        val radio04: RadioButton = findViewById(R.id.Radio04)
        val radio05: RadioButton = findViewById(R.id.Radio05)
        val radio06: RadioButton = findViewById(R.id.Radio06)
        val radio07: RadioButton = findViewById(R.id.Radio07)
        val radio08: RadioButton = findViewById(R.id.Radio08)
        val radio09: RadioButton = findViewById(R.id.Radio09)
        val radio10: RadioButton = findViewById(R.id.Radio10)
        val radio11: RadioButton = findViewById(R.id.Radio11)
        val radio12: RadioButton = findViewById(R.id.Radio12)
        val radio13: RadioButton = findViewById(R.id.Radio13)
        val radio14: RadioButton = findViewById(R.id.Radio14)
        val radio15: RadioButton = findViewById(R.id.Radio15)
        val radio16: RadioButton = findViewById(R.id.Radio16)
        val radio17: RadioButton = findViewById(R.id.Radio17)
        val radio18: RadioButton = findViewById(R.id.Radio18)


        val Player_Name = intent.extras!!.get("Nombre Jugador")!!.toString()
        lblPlayerName = findViewById(R.id.lblName)
        lblPlayerName.setText(Player_Name)

        val amountAvailableEditText: EditText = findViewById(R.id.AmountAvailable)
        val amountBetEditText: EditText = findViewById(R.id.AmountBet)

        val editTextValue: String = amountBetEditText.text.toString().trim()

        if (editTextValue.isNotEmpty()) {
            val amountAvailableString: String = amountAvailableEditText.text.toString()
            val amountBetString: String = amountBetEditText.text.toString()
            val amountAvailable: Double = amountAvailableString.replace(".", "").toDouble()
            val amountBet: Double = amountBetString.replace(".", "").toDouble()

            if (amountBet > amountAvailable) {
                // Mostrar un mensaje de error al usuario
                Toast.makeText(this, "El monto apostado no puede ser mayor al monto disponible", Toast.LENGTH_SHORT).show()
            } else {
                //val allRadioButtons = listOf(radio01, radio02, radio03, radio04, radio05,radio06,radio07, radio08, radio09, radio10, radio11, radio12, radio13, radio14, radio15, radio16, radio17, radio18)

                //for (radioButton in allRadioButtons) {
                //    radioButton.setOnClickListener {
                //        for (otherRadioButton in allRadioButtons) {
                //            if (otherRadioButton.id != radioButton.id) {
                //                otherRadioButton.isChecked = false
                //            }
                //       }

                //    }
                //}

                //fun getSelectedRadioButtonValue(): String? {
                //    for (radioButton in allRadioButtons) {
                //        if (radioButton.isChecked) {
                //            return radioButton.text.toString()
                //        }
                //    }
                //    return null
                //}
                btnJugar = findViewById(R.id.Play)
                img01 = findViewById(R.id.Dice1)
                img02 = findViewById(R.id.Dice2)
                img03 = findViewById(R.id.Dice3)

                btnJugar.setOnClickListener {
                    img01.setImageResource(dado1.obtener())
                    img02.setImageResource(dado2.obtener())
                    img03.setImageResource(dado3.obtener())
                }
            }
        } else {
            Toast.makeText(this, "Por favor, ingrese un valor", Toast.LENGTH_SHORT).show()
        }


    }
}