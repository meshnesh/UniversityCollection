package com.example.tune.studentdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class BackgroundTask extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://10.0.2.2/dataCollection/init.php";
    private Map<String, String> params;



    public BackgroundTask(   String name, int age, String gender,  String university, String job, String salary, String company, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("age", age + "");
        params.put("gender", gender);
        params.put("university", university);
        params.put("job", job);
        params.put("salary", salary);
        params.put("company", company);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
