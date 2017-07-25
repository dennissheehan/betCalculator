package com.bookielocator.betcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class enterOdds2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_odds2);
        backbutton2();
    }

    public void backbutton2() {
        Button back = (Button) findViewById(R.id.backButton2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent single = new Intent(enterOdds2.this, Selections.class);
                finish();
            }
        });
    }
}
