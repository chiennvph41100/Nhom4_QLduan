package com.chiennvph41100.asm1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Dangky extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangky);

        EditText txtname = findViewById(R.id.txtname);
        EditText txtpass = findViewById(R.id.txtpass);
        EditText txtrepass = findViewById(R.id.txtrepass);

        Button dangnhap = findViewById(R.id.btndangnhap);
        Button trove = findViewById(R.id.btntrove);


        dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = txtname.getText().toString();
                String pass = txtpass.getText().toString();
                String repass = txtrepass.getText().toString();
                if(name.trim().isEmpty() || pass.trim().isEmpty() || repass.trim().isEmpty()){
                    Toast.makeText(Dangky.this, "Vui Lòng Nhập Đầy Đủ", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(pass.equals(repass)){
                        Toast.makeText(Dangky.this, "Đăng Ký Thành Công !!", Toast.LENGTH_SHORT).show();
                        //Gui du lieu
                        Intent intent = new Intent(Dangky.this, Dangnhap.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("name", name);
                        bundle.putString("pass",pass);
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                    else
                        Toast.makeText(Dangky.this, "Mật khẩu không trùng nhau !!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        trove.setOnClickListener(new View.OnClickListener(){
            //code added
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), Dangnhap.class);// khởi tạo đối tượng để gọi màn hình tiếp theo
                startActivity(nextScreen);// mở màn hình sau
            }
        }
        );
    }
}