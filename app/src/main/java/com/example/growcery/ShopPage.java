package com.example.growcery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ShopPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_page);

    }

    public void goToBeginnerPage(View view) {
        Intent myIntent = new Intent(this, BeginnerPage.class);
        startActivity(myIntent);
    }
}

