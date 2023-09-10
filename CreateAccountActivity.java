package com.app.brightLightBookStore.activities;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.app.brightLightBookStore.R;
import com.app.brightLightBookStore.helpers.BaseActivity;
import com.app.brightLightBookStore.model.User;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

public class CreateAccountActivity extends BaseActivity {
    TextView tvSignIn;
    Button RegisterBtn;
    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;
    EditText etUsername,etEmail,etPassword,etAge;
    String stUsername, stEmail, stPassword, stAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        tvSignIn = findViewById(R.id.tvSignIn);
        RegisterBtn = findViewById(R.id.RegisterBtn);
        etUsername = findViewById(R.id.etUsername);
        etEmail = findViewById(R.id.etEmail);
        etAge = findViewById(R.id.etAge);
        etPassword = findViewById(R.id.etPassword);

        FirebaseApp.initializeApp(this);
        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        tvSignIn.setOnClickListener(view ->   startActivity(new Intent(getApplicationContext(), LoginActivity.class)));
        RegisterBtn.setOnClickListener(view->{
            signUp(view);
        });
    }

    private void signUp(View view) {
        Log.d(TAG, "signUp");
        if (!validateForm()) {
            return;
        }
        showProgressDialog();

        stEmail = etEmail.getText().toString().trim();
        stPassword = etPassword.getText().toString().trim();
        stUsername = etUsername.getText().toString().trim();
        stAge = etAge.getText().toString().trim();

        mAuth.createUserWithEmailAndPassword(stEmail, stPassword)
                .addOnCompleteListener(task -> {
                    Log.d(TAG, "createUser:onComplete:" + task.isSuccessful());
                    hideProgressDialog();

                    if (task.isSuccessful()) {
                        onAuthSuccess(task.getResult().getUser());
                    } else {
                        Snackbar.make(view, "error: " + task.getException().getMessage(), Snackbar.LENGTH_SHORT)
                                .setAction("OK", new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view1) {
                                    }
                                })
                                .setActionTextColor(getResources().getColor(R.color.red))
                                .show();
                    }
                });
    }

    private void onAuthSuccess(FirebaseUser user) {
        // Write new user
        writeNewUser(user.getUid(), user.getEmail(),stUsername,Integer.parseInt(stAge));
        // Go to MainActivity
        Toast.makeText(this,"User account created!",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }

    private boolean validateForm() {
        boolean result = true;
        if (TextUtils.isEmpty(etEmail.getText().toString())){
            etEmail.setError("Required");
            result = false;
        }else if(!android.util.Patterns.EMAIL_ADDRESS.matcher(etEmail.getText().toString()).matches()) {
            etEmail.setError("Enter valid email!");
            result = false;
        }
        else{
            etEmail.setError(null);
        }
        if (TextUtils.isEmpty(etUsername.getText().toString())) {
            etUsername.setError("Required");
            result = false;
        } else {
            etUsername.setError(null);
        }

        if (TextUtils.isEmpty(etPassword.getText().toString())) {
            etPassword.setError("Required");
            result = false;
        } else {
            etPassword.setError(null);
        }

        if (TextUtils.isEmpty(etAge.getText().toString())) {
            etAge.setError("Required");
            result = false;
        } else {
            etAge.setError(null);
        }
        return result;
    }

    // [START basic_write]
    private void writeNewUser(String userId,String email, String name, int age) {
        User user = new User(userId,name, email,age);
        mDatabase.child("users").child(userId).setValue(user);
    }
}