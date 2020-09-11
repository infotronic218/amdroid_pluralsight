package com.example.pluralsight;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

public class SubmitActivity extends AppCompatActivity  {
    private Toolbar toolbar ;
    //private static final int  FRAGMENT_CONTAINER_ID = R.id.submit_fragment_container;
    private FragmentManager fragmentManager;

    private EditText editTextLastName;
    private EditText editTextFistName ;
    private EditText editTextEmail ;
    private EditText editTextLink ;
    private Button buttonSubmit ;
    private LinearLayout linearLayoutFormContainer;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);
        toolbar = findViewById(R.id.submit_project_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.back_arrocw);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        /*
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(FRAGMENT_CONTAINER_ID,SubmitFormFragment.newInstance(this))
                .commit();
        */

        editTextLastName = findViewById(R.id.submit_editext_last_name);
        editTextFistName = findViewById(R.id.submit_editext_first_name);
        editTextEmail = findViewById(R.id.submit_editext_email);
        editTextLink = findViewById(R.id.submit_editext_project_link);
        buttonSubmit = findViewById(R.id.submit_button_submit);
        linearLayoutFormContainer = findViewById(R.id.submit_form_container);
    }


    @Override
    protected void onResume() {
        super.onResume();
        buttonSubmit.setOnClickListener(submitButtonClicked);

    }



    private View.OnClickListener submitButtonClicked = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
           linearLayoutFormContainer.setVisibility(View.INVISIBLE);
            showFailedSubmit();
            showSuccessfullySubmit();
        }
    };

    private void showSuccessfullySubmit(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View  view = LayoutInflater.from(this)
                .inflate(R.layout.submit_success_dialog, null, false);
        builder.setView(view);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void showFailedSubmit(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View  view = LayoutInflater.from(this)
                .inflate(R.layout.submit_failed_dialog, null, false);
        builder.setView(view);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void showConfirmDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View  view = LayoutInflater.from(this)
                .inflate(R.layout.submit_confirm_dialog, null, false);
        builder.setView(view);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}