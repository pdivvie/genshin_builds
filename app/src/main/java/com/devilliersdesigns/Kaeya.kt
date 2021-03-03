package com.devilliersdesigns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devilliersdesigns.fragments.adapters.ViewPagerAdapter
import com.devilliersdesigns.fragments.kaeya_build_1
import kotlinx.android.synthetic.main.activity_albedo.*

class Kaeya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kaeya)
        val actionBar = supportActionBar
        "Kaeya".also { actionBar!!.title = it }
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(kaeya_build_1(), "Cryo Support")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}