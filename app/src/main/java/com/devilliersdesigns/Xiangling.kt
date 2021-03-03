package com.devilliersdesigns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devilliersdesigns.fragments.adapters.ViewPagerAdapter
import com.devilliersdesigns.fragments.xiangling_build_1
import kotlinx.android.synthetic.main.activity_albedo.*

class Xiangling : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xiangling)
        val actionBar = supportActionBar
        "Xiangling".also { actionBar!!.title = it }
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(xiangling_build_1(), "Pyro Support")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}