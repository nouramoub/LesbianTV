package com.education.lesbiantv;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends BaseAdapter {
    private Context mContext;
    private List<Movie> mDate;
    private LayoutInflater inflter;



    public RecyclerViewAdapter(Context mContext, List<Movie> movies) {
        this.mContext = mContext;
        inflter = (LayoutInflater.from(mContext));
        this.mDate = movies;


    }
    @Override
    public int getCount() { return mDate.size(); }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.card_item, null); // inflate the layout
        ImageView icon = (ImageView) view.findViewById(R.id.img); // get the reference of ImageView
        icon.setImageResource(mDate.get(i).getCategory());
        TextView text = (TextView) view.findViewById(R.id.movie_title);
        text.setText(mDate.get(i).getTitle());
        // set logo images
        return view;
    }

}
