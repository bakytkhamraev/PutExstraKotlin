package com.example.twokotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_save.setOnClickListener {
            fetchDataFromFields()
            SecondActivity.start(this, user)
        }
    }

    private fun fetchDataFromFields() {
        user = User()
        fistName.text.toString().let {
            if (it.isNotEmpty())
                user.firstName = it
        }

        secondName.text.toString().let {
            if (it.isNotEmpty())
                user.secondName = it
        }

        email.text.toString().let {
            if (it.isNotEmpty())
                user.email = it
        }
        address.text.toString().let {
            if (it.isNotEmpty())
                user.address = it
        }
    }
}