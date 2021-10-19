package ru.pasechnik.ups2.education

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton

class FragmentEducation3: Fragment() {
    private lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        root = inflater.inflate(R.layout.fragment_education_3, container, false)

        val btn = root.findViewById<ImageButton>(R.id.btn_next_educ_3)

        btn.setOnClickListener {
            startActivity(Intent(it.context, MainActivity::class.java))
            activity?.finish()
        }

        return root
    }
}