package com.example.akshay.imageswitcherdemo;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    ImageView imageView;
    Button b;
    int i = 0;
    int images[] = {R.drawable.image1,R.drawable.image2,R.drawable.image_3,R.drawable.image4,R.drawable.image5,R.drawable.image6,
            R.drawable.image_7,R.drawable.image8,R.drawable.image9,R.drawable.image10,R.drawable.image11};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagesSet();
    }

    private void imagesSet() {
        imageView = findViewById(R.id.image_id);
        b = findViewById(R.id.next_button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(i < images.length)
                {
                    imageView.setImageResource(images[i]);
                    ++i;
                }
                else
                {
                    AlertDialog.Builder bldr = new AlertDialog.Builder(MainActivity.this);
                    bldr.setTitle("Over");
                    bldr.setMessage("Thank you...");
                    bldr.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
                    bldr.show();
                }
            }
        });
    }
}
