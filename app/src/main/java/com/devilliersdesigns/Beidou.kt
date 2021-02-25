package com.devilliersdesigns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devilliersdesigns.fragments.adapters.ViewPagerAdapter
import com.devilliersdesigns.fragments.ba_build_1
import com.devilliersdesigns.fragments.bei_build_1
import kotlinx.android.synthetic.main.activity_albedo.*

class Beidou : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beidou)
        val actionBar = supportActionBar
        "Beidou".also { actionBar!!.title = it }
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(bei_build_1(), "Build 1")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}