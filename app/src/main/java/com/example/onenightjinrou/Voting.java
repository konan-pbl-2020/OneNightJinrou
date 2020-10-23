package com.example.onenightjinrou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Voting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        int i = 0;
        int white = 0;
        int black = 0;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting);

        for(i = 0; i < 6; i++){
            Button Player1 = (Button)findViewById(R.id.button1_Voting);
            Player1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(Voting.this, Voting.class);
                    startActivity(intent);
                }
            });
            Button Player2 = (Button)findViewById(R.id.button2_Voting);
            Player2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(Voting.this, Voting.class);
                    startActivity(intent);
                }
            });
            Button Player3 = (Button)findViewById(R.id.button3_Voting);
            Player3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(Voting.this, Voting.class);
                    startActivity(intent);
                }
            });
            Button Player4 = (Button)findViewById(R.id.button4_Voting);
            Player4.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(Voting.this, Voting.class);
                    startActivity(intent);
                }
            });
            Button Player5 = (Button)findViewById(R.id.button5_Voting);
            Player5.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(Voting.this, Voting.class);
                    startActivity(intent);
                }
            });
            Button Player6 = (Button)findViewById(R.id.button6_Voting);
            Player6.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(Voting.this, Voting.class);
                    startActivity(intent);
                }
            });
            Button NotVoting = (Button)findViewById(R.id.button7_Voting);
            NotVoting.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(Voting.this, Voting.class);
                    startActivity(intent);
                }
            });
        }
    }
}