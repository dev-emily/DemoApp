package com.app.demoapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPageAdapter(fragmentManager: FragmentManager, behavior:Int): FragmentPagerAdapter(fragmentManager, behavior) {
    private var pages:List<Pair<Fragment,String>> = ArrayList<Pair<Fragment,String>>()

    override fun getItem(position: Int): Fragment {
        return pages.get(position).first
    }

    override fun getCount(): Int = pages.size

    override fun getPageTitle(position: Int): String? {
        return pages.get(position).second
    }

    fun setPages(pages:List<Pair<Fragment,String>>){
        this.pages = pages
    }

}