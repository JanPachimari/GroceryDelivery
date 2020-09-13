package com.example.grocerydelivery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.grocerydelivery.data.FoodItem
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

/*        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
 */
        val foodItems = listOf(
            FoodItem(R.drawable.pizza_margherita, "Pizza Margherita", "with tomato sauce and mozzarella", 4.99, false),
            FoodItem(R.drawable.pizza_salami, "Pizza Salami", "with beef salami", 5.99, false),
            FoodItem(R.drawable.pizza_tuna, "Pizza Tuna", "with fresh tuna and onions", 6.49, true),
            FoodItem(R.drawable.pizza_sucuk, "Pizza Sucuk", "with spicy garlic sucuk, olives \nand goat cheese", 6.99, true),
            FoodItem(R.drawable.pizza_funghi, "Pizza Funghi", "with mushrooms and broccoli", 5.49, false),
            FoodItem(R.drawable.pizza_hotdog, "Pizza Hot Dog", "with sausage, pickles, ketchup \nand mustard", 7.99, true)
        )

        dishRecyclerView.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = dishAdapter(foodItems)
        }

    }
}