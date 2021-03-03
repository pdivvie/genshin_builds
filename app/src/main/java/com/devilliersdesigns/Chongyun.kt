package com.devilliersdesigns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devilliersdesigns.fragments.adapters.ViewPagerAdapter
import com.devilliersdesigns.fragments.chongyun_build_1
import kotlinx.android.synthetic.main.activity_albedo.*

class Chongyun : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chongyun)
        val actionBar = supportActionBar
        "Chongyun".also { actionBar!!.title = it }
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(chongyun_build_1(), "Cryo DPS")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}