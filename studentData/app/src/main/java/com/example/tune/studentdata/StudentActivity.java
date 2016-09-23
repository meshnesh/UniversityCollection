package com.example.tune.studentdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class StudentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);


        final EditText etAge = (EditText) findViewById(R.id.etAge);
        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etGender = (EditText) findViewById(R.id.etGender);
        final EditText etUniversity = (EditText) findViewById(R.id.etUniversity);
        final EditText etJob = (EditText) findViewById(R.id.etJob);
        final EditText etSalary = (EditText) findViewById(R.id.etSalary);
        final EditText etCompany = (EditText) findViewById(R.id.etCompany);
        final Button bSave = (Button) findViewById(R.id.bSave);
    }
}
