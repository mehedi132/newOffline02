package com.example.offline02;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class secondActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1,button2,button3,button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button1=findViewById(R.id.button01);
        button2=findViewById(R.id.button02);
        button3=findViewById(R.id.button03);
        button4=findViewById(R.id.button04);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.button01)
        {
            Intent intent= new Intent(secondActivity.this,thirdActivity.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.button02)
        {
            Intent intent= new Intent(secondActivity.this,symptomActivity.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.button03)
        {
            Intent intent= new Intent(secondActivity.this,preventionActivity.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.button04)
        {
            Intent intent= new Intent(secondActivity.this,treatmentActivity.class);
            startActivity(intent);
        }


    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder alar =new AlertDialog.Builder(secondActivity.this);
        alar.setTitle("Wanna go back?");
        alar.setMessage(R.string.message);
        alar.setCancelable(false);
        alar.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();

            }
        });

        alar.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog al= alar.create();
        al.show();


    }
}
