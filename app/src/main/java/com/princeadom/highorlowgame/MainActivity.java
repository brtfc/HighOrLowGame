package com.princeadom.highorlowgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //generate just one random number each time the program runs
    Random randObjGenerator = new Random();
    int secretNumber  = randObjGenerator.nextInt(20);

    public void checkGuess(View view){
        EditText userGuess = findViewById(R.id.userResponse_edtText);
        TextView displayResult = findViewById(R.id.displayResult_txtView);

        if(Integer.parseInt(userGuess.getText().toString()) == secretNumber){
            displayResult.setText("You Guessed Right! Congratulations");
        }
        else if(Integer.parseInt(userGuess.getText().toString()) > secretNumber){
            displayResult.setText("Number Too High!    Try Again!");
        }
        else if(Integer.parseInt(userGuess.getText().toString()) < secretNumber){
            displayResult.setText("Number Too Low!    Try Again!");
        }
        else if((Integer.parseInt(userGuess.getText().toString()) > 20) || (Integer.parseInt(userGuess.getText().toString()) < 1)){
            displayResult.setText("Out of range (1 ~ 20)");
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
