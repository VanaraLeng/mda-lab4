package com.vanaraleng.lab3

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.vanaraleng.lab3.models.User
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    var userList = arrayListOf<User>(
        User("Jonh", "Mark", "tester@mail.com", "123abc"),
        User("Miley", "Cyrus", "miley@gmail.com", "P@SSword"),
        User("Mark", "Zuck", "jonhmark@ymail.com", "P@SSword"),
        User("Mike", "Jonhson", "mike@zmail.com", "P@SSword")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun signInButtonClick(view: View) {
        val username = editTextUsername.text.toString()
        val password = editPassword.text.toString()

         val user = userList.find { it.username == username && it.password == password }

        user?.let {
            openShoppingActivity(it)
        }
    }

    private fun openShoppingActivity(user: User) {
        startActivity(Intent(this, ShoppingActivity::class.java).apply {
            putExtra("username", user.username)
        })
    }

    fun signUpButtonClick(view: View) {

    }

    fun forgetPasswordClick(view: View) {

    }

}