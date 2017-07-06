package com.example.taqtile.androidtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    int numero = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increase(View view) {
        numero = numero + 1;
        display(numero);
        txt = (TextView) findViewById(R.id.txt);
        txt.setText("Increment");

    }

    public void decrease(View view) {
        numero = numero - 1;
        display(numero);
        txt = (TextView) findViewById(R.id.txt);
        txt.setText("Decrement");
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.numero);
        quantityTextView.setText("" + numero);
    }
}
