package com.example.ourkids;

import android.os.Bundle;
import android.widget.NumberPicker;


import androidx.appcompat.app.AppCompatActivity;

import com.example.ourkids.R;

public class popup_my extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super .onCreate(savedInstanceState);
        setContentView(R.layout.popup_my);

        NumberPicker picker1 = (NumberPicker) findViewById(R.id.year);

        picker1.setMaxValue(2200);
        picker1.setMinValue(1850);
        picker1.setValue(2022);


    }

}
