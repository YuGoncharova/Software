package com.example.senseapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button10);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                 openContacts();
            }
        });

        button2 = (Button) findViewById(R.id.button5);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openAboutUs();
            }
        });



        button3 = (Button) findViewById(R.id.button9);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMain2Activity();
            }
        });

    }
    public void openContacts(){
         Intent intent = new Intent(this, Contacts.class);
         startActivity(intent);
    }
    public void openAboutUs(){
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }
    public void openMain2Activity(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

}
