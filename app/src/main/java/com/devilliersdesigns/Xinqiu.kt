package com.devilliersdesigns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devilliersdesigns.fragments.adapters.ViewPagerAdapter
import com.devilliersdesigns.fragments.xinqiu_build_1
import kotlinx.android.synthetic.main.activity_albedo.*

class Xinqiu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xinqiu)
        val actionBar = supportActionBar
        "Xinqiu".also { actionBar!!.title = it }
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(xinqiu_build_1(), "Hydro Support")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}