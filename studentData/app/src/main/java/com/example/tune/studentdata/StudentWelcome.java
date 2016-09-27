package com.example.tune.studentdata;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tune on 26/09/2016.
 */

public class StudentWelcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etAge = (EditText) findViewById(R.id.etAge);
        final EditText etGender = (EditText) findViewById(R.id.etGender);
        final EditText etUniversity = (EditText) findViewById(R.id.etUniversity);
        final EditText etJob = (EditText) findViewById(R.id.etJob);
        final EditText etSalary = (EditText) findViewById(R.id.etSalary);
        final EditText etCompany = (EditText) findViewById(R.id.etCompany);
        final Button bSave = (Button) findViewById(R.id.bSave);


        bSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = etName.getText().toString();
                final String age = etAge.getText().toString();
                final String gender = etGender.getText().toString();
                final String university = etUniversity.getText().toString();
                final String job = etJob.getText().toString();
                final String salary = etSalary.getText().toString();
                final String company = etCompany.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        Intent intent = new Intent(StudentWelcome.this, ThankActivity.class);
                        StudentWelcome.this.startActivity(intent);
                    }
                };

                StudentRequest registerRequest = new StudentRequest(name, age, gender, university, job, salary, company, responseListener);
                RequestQueue queue = Volley.newRequestQueue(StudentWelcome.this);
                queue.add(registerRequest);
            }
        });




    }
}