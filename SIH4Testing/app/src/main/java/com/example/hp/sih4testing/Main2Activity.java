package com.example.hp.sih4testing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.zip.Inflater;

public class Main2Activity extends AppCompatActivity {

    public void Dairy(View view)
    {
        Intent i=new Intent(this,activity_dairy.class);
        startActivity(i);
    }

    public void Grocery(View view)
    {
        Intent i=new Intent(this,activity_grocery.class);
        startActivity(i);
    }

    public void Clothing(View view)
    {
        Intent i=new Intent(this,activity_clothing.class);
        startActivity(i);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }


}
