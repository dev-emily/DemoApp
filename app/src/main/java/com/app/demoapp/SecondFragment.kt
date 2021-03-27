package com.app.demoapp

import android.content.res.Resources
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration

/**
 * A fragment representing a list of Items.
 */
class SecondFragment: Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second_list, container, false)
        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                layoutManager =  LinearLayoutManager(context)
                adapter = TabTwoRecyclerViewAdapter(ListItemContent.itemList)
                var decoration = DividerItemDecoration(view.context, LinearLayout.VERTICAL)
                decoration.setDrawable(this@SecondFragment.resources.getDrawable(R.drawable.divider, null))
                view.addItemDecoration(decoration)
            }
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}