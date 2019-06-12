package com.samarinsergey.firsttestapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editInput = findViewById(R.id.edit_input);
        Button buttonEnter = findViewById(R.id.button_enter);
        final TextView textResult = findViewById(R.id.text_result);

        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editInput.getText().toString() + " some text";
                textResult.setText(text);
            }
        });
    }
}
