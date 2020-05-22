package com.example.term_project_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.SetOptions;

import java.util.HashMap;
import java.util.Map;

public class createRoomSettingActivity extends AppCompatActivity {
    private EditText CategoryEditText;
    private EditText TermEditText;
    private EditText MaxNumberEditText;
    private EditText TitleEditText;
    private EditText ContentsEditText;

    private FirebaseAuth mAuth = FirebaseAuth.getInstance();
    private FirebaseFirestore mStore = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_room_setting);
        CategoryEditText = (EditText)findViewById(R.id.category_setting);
        TermEditText = (EditText)findViewById(R.id.term_setting);
        MaxNumberEditText = (EditText)findViewById(R.id.max_number_setting);
        TitleEditText = (EditText)findViewById(R.id.title_setting);
        ContentsEditText = (EditText)findViewById(R.id.contents_setting);
    }


    public void settingButton(View view) {
        if (mAuth.getCurrentUser() != null) {
            String postId = mStore.collection(FirebaseID.post).document().getId();
            Map<String, Object> data = new HashMap<>();
            data.put(FirebaseID.documentId, mAuth.getCurrentUser().getUid());
            data.put(FirebaseID.title, TitleEditText.getText().toString());
            data.put(FirebaseID.contents, ContentsEditText.getText().toString());
            data.put(FirebaseID.category, CategoryEditText.getText().toString());
            data.put(FirebaseID.term, TermEditText.getText().toString());
            data.put(FirebaseID.maxNum, MaxNumberEditText.getText().toString());
            mStore.collection(FirebaseID.post).document(postId).set(data, SetOptions.merge());
            Toast.makeText(this, "success data title" + TitleEditText.getText().toString(), Toast.LENGTH_SHORT).show();
        }
        Intent intent = new Intent(this, joinRoomListActivity.class);
        startActivity(intent);
    }
}
