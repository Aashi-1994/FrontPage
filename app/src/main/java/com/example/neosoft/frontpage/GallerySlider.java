package com.example.neosoft.frontpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class GallerySlider extends AppCompatActivity {
    private Integer images[] = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery_slider);
        addImagesToThegallery();

//        LinearLayout gallery = findViewById(R.id.gallery);
//
//        LayoutInflater inflater = LayoutInflater.from(this);
//        for (int i = 0; i < 6; i++){
//            View view = inflater.inflate(R.layout.itemimage, gallery, false);
//
//            TextView textView = view.findViewById(R.id.text);
//            textView.setText("Item" + i);
//
//            ImageView imageView = view.findViewById(R.id.imageView);
//            imageView.setImageResource(R.mipmap.ic_launcher_round);
//
//            gallery.addView(view);
//
//
//
//
//        }

    }
    private void addImagesToThegallery() {
        LinearLayout imageGallery = (LinearLayout) findViewById(R.id.imageGallery);
        for (Integer image : images) {
            imageGallery.addView(getImageView(image));
        }
    }
    private View getImageView(Integer image) {
        ImageView imageView = new ImageView(getApplicationContext());
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lp.setMargins(0, 0, 10, 0);
        imageView.setLayoutParams(lp);
        imageView.setImageResource(image);
        return imageView;
    }
}
