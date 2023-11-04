package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText vall1,vall2;
Button add,sub,mul,div,ac;
TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vall1.setText("");
                vall2.setText("");
                res.setText("");

            }
        });

    }
    public void init(){
        vall1=findViewById(R.id.val1);
        vall2=findViewById(R.id.val2);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        ac=findViewById(R.id.ac);
        res=findViewById(R.id.result);


    }
    public void ops(View v) {
        if (!vall1.getText().toString().equals("") && !vall2.getText().toString().equals("")) {
        int v1=Integer.parseInt(vall1.getText().toString());
        int v2=Integer.parseInt(vall2.getText().toString());

            Button b = (Button) v;
            String s = b.getText().toString();
            double ress = 0;
            if (s.equals("+"))
                ress = v1 + v2;
            else if (s.equals("-"))
                ress = v1 - v2;
            else if (s.equals("*"))
                ress = (float) v1 * v2;
            else if (s.equalsIgnoreCase("/"))
                ress = (float) v1 / v2;
            res.setText(String.valueOf(ress));
        }

    }

}