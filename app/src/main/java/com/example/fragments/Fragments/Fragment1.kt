package com.example.fragments.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.fragments.MainActivity
import com.example.fragments.R
import com.example.fragments.`interface`.SendData
import java.lang.reflect.Array.newInstance

class Fragment1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_one_layout, container, false)
        val varSendData = activity as SendData
        val nextFragment : Button = view.findViewById(R.id.nextFragment)
        val userName: EditText = view.findViewById(R.id.userName)
        val userSurname: EditText = view.findViewById(R.id.userSurname)
        val userAge: EditText = view.findViewById(R.id.userAge)
        val ratingBar: RatingBar = view.findViewById(R.id.ratingBar)

        nextFragment.setOnClickListener() {
            val strResult = "Имя:   " + " " + userName.text.toString() + "\n" +
                            "Фамилия:  " + " " + userSurname.text.toString() + "\n" +
                            "Возраст:  " + " " + userAge.text.toString() + "\n" +
                            "Ваша оценка: " + " " + ratingBar.rating.toString()
            varSendData.sendData(strResult)
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}