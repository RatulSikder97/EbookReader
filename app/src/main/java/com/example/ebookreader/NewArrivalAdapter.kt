package com.example.ebookreader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class NewArrivalAdapter(private val newArrivalList: List<NewArrival>): RecyclerView.Adapter<NewArrivalAdapter.NewArrivalViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewArrivalViewHolder {
        val ItemView  = LayoutInflater.from(parent.context).inflate(R.layout.new_arrival_item, parent, false)

        return NewArrivalViewHolder(ItemView)
    }

    override fun onBindViewHolder(holder: NewArrivalViewHolder, position: Int) {
        val currItem =  newArrivalList[position]

        holder.arrivalImage.setImageResource(currItem.imageUrl)
    }

    override fun getItemCount(): Int = newArrivalList.size

    class NewArrivalViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {
        val arrivalImage = ItemView.findViewById<ImageView>(R.id.arrival_image)
    }
}