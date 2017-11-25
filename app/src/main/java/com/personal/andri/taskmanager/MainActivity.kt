package com.personal.andri.taskmanager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputLayout
import android.support.v7.widget.AppCompatButton
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton = findViewById<AppCompatButton>(R.id.login_button)
        val usernameInput = findViewById<TextInputLayout>(R.id.username_input)
        val passInput = findViewById<TextInputLayout>(R.id.password_input)

        loginButton.setOnClickListener{
            Toast.makeText(this, usernameInput.editText?.text, Toast.LENGTH_LONG).show()
        }

    }
}
