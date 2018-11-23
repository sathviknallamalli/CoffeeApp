package com.example.sathv.coffeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class OrderForm extends AppCompatActivity {

    ArrayList<Order> newos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_form);

        TextView none = findViewById(R.id.none);

        ListView olist = findViewById(R.id.orderlist);

        if(NewOrder.allos.size()==0){
            none.setVisibility(View.VISIBLE);
        }else{
            OrderAdapter adapter = new OrderAdapter(OrderForm.this, R.layout.orderrow, NewOrder.allos);
            olist.setAdapter(adapter);
        }

        Button startneworder = findViewById(R.id.neworder);
        startneworder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NewOrder.class);
                startActivity(intent);
            }
        });
    }
}
