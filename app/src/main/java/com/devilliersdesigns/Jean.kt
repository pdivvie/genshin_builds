package com.devilliersdesigns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devilliersdesigns.fragments.adapters.ViewPagerAdapter
import com.devilliersdesigns.fragments.al_build_1_fragment
import com.devilliersdesigns.fragments.al_build_2_fragment
import com.devilliersdesigns.fragments.jean_build_1
import kotlinx.android.synthetic.main.activity_albedo.*

class Jean : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jean)
        val actionBar = supportActionBar
        "Jean".also { actionBar!!.title = it }
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(jean_build_1(), "Build 1")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}