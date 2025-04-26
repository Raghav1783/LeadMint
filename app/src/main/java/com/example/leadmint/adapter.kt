package com.example.leadmint

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class adapter(private val layouts: List<Int>) : RecyclerView.Adapter<adapter.IntroViewHolder>() {

    inner class IntroViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(viewType, parent, false)
        return IntroViewHolder(view)
    }

    override fun getItemCount()
        = layouts.size

    override fun onBindViewHolder(holder: IntroViewHolder, position: Int) {

    }

    override fun getItemViewType(position: Int) = layouts[position]
}