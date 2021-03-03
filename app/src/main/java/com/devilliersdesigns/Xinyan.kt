package com.devilliersdesigns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devilliersdesigns.fragments.adapters.ViewPagerAdapter
import com.devilliersdesigns.fragments.xinyan_build_1
import kotlinx.android.synthetic.main.activity_albedo.*

class Xinyan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xinyan)
        val actionBar = supportActionBar
        "Xinyan".also { actionBar!!.title = it }
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(xinyan_build_1(), "Physical DPS")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}