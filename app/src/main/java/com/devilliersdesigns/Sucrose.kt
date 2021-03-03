package com.devilliersdesigns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devilliersdesigns.fragments.adapters.ViewPagerAdapter
import com.devilliersdesigns.fragments.sucrose_build_1
import kotlinx.android.synthetic.main.activity_albedo.*

class Sucrose : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sucrose)
        val actionBar = supportActionBar
        "Sucrose".also { actionBar!!.title = it }
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(sucrose_build_1(), "Anemo Support")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}