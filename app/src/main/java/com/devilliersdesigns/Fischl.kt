package com.devilliersdesigns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devilliersdesigns.fragments.adapters.ViewPagerAdapter
import com.devilliersdesigns.fragments.fischl_build_1
import kotlinx.android.synthetic.main.activity_albedo.*

class Fischl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fischl)
        val actionBar = supportActionBar
        "Fischl".also { actionBar!!.title = it }
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(fischl_build_1(), "Electro Support")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}