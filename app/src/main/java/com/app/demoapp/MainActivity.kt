package com.app.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.button.MaterialButton
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity(), TabChangeListener {
    private val TAG = "MainActivity"
    private lateinit var pageAdapter: ViewPageAdapter
    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout
    private lateinit var tab2Button: MaterialButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager = findViewById(R.id.view_pager)
        tabLayout = findViewById(R.id.tab_layout)

        //set pager adapter
        pageAdapter = ViewPageAdapter(supportFragmentManager, FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
        var pages:ArrayList<Pair<Fragment,String>> = arrayListOf(Pair(FirstFragment(this),"Tab 1"), Pair(SecondFragment(), "Tab 2"));
        pageAdapter.setPages(pages);

        //set adapter and tab layout
        viewPager.adapter = pageAdapter
        tabLayout.setupWithViewPager(viewPager)

    }

    override fun onTabChange(tabIndex: Int) {
        //jump to tab [position]
        viewPager.currentItem = tabIndex
    }


}