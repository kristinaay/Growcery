package com.example.growcery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CreateAccount extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account_page);

    }
    /** Called when the user taps the Get Started button */
    public void goToConfirmationPage(View view) {
        Intent myIntent = new Intent(this, Confirmation.class);
        startActivity(myIntent);

    }
}
