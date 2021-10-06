package com.example.ebookreader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HomeExploreProductAdapter(private val homeExploreProduct: List<ExploreProduct>): RecyclerView.Adapter<HomeExploreProductAdapter.HomeExploreProductViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HomeExploreProductViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.explore_home_item, parent, false)
        return HomeExploreProductViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: HomeExploreProductViewHolder, position: Int) {
        val currItem = homeExploreProduct[position]

        holder.productImage.setImageResource(currItem.imgUrl)
        holder.bookName.text = currItem.bookName
        holder.author.text = currItem.author
        holder.price.text = currItem.price
    }

    override fun getItemCount() =  homeExploreProduct.size

    class HomeExploreProductViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {
        val productImage = ItemView.findViewById<ImageView>(R.id.explore_product_img)
        val bookName = ItemView.findViewById<TextView>(R.id.explore_book_name)
        val author = ItemView.findViewById<TextView>(R.id.explore_book_author)
        val price = ItemView.findViewById<TextView>(R.id.explore_book_price)
    }
}