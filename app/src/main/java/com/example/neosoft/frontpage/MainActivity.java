package com.example.neosoft.frontpage;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper v_flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clickMe = (Button) findViewById(R.id.SendLink);
        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent (MainActivity.this, NavActivity.class);
                startActivity(intent);
            }
        });

        int images[] = {R.drawable.slider1, R.drawable.slider2};

        v_flipper = findViewById(R.id.v_flipper);

        // for loop
//        for(int i = 0; i < images.length; i++){
//            flipperImages(images[i]);
//        }
        for(int image: images){
            flipperImages(image);
        }


    }
    public void flipperImages(int image){
        ImageView imageView = new ImageView( this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(5000);
        v_flipper.setAutoStart(true);


        //animation
        v_flipper.setInAnimation( this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(  this, android.R.anim.slide_out_right);


    }

}
