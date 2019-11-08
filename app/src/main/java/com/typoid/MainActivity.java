package com.typoid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button btnClear;
    Button btnNext;
    Button btnResult;
    String CurrentText;
    char CurrentLetter;


    List<TestLetter> FirstList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        btnClear = findViewById(R.id.btnClear);
        btnNext = findViewById(R.id.btnNext);
        btnResult = findViewById(R.id.btnResult);



        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                CurrentText = s.toString();

                int textLength = CurrentText.length();

                if (CurrentText.length() > 0){

                    CurrentLetter = CurrentText.charAt(textLength-1);
                    System.out.println(CurrentLetter);
                }

            }
        });


    }
}
