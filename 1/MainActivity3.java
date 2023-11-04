package com.example.unitconverter1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    Spinner sp1,sp2;
    TextView t1,t2;
    EditText e1,e2;
    Button btn;

    ArrayList<String> al=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        sp1=findViewById(R.id.spinnerfrom);
        sp2=findViewById(R.id.spinnerto);
        t1=findViewById(R.id.fromtext);
        t2=findViewById(R.id.totext);
        e1=findViewById(R.id.from);
        e2=findViewById(R.id.to);
        btn=findViewById(R.id.convert);

        al.add("Kilogram");
        al.add("Gram");
        al.add("Ton");
        al.add("Ounce");
        al.add("Pound");
        al.add("Quintal");
        ArrayAdapter<String> arrayadapter= new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,al );
        sp1.setAdapter(arrayadapter);
        sp2.setAdapter(arrayadapter);

        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                t1.setText(al.get(position));
                if(e1.hasFocus())
                    e2.setText("");
                if(e2.hasFocus())
                    e1.setText("");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                t1.setText("select type");

            }
        });
        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                t2.setText(al.get(position));
                if(e1.hasFocus())
                    e2.setText("");
                if(e2.hasFocus())
                    e1.setText("");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                t1.setText("select type");

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double val, val2 = 0;
                if (e1.hasFocus()) {
                    val = Double.parseDouble(e1.getText().toString());

                    if (t1.getText().toString() == "Kilogram") {
                        switch (t2.getText().toString()) {
                            case "Kilogram":
                                val2 = val;
                                break;
                            case "Gram":
                                val2 = val * 1000;
                                break;
                            case "Ton":
                                val2 = val * 0.001;
                                break;
                            case "Ounce":
                                val2 = val * 35.2739619;
                                break;
                            case "Pound":
                                val2 = val * 2.20462262;
                                break;
                            case "Quintal":
                                val2 = val * 0.01;
                                break;
                            default:
                                val2 = 0;
                        }

                    } else if (t1.getText().toString() == "Gram") {
                        switch (t2.getText().toString()) {
                            case "Kilogram":
                                val2 = val / 1000;
                                break;
                            case "Gram":
                                val2 = val;
                                break;
                            case "Ton":
                                val2 = val * 0.000001;
                                break;
                            case "Ounce":
                                val2 = val * 0.0352739;
                                break;
                            case "Pound":
                                val2 = val * 0.00220462262;
                                break;
                            case "Quintal":
                                val2 = val * 0.00001;
                                break;
                            default:
                                val2 = 0;
                        }

                    } else if (t1.getText().toString() == "Ton") {
                        switch (t2.getText().toString()) {
                            case "Kilogram":
                                val2 = val * 1000;
                                break;
                            case "Gram":
                                val2 = val * 1000000;
                                break;
                            case "Ton":
                                val2 = val;
                                break;
                            case "Ounce":
                                val2 = val * 35273.9619;
                                break;
                            case "Pound":
                                val2 = val * 2204.62262;
                                break;
                            case "Quintal":
                                val2 = val * 10;
                                break;
                            default:
                                val2 = 0;
                        }

                    } else if (t1.getText().toString() == "Ounce") {
                        switch (t2.getText().toString()) {
                            case "Kilogram":
                                val2 = val * 0.0283495231;
                                break;
                            case "Gram":
                                val2 = val * 28.3495231;
                                break;
                            case "Ton":
                                val2 = val * 0.0000283495;
                                break;
                            case "Ounce":
                                val2 = val;
                                break;
                            case "Pound":
                                val2 = val * 0.0625;
                                break;
                            case "Quintal":
                                val2 = val * 0.000283495231;
                                break;
                            default:
                                val2 = 0;
                        }

                    } else if (t1.getText().toString() == "Pound") {
                        switch (t2.getText().toString()) {
                            case "Kilogram":
                                val2 = val * 0.45359237;
                                break;
                            case "Gram":
                                val2 = val * 453.59237;
                                break;
                            case "Ton":
                                val2 = val * 0.00045359237;
                                break;
                            case "Ounce":
                                val2 = val * 16;
                                break;
                            case "Pound":
                                val2 = val;
                                break;
                            case "Quintal":
                                val2 = val * 0.0045359237;
                                break;
                            default:
                                val2 = 0;
                        }

                    } else if (t1.getText().toString() == "Quintal") {
                        switch (t2.getText().toString()) {
                            case "Kilogram":
                                val2 = val * 100;
                                break;
                            case "Gram":
                                val2 = val * 100000;
                                break;
                            case "Ton":
                                val2 = val * 0.1;
                                break;
                            case "Ounce":
                                val2 = val * 3527.39619;
                                break;
                            case "Pound":
                                val2 = val * 220.462262;
                                break;
                            case "quintal":
                                val2 = val;
                                break;
                            default:
                                val2 = 0;
                        }

                    }
                    e2.setText(String.valueOf(val2));
                }
                if (e2.hasFocus()) {
                    val = Double.parseDouble(e2.getText().toString());

                    if (t2.getText().toString() == "Kilogram") {
                        switch (t1.getText().toString()) {
                            case "Kilogram":
                                val2 = val;
                                break;
                            case "Gram":
                                val2 = val * 1000;
                                break;
                            case "Ton":
                                val2 = val * 0.001;
                                break;
                            case "Ounce":
                                val2 = val * 35.2739619;
                                break;
                            case "Pound":
                                val2 = val * 2.20462262;
                                break;
                            case "Quintal":
                                val2 = val * 0.01;
                                break;
                            default:
                                val2 = 0;
                        }

                    } else if (t2.getText().toString() == "Gram") {
                        switch (t1.getText().toString()) {
                            case "Kilogram":
                                val2 = val / 1000;
                                break;
                            case "Gram":
                                val2 = val;
                                break;
                            case "Ton":
                                val2 = val * 0.000001;
                                break;
                            case "Ounce":
                                val2 = val * 0.0352739;
                                break;
                            case "Pound":
                                val2 = val * 0.00220462262;
                                break;
                            case "Quintal":
                                val2 = val * 0.00001;
                                break;
                            default:
                                val2 = 0;
                        }

                    } else if (t2.getText().toString() == "Ton") {
                        switch (t1.getText().toString()) {
                            case "Kilogram":
                                val2 = val * 1000;
                                break;
                            case "Gram":
                                val2 = val * 1000000;
                                break;
                            case "Ton":
                                val2 = val;
                                break;
                            case "Ounce":
                                val2 = val * 35273.9619;
                                break;
                            case "Pound":
                                val2 = val * 2204.62262;
                                break;
                            case "Quintal":
                                val2 = val * 10;
                                break;
                            default:
                                val2 = 0;
                        }

                    } else if (t2.getText().toString() == "Ounce") {
                        switch (t1.getText().toString()) {
                            case "Kilogram":
                                val2 = val * 0.0283495231;
                                break;
                            case "Gram":
                                val2 = val * 28.3495231;
                                break;
                            case "Ton":
                                val2 = val * 0.0000283495;
                                break;
                            case "Ounce":
                                val2 = val;
                                break;
                            case "Pound":
                                val2 = val * 0.0625;
                                break;
                            case "Quintal":
                                val2 = val * 0.000283495231;
                                break;
                            default:
                                val2 = 0;
                        }

                    } else if (t2.getText().toString() == "Pound") {
                        switch (t1.getText().toString()) {
                            case "Kilogram":
                                val2 = val * 0.45359237;
                                break;
                            case "Gram":
                                val2 = val * 453.59237;
                                break;
                            case "Ton":
                                val2 = val * 0.00045359237;
                                break;
                            case "Ounce":
                                val2 = val * 16;
                                break;
                            case "Pound":
                                val2 = val;
                                break;
                            case "Quintal":
                                val2 = val * 0.0045359237;
                                break;
                            default:
                                val2 = 0;
                        }

                    } else if (t2.getText().toString() == "Quintal") {
                        switch (t1.getText().toString()) {
                            case "Kilogram":
                                val2 = val * 100;
                                break;
                            case "Gram":
                                val2 = val * 100000;
                                break;
                            case "Ton":
                                val2 = val * 0.1;
                                break;
                            case "Ounce":
                                val2 = val * 3527.39619;
                                break;
                            case "Pound":
                                val2 = val * 220.462262;
                                break;
                            case "quintal":
                                val2 = val;
                                break;
                            default:
                                val2 = 0;
                        }

                    }
                    e1.setText(String.valueOf(val2));
                }
            }
        });

    }
}