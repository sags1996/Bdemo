package com.example.admin.bdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Doc;
    Button Emp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Doc=(Button)findViewById(R.id.doctorButton);
        Emp=(Button)findViewById(R.id.employeeButton);
        Doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent i= new Intent(MainActivity.this,DoctorLogin.class);
                startActivity(i);
            }
        });
        Emp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,EmpLogin.class);
                startActivity(i);

            }
        });
    }
}
