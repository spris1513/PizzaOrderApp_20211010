package com.example.pizzaorderapp_20211010.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.pizzaorderapp_20211010.EditNickNameActivity
import com.example.pizzaorderapp_20211010.R
import kotlinx.android.synthetic.main.fragment_my_profile.*

class MyProfileFragment : Fragment() {

    val REQ_FOR_NICKNAME = 1015

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile, container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        edtNickNameBtn.setOnClickListener {

            val myIntent = Intent(requireContext(), EditNickNameActivity::class.java)
            startActivityForResult(myIntent,REQ_FOR_NICKNAME)

        }


    }

}