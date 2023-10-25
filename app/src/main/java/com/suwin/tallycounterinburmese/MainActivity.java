package com.suwin.tallycounterinburmese;
//Written by Su Win
//GitHub: https://github.com/su-win

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView counterDisplay;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the views by their IDs
        counterDisplay = findViewById(R.id.txtDisplayCounter);
        Button btnIncrement = findViewById(R.id.btnIncrement);
        Button btnDecrement = findViewById(R.id.btnDecrement);
        Button btnRestart = findViewById(R.id.btnRestart);
        Button btnExit = findViewById(R.id.btnExit);

        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                updateCounterDisplay();
            }
        });

        btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counter > 0) { //if counter is greater than 0, it'll decrease
                    counter--;
                    updateCounterDisplay();
                }
            }
        });

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter = 0;
                updateCounterDisplay();
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    //update the counter display
    private void updateCounterDisplay() {
        DigitToBurmeseMapper mapper = new DigitToBurmeseMapper();
        String nums = String.valueOf(counter);
        StringBuilder converted = new StringBuilder();
        for(int i = 0; i <= nums.length()-1; i++){
            char digit = nums.charAt(i);
            converted.append(mapper.getBumeseCharacter(digit));
        }
        counterDisplay.setText(converted.toString());
    }
}
