package com.example.twokotlin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    lateinit var user: User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        user = intent.getSerializableExtra(SECOND) as User
        fistName.text = user.firstName
        secondName.text = user.secondName
        email.text = user.email
        address.text = user.address
    }


    companion object {
        const val SECOND = "11"
        fun start(context: Context?, userInfo: User) {
            var intent = Intent(context, SecondActivity::class.java)
            intent.putExtra(SECOND, userInfo)
            context?.startActivity(intent)
        }
    }
}