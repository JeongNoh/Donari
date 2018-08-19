package com.example.myeonsic.donari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class NoticeActivity extends AppCompatActivity {

    LinearLayout linearLayout1;
    LinearLayout linearLayout2;
    LinearLayout linearLayout3;
    LinearLayout linearLayout4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        linearLayout1 = (LinearLayout) findViewById(R.id.frame_view_notice);
        linearLayout2 = (LinearLayout) findViewById(R.id.frame_view_recent);
        linearLayout3 = (LinearLayout) findViewById(R.id.frame_view_result);
        linearLayout4 = (LinearLayout) findViewById(R.id.frame_view_ask);
    }

    public void onButtonNoticeClicked(View view) {
        Toast.makeText(getApplicationContext(), "나쁘지", Toast.LENGTH_LONG).show();
        changeImage(0);
    }

    public void onButtonRecentClicked(View view) {
        Toast.makeText(getApplicationContext(), "않게", Toast.LENGTH_LONG).show();
        changeImage(1);
    }

    public void onButtonResultClicked(View view) {
        Toast.makeText(getApplicationContext(), "만들었죠?", Toast.LENGTH_LONG).show();
        changeImage(2);
    }

    public void onButtonAskClicked(View view) {
        Toast.makeText(getApplicationContext(), "ㅎㅎ", Toast.LENGTH_LONG).show();
        changeImage(3);
    }


    public void onButtonHomeLeftClicked(View view) {
        Toast.makeText(getApplicationContext(), "뒤로가기", Toast.LENGTH_LONG).show();
        finish();
    }
    private void changeImage(int frameIndex){
        if(frameIndex == 0){
            linearLayout1.setVisibility(View.VISIBLE);
            linearLayout2.setVisibility(View.INVISIBLE);
            linearLayout3.setVisibility(View.INVISIBLE);
            linearLayout4.setVisibility(View.INVISIBLE);
        }
        else if(frameIndex == 1){
            linearLayout1.setVisibility(View.INVISIBLE);
            linearLayout2.setVisibility(View.VISIBLE);
            linearLayout3.setVisibility(View.INVISIBLE);
            linearLayout4.setVisibility(View.INVISIBLE);
        }
        else if(frameIndex == 2){
            linearLayout1.setVisibility(View.INVISIBLE);
            linearLayout2.setVisibility(View.INVISIBLE);
            linearLayout3.setVisibility(View.VISIBLE);
            linearLayout4.setVisibility(View.INVISIBLE);
        }
        else if(frameIndex == 3){
            linearLayout1.setVisibility(View.INVISIBLE);
            linearLayout2.setVisibility(View.INVISIBLE);
            linearLayout3.setVisibility(View.INVISIBLE);
            linearLayout4.setVisibility(View.VISIBLE);
        }
    }
}
