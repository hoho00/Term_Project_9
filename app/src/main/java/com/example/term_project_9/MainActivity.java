package com.example.term_project_9;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    private EditText mEmail , mPassword;
    private boolean flag = false;

    private FirebaseAuth mAuth = FirebaseAuth.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEmail = findViewById(R.id.email_login);
        mPassword = findViewById(R.id.password_login);

    }
    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        if(user != null) {
            Toast.makeText(this, "자동로그인 " + user.getUid(), Toast.LENGTH_SHORT).show();
        }
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void loginButton(View v) {

        mAuth.signInWithEmailAndPassword(mEmail.getText().toString(), mPassword.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            FirebaseUser user = mAuth.getCurrentUser();

                            if(user != null) {
                                Toast.makeText(MainActivity.this, "log in success " + user.getUid(), Toast.LENGTH_LONG).show();
                                flag = true;
                            }
                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(MainActivity.this, "log in error", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
        if(flag == true) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
            flag = false;
        }

        else {
            Toast.makeText(MainActivity.this, "log in error222", Toast.LENGTH_SHORT).show();
            flag = false;
        }
    }

    public void signUpButton(View v) {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }

}
