package com.devilliersdesigns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devilliersdesigns.fragments.adapters.ViewPagerAdapter
import com.devilliersdesigns.fragments.al_build_1_fragment
import com.devilliersdesigns.fragments.al_build_2_fragment
import com.devilliersdesigns.fragments.noelle_build_1
import kotlinx.android.synthetic.main.activity_albedo.*

class Noelle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noelle)
        val actionBar = supportActionBar
        "Noelle".also { actionBar!!.title = it }
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(noelle_build_1(), "Build 1")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}