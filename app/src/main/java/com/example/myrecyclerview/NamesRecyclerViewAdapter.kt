package com.example.myrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_adapter_items.view.*


class NamesRecyclerViewAdapter(val namesList: List<Students>) :
    RecyclerView.Adapter<NamesRecyclerViewAdapter.NamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_adapter_items, parent, false)
        return NamesViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return namesList.size
    }
    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        val item=namesList[position]
        holder.rowView.etStudentAttributes.text=item.name
        holder.rowView.etStudentDateOfBirth.text=item.dateOfBirth
        holder.rowView.etStudentHobby.text=item.hobby
    }
    class NamesViewHolder(val rowView: View) : RecyclerView.ViewHolder(rowView)
}