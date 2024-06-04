package com.chiennvph41100.asm1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button exit = findViewById(R.id.btnexit);

        exit.setOnClickListener(new View.OnClickListener(){
            //code added
            public void onClick(View arg0) {
                Intent nextScreen = new Intent(getApplicationContext(), Dangnhap.class);// khởi tạo đối tượng để gọi màn hình tiếp theo
                startActivity(nextScreen);// mở màn hình sau
            }
        }
        );
    }
}