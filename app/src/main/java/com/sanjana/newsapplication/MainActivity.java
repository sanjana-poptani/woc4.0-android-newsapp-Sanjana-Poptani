package com.sanjana.newsapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button  btnone = findViewById(R.id.button23);
        Button  btntwo = findViewById(R.id.button24);
        Button  btnthree = findViewById(R.id.button25);
        Button  btnfour = findViewById(R.id.button26);
        Button  btnfive = findViewById(R.id.button27);
        Button  btnsix = findViewById(R.id.button28);
        LinearLayout LinearLayout = findViewById(R.id.linearLayout);


        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewScreen newsVerticalLayout = new NewScreen();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout,newsVerticalLayout);
                transaction.commit();
            }
        });

        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewScreen newsVerticalLayout = new NewScreen();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout,newsVerticalLayout);
                transaction.commit();
            }
        });

        btnthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewScreen newsVerticalLayout = new NewScreen();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout,newsVerticalLayout);
                transaction.commit();
            }
        });

        btnfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewScreen newsVerticalLayout = new NewScreen();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout,newsVerticalLayout);
                transaction.commit();
            }
        });

        btnfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewScreen newsVerticalLayout = new NewScreen();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout,newsVerticalLayout);
                transaction.commit();
            }
        });

        btnsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewScreen newsVerticalLayout = new NewScreen();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout,newsVerticalLayout);
                transaction.commit();
            }
        });


    }




//        btnone.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            NewsVerticalLayout newsVerticalLayout = new NewsVerticalLayout();
//            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//            transaction.replace(R.id.linearLayout,newsVerticalLayout);
//        }
//    });


}