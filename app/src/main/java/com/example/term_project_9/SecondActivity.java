package com.example.term_project_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_main);
    }

    public void createRoom(View view) {
    Intent intent = new Intent(this, createRoomSettingActivity.class);
    startActivity(intent);
}

public void joinRoom(View view) {
        Intent intent = new Intent(this, joinRoomListActivity.class);
        startActivity(intent);
        }

public void challenges(View view) {
        Intent intent = new Intent(this, challengesActivity.class);
        startActivity(intent);
        }
}
