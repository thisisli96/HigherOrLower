package com.example.mrpeter1.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button tombolinputan;
EditText inputan;
    Integer a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombolinputan = findViewById(R.id.tombolinputan);
        inputan = findViewById(R.id.inputan);
        tombolinputan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 a = Integer.parseInt(inputan.getText().toString());
                if (a > 10 ){

                    Toast.makeText(getApplicationContext(),"angkanya sangat besar ", Toast.LENGTH_SHORT).show();

                } else {

                    Toast.makeText(getApplicationContext(),"angkanya di bawa 10 ", Toast.LENGTH_SHORT).show();
                };
            }
        });
    }
}
