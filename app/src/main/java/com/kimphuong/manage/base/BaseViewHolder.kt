package com.kimphuong.manage.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

open class BaseViewHolder<T : ViewDataBinding>(binding: T) : RecyclerView.ViewHolder(binding.root) {
    open fun onBind(position: Int) {

    }
}