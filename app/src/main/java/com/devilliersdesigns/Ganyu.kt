package com.devilliersdesigns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devilliersdesigns.fragments.adapters.ViewPagerAdapter
import com.devilliersdesigns.fragments.ganyu_build_1
import kotlinx.android.synthetic.main.activity_albedo.*

class Ganyu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ganyu)
        val actionBar = supportActionBar
        "Ganyu".also { actionBar!!.title = it }
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(ganyu_build_1(), "Cryo DPS")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}