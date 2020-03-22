package com.example.offline02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class preventionActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView germ,hand,distance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevention);
        germ=findViewById(R.id.germs);
        hand=findViewById(R.id.hand);
        distance= findViewById(R.id.distance);
        germ.setOnClickListener(this);
        hand.setOnClickListener(this);
        distance.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.germs)
        {
            germ.setVisibility(View.GONE);
            hand.setVisibility(View.VISIBLE);
        }

        if(view.getId()==R.id.hand)
        {

            hand.setVisibility(View.GONE);
            distance.setVisibility(View.VISIBLE);
        }
        if(view.getId()==R.id.distance)
        {

            distance.setVisibility(View.GONE);
            germ.setVisibility(View.VISIBLE);
        }


    }
}