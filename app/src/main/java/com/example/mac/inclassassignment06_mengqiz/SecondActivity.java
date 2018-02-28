package com.example.mac.inclassassignment06_mengqiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        Animal animal = (Animal) intent.getSerializableExtra(Keys.ANIMAL);
        TextView printOut = (TextView) findViewById(R.id.print_field);
        printOut.setText(animal.toString());
    }
}
