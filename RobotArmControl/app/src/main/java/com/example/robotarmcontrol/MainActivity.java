package com.example.robotarmcontrol;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import okhttp3.OkHttpClient;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView _hardware, _software, _instructions, _kontroller,_aboutme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _hardware = (CardView) findViewById(R.id.hardware);
        _software = (CardView) findViewById(R.id.software);
        _instructions = (CardView) findViewById(R.id.instructions);
        _kontroller = (CardView) findViewById(R.id.kontroller);
       _aboutme = (CardView) findViewById(R.id.about_me);

        _hardware.setOnClickListener(this);
        _software.setOnClickListener(this);
        _instructions.setOnClickListener(this);
        _kontroller.setOnClickListener(this);
        _aboutme.setOnClickListener(this);
        OkHttpClient client = new OkHttpClient();
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()){
            case R.id.hardware : i = new Intent(this,Hardware.class);startActivity(i);break;
            case R.id.software : i= new Intent(this,Software.class);startActivity(i);break;
            case R.id.instructions : i = new Intent(this,Instructions.class);startActivity(i);break;
            case R.id.kontroller : i = new Intent(this,Kontroller.class);startActivity(i);break;
            case R.id.about_me : i = new Intent(this,About_me.class);startActivity(i);break;
            default:break;
        }
    }
}