package ru.pasechnik.ups2

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.airbnb.lottie.LottieAnimationView
import com.google.android.material.textview.MaterialTextView
import com.google.android.material.transition.MaterialSharedAxis
import ru.pasechnik.ups2.getCleaning.GetCleaningActivity

class FragmentActualOrders: Fragment() {

    private lateinit var root: View

    private lateinit var btnGetCleaning: Button
    private lateinit var btnVypoln: ImageView
    private lateinit var constraintGetClean: ConstraintLayout
    private lateinit var constraintActive: ConstraintLayout

    private lateinit var tvZakaz: MaterialTextView
    private lateinit var tvCost: MaterialTextView
    private lateinit var tvAdres: MaterialTextView

    private lateinit var anim: LottieAnimationView

    private lateinit var iv_card: ImageView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        enterTransition = MaterialSharedAxis(MaterialSharedAxis.X, /* forward= */ false)
        returnTransition = MaterialSharedAxis(MaterialSharedAxis.X, /* forward= */ false)


        root = inflater.inflate(R.layout.fragment_actual_orders, container, false)


        btnGetCleaning = root.findViewById(R.id.getCleaning)
        btnVypoln = root.findViewById(R.id.btnVypoln)

        constraintGetClean = root.findViewById(R.id.constraintGetClean)
        constraintActive = root.findViewById(R.id.constraintActive)

        tvZakaz = root.findViewById(R.id.tvZakaz)
        tvCost = root.findViewById(R.id.tvCost)
        tvAdres = root.findViewById(R.id.tvAdress)
        anim = root.findViewById(R.id.anim)
        iv_card = root.findViewById(R.id.iv_card)

        tvZakaz.text = Cleaning.zakazNumber
        tvCost.text = "${Cleaning.cost} ₽"
        tvAdres.text = Cleaning.adr

        anim.apply {
            setAnimation("hour_loader.json")
            loop(true)
            playAnimation()
        }

        iv_card.setOnClickListener {
            startActivity(Intent(root.context, GetCleaningActivity::class.java))
        }

        btnVypoln.setOnClickListener {
            findNavController().navigate(R.id.mainOrdersVypoln)
        }

        if(Cleaning.isActive) {
            constraintGetClean.visibility = View.GONE
            constraintActive.visibility = View.VISIBLE


        }else{
            constraintGetClean.visibility = View.VISIBLE
            constraintActive.visibility = View.GONE
        }

        btnGetCleaning.setOnClickListener{
            startActivity(Intent(root.context, GetCleaningActivity::class.java))
        }



        return root
    }



}