package com.example.tune.studentdata;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

public class StudentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        final Button bNext = (Button) findViewById(R.id.bNext);


        bNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent Intent = new Intent(StudentActivity.this, StudentWelcome.class);
                StudentActivity.this.startActivity(Intent);


            }
        });

    }
}