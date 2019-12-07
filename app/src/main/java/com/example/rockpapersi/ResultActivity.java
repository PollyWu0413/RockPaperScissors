package com.example.rockpapersi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView txt_result2;
    Button btn_back;
    Bundle bag;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        txt_result2 = findViewById(R.id.txt_result2);
        btn_back = findViewById(R.id.btn_back);

        //返回上一頁
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(ResultActivity.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        });
//Bundle取的上一頁的結果
        bag = getIntent().getExtras();
        int win = bag.getInt("win");
        int lose = bag.getInt("lose");
        int div = bag.getInt("div");
        txt_result2.setText("贏:"+win+"次"+"\r\n"+"輸:"+lose+"次"+"\r\n"+"平手:"+div+"次");
    }
}
