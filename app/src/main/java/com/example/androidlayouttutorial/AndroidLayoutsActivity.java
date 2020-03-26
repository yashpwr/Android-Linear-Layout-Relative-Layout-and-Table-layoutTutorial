package com.example.androidlayouttutorial;

        import android.app.Activity;
        import android.os.Bundle;

public class AndroidLayoutsActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.linear_layout);

        //setContentView(R.layout.relative_layout);

        setContentView(R.layout.table_layout);
    }
}
