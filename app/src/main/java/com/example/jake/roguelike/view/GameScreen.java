package com.example.jake.roguelike.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;

import com.example.jake.roguelike.R;
import com.example.jake.roguelike.control.MapMaker;

public class GameScreen extends AppCompatActivity {

    Paint paint = new Paint();
    Bitmap backGround = Bitmap.createBitmap(480, 800, Bitmap.Config.ARGB_8888);
    Canvas canvas = new Canvas(backGround);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);
        paint.setColor(Color.parseColor("#CD5C5C"));


        canvas.drawRGB(1,1,1);
        canvas.drawRect(1, 1, 20, 20, paint);
        LinearLayout ll = (LinearLayout) findViewById(R.id.rect);
        ll.setBackgroundDrawable(new BitmapDrawable(backGround));


    }

    public void onUpdate(){
        canvas.drawRGB(1,1,1);

        //do some magic stuff here. All we want to do is draw graphics here. We don't care about doing other stuff.
        //basically loop through and draw all of the things we need to draw.
        MapMaker map = new MapMaker();
        map.buildMap();
        //for(int x = 0; x < map.)
        canvas.drawRect(1, 1, 20, 20, paint);
        LinearLayout ll = (LinearLayout) findViewById(R.id.rect);
        ll.setBackgroundDrawable(new BitmapDrawable(backGround));


    }
}
