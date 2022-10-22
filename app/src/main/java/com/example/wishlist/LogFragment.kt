package com.example.wishlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class LogFragment : Fragment() {
    private lateinit var wishlistRv : RecyclerView
    private lateinit var wishlistAdapter : WishlistAdapter
    private lateinit var nameField : TextView
    private lateinit var urlField : TextView
    private lateinit var addButton: Button

    private val items = mutableListOf<WishlistEntry>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Change this statement to store the view in a variable instead of a return statement
        val view = inflater.inflate(R.layout.fragment_log, container, false)

        // Add these configurations for the recyclerView and to configure the adapter
        val layoutManager = LinearLayoutManager(context)
        wishlistRv = view.findViewById(R.id.log_recycler_view)
        wishlistRv.layoutManager = layoutManager
        wishlistRv.setHasFixedSize(true)
        wishlistAdapter = WishlistAdapter(items)
        wishlistRv.adapter = wishlistAdapter

        nameField = view.findViewById(R.id.nameField)
        urlField = view.findViewById<TextView>(R.id.urlField)
        addButton = view.findViewById<Button>(R.id.addButton)
        addButton.setOnClickListener {
            val newWishlistEntry = WishlistEntry(nameField.text.toString(), urlField.text.toString())
            items.add(newWishlistEntry)
            wishlistAdapter.notifyItemInserted(items.size - 1)
        }

        // Update the return statement to return the inflated view from above
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    companion object {
        fun newInstance(): LogFragment {
            return LogFragment()
        }
    }
}