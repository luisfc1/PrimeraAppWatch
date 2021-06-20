package com.octopus.primeraappwatch;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends WearableActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.text);

        Date hoy = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("EEE, MMMM d - yyyy");
        mTextView.setText("Hoy es: " + formatoFecha.format(hoy) + "\nLuis Fernando Caute Hernández");

        // Enables Always-on
        setAmbientEnabled();
    }
}
