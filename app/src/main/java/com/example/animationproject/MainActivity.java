package com.example.animationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = findViewById(R.id.textHelloWorld);

        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("HELLO", "some text");
            }
        });
    }
}