package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] ball_array={
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};
        final Button ask_button=(Button) findViewById(R.id.ask_button);
        final Random rand=new Random();
        final ImageView ball_image=findViewById(R.id.ball_image);
        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n=rand.nextInt(5);
                ball_image.setImageResource(ball_array[n]);
                Log.d("Magic Eight Ball","the random num,ber is"+n);
            }
        });


    }
}
