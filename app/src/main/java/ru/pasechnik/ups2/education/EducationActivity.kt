package ru.pasechnik.ups2.education

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.rd.PageIndicatorView
import com.rd.animation.type.AnimationType
import ru.pasechnik.ups2.R

class EducationActivity : AppCompatActivity() {

    private lateinit var pagerAdapter: EducationViewPagerAdapter
    private lateinit var viewPager: ViewPager2
    private lateinit var pagerDots: PageIndicatorView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)

        viewPager = findViewById(R.id.education_viewpager)
        pagerDots = findViewById(R.id.page_indicator)
        pagerDots.setAnimationType(AnimationType.DROP)


        val fragments = arrayListOf(
            FragmentEducation1(),
            FragmentEducation2(),
            FragmentEducation3()
        )

        pagerAdapter =
            EducationViewPagerAdapter(
                fragments,
                lifecycle,
                supportFragmentManager
            )


        pagerDots.setAnimationType(AnimationType.DROP)
        viewPager.adapter = pagerAdapter
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                pagerDots.selection = position
            }
        })
    }
}