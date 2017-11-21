package com.utilitymanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    String mUsername;
    Button email,messge,calc,notepad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseUser = mFirebaseAuth.getCurrentUser();
        email = (Button)findViewById(R.id.email);
        messge = (Button)findViewById(R.id.msg);
        calc = (Button)findViewById(R.id.calc);
        notepad = (Button)findViewById(R.id.npad);

        email.setOnClickListener(this);
        messge.setOnClickListener(this);
        calc.setOnClickListener(this);
        notepad.setOnClickListener(this);

        if (mFirebaseUser == null) {
            // Not signed in, launch the Sign In activity
            startActivity(new Intent(this, SignInActivity.class));
            finish();
            return;
        } else {
            mUsername = mFirebaseUser.getDisplayName();
            /*if (mFirebaseUser.getPhotoUrl() != null) {
                mPhotoUrl = mFirebaseUser.getPhotoUrl().toString();
            }*/
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }
    public void onClick(View v){
        Intent i;
        switch(v.getId()){
            case R.id.email:
                i=new Intent(MainActivity.this,emailSender.class);
                startActivity(i);
                break;
            case R.id.msg:
                i=new Intent(MainActivity.this,MessageSender.class);
                startActivity(i);
                break;
            case R.id.calc:
                i=new Intent(MainActivity.this,Calculator.class);
                startActivity(i);
                break;
            case R.id.npad:
                i=new Intent(MainActivity.this,MainFiles.class);
                startActivity(i);
                break;
        }
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.sign_out_menu:
                mFirebaseAuth.signOut();
                //Auth.GoogleSignInApi.signOut(mGoogleApiClient);
                //mUsername = ANONYMOUS;
                startActivity(new Intent(this, SignInActivity.class));
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

}
