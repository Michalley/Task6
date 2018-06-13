package com.example.tesk6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView yesno;
    TextView num1;
    TextView num2;
    Button big;
    Button eq;
    Button small;
    Button numbers;
    int n1;
    int n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yesno = findViewById(R.id.yesno);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        big = findViewById(R.id.big);
        eq = findViewById(R.id.eq);
        small = findViewById(R.id.small);
        numbers = findViewById(R.id.numbers);

    }

    public void numbersg(View view) {
        yesno.setText("true/false");
        n1 = (int) (Math.random()*100+0);
        n2 = (int) (Math.random()*100+0);
        num1.setText("number: "+n1);
        num2.setText("number: "+n2);
    }

    public void big(View view) {
        if (n1<n2) {
            yesno.setText("True");
        }
        else{
            yesno.setText("False");
        }
    }

    public void eq(View view) {
        if (n1==n2){
            yesno.setText("True");
        }
        else{
            yesno.setText("False");
        }
    }

    public void small(View view) {
        if (n1>n2){
            yesno.setText("True");
        }
        else{
            yesno.setText("False");
        }
    }


}
