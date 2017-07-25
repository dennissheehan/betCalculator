package com.bookielocator.betcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class enterOdds extends AppCompatActivity {
    AutoCompleteTextView oddsPick;
    String[] odds = {
            "1/1000",
            "1/500",
            "1/250",
            "1/100",
            "1/66",
            "1/50",
            "1/40",
            "1/33",
            "1/20",
            "1/10",
            "1/16",
            "1/14",
            "1/12",
            "1/10",
            "1/9",
            "2/17",
            "1/8",
            "2/15",
            "1/7",
            "2/13",
            "1/6",
            "2/11",
            "1/5",
            "2/9",
            "1/4",
            "2/7",
            "3/10",
            "30/100",
            "1/3",
            "4/11",
            "2/5",
            "4/9",
            "1/2",
            "8/15",
            "4/7",
            "8/13",
            "4/6",
            "2/3",
            "8/11",
            "4/5",
            "5/6",
            "10/11",
            "20/21",
            "1/1",
            "evens",
            "11/10",
            "21/20",
            "6/5",
            "5/4",
            "11/8",
            "6/4",
            "13/8",
            "7/4",
            "9/5",
            "15/8",
            "2/1",
            "85/40",
            "11/5",
            "9/4",
            "12/5",
            "5/2",
            "13/5",
            "11/4",
            "3/1",
            "10/3",
            "100/30",
            "7/2",
            "4/1",
            "9/2",
            "5/1",
            "11/2",
            "6/1",
            "13/2",
            "7/1",
            "15/2",
            "8/1",
            "17/2",
            "9/1",
            "19/2",
            "10/1",
            "11/1",
            "12/1",
            "13/1",
            "14/1",
            "15/1",
            "16/1",
            "18/1",
            "19/1",
            "20/1",
            "21/1",
            "22/1",
            "25/1",
            "28/1",
            "33/1",
            "35/1",
            "38/1",
            "40/1",
            "50/1",
            "66/1",
            "100/1",
            "150/1",
            "125/1",
            "175/1",
            "200/1",
            "250/1",
            "300/1",
            "400/1",
            "500/1",
            "600/1",
            "700/1",
            "800/1",
            "900/1",
            "999/1",
            "99/1",
            "1000/1",
            "2000/1",
            "3000/1",
            "5000/1",
            "7/5",
            "8/5",
            "11/5",
            "13/5",
            "14/5",
            "16/5",
            "17/5",
            "18/5",
            "19/5",
            "21/5",
            "22/5",
            "23/5",
            "24/5",
            "26/5",
            "27/5",
            "28/5",
            "29/5",
            "31/5",
            "32/5",
            "33/5",
            "13/10",
            "16/10",
            "17/10",
            "19/10",
            "21/10",
            "23/10",
            "27/10",
            "19/10"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_odds);
        backbutton();
        oddsPick = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.select_dialog_item,odds);
        oddsPick.setThreshold(1);
        oddsPick.setAdapter(adapter);
    }
    public void backbutton(){
        Button back= (Button)findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent single = new Intent(enterOdds.this, Selections.class);
                finish();
            }
        });
    }
}
