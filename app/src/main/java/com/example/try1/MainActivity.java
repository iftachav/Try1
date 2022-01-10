package com.example.try1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final double TAX=17.0;
    Button x;
    TextView tv;
    EditText edt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x=findViewById(R.id.b1);
        tv=findViewById(R.id.text1);
        edt=findViewById(R.id.edt);

        x.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 func();
             }
         });


    }

    private void func() {
        String s=edt.getText().toString();
        int current=Integer.valueOf(s);
        double result=current*TAX/100;
        String s1= tv.getText().toString();
        tv.setText(s1+" "+result);
        tv.setVisibility(View.VISIBLE);
    }
}