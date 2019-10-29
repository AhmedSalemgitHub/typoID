package com.typoid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;

    Long timeBefore ;
    Long timeafter ;

    String textToShow = "start";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                timeBefore = System.currentTimeMillis();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String timeLine = "time Before = " + timeBefore + " time after = " + timeafter;
                if (timeBefore != null && timeafter != null){
                    textToShow = textToShow + "\n"+ s + "\ndif is " + (timeBefore-timeafter);
                }
                textView.setText(textToShow);
            }

            @Override
            public void afterTextChanged(Editable s) {
                timeafter = System.currentTimeMillis();
            }
        });
    }
}
