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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                System.out.println("beforeTextChanged CharSequence"+s);
                System.out.println("beforeTextChanged start"+start);
                System.out.println("beforeTextChanged count"+count);
                System.out.println("beforeTextChanged after"+after);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textView.setText(s);
                System.out.println("onTextChanged CharSequence"+s);
                System.out.println("onTextChanged start"+start);
                System.out.println("onTextChanged before"+before);
                System.out.println("onTextChanged count"+count);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}
