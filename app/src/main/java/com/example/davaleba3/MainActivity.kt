package com.example.davaleba3

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.util.ArrayList

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    var firstplayer = ArrayList<Int>()
    var secoundplayer = ArrayList<Int>()
    var active = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    fun init() {
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
    }

    override fun onClick(clickview: View?) {
        if (clickview is Button) {
            var num = 0
            when (clickview.id) {
                R.id.button1 -> num = 1
                R.id.button2 -> num = 2
                R.id.button3 -> num = 3
                R.id.button4 -> num = 4
                R.id.button5 -> num = 5
                R.id.button6 -> num = 6
                R.id.button7 -> num = 7
                R.id.button8 -> num = 8
                R.id.button9 -> num = 9
            }
            if (num != 0) {
                game(clickview, num)
            }
        }
    }

    fun game(view: Button, num: Int) {
        if (active == 1) {
            view.text = "x"
            view.setBackgroundColor(Color.BLUE)
            firstplayer.add(num)
            active = 2
        } else {
            secoundplayer.add(num)
            view.text = "0"
            view.setBackgroundColor(Color.RED)
            active = 1
        }
        view.isEnabled = false
        check()
    }

    fun check() {
        var winner = 0
        if (firstplayer.contains(1) && firstplayer.contains(2) && firstplayer.contains(3)) {
            winner = 1
        } else {
            winner = 3
        }
        if (secoundplayer.contains(1) && secoundplayer.contains(2) && secoundplayer.contains(3)) {
            winner = 2
        } else {
            winner = 3
        }
        if (firstplayer.contains(4) && firstplayer.contains(5) && firstplayer.contains(6)) {
            winner = 1
        } else {
            winner = 3
        }
        if (secoundplayer.contains(4) && secoundplayer.contains(5) && secoundplayer.contains(6)) {
            winner = 2
        } else {
            winner = 3
        }
        if (firstplayer.contains(7) && firstplayer.contains(8) && firstplayer.contains(9)) {
            winner = 1
        } else {
            winner = 3
        }
        if (secoundplayer.contains(7) && secoundplayer.contains(8) && secoundplayer.contains(9)) {
            winner = 2
        } else {
            winner = 3
        }
        if (firstplayer.contains(1) && firstplayer.contains(4) && firstplayer.contains(7)) {
            winner = 1
        } else {
            winner = 3
        }
        if (secoundplayer.contains(1) && secoundplayer.contains(4) && secoundplayer.contains(7)) {
            winner = 2
        } else {
            winner = 3
        }
        if (firstplayer.contains(2) && firstplayer.contains(5) && firstplayer.contains(8)) {
            winner = 1
        } else {
            winner = 3
        }
        if (secoundplayer.contains(2) && secoundplayer.contains(5) && secoundplayer.contains(8)) {
            winner = 2
        } else {
            winner = 3
        }
        if (firstplayer.contains(3) && firstplayer.contains(6) && firstplayer.contains(9)) {
            winner = 1
        } else {
            winner = 3
        }
        if (secoundplayer.contains(3) && secoundplayer.contains(6) && secoundplayer.contains(9)) {
            winner = 2
        } else {
            winner = 3
        }
        if (firstplayer.contains(7) && firstplayer.contains(5) && firstplayer.contains(3)) {
            winner = 1
        } else {
            winner = 3
        }
        if (secoundplayer.contains(7) && secoundplayer.contains(5) && secoundplayer.contains(3)) {
            winner = 2
        } else {
            winner = 3
        }
        if (firstplayer.contains(1) && firstplayer.contains(5) && firstplayer.contains(9)) {
            winner = 1
        } else {
            winner = 3
        }
        if (secoundplayer.contains(1) && secoundplayer.contains(5) && secoundplayer.contains(9)) {
            winner = 2
        } else {
            winner = 3
        }
        if (winner == 1) {
            Toast.makeText(this, "1", Toast.LENGTH_SHORT).show()
        } else if (winner == 2) {
            Toast.makeText(this, "2", Toast.LENGTH_SHORT).show()
        } else if (winner == 3 ) {
            Toast.makeText(this, "Tie", Toast.LENGTH_SHORT).show()
        }

    }

}