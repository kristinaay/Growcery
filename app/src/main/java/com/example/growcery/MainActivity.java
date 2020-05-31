package com.example.growcery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the Get Started button */
    public void goToAccountPage(View view) {
        Intent myIntent = new Intent(this, CreateAccount.class);
        startActivity(myIntent);

    }

}
