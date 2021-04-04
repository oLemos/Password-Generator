package com.lemos.passwordgenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private String[] letters;

    private TextView show_password;
    private Button btn_generator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        letters = new String[] {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        };

        show_password = findViewById(R.id.show_password);
        btn_generator = findViewById(R.id.btn_generator);

        btn_generator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int int_password = random.nextInt(8999) + 1000;
                String letter = letters[random.nextInt(letters.length)];
                show_password.setText(letter.toUpperCase() + int_password);
            }
        });
    }
}