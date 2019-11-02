package com.typoid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
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

    Long timeBefore ;
    Long timeafter ;

    String textToShow = "start";
    boolean starter = false;

    String ListToUse = "First";

    List<Long> FirstList = new ArrayList<>();
    List<Long> SecondList = new ArrayList<>() ;


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
                if (starter == false){
                    starter = true;
                }
                timeBefore = System.currentTimeMillis();
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (timeBefore != null && timeafter != null){
                    textToShow = textToShow + "\n"+ s + "\ndif is " + (timeBefore-timeafter);
                    if (starter == true ){
                        if (ListToUse.equals("First")){
                            FirstList.add(timeBefore-timeafter);
                        }else{
                            SecondList.add(timeBefore-timeafter);
                        }
                    }
                }

            }

            @Override
            public void afterTextChanged(Editable s) {
                timeafter = System.currentTimeMillis();
                if (textToShow.length()>0){
                    textView.setText(textToShow);
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                editText.setText("");
                textToShow = "";
                starter = false;
                ListToUse = "First";
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                editText.setText("");
                textToShow = "";
                starter = false;
                ListToUse = "second";
            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("first List :" + FirstList +"\n"+  "SecondList :" + SecondList);
            }
        });
    }
}
