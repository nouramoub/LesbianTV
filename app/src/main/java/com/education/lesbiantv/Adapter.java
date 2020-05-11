package com.education.lesbiantv;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder>{

    private Context mContext ;
    private List<Movie> mData ;

    public Adapter(Context mContext, List<Movie> mData) {
        this.mContext = mContext;
        this.mData = mData;}

    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view ;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.card_item,parent,false) ;

        final MyViewHolder viewHolder = new MyViewHolder(view) ;
        viewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(mContext, MovieActivity.class);
                i.putExtra("description",mData.get(viewHolder.getAdapterPosition()).getDescription());
                i.putExtra("url",mData.get(viewHolder.getAdapterPosition()).getUrl());


                mContext.startActivity(i);

            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {
        holder.movie_image.setImageResource(mData.get(position).getCategory());
        holder.movie_name.setText(mData.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView movie_name ;
        ImageView movie_image ;
        RelativeLayout relativeLayout;







        public MyViewHolder(View itemView) {
            super(itemView);

            movie_name = itemView.findViewById(R.id.movie_title);
            movie_image = itemView.findViewById(R.id.img);
            relativeLayout = itemView.findViewById(R.id.crdview);


        }
    }
}
