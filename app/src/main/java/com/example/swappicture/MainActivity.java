package com.example.swappicture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn2 ;
    private Button btn1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int range = (int) (Math.random()*100)+1;
        String number = String.valueOf(range);
        String str = getString(R.string.text)+number;
        TextView textView = findViewById(R.id.text_view);
        textView.setText(str);
        init();
        clickListener();

    }
    private void init(){
        btn1 =  findViewById(R.id.button_two);
        btn2 =  findViewById(R.id.button_one);

    }
    private void clickListener(){

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
