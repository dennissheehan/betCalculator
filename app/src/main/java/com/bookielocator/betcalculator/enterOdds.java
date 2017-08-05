package com.bookielocator.betcalculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class enterOdds extends AppCompatActivity {



// the following is the main engine of this activity
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_odds);
        backbutton();
        calculate();
    }




    public void backbutton() {// the segment for the return buttom which is common to all activities
        Button back = (Button) findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent single = new Intent(enterOdds.this, Selections.class);
                finish();
            }
        });


    }
    public void calculate(){
        Button calc = (Button) findViewById(R.id.calculate);
        TextView winnings = (TextView) findViewById(R.id.result);
        calc.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        TextView winnings = (TextView) findViewById(R.id.result); // needs to get the text again
                                        // the calculation part
                                        // sends to new method




                                        winnings.setText(getTheWinnings()); // changes the text to the winnings
                                    }
                                }
        );

    }
    public String getTheWinnings()
    {// setup the variables
        // single for the decimal odds of the single, and top and bottom odds of the factoral odds
        double singleOdds;
        double topOddsDouble;
        double bottomOddsDouble ;
        double win = 0.0; // sets up the placeholder for the win
        double staked = 1.00; // sets the default stake to 1.00 (this is alteady set in the activity
        EditText stake = (EditText) findViewById(R.id.stake); // gets the stake from the screen
        // check to see if a stake is entered
        String testStake = stake.getText().toString().trim(); // makes a new variable to check the stake is not empty
        if(testStake.isEmpty() || testStake.length() == 0 || testStake.equals("") || testStake == null)
        {
            //EditText is empty
            staked = 1.00; // makes the default stake 1.00
            stake.setText("1.00");
        }
        else
        {
            //EditText is not empty
            staked = Double.parseDouble(testStake);
        }
        //System.out.print(staked); this was used to print to screen for testing
        // odds are already seperated when entered unlike before
        // gets the data
        EditText topOdds = (EditText) findViewById(R.id.topOdds);
        EditText bottomOdds = (EditText) findViewById(R.id.bottomOdds);
        // now converts to double
        topOddsDouble = Double.parseDouble(topOdds.getText().toString());
        bottomOddsDouble = Double.parseDouble(bottomOdds.getText().toString());
        // divide the two doubles to get the odds
        singleOdds = topOddsDouble/bottomOddsDouble;
        // add 1 to complete the task
        singleOdds++;
        // make the win equal to the single odds multiplied by the stake
        win =singleOdds*staked; // multiplys the odds by the stake

        @SuppressLint("DefaultLocale") String totalWin$ = String.format ("%.2f", win); // formats the decimal places to 2
        return totalWin$; // returns the winning text
    }

}


