package com.juranoaa.androidtannotations_example;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.juranoaa.tannotations.AndroidTannotationsHandler;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int intMaxTest = AndroidTannotationsHandler.sampleIntMaxReturn();
        TextView tv = (TextView) findViewById(R.id.tv);
        tv.setText(""+intMaxTest);

    }

}
