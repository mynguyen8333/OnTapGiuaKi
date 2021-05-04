package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Donus donus;
    ImageView imgAnh;
    TextView tvName2,tvChiTiet2,tvGiaSP2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imgAnh = findViewById(R.id.imganhSP2);
        tvName2 = findViewById(R.id.tvName2);
        tvChiTiet2 = findViewById(R.id.tvChiTiet2);
        tvGiaSP2 = findViewById(R.id.tvGiaSP2);

        Intent intent = getIntent();
        if(intent!=null){
            donus = (Donus) intent.getSerializableExtra("key1");
            imgAnh.setImageResource(donus.getAnhSP());
            tvName2.setText(donus.getTenSP());
            tvChiTiet2.setText(donus.getChiTietSP());
            tvGiaSP2.setText(donus.getGiaSP()+"");
        }
    }
}