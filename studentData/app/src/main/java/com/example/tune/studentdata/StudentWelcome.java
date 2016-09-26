package com.example.tune.studentdata;

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

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tune on 26/09/2016.
 */

public class StudentWelcome extends AppCompatActivity {

    String insertUrl = "http://localhost/dataCollection/init.php";

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
                StringRequest request = new StringRequest(Request.Method.POST, insertUrl, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                    }
                }, new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError error){

                    }
                }){

                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> parameters = new HashMap<String, String>();
                        parameters.put("name", etName.getText().toString());
                        parameters.put("age", etAge.getText().toString());
                        parameters.put("gender", etGender.getText().toString());
                        parameters.put("university", etUniversity.getText().toString());
                        parameters.put("job", etJob.getText().toString());
                        parameters.put("salary", etSalary.getText().toString());
                        parameters.put("company", etCompany.getText().toString());


                        return parameters;
                    }
                };
                RequestQueue requestQueue = Volley.newRequestQueue(StudentWelcome.this);
                requestQueue.add(request);
            }
        });


    }


}
