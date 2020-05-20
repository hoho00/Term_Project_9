package com.example.term_project_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class createRoomSettingActivity extends AppCompatActivity {
    private EditText CategoryEditText;
    private EditText TermEditText;
    private EditText MaxNumberEditText;
    private EditText TitleEditText;
    private EditText ExplanationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_room_setting);
        CategoryEditText = (EditText)findViewById(R.id.category_setting);
        TermEditText = (EditText)findViewById(R.id.term_setting);
        MaxNumberEditText = (EditText)findViewById(R.id.max_number_setting);
        TitleEditText = (EditText)findViewById(R.id.title_setting);
        ExplanationEditText = (EditText)findViewById(R.id.explanation_setting);
    }


    public void settingButton(View view) {

    }
}
