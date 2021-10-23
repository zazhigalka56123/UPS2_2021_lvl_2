package ru.pasechnik.ups2

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.transition.MaterialSharedAxis
import ru.pasechnik.ups2.getCleaning.GetCleaningActivity

class FragmentVypolnOrders: Fragment(){


    private lateinit var root: View

    private lateinit var btnGetCleaning: Button
    private lateinit var btnActual: ImageView

    private lateinit var constraintGetClean: ConstraintLayout
    private lateinit var noContext: ConstraintLayout

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        enterTransition = MaterialSharedAxis(MaterialSharedAxis.X, /* forward= */ false)
        returnTransition = MaterialSharedAxis(MaterialSharedAxis.X, /* forward= */ false)

        root = inflater.inflate(R.layout.fragment_vypoln_orders, container, false)


        btnActual = root.findViewById(R.id.btnActual)
        btnGetCleaning = root.findViewById(R.id.getCleaning)

        constraintGetClean = root.findViewById(R.id.constraintGetClean)
        noContext = root.findViewById(R.id.noContext)

        btnGetCleaning.setOnClickListener {
            startActivity(Intent(root.context, GetCleaningActivity::class.java))
        }

        btnActual.setOnClickListener {
            findNavController().navigate(R.id.mainOrders)
        }

        if(Cleaning.isActive){
            constraintGetClean.visibility = View.VISIBLE
            noContext.visibility = View.GONE
        }else{
            constraintGetClean.visibility = View.GONE
            noContext.visibility = View.VISIBLE
        }


        return root
    }
}
