package com.example.android1_lesson7_dz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FifthActivity extends AppCompatActivity {

    Button button;
    TextView editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        button = findViewById(R.id.btn_fifth);
        editText = findViewById(R.id.tv_fifth);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                String text = intent.getStringExtra("4");
                editText.setText(text);
                button.setText(text);
            }
        });


    }
}