package com.example.to_do_app;

import android.content.Context;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private List<String> dataList;

    public MyAdapter(List<String> dataList) {
        this.dataList = dataList;
        }

        @NonNull
        @Override

        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            Context context = parent.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);
            View itemView = inflater.inflate(R.layout.activity_main, parent, false);
            return new MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            String data = dataList.get(position);
            holder.editView.setText(data);
            holder.editView1.setText(data);
        }


        @Override
        public int getItemCount() {
        return dataList.size();
        }

        static class MyViewHolder extends RecyclerView.ViewHolder {
            EditText editView;
            EditText editView1;

            MyViewHolder(@NonNull View itemView) {
                super(itemView);
                editView = itemView.findViewById(R.id.editTextTitle);
                editView1=itemView.findViewById(R.id.editTextDescription);
            }

    }
}
