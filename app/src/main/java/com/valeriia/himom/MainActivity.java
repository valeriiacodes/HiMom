package com.valeriia.himom;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    String color = "#E13543";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getCongrats(View view) {
        display();
    }

    private void display() {
        TextView quantityTextView = (TextView) findViewById(R.id.kisses_text_view);
        quantityTextView.setTextColor(Color.parseColor(color));
    }
}