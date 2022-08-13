package com.example.salem12_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class salem12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salem12);


        TextView salem = findViewById(R.id.textView5);
        TextView age1 = findViewById(R.id.textView7);
        TextView yourtrip = findViewById(R.id.textView);


        Bundle bundle = getIntent().getExtras();

        String name = bundle.getString("salem1");
        int age = bundle.getInt("salem2");


        salem.setText(name);
        age1.setText(String.valueOf(age));

    }
}