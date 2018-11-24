package com.example.sathv.coffeeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sathv on 11/23/2018.
 */

public class OrderAdapter extends ArrayAdapter<Order> {
    Context context;
    ArrayList<Order> arraylistcheckedbooks = null;

    //checked books adapter contructor
    public OrderAdapter(Context context, int resource, ArrayList<Order> arraylistcheckedbooks) {
        super(context, resource, arraylistcheckedbooks);
        this.context = context;
        this.arraylistcheckedbooks = arraylistcheckedbooks;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Order checkedBook = arraylistcheckedbooks.get(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.orderrow, parent, false);
        }

        //retrieve the fields
        TextView title = convertView.findViewById(R.id.title);
        TextView price = convertView.findViewById(R.id.price);
        TextView addons = convertView.findViewById(R.id.addons);
        TextView nameonorder = convertView.findViewById(R.id.nameonorder);
        TextView quantity = convertView.findViewById(R.id.quantity);
        ImageView orderpic = convertView.findViewById(R.id.orderpic);

        if (checkedBook.generalname.equals("Cappuccino")) {
            orderpic.setImageResource(R.mipmap.cap);
        } else if (checkedBook.generalname.equals("Cafe mocha")) {
            orderpic.setImageResource(R.mipmap.mocha);
        } else if (checkedBook.generalname.equals("Latte")) {
            orderpic.setImageResource(R.mipmap.latte);
        } else if (checkedBook.generalname.equals("Cafe macchiato")) {
            orderpic.setImageResource(R.mipmap.mach);
        } else if (checkedBook.generalname.equals("Espresso")) {
            orderpic.setImageResource(R.mipmap.espres);
        }


        //set the appropriate fields with the appropriate info
        title.setText("Type: " + checkedBook.generalname);
        price.setText("Price: " + checkedBook.price);
        addons.setText("Addons: " + checkedBook.addons);
        nameonorder.setText("Orderer name: " + checkedBook.nameonorder);
        quantity.setText("Quantity: " + checkedBook.quantity);

        return convertView;
    }
}
