package com.example.growcery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Confirmation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmation_page);

    }
    public void goToSecondPage(View view) {
        Intent myIntent = new Intent(this, DisplaySecondPage.class);
        startActivity(myIntent);

    }
}
