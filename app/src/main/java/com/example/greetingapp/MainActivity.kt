package com.example.greetingapp // The code said "yourname" and not what my workspace use which is "example"
// FIXED R unresolved here


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Get references to the UI elements by their id
        val etName = findViewById<EditText>(R.id.etName)
        val btnGreet = findViewById<Button>(R.id.btnGreet)
        val tvGreeting = findViewById<TextView>(R.id.tvGreeting)

        // challenge #2 ImageView
        val ivEmailIcon = findViewById<ImageView>(R.id.emailIcon)

        // challenge #4
        val btnReset = findViewById<Button>(R.id.btnReset)

        // 2. Handle the button click event
        btnGreet.setOnClickListener {
            val name = etName.text.toString()

            if (name.isBlank()) {
                tvGreeting.text = "Please enter your name first."


            } else {
                tvGreeting.text = "Hello, $name! Welcome to your first app."
                // Below is for challenge #1
                Toast.makeText(this, "Greeting sent!", Toast.LENGTH_SHORT).show()

                // Challenge #2
                ivEmailIcon.visibility = View.VISIBLE

                // Challenge # 4
                btnReset.visibility = View.VISIBLE

            }
        }
        // Challenge #4
        btnReset.setOnClickListener {
            etName.setText("")
            tvGreeting.text = ""
            ivEmailIcon.visibility = View.GONE
            btnReset.visibility = View.GONE
        }



    }
}
