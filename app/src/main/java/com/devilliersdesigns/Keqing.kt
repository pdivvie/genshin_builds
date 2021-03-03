package com.devilliersdesigns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devilliersdesigns.fragments.adapters.ViewPagerAdapter
import com.devilliersdesigns.fragments.keqing_build_1
import kotlinx.android.synthetic.main.activity_albedo.*

class Keqing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keqing)
        val actionBar = supportActionBar
        "Keqing".also { actionBar!!.title = it }
        actionBar?.setDisplayHomeAsUpEnabled(true)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(keqing_build_1(), "Electro DPS")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}