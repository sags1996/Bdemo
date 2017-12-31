package com.example.admin.bdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OtpVerification extends AppCompatActivity {
    Button sub;
    EditText otp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);
        sub=(Button)findViewById(R.id.SubmitOTP);
        otp=(EditText)findViewById(R.id.otpText);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(otp.getText().length()!=0){
                   Intent i= new Intent(OtpVerification.this,EmployeeMainPage.class);
                   startActivity(i);
                }
                else{
                    Toast.makeText(OtpVerification.this,"Make A entry",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
