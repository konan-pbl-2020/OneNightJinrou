package com.example.onenightjinrou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Villager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_villager);
        Button okButton = (Button)findViewById(R.id.button1_Y_Villager);
        okButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Villager.this,Villager2.class);
                startActivity(intent);
            }
        });
    }
}