package com.example.kotlinbasic01_jaewhi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    clickBtn.setOnClickListener {
        Log.d("메인화면","클릭용 버튼 눌림")
    }

    }
}