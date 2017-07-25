package com.bookielocator.betcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.bookielocator.betcalculator.R.id.button1;

public class Selections extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selections);
        number1();
        number2(); // number 2
    }
private void number1() {
// this tests the button 1 to go to the singles page
    Button button1 = (Button) findViewById(R.id.button1); // sets up and assigns the button
    button1.setOnClickListener(new View.OnClickListener() {// listens for a click on that button
        @Override
        public void onClick(View v) {// this part send it to the next activity
            Intent single = new Intent(Selections.this, enterOdds.class); // selections is this page enterOdds is page 2 which will be changed
            startActivity(single); // starts the new screen
        }
    });
}

    private void number2(){
// this tests the button 2 to go to the doubles page
        final Button button1= (Button)findViewById(R.id.button2); // sets up and assigns the button
        button1.setOnClickListener(new View.OnClickListener() {// listens for a click on that button
            @Override
            public void onClick(View v) {// this part send it to the next activity

                Intent single = new Intent(Selections.this, enterOdds2.class); // selections is this page enterOdds is page 2 which will be changed
                startActivity(single); // starts the new screen
            }
        });
    }
}



