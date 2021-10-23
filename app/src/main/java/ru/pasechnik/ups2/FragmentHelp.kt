package ru.pasechnik.ups2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.transition.MaterialSharedAxis

class FragmentHelp: Fragment() {

    private lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        enterTransition = MaterialSharedAxis(MaterialSharedAxis.X, /* forward= */ false)
        returnTransition = MaterialSharedAxis(MaterialSharedAxis.X, /* forward= */ false)
        root = inflater.inflate(R.layout.fragment_help, container, false)



        return root
    }



}