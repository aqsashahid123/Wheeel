package com.example.onebyte.wheeel.Views;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.onebyte.wheeel.R;
import com.example.onebyte.wheeel.Views.Activities.MainActivity;

import java.util.List;

public class MakeBetAdapter  extends RecyclerView.Adapter<MakeBetAdapter.ViewHolder>{
    List<String> list;
    Context context;
    ArrayAdapter<String> adapter;
    String[] items;
    public  MakeBetAdapter(List<String> list,Context context){
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.rv_makebet_row, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.tvNum.setText(list.get(position));
        items = new String[]{"","5","10", "15", "20","25","30","35","40","45","50"};
        adapter = new ArrayAdapter<>(context, R.layout.dropdown_list_item, items);
        holder.planets_spinner.setAdapter(adapter);
//        holder.planets_spinner.setOnItemSelectedListener( {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//            }
//        });
//
        holder.planets_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                holder.etMoney.setText(holder.planets_spinner.getSelectedItem().toString());
                holder.planets_spinner.setSelection(0);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        holder.rootView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvNum;
        LinearLayout rootView;
        Spinner planets_spinner;
        EditText etMoney;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNum = (TextView) itemView.findViewById(R.id.tvNum);
            planets_spinner = (Spinner) itemView.findViewById(R.id.planets_spinner);
            etMoney = (EditText) itemView.findViewById(R.id.etMoney);
            rootView = (LinearLayout) itemView.findViewById(R.id.rootView);
        }
    }
}
