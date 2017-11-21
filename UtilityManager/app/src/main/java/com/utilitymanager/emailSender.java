package com.utilitymanager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class emailSender extends AppCompatActivity {

    EditText id,sub,text;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_sender);

        id = (EditText) findViewById(R.id.toaddr);
        sub = (EditText) findViewById(R.id.subject);
        text = (EditText) findViewById(R.id.text);
        send = (Button) findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String s_id= id.getText().toString();
                String s_sub = sub.getText().toString();
                String s_text = text.getText().toString();
                String s[] = {s_id};
                composeEmail(s, s_sub, s_text);
            }
        });
    }

    public void composeEmail(String s_id[],String s_sub, String s_text) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto:"));
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, s_id);
        intent.putExtra(Intent.EXTRA_SUBJECT, s_sub);
        intent.putExtra(Intent.EXTRA_TEXT,s_text);
        try {
            startActivity(Intent.createChooser(intent, "Choose app to send mail:"));
        }catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(emailSender.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }


}

