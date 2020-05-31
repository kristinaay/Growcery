package com.example.growcery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SellerPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seller_page);

    }
    public void goToShopPage(View view) {
        Intent myIntent = new Intent(this, ShopPage.class);
        startActivity(myIntent);
    }

}
