package com.example.ebookreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class BookHomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_home)

        val newArrivalList = generateDummyNewArrival(20)
        val arrivalRecycle = findViewById<RecyclerView>(R.id.new_arrival_recycle)
        val exploreProductList = generateDummyExploreProduct(20)
        val exploreHomeRecycler = findViewById<RecyclerView>(R.id.explore_home_recycle)

        arrivalRecycle.adapter = NewArrivalAdapter(newArrivalList)
        arrivalRecycle.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        arrivalRecycle.setHasFixedSize(true)

        exploreHomeRecycler.adapter = HomeExploreProductAdapter(exploreProductList)
        exploreHomeRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        exploreHomeRecycler.setHasFixedSize(true)
    }

    private fun generateDummyNewArrival(size: Int): List<NewArrival> {
        val list = ArrayList<NewArrival>()

        for (i in 0 until size) {
            val drawable = when (i%3) {
                0 -> R.drawable.bookone
                1 -> R.drawable.booktwo
                else -> R.drawable.bookthree
            }

            val item = NewArrival(drawable)
            list += item
        }
        return  list
    }

    private fun generateDummyExploreProduct(size: Int): List<ExploreProduct> {
        val list = ArrayList<ExploreProduct>()

        for (i in 0 until size) {
            val drawable = when (i%3) {
                0 -> R.drawable.bookone
                1 -> R.drawable.booktwo
                else -> R.drawable.bookthree
            }

            val item = ExploreProduct(drawable, "Book Long Name Here", "Ratul Sikder", "13.39")
            list += item
        }
        return  list
    }


}