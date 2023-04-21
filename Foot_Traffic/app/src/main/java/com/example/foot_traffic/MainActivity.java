package com.example.foot_traffic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView register, forgotPassword;
    private EditText editTextEmail, editTextPassword;
    private Button login;

    private FirebaseAuth mAuth;
    //private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        register = (TextView) findViewById(R.id.tv_register);
        register.setOnClickListener(this);

        login=(Button) findViewById(R.id.btn_login);
        login.setOnClickListener(this);

        editTextEmail=(EditText) findViewById(R.id.et_signup_email);
        editTextPassword=(EditText) findViewById(R.id.et_email_password);

      //  progressBar=(ProgressBar) findViewById(R.id.progressBar);
        mAuth=FirebaseAuth.getInstance();
        forgotPassword=(TextView) findViewById(R.id.tv_forgot_pswd);
        forgotPassword.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_register:
                startActivity(new Intent(this, RegisterActivity.class));
                break;

            case R.id.btn_login:
                userLogin();
                break;

            case R.id.tv_forgot_pswd:
                startActivity(new Intent(this, ForgotPassword.class));
        }

    }

    private void userLogin(){
        String email=editTextEmail.getText().toString().trim();
        String password=editTextPassword.getText().toString().trim();

        if(email. isEmpty()){
            editTextEmail.setError("Please fill the email");
            editTextEmail.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            editTextEmail.setError("Please enter valid email");
            editTextEmail.requestFocus();
            return;
        }
        if(password.isEmpty()){
            editTextPassword.setError("Please enter the password");
            editTextPassword.requestFocus();
            return;
        }
        if(password.length()<6){
            editTextPassword.setError("Minimum password length is 6 character");
            editTextPassword.requestFocus();
            return;
        }

    //    progressBar.setVisibility(View.VISIBLE);
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()) {
                    FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                    if (user.isEmailVerified()) {
                        startActivity(new Intent(MainActivity.this, HomePageActivity.class));//intent to homepage
                    } else {
                        user.sendEmailVerification();
                        Toast.makeText(MainActivity.this, "Please check your email to verify your account", Toast.LENGTH_LONG).show();

                    }

                } else{
                    Toast.makeText(MainActivity.this, "Failed to login! Make sure you login with the correct email and password", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}