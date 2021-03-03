package com.devilliersdesigns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devilliersdesigns.fragments.adapters.ViewPagerAdapter
import com.devilliersdesigns.fragments.tartaglia_build_1
import kotlinx.android.synthetic.main.activity_albedo.*

class Tartaglia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tartaglia)
        val actionBar = supportActionBar
        "Tartaglia".also { actionBar!!.title = it }
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(tartaglia_build_1(), "Hydro DPS")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}