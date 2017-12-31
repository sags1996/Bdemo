package com.example.admin.bdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DoctorLogin extends AppCompatActivity {
     EditText mobileno;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_login);
        Button blogin=(Button)findViewById(R.id.login);
        mobileno=(EditText)findViewById(R.id.DoctorMobile) ;
        password=(EditText)findViewById(R.id.DocPass);
        blogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mobileno.getText().length()!=0 && password.getText().length()!=0){
               Intent i=new Intent(DoctorLogin.this,DoctorActivity.class);
                startActivity(i);}
                else {
                    Toast.makeText(DoctorLogin.this,"Fill The Details",Toast.LENGTH_LONG).show();
                }

                //Shared preference work later
            }
        });
    }
}
