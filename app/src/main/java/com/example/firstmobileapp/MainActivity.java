package com.example.firstmobileapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find the button and text view by their IDs
        Button myButton = findViewById(R.id.button);
        final TextView myTextView = findViewById(R.id.textView);
        Button mySecondButton = findViewById(R.id.button2);


        final String initialText = "The text before you press the button";
        final String changedText = "Text after you pressed the button";

        // here we set the initial text
        myTextView.setText(initialText);

        // here is functionality for the first button
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myTextView.getText().toString().equals(initialText)) {
                    myTextView.setText(changedText);
                } else {
                    myTextView.setText(initialText);
                }
            }
        });

        // here is functionality for the second button
        mySecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toggle text color based on current color
                if (myTextView.getCurrentTextColor() == ContextCompat.getColor(MainActivity.this, R.color.text_initial_color)) {
                    myTextView.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.text_changed_color));
                } else {
                    myTextView.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.text_initial_color));
                }
            }
        });
    }// hello
}
