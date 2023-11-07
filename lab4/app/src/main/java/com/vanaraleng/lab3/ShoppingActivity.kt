package com.vanaraleng.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_shopping.*

class ShoppingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        // Setup username
        val username = intent.getStringExtra("username")
        textEmail.text = "Welcome $username"
    }

    fun onClickElectronic(view: View) {
        Toast.makeText(this, "Hi there! This is Electronic.", Toast.LENGTH_LONG).show()
    }

    fun onClickClothing(view: View) {
        Toast.makeText(this, "Hi there! This is Clothing.", Toast.LENGTH_LONG).show()
    }

    fun onClickBeauty(view: View) {
        Toast.makeText(this, "Hi there! This is Beauty.", Toast.LENGTH_LONG).show()
    }

    fun onClickFood(view: View) {
        Toast.makeText(this, "Hi there! This is Food.", Toast.LENGTH_LONG).show()
    }
}