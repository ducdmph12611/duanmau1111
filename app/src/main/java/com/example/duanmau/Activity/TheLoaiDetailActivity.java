package com.example.duanmau.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.duanmau.dao.TheLoaiDAO;
import com.example.duanmau.R;

public class TheLoaiDetailActivity extends AppCompatActivity {
    EditText edMatheloai, edTentheloai, edMota, edVitri;
    TheLoaiDAO theloaiDAO;
    String maTl, tenTL, viTri, moTa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("CHI TIẾT THỂ LOẠI");
        setContentView(R.layout.activity_the_loai_detail);

        edMatheloai = findViewById(R.id.edMatheloai);
        edTentheloai = findViewById(R.id.edTentheloai);
        edMota = findViewById(R.id.edMota);
        edVitri = findViewById(R.id.edVitri);
        theloaiDAO = new TheLoaiDAO(this);
        TextView text = findViewById(R.id.text);
        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/svn-hello_sweets.otf");
        text.setTypeface(type);
        Intent in = getIntent();
        Bundle c = in.getExtras();
        maTl = c.getString("MATHELOAI");
        tenTL = c.getString("TENTHELOAI");
        moTa = c.getString("MOTA");
        viTri = c.getString("VITRI");
        edMatheloai.setText(maTl);
        edTentheloai.setText(tenTL);
        edMota.setText(moTa);
        edVitri.setText(viTri);
    }

    public void updateU(View view) {

        if (theloaiDAO.updateInfoTheLoai(maTl, edMatheloai.getText().toString(), edTentheloai.getText().toString(), edMota.getText().toString(), edVitri.getText().toString()) > 0) {
            Toast.makeText(getApplicationContext(), "Lưu thành công", Toast.LENGTH_SHORT).show();
        }
    }

    public void Huy(View view) {
        finish();
    }



}

