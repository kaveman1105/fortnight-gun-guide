package com.pickledgames.kevin.gunguideforfortnight

import android.support.v4.content.res.TypedArrayUtils.getString
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.gson.Gson


class GunlistAdapter: RecyclerView.Adapter<GunListViewHolder>() {




    override fun getItemCount(): Int {
        return 20
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GunListViewHolder{

        val layoutInflator = LayoutInflater.from(parent?.context)
        val cell = layoutInflator.inflate(R.layout.gun_row, parent, false)
        return GunListViewHolder(cell)
    }

    override fun onBindViewHolder(holder: GunListViewHolder, position: Int) {

    }
}

class GunListViewHolder(val view: View): RecyclerView.ViewHolder(view){

}







