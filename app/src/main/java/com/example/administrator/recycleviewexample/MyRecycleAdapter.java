package com.example.administrator.recycleviewexample;

/**
 * Created by Administrator on 5/22/2015.
 */
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 5/22/2015.
 */
public class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleAdapter.MyViewHolder>{

    Context context;
    ArrayList<Employee> myList;
    public MyRecycleAdapter(Context ctxt, ArrayList<Employee> l)
    {
        this.context = ctxt;
        this.myList = l;
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        CardView cardView;
        TextView personName;
        TextView personAge;
        ImageView personPhoto;
        public MyViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView)itemView.findViewById(R.id.cv);
            personName = (TextView)itemView.findViewById(R.id.person_name);
            personAge = (TextView)itemView.findViewById(R.id.person_age);
            personPhoto = (ImageView)itemView.findViewById(R.id.person_photo);
        }
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(this.context).inflate(R.layout.list_layout,parent,false);
        MyViewHolder holder = new MyViewHolder(v);
        return holder;
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.personName.setText(myList.get(position).empName);
        holder.personAge.setText(myList.get(position).age);
        holder.personPhoto.setImageResource(myList.get(position).empImage);
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }
}

