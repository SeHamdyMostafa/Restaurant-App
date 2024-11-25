package com.example.resturant;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PizzaFoodAdapter extends BaseAdapter  {
    Context c;
    ArrayList<String> PizzaFoodNames=new ArrayList<>();
    ArrayList<Integer> PizzaFoodImages=new ArrayList<>();
    LayoutInflater inflater;

    PizzaFoodAdapter(Context c, ArrayList<String> PizzaFoodNames, ArrayList<Integer> PizzaFoodimages){
        this.c=c;
        this.PizzaFoodNames=PizzaFoodNames;
        this.PizzaFoodImages=PizzaFoodimages;
        inflater =LayoutInflater.from(c);
    }
    @Override
    public int getCount() {
        return PizzaFoodNames.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.food_item,null);
        ImageView foodImage=convertView.findViewById(R.id.image_foodImage);
        TextView foodName=convertView.findViewById(R.id.tv_foodName);
        foodImage.setImageResource(PizzaFoodImages.get(position));
        foodName.setText(PizzaFoodNames.get(position));
        return convertView;

    }
}
