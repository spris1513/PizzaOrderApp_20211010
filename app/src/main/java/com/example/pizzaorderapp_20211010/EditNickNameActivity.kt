package com.example.pizzaorderapp_20211010

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nick_name.*

class EditNickNameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nick_name)

        okBtn.setOnClickListener {

            val inputNickname = nicknameEdt.text.toString()
            val resultIntent = Intent()
            resultIntent.putExtra("nickname",inputNickname)
            setResult(RESULT_OK,resultIntent)
            finish()

        }

    }
}