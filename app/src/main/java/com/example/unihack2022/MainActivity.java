package com.example.unihack2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
<<<<<<< HEAD
    Button button, button2;
=======

    Button button1;

>>>>>>> 32da135c54181e4fcb132f8d83d978bc8b5754c8
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Login.class);
=======
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapActivity.class);
>>>>>>> 32da135c54181e4fcb132f8d83d978bc8b5754c8
                startActivity(intent);
                finish();
            }
        });
<<<<<<< HEAD
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Register.class));
            }
        });
=======
>>>>>>> 32da135c54181e4fcb132f8d83d978bc8b5754c8
    }
}