package com.example.pizzaorderapp_20211010.adapters

import android.content.Context
import android.content.LocusId
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.pizzaorderapp_20211010.R
import com.example.pizzaorderapp_20211010.datas.StoreData
import java.security.AccessControlContext

class PizzaStoreAdapter(
    val mContext: Context,
    val resId: Int,
    val mList : ArrayAdapter<StoreData>
) : ArrayAdapter<StoreData>(mContext, resId, mList) {

    val  mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.pizza_store_list_item,null)
        }

        val row = tempRow!!

        return row

    }
}