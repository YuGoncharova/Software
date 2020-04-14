package com.example.senseapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MeasuredData extends AppCompatActivity {
    database_helper myDb = new database_helper(this);
    Button button14;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_medidos);

        button14 = (Button) findViewById(R.id.button14);


    }

}