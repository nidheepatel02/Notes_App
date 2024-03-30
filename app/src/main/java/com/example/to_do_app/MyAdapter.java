package com.example.to_do_app;

import android.content.Context;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    private List<Notes> mData;

    public MyAdapter(List<Notes> data) {
        mData = data;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.title1);
            textView= itemView.findViewById(R.id.description);
        }
    }
        @Override

        public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            Notes note = mData.get(position);
            holder.textView.setText(note.getTitle());
            holder.textView.setText(note.getDescription());
        }


        @Override
        public int getItemCount() {
            return mData.size();
        }
}
