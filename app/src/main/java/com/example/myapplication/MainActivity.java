package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnClickLiner {
    RecyclerView rsv_ac1;
    ArrayList<Donus> mDonuses;
    CustomAdapter_Donus adt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rsv_ac1 = findViewById(R.id.rcv_ac1);
        mDonuses = new ArrayList<>();
        mDonuses.add(new Donus(R.drawable.donut_yellow,R.drawable.daucong,"Tasty Donut","Spicy tasty donut family",10.00));
        mDonuses.add(new Donus(R.drawable.tasty_donut,R.drawable.daucong,"Pink Donut","Spicy tasty donut family",20.00));
        mDonuses.add(new Donus(R.drawable.green_donut,R.drawable.daucong,"Floating Donut","Spicy tasty donut family",30.00));
        mDonuses.add(new Donus(R.drawable.donut_red,R.drawable.daucong,"Tasty Donut","Spicy tasty donut family",40.00));
        adt = new CustomAdapter_Donus(mDonuses,this);
        rsv_ac1.setAdapter(adt);
        rsv_ac1.setHasFixedSize(true);
        rsv_ac1.setLayoutManager(new GridLayoutManager(this,1));

    }

    @Override
    public void clickItem(Donus donus) {

        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("key1",donus);
        startActivity(intent);
    }
}