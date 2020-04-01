package com.example.senseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    //private TextView Info;
    private int counter=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Name = (EditText)findViewById(R.id.etName);
        Password= (EditText)findViewById(R.id.etPassword);
      //  Info = (TextView)findViewId(R.id.tvInfo);
        Login= (Button)findViewById(R.id.btnLogin);

        //Info.setText("No of attempts remaining: 5");

        Login.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
              validate(Name.getText().toString(),Password.getText().toString());

            }
        });

}

    private void validate(String userName, String userPassword){

        if((userName.equals("Samuel")) && (userPassword.equals("sam"))){
            Intent intent = new Intent(Main2Activity.this, AfterLogIn.class);
            startActivity(intent);
        }else{
            counter--;

           // Info.setText("No of attempts remaining " + String.valueOf(counter));

            if(counter == 0)
            {
              Login.setEnabled(false);
            }
        }

    }
}
