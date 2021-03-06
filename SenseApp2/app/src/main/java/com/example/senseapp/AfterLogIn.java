package com.example.senseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AfterLogIn extends AppCompatActivity {
    private Button button4;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_log_in);

        button4 = (Button) findViewById(R.id.button);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMeasuredData();
            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openConnectingSensors();
            }
        });
    }
    public void openMeasuredData(){
        Intent intent = new Intent(this, MeasuredData.class);
        startActivity(intent);
    }
    public void openConnectingSensors(){
        Intent intent = new Intent(this, ConnectingSensors.class);
        startActivity(intent);
    }
}
