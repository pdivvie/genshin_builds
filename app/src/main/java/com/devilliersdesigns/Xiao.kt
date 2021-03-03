package com.devilliersdesigns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devilliersdesigns.fragments.adapters.ViewPagerAdapter
import com.devilliersdesigns.fragments.xiao_build_1
import kotlinx.android.synthetic.main.activity_albedo.*

class Xiao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xiao)
        val actionBar = supportActionBar
        "Xiao".also { actionBar!!.title = it }
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(xiao_build_1(), "Anemo DPS")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}