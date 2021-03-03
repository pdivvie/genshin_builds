package com.devilliersdesigns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devilliersdesigns.fragments.adapters.ViewPagerAdapter
import com.devilliersdesigns.fragments.zhongli_build_1
import kotlinx.android.synthetic.main.activity_albedo.*

class Zhongli : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zhongli)
        val actionBar = supportActionBar
        "Zhongli".also { actionBar!!.title = it }
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(zhongli_build_1(), "Geo Support")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}