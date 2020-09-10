package com.example.pluralsight;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private   Toolbar toolbar;
    private Button open_submit ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        //getSupportActionBar().setCustomView(R.layout.toolbar);
        toolbar = findViewById(R.id.apptoolbar);
        setSupportActionBar(toolbar);
        open_submit = findViewById(R.id.toolbar_submit_button);
    }

    @Override
    protected void onResume() {
        super.onResume();
        open_submit.setOnClickListener(openSubmitActivity);
    }

    // Open submit activity on button clicked
    private View.OnClickListener openSubmitActivity= new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Intent openIntent = new Intent(MainActivity.this, SubmitActivity.class);
            startActivity(openIntent);
        }
    };
}



