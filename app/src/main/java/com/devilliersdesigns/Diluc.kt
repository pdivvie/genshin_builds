package com.devilliersdesigns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devilliersdesigns.fragments.adapters.ViewPagerAdapter
import com.devilliersdesigns.fragments.diluc_build_1
import kotlinx.android.synthetic.main.activity_albedo.*

class Diluc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diluc)
        val actionBar = supportActionBar
        "Diluc".also { actionBar!!.title = it }
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(diluc_build_1(), "Pyro DPS")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}