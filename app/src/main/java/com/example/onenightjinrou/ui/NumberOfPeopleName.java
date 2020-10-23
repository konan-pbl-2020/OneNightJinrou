package com.example.onenightjinrou.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.onenightjinrou.R;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NumberOfPeopleName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_of_people_name);

        public static void main(String[]Object args){
            String result[] = new String[10];
            Scanner sc = new Scanner(System.in);
            System.out.println("人数を決めてください");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            for(int i = 0; i  < num; i++){
                result[i] = sc.next();
                //
            }
        }
    }
}





