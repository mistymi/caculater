package com.example.administrator.caculater;

import android.content.Intent;
import android.media.Image;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class index extends AppCompatActivity {
     TextView atime;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        findViewById(R.id.cal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(index.this,Mistycaculater.class));
            }
        });

        findViewById(R.id.sk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(index.this,pay.class));
               // Toast.makeText(index.this, "You clicked Button 1", Toast.LENGTH_SHORT).show();
            }
        });


        getTime();

    }



    public void getTime() {
        atime=(TextView)findViewById(R.id.time);
        java.util.Date d=new java.util.Date();    //获取当前系统的时间
        java.text.SimpleDateFormat s= new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//格式化日期
        String dateStr = s.format(d); //转为字符串
        atime.setText("现在时间："+dateStr);

    }



}
