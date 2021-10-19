package ru.pasechnik.ups2

import android.media.Image
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.button.MaterialButton

class FragmentEducation1: Fragment() {
    private lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        root = inflater.inflate(R.layout.fragment_education_1, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.education_viewpager)
        val btn = root.findViewById<ImageButton>(R.id.btn_next_educ_1)

        btn.setOnClickListener {
            viewPager?.currentItem = 1
        }

        return root
    }
}