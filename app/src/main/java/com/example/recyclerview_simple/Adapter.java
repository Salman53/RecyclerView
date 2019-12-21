package com.example.recyclerview_simple;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private String[] data;
    public Adapter(String[] data)
    {
        this.data =  data;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item , parent , false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        String title = data[position];
        holder.txtTitle.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imgIcon;
        TextView txtTitle;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon =  itemView.findViewById(R.id.id_img_icon);
            txtTitle = itemView.findViewById(R.id.id_text_view);


        }
    }


}
