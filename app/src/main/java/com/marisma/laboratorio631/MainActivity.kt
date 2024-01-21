package com.marisma.laboratorio631

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_blank)

        val layout = findViewById<ConstraintLayout>(R.id.fragmento)
        val textview1 = findViewById<TextView>(R.id.textView2)
        val textview2 = findViewById<TextView>(R.id.textView3)
        val textview3 = findViewById<TextView>(R.id.textView4)
        val textview4 = findViewById<TextView>(R.id.textView5)
        val textview5 = findViewById<TextView>(R.id.textView6)
        val textview6 = findViewById<TextView>(R.id.textView7)
        val textview7 = findViewById<TextView>(R.id.textView8)
        val textview8 = findViewById<TextView>(R.id.textView9)
        val textview9 = findViewById<TextView>(R.id.textView10)
        val textview10 = findViewById<TextView>(R.id.textView11)
        textview1.setOnClickListener(){
            textview1.setBackgroundColor(obtenerColorAleatorio(this))
        }
        textview2.setOnClickListener(){
            textview2.setBackgroundColor(obtenerColorAleatorio(this))
        }
        textview3.setOnClickListener(){
            textview3.setBackgroundColor(obtenerColorAleatorio(this))
        }
        textview4.setOnClickListener(){
            textview4.setBackgroundColor(obtenerColorAleatorio(this))
        }
        textview5.setOnClickListener(){
            textview5.setBackgroundColor(obtenerColorAleatorio(this))
        }
        textview6.setOnClickListener(){
            textview6.setBackgroundColor(obtenerColorAleatorio(this))
        }
        textview7.setOnClickListener(){
            textview7.setBackgroundColor(obtenerColorAleatorio(this))
        }
        textview8.setOnClickListener(){
            textview8.setBackgroundColor(obtenerColorAleatorio(this))
        }
        textview9.setOnClickListener(){
            textview9.setBackgroundColor(obtenerColorAleatorio(this))
        }
        textview10.setOnClickListener(){
            textview10.setBackgroundColor(obtenerColorAleatorio(this))
        }

        layout.setOnClickListener() {
            layout.setBackgroundColor(Color.GRAY)
        }
    }
    private fun obtenerColorAleatorio(context: Context): Int {
        // Obtener la lista de colores definidos en colors.xml
        val colores = context.resources.getIntArray(R.array.colores_disponibles)

        // Elegir un color aleatorio
        return colores[Random.nextInt(colores.size)]
    }
}