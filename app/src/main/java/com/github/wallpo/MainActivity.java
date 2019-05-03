package com.github.wallpo;

import android.content.Context;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.github.wallpoo.Wallpo;

public class MainActivity extends AppCompatActivity {


    Context mContext = MainActivity.this;
    ImageView imageView;
    Button wallpaper, lockscreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView = findViewById(R.id.imageview);
        wallpaper = findViewById(R.id.setwallpaper);
        lockscreen = findViewById(R.id.setlockscreen);


        wallpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Wallpo.setMainScreenWallpaper(MainActivity.this, imageView, "Wallpaper Set");

            }
        });

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            lockscreen.setVisibility(View.VISIBLE);

        } else {
            lockscreen.setVisibility(View.GONE);
        }

        lockscreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Wallpo.setLockScreenWallpaper(MainActivity.this, imageView, "LockWallpaper Set");

            }
        });
    }
}
