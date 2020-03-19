package com.example.administrator.caculater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class pay extends AppCompatActivity {
    private ImageView imageView=null;
    private Button bt1=null;
    private Button bt2=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
        imageView = (ImageView) findViewById(R.id.imageView);
       bt1=(Button)findViewById(R.id.vxsk);
        bt2=(Button)findViewById(R.id.zfbsk);
        bt1.setOnClickListener(listener);
        bt2.setOnClickListener(listener);




    }

    private View.OnClickListener listener = new View.OnClickListener() {
        public void onClick(View v) {
            if (v == bt1) {
                //   currentImgId=(currentImgId-1+imgId.length)%imgId.length;
                //    imageView.setImageResource(imgId[currentImgId]);
                imageView.setImageResource( R.drawable.vx);

            }
            if (v == bt2) {
                //  currentImgId=(currentImgId+1)%imgId.length;
                //  imageView.setImageResource(imgId[currentImgId]);
                imageView.setImageResource( R.drawable.zfb);
            }

        }
    };


}
