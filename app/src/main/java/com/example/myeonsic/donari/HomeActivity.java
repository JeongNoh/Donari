package com.example.myeonsic.donari;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.ScrollView;
import android.widget.Toast;


public class HomeActivity extends AppCompatActivity {

    /*ScrollView scrollView;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /*scrollView = (ScrollView) findViewById(R.id.scrollView);
        scrollView.setVerticalScrollBarEnabled(true);*/

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar_home);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

    }

    public void onButtonHomeLeftClicked(View v){
        Toast.makeText(getApplicationContext(), "왼쪽버튼", Toast.LENGTH_LONG).show();
    }

    public void onButtonHomeRightClicked(View v){
        Toast.makeText(getApplicationContext(), "오른쪽버튼", Toast.LENGTH_LONG).show();
    }

    public void onButtonUnderBarClicked(View v){
        Intent intent = new Intent(getApplicationContext(), NoticeActivity.class);
        startActivity(intent);
    }
}
