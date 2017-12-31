package com.example.admin.bdemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EmpLogin extends AppCompatActivity {
    Button Submit;
    EditText staff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emp_login);
        Submit= (Button)findViewById(R.id.SubmitButton);
        staff=(EditText)findViewById(R.id.staffno) ;
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(staff.getText().length()!=0){
                    Intent in= new Intent(EmpLogin.this,OtpVerification.class);
                    startActivity(in);
                }
                else{
                    Toast.makeText(EmpLogin.this,"Enter Your staff Number Please",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
