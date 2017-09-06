package com.android.recyclerbinding;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.android.recyclerbinding.databinding.ListDataBinding;

import java.util.ArrayList;

/**
 * Created by ecko on 9/6/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<viewHolder> {
    private Context context;
    private ArrayList<foodModel> myList;
    private LayoutInflater inflater;

    public RecyclerAdapter(Context context, ArrayList<foodModel> myList){
        this.context = context;
        this.myList = myList;
    }

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(inflater == null) {
            inflater = LayoutInflater.from(parent.getContext());
        }

        ListDataBinding listDataBinding = ListDataBinding.inflate(inflater, parent, false);
        return new viewHolder(listDataBinding);
    }

    @Override
    public void onBindViewHolder(viewHolder holder, int position) {
        foodModel model = myList.get(position);
        holder.bind(model);

    }

    @Override
    public int getItemCount() {
        return myList.size();
    }
}
