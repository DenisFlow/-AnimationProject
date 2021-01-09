package com.example.animationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtHelloWorld;
    private ImageView imgClick;
    boolean bNowLeopard = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHelloWorld = findViewById(R.id.textHelloWorld);
        imgClick = findViewById(R.id.imageView);

        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.i("HELLO", "some text");
                txtHelloWorld.animate().alpha(0f).setDuration(1000);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (txtHelloWorld.getText() == "Hi World!"){
                            txtHelloWorld.setText("Hello World!");
                        }else{
                            txtHelloWorld.setText("Hi World!");
                        }

                        txtHelloWorld.animate().alpha(1f).setDuration(1000);
                    }
                }, 1000);

                    }

        });

        imgClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgClick.animate().alpha(0f).setDuration(1000);
//                imgClick.animate().translationX(100).setDuration(1000);
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (bNowLeopard){
                            imgClick.setImageResource(R.drawable.lion);

                        }else{
                            imgClick.setImageResource(R.drawable.lepard);
                        }
                        bNowLeopard = !bNowLeopard;
                        imgClick.animate().alpha(1f).setDuration(1000);
//                        imgClick.animate().translationX(-100).setDuration(1000);
                    }
                }, 1000);
            }

        });
    }
}