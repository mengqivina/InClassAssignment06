package com.example.mac.inclassassignment06_mengqiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText type;
    private EditText leg;
    private CheckBox fur;
    private EditText moreInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        type= (EditText)findViewById(R.id.type_field);
        leg= (EditText)findViewById(R.id.leg_field);
        fur= (CheckBox)findViewById(R.id.fur_field);
        moreInfo= (EditText) findViewById(R.id.info_field);
    }

    public void submit(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String animalType=type.getText().toString();
        String legNumberString =leg.getText().toString();
        int legNumber = Integer.parseInt(legNumberString);
        String hasFurString=fur.getText().toString();
        boolean hasFur=Boolean.parseBoolean(hasFurString);
        String moreInfoHere= moreInfo.getText().toString();

        Animal a = new Animal(animalType,legNumber, hasFur, moreInfoHere);
        intent.putExtra(Keys.ANIMAL, a);
        startActivity(intent);
    }
}
