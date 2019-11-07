package com.example.kittyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val treatmentList = arrayListOf("Brush my hair", "Rub my paw", "Feed me some snacks", "Scratch my back", "Get me a mouse")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        powBtn.setOnClickListener {
            val random = Random
            val randomTreatment = random.nextInt(treatmentList.count())
            actionTxt.text = treatmentList[randomTreatment]
        }

        addBtn.setOnClickListener {
            val newTreatment = addTtmt.text.toString()
            treatmentList.add(newTreatment)
            addTtmt.text.clear()
            println(treatmentList)
        }
    }
}
