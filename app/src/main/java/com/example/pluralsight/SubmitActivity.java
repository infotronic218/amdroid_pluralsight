package com.example.pluralsight;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class SubmitActivity extends AppCompatActivity {
    private Toolbar toolbar ;
    private EditText editTextFistName;
    private EditText editTextLastName;
    private EditText editTextEmail;
    private EditText editTextLink;
    private Button buttonSubmit ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
        //toolbar = findViewById(R.id.submit_toolbar);
        //setSupportActionBar(toolbar);
        //toolbar.setNavigationIcon(R.drawable.);


        // Initialize editext end button
        editTextLastName = findViewById(R.id.submit_editext_last_name);
        editTextFistName = findViewById(R.id.submit_editext_first_name);
        editTextEmail = findViewById(R.id.submit_editext_email);
        editTextLink = findViewById(R.id.submit_editext_project_link);
        buttonSubmit = findViewById(R.id.submit_button_submit);
    }


    @Override
    protected void onResume() {
        super.onResume();
        buttonSubmit.setOnClickListener(submitButtonClicked);
    }

    private View.OnClickListener submitButtonClicked = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Submit the project here
        }
    };
}