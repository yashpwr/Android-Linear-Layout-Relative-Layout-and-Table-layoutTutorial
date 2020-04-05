package com.example.androidlayouttutorial;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class AndroidLayoutsActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.linear_layout);

        //setContentView(R.layout.relative_layout);

        setContentView(R.layout.table_layout);
    }
}
