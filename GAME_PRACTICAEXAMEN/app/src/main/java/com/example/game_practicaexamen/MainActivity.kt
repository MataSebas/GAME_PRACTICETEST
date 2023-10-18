package com.example.game_practicaexamen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.NumberPicker
import android.widget.Toast
import com.example.game_practicaexamen.R


class MainActivity : AppCompatActivity() {
    private lateinit var txt_PlayerName: EditText
    private lateinit var fecNacido: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numberPicker: NumberPicker = findViewById(R.id.numberPicker)
        txt_PlayerName   = findViewById(R.id.PlayerName)
        fecNacido   = findViewById(R.id.DatePicker)
        numberPicker.minValue = 0
        numberPicker.maxValue = 3


    }

    fun ejecutar(view: View) {
        var aplicar = true
        if (txt_PlayerName.getText().toString().trim({ it <= ' ' }).length == 0) {
            Toast.makeText(this, "Id requerido", Toast.LENGTH_SHORT).show()
            txt_PlayerName.requestFocus()
            aplicar = false
        }

        if (fecNacido.getText().toString().trim({ it <= ' ' }).length == 0 && aplicar) {
            Toast.makeText(this, "Fecha requerida", Toast.LENGTH_SHORT).show()
            fecNacido.requestFocus()
            aplicar = false
        }

            if (aplicar) {
                //Invoca otra ventana
                val Game_Screen = Intent(this, GameScreen::class.java)


                Game_Screen.putExtra("Nombre Jugador", txt_PlayerName.getText())

                startActivity(Game_Screen)

            }//fin del if de aplicar
        }//fin del método ejecutar
    }

