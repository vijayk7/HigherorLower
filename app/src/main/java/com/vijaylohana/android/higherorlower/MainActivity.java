package com.vijaylohana.android.higherorlower;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;

    public void check(View view){


        EditText guessedNumber = (EditText) findViewById(R.id.guessedNumber);
        String guessedNumberString = guessedNumber.getText().toString();
        int guessedNumberInt = Integer.parseInt(guessedNumberString);

        String message = "";
        if (guessedNumberInt > randomNumber){
            message = "too high";
        }
        else if (guessedNumberInt < randomNumber) {
            message = "too low";

        } else {
            message = " correct, well done!";
        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random randomGenerator = new Random();
        randomNumber = randomGenerator.nextInt(21);
    }
}
