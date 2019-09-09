package com.example.student.bt_android_tuan02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bai01Activity extends AppCompatActivity {

    EditText edtSoA;
    EditText edtSoB;
    Button btnTong;
    Button btnHieu;
    Button btnTich;
    Button btnThuong;
    Button btnUoc;
    Button btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai01);

         edtSoA = findViewById(R.id.edtSoB2);
         edtSoB = findViewById(R.id.edtSoB3);
         btnTong = findViewById(R.id.btnTong2);
         btnHieu = findViewById(R.id.btnHieu);
         btnTich = findViewById(R.id.btnTich);
         btnThuong= findViewById(R.id.btnThuong2);
         btnUoc = findViewById(R.id.btnUoc);
         btnThoat = findViewById(R.id.btnThoat);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(edtSoA.getText().toString());
                double num2 = Double.parseDouble(edtSoB.getText().toString());

                double tong = num1 + num2;

                Toast.makeText(Bai01Activity.this, String.valueOf(tong), Toast.LENGTH_SHORT).show();
            }
        });
        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(edtSoA.getText().toString());
                double num2 = Double.parseDouble(edtSoB.getText().toString());

                double hieu = num1 - num2;

                Toast.makeText(Bai01Activity.this, String.valueOf(hieu), Toast.LENGTH_SHORT).show();
            }
        });
        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(edtSoA.getText().toString());
                double num2 = Double.parseDouble(edtSoB.getText().toString());

                double tich = num1 * num2;

                Toast.makeText(Bai01Activity.this, String.valueOf(tich), Toast.LENGTH_SHORT).show();
            }
        });
        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(edtSoA.getText().toString());
                double num2 = Double.parseDouble(edtSoB.getText().toString());

                double thuong = num1 / num2;

                Toast.makeText(Bai01Activity.this, String.valueOf(thuong), Toast.LENGTH_SHORT).show();
            }
        });
        btnUoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(edtSoA.getText().toString());
                double num2 = Double.parseDouble(edtSoB.getText().toString());
                while (num1 != num2) {
                    if (num1 > num2) {
                        num1 -= num2;
                    } else {
                        num2 -= num1;
                    }
                }
               double uscln = num1;
                Toast.makeText(Bai01Activity.this, String.valueOf(uscln), Toast.LENGTH_SHORT).show();
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Bai01Activity.this, MainActivity.class));
            }
        });
    }
}
