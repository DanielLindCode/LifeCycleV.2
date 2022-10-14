package com.example.loginform

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.example.loginform.databinding.FragmentEditBinding


class EditFragment : Fragment(R.layout.fragment_edit) {

    private lateinit var binding: FragmentEditBinding

    var switchResult = ""

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentEditBinding.bind(view)

        binding.switchDarkMode.setOnClickListener {
            if (binding.switchDarkMode.isChecked) switchResult = "Yes"
            else switchResult = "No"
        }

        binding.submitBtn.setOnClickListener {

            SecondActivity.name = binding.editName.text.toString()
            SecondActivity.age = binding.editAge.text.toString()
            SecondActivity.phoneNr = binding.editPhone.text.toString()
            if (binding.editPet.isChecked) SecondActivity.petOwner = "Yes"
            else SecondActivity.petOwner = "No"
            SecondActivity.darkmode = switchResult

        }
    }
}

