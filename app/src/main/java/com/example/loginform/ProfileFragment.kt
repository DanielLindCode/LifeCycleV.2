package com.example.loginform

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.loginform.databinding.FragmentEditBinding
import com.example.loginform.databinding.FragmentProfileBinding


class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private lateinit var binding: FragmentProfileBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)




        binding.nameInput.text = SecondActivity.name
        binding.ageInput.text = SecondActivity.age
        binding.phoneNrInput.text = SecondActivity.phoneNr
        binding.petOwnerInput.text = SecondActivity.petOwner.toString()
        binding.darkMode.text = SecondActivity.darkmode.toString()

    }


}