package com.example.onenightjinrou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YourTurn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_turn);
        /*該当者であるときOkボタンを押すと役職画面へ～*/
        Button nextButton = (Button)findViewById(R.id.OkButtton4_Ya);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent4_Ya = new Intent(YourTurn.this,Yaku.class);
                startActivity(intent4_Ya);

            }
        });
    }
}
