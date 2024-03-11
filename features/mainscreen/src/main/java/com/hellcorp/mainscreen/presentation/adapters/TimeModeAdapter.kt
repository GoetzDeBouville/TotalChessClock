package com.hellcorp.mainscreen.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hellcorp.database.domain.models.TimeMode
import com.hellcorp.mainscreen.databinding.TimeModeItemBinding

class TimeModeAdapter : RecyclerView.Adapter<TimeModeAdapter.TimeModeVH>() {
    inner class TimeModeVH(private val binding: TimeModeItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun fetchItem(timeMode: TimeMode) = with(binding) {
            tvName.text = timeMode.name
            tvTimeMode.text = timeMode.buildTimeString()
        }
    }

    private var itemList = ArrayList<TimeMode>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimeModeVH {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = TimeModeItemBinding.inflate(layoutInflater, parent, false)
        return TimeModeVH(binding)
    }

    override fun getItemCount(): Int = itemList.size

    override fun onBindViewHolder(holder: TimeModeVH, position: Int) {
        holder.fetchItem(itemList[position])
    }

    fun setItemList(data: ArrayList<TimeMode>) {
        itemList = data
    }
}