package com.example.grocerydelivery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.grocerydelivery.data.FoodItem
import kotlinx.android.synthetic.main.a_single_dish.view.*

class dishAdapter(private val foodItems: List<FoodItem>) :
    RecyclerView.Adapter<dishAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.a_single_dish, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = foodItems.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val foodItem = foodItems[position]
        holder.bind(foodItem)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(foodItem: FoodItem) {
            itemView.foodImage.setImageResource(foodItem.image)
            itemView.foodTitle.text = foodItem.name
            itemView.foodDescription.text = foodItem.description
            itemView.foodPrice.text = "$ ${foodItem.price}"
            if(foodItem.isNew) {
                itemView.foodIsNew.alpha = 1.0F
            }
            else {
                itemView.foodIsNew.alpha = 0F
            }
        }

    }
}