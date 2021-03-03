package com.devilliersdesigns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devilliersdesigns.fragments.adapters.ViewPagerAdapter
import com.devilliersdesigns.fragments.bei_build_1
import com.devilliersdesigns.fragments.ben_build_1
import kotlinx.android.synthetic.main.activity_albedo.*

class Bennet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bennet)
        val actionBar = supportActionBar
        "Bennet".also { actionBar!!.title = it }
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(ben_build_1(), "Pyro Support")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}