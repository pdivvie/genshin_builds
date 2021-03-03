package com.devilliersdesigns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devilliersdesigns.fragments.*
import com.devilliersdesigns.fragments.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_albedo.*

class Amber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amber)
        val actionBar = supportActionBar
        "Amber".also { actionBar!!.title = it }
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(am_build_1(), "Pyro DPS")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}