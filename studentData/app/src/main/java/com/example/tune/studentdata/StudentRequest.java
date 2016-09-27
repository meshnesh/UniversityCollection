package com.example.tune.studentdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class StudentRequest extends StringRequest {





    private static final String REGISTER_REQUEST_URL = "http://localhost/dataCollection/init.php";
    private Map<String, String> params;


    public StudentRequest(String etName, String etAge, String etGender, String etUniversity, String etJob, String etSalary, String etCompany, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", etName);
        params.put("age", etAge);
        params.put("gender", etGender);
        params.put("university", etUniversity);
        params.put("job", etJob);
        params.put("salary", etSalary);
        params.put("company", etCompany);


    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
