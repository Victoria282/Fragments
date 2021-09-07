package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragments.Fragments.Fragment1
import com.example.fragments.Fragments.Fragment2
import com.example.fragments.`interface`.SendData

class MainActivity : AppCompatActivity(), SendData {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = Fragment1()
        // на главный экран устанавливаем Первый Фрагмент
        supportFragmentManager.beginTransaction().add(R.id.fragmentLayout, fragment1).commit()
    }

    /*// Функция переключения между фрагментами
    fun changeFragment(fragment:Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragmentLayout, fragment).commit()
    }*/

    override fun sendData(userData: String) {
        val argUser = Bundle()
        val fragment2 = Fragment2()
        argUser.putString("userInfo", userData)
        fragment2.arguments = argUser

        supportFragmentManager.beginTransaction().add(R.id.fragmentLayout, fragment2).commit()
    }
}