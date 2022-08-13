package com.example.salem12_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.editTextTextPersonName);
        TextView textView = findViewById(R.id.textView4);
        EditText editText1 = findViewById(R.id.editTextTextPersonName3);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int age = 16;
                String name ="salem12";
                Intent intent = new Intent(MainActivity.this, salem12.class);
                intent.putExtra("salem1", name);
                intent.putExtra("salem2", age);
                startActivity(intent);


            }
        });


    }
}