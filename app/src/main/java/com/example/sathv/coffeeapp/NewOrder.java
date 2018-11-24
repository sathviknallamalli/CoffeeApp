package com.example.sathv.coffeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NewOrder extends AppCompatActivity {
    EditText name;
    TextView pr;

    static ArrayList<Order> allos = new ArrayList<>();

    Button calculate;
    Spinner milkspin;
    Spinner coffeespin;
    Spinner spicespin;
    Spinner syrupspin;
    Spinner icespin;
    Spinner whipspin;
    Spinner sizespin;
    Spinner quantityspin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_order);

        ArrayAdapter<CharSequence> adapter, cadapter, sadapter, syadapter, iadapter, wadapter, siadapter, qadapter;

        milkspin = findViewById(R.id.milk);
        coffeespin = findViewById(R.id.typespinner);
        spicespin = findViewById(R.id.spices);
        syrupspin = findViewById(R.id.syrup);
        icespin = findViewById(R.id.icecream);
        whipspin = findViewById(R.id.whip);
        sizespin = findViewById(R.id.sizespinner);
        calculate = findViewById(R.id.calculate);

        name = findViewById(R.id.nameet);
        quantityspin = findViewById(R.id.quantityspin);
        pr = findViewById(R.id.price);

        name.setInputType(InputType.TYPE_TEXT_FLAG_CAP_WORDS);

        Button confirm = findViewById(R.id.confirm);

        adapter = ArrayAdapter.createFromResource(this, R.array.milktypes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        milkspin.setAdapter(adapter);
        milkspin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                //parent.getItemAtPosition(position)
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
        milkspin.setSelection(0);

        cadapter = ArrayAdapter.createFromResource(this, R.array.coffeetype, android.R.layout.simple_spinner_item);
        cadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        coffeespin.setAdapter(cadapter);
        coffeespin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                //parent.getItemAtPosition(position)
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
        coffeespin.setSelection(0);

        sadapter = ArrayAdapter.createFromResource(this, R.array.spicetype, android.R.layout.simple_spinner_item);
        sadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spicespin.setAdapter(sadapter);
        spicespin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                //parent.getItemAtPosition(position)
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
        spicespin.setSelection(0);

        syadapter = ArrayAdapter.createFromResource(this, R.array.syruptype, android.R.layout.simple_spinner_item);
        syadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        syrupspin.setAdapter(syadapter);
        syrupspin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                //parent.getItemAtPosition(position)
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
        syrupspin.setSelection(0);

        iadapter = ArrayAdapter.createFromResource(this, R.array.icetype, android.R.layout.simple_spinner_item);
        iadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        icespin.setAdapter(iadapter);
        icespin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                //parent.getItemAtPosition(position)
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
        icespin.setSelection(0);

        wadapter = ArrayAdapter.createFromResource(this, R.array.whiptype, android.R.layout.simple_spinner_item);
        wadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        whipspin.setAdapter(wadapter);
        whipspin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                //parent.getItemAtPosition(position)
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
        whipspin.setSelection(0);

        siadapter = ArrayAdapter.createFromResource(this, R.array.sizetype, android.R.layout.simple_spinner_item);
        siadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sizespin.setAdapter(siadapter);
        sizespin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                //parent.getItemAtPosition(position)
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
        sizespin.setSelection(0);

        qadapter = ArrayAdapter.createFromResource(this, R.array.quantity, android.R.layout.simple_spinner_item);
        qadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        quantityspin.setAdapter(qadapter);
        quantityspin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                //parent.getItemAtPosition(position)
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
        quantityspin.setSelection(0);


        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pricecalc(view);

                if (quantityspin.getSelectedItemPosition() == 0 || name.getText().toString().isEmpty() || syrupspin.getSelectedItemPosition() == 0) {
                    Toast.makeText(NewOrder.this, "Cant confirm order, missing info", Toast.LENGTH_LONG).show();
                } else {
                    String n = name.getText().toString();
                    String ct = coffeespin.getSelectedItem().toString();
                    String q = quantityspin.getSelectedItem().toString();
                    String mad = milkspin.getSelectedItem().toString();
                    String spad = spicespin.getSelectedItem().toString();
                    String syad = syrupspin.getSelectedItem().toString();
                    String iad = icespin.getSelectedItem().toString();
                    String was = whipspin.getSelectedItem().toString();
                    String p = pr.getText().toString();

                    String ad =
                            mad + "\n" + spad + "\n" + syad + "\n" + iad + "\n" + was;

                    Order o = new Order(ct, p, q, ad, n);
                    allos.add(o);

                    Intent intent = new Intent(getApplicationContext(), OrderForm.class);
                    startActivity(intent);
                }


            }
        });


    }

    public void pricecalc(View v) {
        if (quantityspin.getSelectedItemPosition() == 0) {
            Toast.makeText(NewOrder.this, "No quantity specified", Toast.LENGTH_SHORT).show();
            pr.setText("Error");
        } else if (syrupspin.getSelectedItemPosition() == 0) {
            Toast.makeText(NewOrder.this, "No syrup specified", Toast.LENGTH_SHORT).show();
            pr.setText("Error");
        } else {
            double prices[] = {1.5, 2, 1, 2.5, 2.3};

            double cofprice = prices[coffeespin.getSelectedItemPosition()];


            double sizescal = (sizespin.getSelectedItemPosition() * (.5)) + 1;
            double quantscal = Integer.parseInt(quantityspin.getSelectedItem().toString());


            if (spicespin.getSelectedItemPosition() != 0) {
                cofprice = cofprice + 1;
            }
            if (icespin.getSelectedItemPosition() != 0) {
                cofprice = cofprice + 1;
            }
            if (whipspin.getSelectedItemPosition() != 0) {
                cofprice = cofprice + 1;
            }

            double finorderprice = cofprice * sizescal * quantscal;
            pr.setText("$" + finorderprice + "");
        }

    }
}
