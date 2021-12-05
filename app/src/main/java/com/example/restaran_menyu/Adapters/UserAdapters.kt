package com.example.restaran_menyu.Adapters

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.restaran_menyu.Data.UserData
import com.example.restaran_menyu.R
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.item_menyu.view.*

class UserAdapters(val data:ArrayList<UserData>):RecyclerView.Adapter<UserAdapters.ViewHolder>() {
    private var listener:((Int,String)->Unit)? = null
    data class ViewHolder(val view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         val view = LayoutInflater.from(parent.context).inflate(R.layout.item_menyu,parent,false)
            return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.apply {
            val image: CircleImageView =findViewById(R.id.image)
            image.setBackgroundResource(data[position].image!!)
            data[position].image?.let { image.setCircleBackgroundColorResource(it) }
            Food_name?.text = data[position].food_name
        }

    }

    override fun getItemCount(): Int {
        return data.size
    }
    fun setOnclilcListen(f:(Int,String)->Unit){
        listener= f
    }

}