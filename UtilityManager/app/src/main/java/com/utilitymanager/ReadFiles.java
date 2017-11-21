package com.utilitymanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadFiles extends AppCompatActivity {

    TextView t1;
    Button b1,b2;
    Spinner s;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_files);
        s=(Spinner)findViewById(R.id.spinner);
        t1=(TextView)findViewById(R.id.display);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        additems();
    }
    public void additems()
    {
        File f=getFilesDir();
        File[] listOfFiles = f.listFiles();
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < listOfFiles.length; i++)
        {
            if (listOfFiles[i].isFile())
            {
                //  Toast.makeText(this,listOfFiles[i].getName(),Toast.LENGTH_SHORT).show();
                list.add(listOfFiles[i].getName());
            }
        }
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(dataAdapter);

    }
    public void clear(View v)
    {
        t1.setText("The content of the opened file will be displayed here");
    }
    public void open(View v)
    {
        try{
            String fn=s.getSelectedItem().toString();
            //Toast.makeText(this,"File selected is:"+fn,Toast.LENGTH_SHORT).show();
            FileInputStream fis= openFileInput(fn);
            String temp="";int c;
            while((c=fis.read())!=-1)
            {
                temp=temp+Character.toString((char)c);
            }
            t1.setText(temp);}
        catch(Exception e)
        {
            Toast.makeText(this,"File does not exist",Toast.LENGTH_SHORT).show();
        }
    }

}
