package com.example.administrator.caculater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.ref.SoftReference;

public class Mistycaculater extends AppCompatActivity implements View.OnClickListener {
    Button btu0,btu1,btu2,btu3;
    Button btu4;
    Button btu5;
    Button btu6;
    Button btu7;
    Button btu8;
    Button btu9;
    Button AC;
    Button DEL;
    Button chu;
    Button chen;
    Button ji;
    Button jia;
    Button pre;
    Button dot;
    Button equ;
    TextView num;
    boolean clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mistycaculater);


        initclick();
    }
    public void initclick(){
        btu0=(Button)findViewById(R.id.btu0);
        btu1=(Button)findViewById(R.id.btu1);
        btu2=(Button)findViewById(R.id.btu2);
        btu3=(Button)findViewById(R.id.btu3);
        btu4=(Button)findViewById(R.id.btu4);
        btu5=(Button)findViewById(R.id.btu5);
        btu6=(Button)findViewById(R.id.btu6);
        btu7=(Button)findViewById(R.id.btu7);
        btu8=(Button)findViewById(R.id.btu8);
        btu9=(Button)findViewById(R.id.btu9);
        AC=(Button)findViewById(R.id.AC);
        DEL=(Button)findViewById(R.id.DEL);
       chu=(Button)findViewById(R.id.chu);
       chen=(Button)findViewById(R.id.chen);
       ji=(Button)findViewById(R.id.ji);
       jia=(Button)findViewById(R.id.jia);
       pre=(Button)findViewById(R.id.pre);
       dot=(Button)findViewById(R.id.dot);
       equ=(Button)findViewById(R.id.equ);
        num=(TextView)findViewById(R.id.num);

        btu0.setOnClickListener(this);
        btu1.setOnClickListener(this);
        btu2.setOnClickListener(this);
        btu3.setOnClickListener(this);
        btu4.setOnClickListener(this);
        btu5.setOnClickListener(this);
        btu6.setOnClickListener(this);
        btu7.setOnClickListener(this);
        btu8.setOnClickListener(this);
        btu9.setOnClickListener(this);
        AC.setOnClickListener(this);
        DEL.setOnClickListener(this);
        chu.setOnClickListener(this);
        chen.setOnClickListener(this);
        ji.setOnClickListener(this);
        jia.setOnClickListener(this);
        pre.setOnClickListener(this);
        dot.setOnClickListener(this);
        equ.setOnClickListener(this);


    }
    public void onClick(View v){
        String str=num.getText().toString();
        switch(v.getId()){
            case R.id.btu1:
            case R.id.btu0:
            case R.id.btu2:
            case R.id.btu3:
            case R.id.btu4:
            case R.id.btu5:
            case R.id.btu6:
            case R.id.btu7:
            case R.id.btu8:
            case R.id.btu9:
            case R.id.dot:
            case R.id.pre:
                //Toast.makeText(this,((Button)v).getText(),Toast.LENGTH_LONG).show();
                num.setText(str+((Button)v).getText());
                break;
            case R.id.jia:
                num.setText(str+" "+"+"+" ");
                break;
            case R.id.ji:
                num.setText(str+" "+"－"+" ");
                break;
            case R.id.chen:
                num.setText(str+" "+"×"+" ");
                break;
            case R.id.chu:
                num.setText(str+" "+"÷"+" ");
                break;

            case R.id.DEL:
                if (str!=null&&!str.equals("")){
                    num.setText(str.substring(0,str.length()-1));
                }
                break;

            case R.id.AC:
                clear=false;
                str="";
                num.setText("");
                break;

            case R.id.equ:
             String aa= result();
             num.setText(aa);
                break;

        }

    }

    public String result(){
        String exp=num.getText().toString();
        double Result=0;
        String getresult="123";
        String nu1=exp.substring(0,exp.indexOf(" "));
        String op = exp.substring(exp.indexOf(" ")+1,exp.indexOf(" ")+2) ;
        String nu2= exp.substring(exp.indexOf(" ")+3) ;
        double a=0,b=0;
        if(!nu1.equals("")&&!nu2.equals(""))
        {
            if(nu1.contains("%")&&!nu2.contains("%")){
                String number1=nu1.substring(0,nu1.indexOf("%"));
                 a=Double.parseDouble(number1)*0.01;
                 b=Double.parseDouble(nu2);
            }

            if(!nu1.contains("%")&&nu2.contains("%")){
                String number2=nu2.substring(0,nu2.indexOf("%"));
                a=Double.parseDouble(nu1);
                b=Double.parseDouble(number2)*0.01;
            }
            if(nu1.contains("%")&&nu2.contains("%")){
                String number1=nu1.substring(0,nu1.indexOf("%"));
                String number2=nu1.substring(0,nu2.indexOf("%"));
                a=Double.parseDouble(number1)*0.01;
                b=Double.parseDouble(number2)*0.01;
            }

            if(!nu1.contains("%")&&!nu2.contains("%")){
             a=Double.parseDouble(nu1);
             b=Double.parseDouble(nu2);}


            if (op.equals("+")){
                Result=a+b;
            } else if(op.equals("－")){
                Result=a-b;
            }else if(op.equals("×")){
                Result=a*b;
            }else if(op.equals("÷")){
                if(b==0)
                {Result=0;}
                else
                { Result=(a*1.0)/b;}
            }
        }
        if(nu1.equals("")&&!nu2.equals("")){
            Result=Double.parseDouble(nu2);
        }
        if(!nu1.equals("")&&nu2.equals("")){
            Result=Double.parseDouble(nu1);
        }
        if(op.equals("")){
            Result=0;
        }

        getresult = Result + "";
        return  getresult;
    }
}
