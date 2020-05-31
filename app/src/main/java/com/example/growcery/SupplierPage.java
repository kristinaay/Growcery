package com.example.growcery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SupplierPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.supplier_page);
    }

    public void goToSentPage(View view) {
        Intent myIntent = new Intent(this, SentPage.class);
        startActivity(myIntent);

    }


}
