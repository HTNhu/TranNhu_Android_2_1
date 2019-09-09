package com.example.student.bt_android_tuan02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bai02Activity extends AppCompatActivity {

    EditText edtC;
    EditText edtF;
    Button btnCF;
    Button btnFC;
    Button btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai02);
        edtC = findViewById(R.id.edtC);
        edtF = findViewById(R.id.edtF);
        btnCF = findViewById(R.id.btnCF);
        btnFC = findViewById(R.id.btnFC);
        btnClear = findViewById(R.id.btnClear);

        btnCF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if(edtC.getText().toString() == "" ){
                        Toast.makeText(Bai02Activity.this,"Not empty", Toast.LENGTH_SHORT).show();
                    }else{
                        double celsius= Double.parseDouble(edtC.getText().toString());
                        double fahrenheit = (double) 9 / 5 * celsius + 32;
                        edtF.setText(String.valueOf(fahrenheit));
                    }
                }catch (Exception ex){
                    Toast.makeText(Bai02Activity.this,"Nhập lỗi" + ex.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    if(edtF.getText().toString() == "" ){
                        Toast.makeText(Bai02Activity.this,"Not empty", Toast.LENGTH_SHORT).show();
                    }else{
                        double f = Double.parseDouble(edtF.getText().toString());
                        double celsius = (double) (f-32)*5/9;;
                        edtC.setText(String.valueOf(celsius));
                    }
                }catch (Exception ex){
                    Toast.makeText(Bai02Activity.this,"Nhập lỗi" + ex.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtC.setText("");
                edtF.setText("");
            }
        });
    }
}
