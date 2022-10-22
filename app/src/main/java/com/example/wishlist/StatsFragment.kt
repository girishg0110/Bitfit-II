package com.example.wishlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

private const val TAG = "StatsFragment"

class StatsFragment : Fragment() {
    private lateinit var avgCaloriesTv : TextView
    private lateinit var minCaloriesTv : TextView
    private lateinit var maxCaloriesTv : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_stats, container, false)
        avgCaloriesTv = view.findViewById(R.id.avgCaloriesTv)
        minCaloriesTv = view.findViewById(R.id.minCaloriesTv)
        maxCaloriesTv = view.findViewById(R.id.maxCaloriesTv)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Call the new method within onViewCreated

    }

    companion object {
        fun newInstance(): StatsFragment {
            return StatsFragment()
        }
    }
}