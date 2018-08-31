package com.example.onebyte.wheeel.Views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.onebyte.wheeel.R;

import java.util.List;

public class GameDataAdapter extends RecyclerView.Adapter<GameDataAdapter.ViewHolder>{
    List<String> list;
    Context context;
    public  GameDataAdapter(List<String> list,Context context){
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.rv_cell_gamedata, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvGameId;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


}
