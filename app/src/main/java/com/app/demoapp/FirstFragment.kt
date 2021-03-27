package com.app.demoapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.button.MaterialButton
import com.google.android.material.tabs.TabLayout

class FirstFragment(): Fragment() {

    constructor(tabChangeListener:TabChangeListener):this(){
        this.tabChangeListener = tabChangeListener
    }

    private lateinit var tab2Button:MaterialButton
    private lateinit var tabChangeListener:TabChangeListener

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tab2Button = view.findViewById(R.id.tab2_button)
        //jump to tab 2
        tab2Button.setOnClickListener{
            tabChangeListener.onTabChange(1)
        }
    }

}