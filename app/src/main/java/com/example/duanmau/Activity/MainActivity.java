package com.example.duanmau.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.duanmau.R;


public class MainActivity extends AppCompatActivity {

    ImageView img_nd, img_sach, img_theloai, img_hoaDonn, img_topSach, img_TK ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        img_nd=(ImageView) findViewById(R.id.img1);
        img_sach=(ImageView) findViewById(R.id.img3);
        img_theloai = (ImageView) findViewById(R.id.img2);
        img_hoaDonn = findViewById(R.id.img4);
        img_topSach = findViewById(R.id.img5);
        img_TK = findViewById(R.id.img6);
        /* Sk click */

        img_nd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListNguoiDungActivity.class);
                startActivity(intent);
            }
        });

        img_theloai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListTheLoaiActivity.class);
                startActivity(intent);
            }
        });

        img_sach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListSachActivity.class);
                startActivity(intent);
            }
        });

        img_hoaDonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListHoaDonActivity.class);
                startActivity(intent);
            }
        });

        img_topSach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListBanChayActivity.class);
                startActivity(intent);
            }
        });

        img_TK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListThongKeActivity.class);
                startActivity(intent);
            }
        });


    }
}

