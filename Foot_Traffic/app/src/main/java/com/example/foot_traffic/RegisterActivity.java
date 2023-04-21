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

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

//public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

   /* private FirebaseAuth mAuth;
    private EditText editTextFullName, editTextAge, editTextEmail, editTextPassword;
    private TextView banner, registerUser;
    private ProgressBar progressBar;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mAuth= FirebaseAuth.getInstance();

        banner=(TextView) findViewById(R.id.banner);
        banner.setOnClickListener(this);

        registerUser=(Button) findViewById(R.id.btn_login_register);
        registerUser.setOnClickListener(this);

        editTextFullName=(EditText) findViewById(R.id.et_fullName);
        editTextAge=(EditText) findViewById(R.id.et_age_register);
        editTextEmail=(EditText) findViewById(R.id.et_email_register);
        editTextPassword=(EditText) findViewById(R.id.et_password_register);

        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("UserInfo");

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.banner:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.btn_login_register:
                addDatatoFirebase(editTextFullName.getText().toString(), editTextAge.getText().toString(), editTextEmail.getText().toString());
                registerUser();
                break;

        }
    }
    private void registerUser(){
        String email=editTextEmail.getText().toString().trim();
        String password= editTextPassword.getText().toString().trim();
        String fullName=editTextFullName.getText().toString().trim();
        String age=editTextAge.getText().toString().trim();

        if(fullName.isEmpty()){
            editTextFullName.setError("Please fill your Full Name");
            editTextFullName.requestFocus();
            return;
        }

        if(age.isEmpty()){
            editTextAge.setError("Please fill your age");
            editTextAge.requestFocus();
            return;
        }

        if(email.isEmpty()){
            editTextEmail.setError("Please fill your Email");
            editTextEmail.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            editTextEmail.setError("Please provide valid Email");
            editTextEmail.requestFocus();
            return;
        }
        if(password.isEmpty()){
            editTextPassword.setError("Please fill your password");
            editTextPassword.requestFocus();
            return;
        }
        if(password.length()<6){
            editTextPassword.setError("Minimum password length should be 6 characters");
            editTextPassword.requestFocus();
            return;
        }

        else{

            progressBar.setVisibility(View.VISIBLE);
            mAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                User user = new User(fullName, age, email);

                            /*
                            FirebaseDatabase.getInstance().getReference("Users")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    if(task.isSuccessful()) {
                                        Toast.makeText(RegisterUser.this, "User has been registered successfully", Toast.LENGTH_LONG).show();
                                        progressBar.setVisibility(View.GONE);

                                    }
                                        else{
                                        Toast.makeText(RegisterUser.this, "Failed to registered! Please try again.", Toast.LENGTH_LONG).show();
                                        progressBar.setVisibility(View.GONE);

                                    }
                                }
                            });

                            }
                        }
                    });


        }
    }
    private void addDatatoFirebase(String fullName,String age, String email) {
        // below 3 lines of code is used to set
        // data in our object class.
        User user = new User(fullName, age, email);

        // we are use add value event listener method
        // which is called with database reference.
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                // inside the method of on Data change we are setting
                // our object class to our database reference.
                // data base reference will sends data to firebase.
                databaseReference.setValue(user);

                // after adding this data we are showing toast message.
                Toast.makeText(getApplicationContext(), "data added", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                // if the data is not added or it is cancelled then
                // we are displaying a failure toast message.
                Toast.makeText(getApplicationContext(), "Fail to add data " + error, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
*/

    public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

        private FirebaseAuth mAuth;
        private EditText editTextFullName, editTextAge, editTextEmail, editTextPassword;
        private TextView banner, registerUser;
        private ProgressBar progressBar;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);

            mAuth = FirebaseAuth.getInstance();

            banner = (TextView) findViewById(R.id.ConstraintLayout);
            banner.setOnClickListener(this);

            registerUser = (Button) findViewById(R.id.btn_login_register);
            registerUser.setOnClickListener(this);

            editTextFullName = (EditText) findViewById(R.id.et_fullName);
            editTextAge = (EditText) findViewById(R.id.et_age_register);
            editTextEmail = (EditText) findViewById(R.id.et_email_register);
            editTextPassword = (EditText) findViewById(R.id.et_password_register);

            progressBar = (ProgressBar) findViewById(R.id.progressBar);

        }

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.ConstraintLayout:
                    startActivity(new Intent(this, MainActivity.class));
                    break;
                case R.id.btn_login_register:
                    registerUser();
                    break;

            }
        }

        private void registerUser() {
            String email = editTextEmail.getText().toString().trim();
            String password = editTextPassword.getText().toString().trim();
            String fullName = editTextFullName.getText().toString().trim();
            String age = editTextAge.getText().toString().trim();

            if (fullName.isEmpty()) {
                editTextFullName.setError("Please fill your Full Name");
                editTextFullName.requestFocus();
                return;
            }

            if (age.isEmpty()) {
                editTextAge.setError("Please fill your age");
                editTextAge.requestFocus();
                return;
            }

            if (email.isEmpty()) {
                editTextEmail.setError("Please fill your Email");
                editTextEmail.requestFocus();
                return;
            }
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                editTextEmail.setError("Please provide valid Email");
                editTextEmail.requestFocus();
                return;
            }
            if (password.isEmpty()) {
                editTextPassword.setError("Please fill your password");
                editTextPassword.requestFocus();
                return;
            }
            if (password.length() < 6) {
                editTextPassword.setError("Minimum password length should be 6 characters");
                editTextPassword.requestFocus();
                return;
            } else {

                progressBar.setVisibility(View.VISIBLE);


                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    User user = new User(fullName, age, email);

                                    FirebaseDatabase.getInstance().getReference("Users")
                                            .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                            .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                            if (task.isSuccessful()) {
                                                Toast.makeText(RegisterActivity.this, "User has been registered successfully", Toast.LENGTH_LONG).show();
                                                progressBar.setVisibility(View.GONE);
                                            } else {
                                                Toast.makeText(RegisterActivity.this, "Failed to registered! Please try again.", Toast.LENGTH_LONG).show();
                                                progressBar.setVisibility(View.GONE);

                                            }
                                        }
                                    });
                                }
                                else{
                                Toast.makeText(RegisterActivity.this, "Failed to registered! Please try again.", Toast.LENGTH_LONG).show();
                                progressBar.setVisibility(View.GONE);
                            }
                                }
                        });


            }


        }
    }
