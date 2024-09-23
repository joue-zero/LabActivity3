package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView
    lateinit var nameEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)
        nameEditText = findViewById(R.id.nameEditText)
        
        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            if(nameEditText.text.isEmpty()){
                displayTextView.text = "Hello, World!"
                nameEditText.error = "Please enter your name"
                return@setOnClickListener
            }
            displayTextView.text = "Hello, ${nameEditText.text}"
        }


    }
}