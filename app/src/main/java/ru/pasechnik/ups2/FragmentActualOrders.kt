package ru.pasechnik.ups2

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FragmentActualOrders: Fragment() {

    private lateinit var root: View

    private lateinit var btnGetCleaning: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        root = inflater.inflate(R.layout.fragment_orders, container, false)


        btnGetCleaning = root.findViewById(R.id.getCleaning)


        btnGetCleaning.setOnClickListener{
            startActivity(Intent(root.context, GetCleaningActivity::class.java))
        }



        return root
    }



}