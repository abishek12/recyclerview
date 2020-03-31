package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BlogAdapter extends RecyclerView.Adapter<BlogAdapter.MyViewHolder> {

    String data1[],data2[];
    int images[];
    Context con;

    public BlogAdapter(Context context,String s1[],String s2[],int img[]){
        data1 = s1;
        data2 = s2;
        images = img;
        con = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(con);
        View v = layoutInflater.inflate(R.layout.list_item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtTitle.setText(data1[position]);
        holder.txtDesc.setText(data2[position]);
        holder.ivPreff.setImageResource(images[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView txtTitle,txtDesc;
        ImageView ivPreff;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtDesc = itemView.findViewById(R.id.txtDesc);
            ivPreff = itemView.findViewById(R.id.ivPreff);
        }
    }
}
