package com.example.growcery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class DisplaySecondPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_page);
        Spinner spinner = (Spinner) findViewById(R.id.select_area);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.area_list, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

    public void goToSellerPage(View view) {
        Intent myIntentTwo = new Intent(this, SellerPage.class);
        startActivity(myIntentTwo);
    }
    public void goToBuyerPage(View view) {
        Intent myIntent = new Intent(this, BuyerPage.class);
        startActivity(myIntent);
    }

    public void goToSupplierPage(View view) {
        Intent myIntentThree = new Intent(this, SupplierPage.class);
        startActivity(myIntentThree);
    }

}
