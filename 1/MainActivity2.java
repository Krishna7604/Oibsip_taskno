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

public class MainActivity2 extends AppCompatActivity {
Spinner sp1,sp2;
TextView t1,t2;
EditText e1,e2;
Button btn;

ArrayList<String> al=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        sp1=findViewById(R.id.spinnerfrom);
        sp2=findViewById(R.id.spinnerto);
        t1=findViewById(R.id.fromtext);
        t2=findViewById(R.id.totext);
        e1=findViewById(R.id.from);
        e2=findViewById(R.id.to);
        btn=findViewById(R.id.convert);

        al.add("KM");
        al.add("meter");
        al.add("CM");
        al.add("mile");
        al.add("foot");
        al.add("inch");
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
                double val,val2=0;
                if (e1.hasFocus()){
                    val=Double.parseDouble(e1.getText().toString());

                    if (t1.getText().toString()=="KM"){
                        switch (t2.getText().toString()){
                            case "KM":
                                val2=val;
                                break;
                            case "meter":
                                val2=val*1000;
                                break;
                            case "CM":
                                val2=val*1000*100;
                                break;
                            case "mile":
                                val2=val*0.62137;
                                break;
                            case "foot":
                                val2=val*3280.84;
                                break;
                            case "inch":
                                val2=val*39370.1;
                                break;
                            default:
                                val2=0;
                        }

                    }
                    else if (t1.getText().toString()=="meter"){
                        switch (t2.getText().toString()){
                            case "KM":
                                val2=val/1000;
                                break;
                            case "meter":
                                val2=val;
                                break;
                            case "CM":
                                val2=val*100;
                                break;
                            case "mile":
                                val2=val*0.00062137;
                                break;
                            case "foot":
                                val2=val*3.28084;
                                break;
                            case "inch":
                                val2=val*39.3701;
                                break;
                            default:
                                val2=0;
                        }

                    }
                    else if (t1.getText().toString()=="CM"){
                        switch (t2.getText().toString()){
                            case "KM":
                                val2=val/100000;
                                break;
                            case "meter":
                                val2=val/100;
                                break;
                            case "CM":
                                val2=val;
                                break;
                            case "mile":
                                val2=val*0.0000062137;
                                break;
                            case "foot":
                                val2=val*0.0328084;
                                break;
                            case "inch":
                                val2=val*0.393701;
                                break;
                            default:
                                val2=0;
                        }

                    }else if (t1.getText().toString()=="mile"){
                        switch (t2.getText().toString()){
                            case "KM":
                                val2=val*1.60934;
                                break;
                            case "meter":
                                val2=val*1609.34;
                                break;
                            case "CM":
                                val2=val*160934;
                                break;
                            case "mile":
                                val2=val;
                                break;
                            case "foot":
                                val2=val*5280;
                                break;
                            case "inch":
                                val2=val*63360;
                                break;
                            default:
                                val2=0;
                        }

                    }
                    else if (t1.getText().toString()=="foot"){
                        switch (t2.getText().toString()){
                            case "KM":
                                val2=val*0.0003048;
                                break;
                            case "meter":
                                val2=val*0.3048;
                                break;
                            case "CM":
                                val2=val*30.48;
                                break;
                            case "mile":
                                val2=val*0.000189394;
                                break;
                            case "foot":
                                val2=val;
                                break;
                            case "inch":
                                val2=val*12;
                                break;
                            default:
                                val2=0;
                        }

                    }
                    else if (t1.getText().toString()=="inch"){
                        switch (t2.getText().toString()){
                            case "KM":
                                val2=val*0.0000254;
                                break;
                            case "meter":
                                val2=val*0.0254;
                                break;
                            case "CM":
                                val2=val*2.54;
                                break;
                            case "mile":
                                val2=val*0.000015783;
                                break;
                            case "foot":
                                val2=val*0.083333;
                                break;
                            case "inch":
                                val2=val;
                                break;
                            default:
                                val2=0;
                        }

                    }
                    e2.setText(String.valueOf(val2));
                }
                if (e2.hasFocus()){
                    val=Double.parseDouble(e2.getText().toString());

                    if (t2.getText().toString()=="KM"){
                        switch (t1.getText().toString()){
                            case "KM":
                                val2=val;
                                break;
                            case "meter":
                                val2=val*1000;
                                break;
                            case "CM":
                                val2=val*1000*100;
                                break;
                            case "mile":
                                val2=val*0.62137;
                                break;
                            case "foot":
                                val2=val*3280.84;
                                break;
                            case "inch":
                                val2=val*39370.1;
                                break;
                            default:
                                val2=0;
                        }

                    }
                    else if (t2.getText().toString()=="meter"){
                        switch (t1.getText().toString()){
                            case "KM":
                                val2=val/1000;
                                break;
                            case "meter":
                                val2=val;
                                break;
                            case "CM":
                                val2=val*100;
                                break;
                            case "mile":
                                val2=val*0.00062137;
                                break;
                            case "foot":
                                val2=val*3.28084;
                                break;
                            case "inch":
                                val2=val*39.3701;
                                break;
                            default:
                                val2=0;
                        }

                    }
                    else if (t2.getText().toString()=="CM"){
                        switch (t1.getText().toString()){
                            case "KM":
                                val2=val/100000;
                                break;
                            case "meter":
                                val2=val/100;
                                break;
                            case "CM":
                                val2=val;
                                break;
                            case "mile":
                                val2=val*0.0000062137;
                                break;
                            case "foot":
                                val2=val*0.0328084;
                                break;
                            case "inch":
                                val2=val*0.393701;
                                break;
                            default:
                                val2=0;
                        }

                    }else if (t2.getText().toString()=="mile"){
                        switch (t1.getText().toString()){
                            case "KM":
                                val2=val*1.60934;
                                break;
                            case "meter":
                                val2=val*1609.34;
                                break;
                            case "CM":
                                val2=val*160934;
                                break;
                            case "mile":
                                val2=val;
                                break;
                            case "foot":
                                val2=val*5280;
                                break;
                            case "inch":
                                val2=val*63360;
                                break;
                            default:
                                val2=0;
                        }

                    }
                    else if (t2.getText().toString()=="foot"){
                        switch (t1.getText().toString()){
                            case "KM":
                                val2=val*0.0003048;
                                break;
                            case "meter":
                                val2=val*0.3048;
                                break;
                            case "CM":
                                val2=val*30.48;
                                break;
                            case "mile":
                                val2=val*0.000189394;
                                break;
                            case "foot":
                                val2=val;
                                break;
                            case "inch":
                                val2=val*12;
                                break;
                            default:
                                val2=0;
                        }

                    }
                    else if (t2.getText().toString()=="inch"){
                        switch (t1.getText().toString()){
                            case "KM":
                                val2=val*0.0000254;
                                break;
                            case "meter":
                                val2=val*0.0254;
                                break;
                            case "CM":
                                val2=val*2.54;
                                break;
                            case "mile":
                                val2=val*0.000015783;
                                break;
                            case "foot":
                                val2=val*0.083333;
                                break;
                            case "inch":
                                val2=val;
                                break;
                            default:
                                val2=0;
                        }

                    }
                    e1.setText(String.valueOf(val2));
                }
            }
        });





    }
}