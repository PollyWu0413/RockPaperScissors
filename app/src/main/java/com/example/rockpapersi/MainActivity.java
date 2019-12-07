package com.example.rockpapersi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int win,lose,div;
ImageView img_com_play;
TextView txt_result;
ImageButton btn_rock,btn_paper,btn_scissors;
Button btn_result;
Intent intent;
Bundle bag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_com_play = findViewById(R.id.imgComPlay);
        txt_result = findViewById(R.id.txtResult);
        btn_rock = findViewById(R.id.btnRock);
        btn_paper = findViewById(R.id.btnPaper);
        btn_scissors = findViewById(R.id.btnSicssor);
        btn_result = findViewById(R.id.btnResult);

        //如果玩家出剪刀
        btn_scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ComPlay = (int)(Math.random()*3+1);//取電腦亂數
                if(ComPlay == 1){//如果電腦出剪刀，顯示平手
                    img_com_play.setImageResource(R.drawable.scissors_resized);
                    txt_result.setText("平手!!");
                    div++;
                }
                else if(ComPlay == 2){//如果電腦出石頭，顯示輸了
                    img_com_play.setImageResource(R.drawable.rock_resized);
                    txt_result.setText("輸了~~真可惜");
                    lose++;
                }
                else {//如果電腦出布，顯示贏了
                    img_com_play.setImageResource(R.drawable.paper_resized);
                    txt_result.setText("恭喜你贏了~~");
                    win++;
                }
            }
        });
        btn_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ComPlay = (int)(Math.random()*3+1);
                if(ComPlay == 1){
                    img_com_play.setImageResource(R.drawable.rock_resized);
                    txt_result.setText("平手!!");
                    div++;
                }
                else if(ComPlay == 2){
                    img_com_play.setImageResource(R.drawable.paper_resized);
                    txt_result.setText("輸了~~真可惜");
                    lose++;
                }
                else {
                    img_com_play.setImageResource(R.drawable.scissors_resized);
                    txt_result.setText("恭喜你贏了~~");
                    win++;
                }
            }
        });
        btn_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ComPlay = (int)(Math.random()*3+1);
                if(ComPlay == 1){
                    img_com_play.setImageResource(R.drawable.paper_resized);
                    txt_result.setText("平手!!");
                    div++;
                }
                else if(ComPlay == 2){
                    img_com_play.setImageResource(R.drawable.scissors_resized);
                    txt_result.setText("輸了~~真可惜");
                    lose++;
                }
                else {
                    img_com_play.setImageResource(R.drawable.rock_resized);
                    txt_result.setText("恭喜你贏了~~");
                    win++;
                }
            }
        });
        //Bundle傳值到下一頁
        btn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,ResultActivity.class);
                bag = new Bundle();
                bag.putInt("win",win);
                bag.putInt("lose",lose);
                bag.putInt("div",div);
                intent.putExtras(bag);
                startActivity(intent);
                finish();
            }
        });



    }
}
