package com.example.growcery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class BuyerPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buyer_page);

    }
    public void goToInfoPage(View view) {
        Intent myIntent = new Intent(this, InfoPage.class);
        startActivity(myIntent);
    }

}