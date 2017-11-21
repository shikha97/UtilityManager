package com.utilitymanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainFiles extends AppCompatActivity {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_files);
    }
    public void create(View v)
    {
        Intent i=new Intent(this,FileCreate.class);
        startActivity(i);
    }
    public void open(View v)
    {
        Intent i=new Intent(this,ReadFiles.class);
        startActivity(i);
    }
}
