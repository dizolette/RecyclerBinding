package com.android.recyclerbinding;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.android.recyclerbinding.databinding.ListDataBinding;

/**
 * Created by ecko on 9/6/2017.
 */

public class viewHolder extends RecyclerView.ViewHolder {
    private ListDataBinding binding; //dari kelas yang dideklarasi di recycler_item

    public viewHolder(ListDataBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(foodModel model){
        this.binding.setViewModel(model);
    }

    public ListDataBinding getDataBinding(){
        return this.binding;
    }

}
