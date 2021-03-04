package com.example.android1_lesson7_dz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {

    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        button3 = findViewById(R.id.btn_third);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = getIntent();
                String text = intent2.getStringExtra("2");
                Intent intent = new Intent(getApplicationContext(), FourthActivity.class);
                intent.putExtra("3", text);
                startActivity(intent);
            }
        });

    }
}