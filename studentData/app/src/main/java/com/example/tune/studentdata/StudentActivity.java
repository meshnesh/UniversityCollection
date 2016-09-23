package com.example.tune.studentdata;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class StudentActivity extends AppCompatActivity {

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
                final String gender = etGender.getText().toString();
                final int age = Integer.parseInt(etAge.getText().toString());
                final String university = etUniversity.getText().toString();
                final String job = etJob.getText().toString();
                final String salary = etSalary.getText().toString();
                final String company = etCompany.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
//                        try {
//                            JSONObject jsonResponse = new JSONObject(response);
//                            boolean success = jsonResponse.getBoolean("success");
//                            if (success) {
//                                Intent intent = new Intent(StudentActivity.this, StudentActivity.class);
//                                StudentActivity.this.startActivity(intent);
//                            } else {
//                                AlertDialog.Builder builder = new AlertDialog.Builder(StudentActivity.this);
//                                builder.setMessage("Saving Failed")
//                                        .setNegativeButton("Retry", null)
//                                        .create()
//                                        .show();
//                            }
//                        } catch (JSONException e) {
//                            e.printStackTrace();
//                        }
                    }
                };

                BackgroundTaskActivity registerRequest = new BackgroundTaskActivity(name, age, gender, university, salary, job, company, responseListener);
                RequestQueue queue = Volley.newRequestQueue(StudentActivity.this);
                queue.add(registerRequest);


            }
        });
    }
}