package com.example.student.bt_android_tuan02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bai03Activity extends AppCompatActivity {

    Button btnChuyen;
    EditText edtDL, edtAL;

    String namAL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai03);
        btnChuyen = (Button) findViewById(R.id.btnChuyen);
        edtAL = findViewById(R.id.edtAL);
        edtDL = findViewById(R.id.edtDL);

        btnChuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namAL="";
                try{
                    double namDL = Double.parseDouble(edtDL.getText().toString());
                    double can = namDL % 10;
                    double chi = namDL % 12;
                    switch ((int) can){
                        case 0: namAL+="Canh ";
                            break;
                        case 1:namAL+="Tân ";
                            break;
                        case 2:namAL+="Nhâm ";
                            break;
                        case 3:namAL+="Quý ";
                            break;
                        case 4:namAL+="Giáp ";
                            break;
                        case 5:namAL+="Ât ";
                            break;
                        case 6:namAL+="Bính ";
                            break;
                        case 7:namAL+="Đinh ";
                            break;
                        case 8:namAL+="Mậu ";
                            break;
                        case 9:namAL+="Kỷ ";
                            break;
                        default:break;
                    }
                    switch ((int) chi){
                        case 0: namAL+="Thân";
                            break;
                        case 1:namAL+="Dậu";
                            break;
                        case 2:namAL+="Tuất";
                            break;
                        case 3:namAL+="Hợi";
                            break;
                        case 4:namAL+="Tý";
                            break;
                        case 5:namAL+="Sửu";
                            break;
                        case 6:namAL+="Dần";
                            break;
                        case 7:namAL+="Mẹo";
                            break;
                        case 8:namAL+="Thìn";
                            break;
                        case 9:namAL+="Tỵ";
                            break;
                        case 10:namAL+="Ngọ";
                            break;
                        case 11:namAL+="Mùi";
                            break;
                        default:break;
                    }
                    edtAL.setText(namAL);
                }catch (Exception ex){
                    Toast.makeText(Bai03Activity.this, "Lỗi " + ex.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
