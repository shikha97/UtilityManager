package com.utilitymanager;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;

public class FileCreate extends AppCompatActivity {

    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_create);
        e1 = (EditText) findViewById(R.id.et1);
        e2 = (EditText) findViewById(R.id.et2);
    }

    public void save(View v) {
        String fname = e1.getText().toString();
        String cont = e2.getText().toString();
        File f = new File(getFilesDir(), fname);
        FileOutputStream fos = null;
        int flag = 0;
        try {

            fos = openFileOutput(fname, Context.MODE_PRIVATE);
            fos.write(cont.getBytes());
        } catch (Exception e) {
            Toast.makeText(this, "File Creation Unsuccesful", Toast.LENGTH_SHORT).show();
            flag = 1;
        }
        if (flag == 0) {
            e1.setText("");
            e2.setText("");
            Toast.makeText(this, "File Saved", Toast.LENGTH_SHORT).show();
        }

    }

    public void clear(View v) {
        e1.setText("");
        e2.setText("");
        Toast.makeText(this, "Cleared", Toast.LENGTH_SHORT).show();
    }
}
