package com.utilitymanager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MessageSender extends AppCompatActivity{

    EditText number,text;
    Button send;
    String phoneno,text_msg;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_sender);
        number = (EditText)findViewById(R.id.num);
        text = (EditText)findViewById(R.id.text_msg);
        send = (Button)findViewById(R.id.send);

        send.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sendSMSMessage();
            }
        });
    }

    protected void sendSMSMessage(){
       phoneno = number.getText().toString();
        text_msg = text.getText().toString();
        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phoneno, null, text_msg, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),
                    "SMS failed, please try again.",
                    Toast.LENGTH_LONG).show();
                e.printStackTrace();
        }
    }
}
