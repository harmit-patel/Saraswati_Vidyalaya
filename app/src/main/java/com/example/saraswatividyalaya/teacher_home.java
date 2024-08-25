package com.example.saraswatividyalaya;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class teacher_home extends AppCompatActivity implements View.OnClickListener {
    public CardView personal, attendance, upload_result, elibrary,add_student,logout;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_home);

        personal = findViewById(R.id.c1);
        attendance = findViewById(R.id.c2);
        upload_result = findViewById(R.id.c3);
        elibrary = findViewById(R.id.c4);
        add_student=findViewById(R.id.c5);
        logout=findViewById(R.id.c6);

        personal.setOnClickListener(this);
        attendance.setOnClickListener(this);
        upload_result.setOnClickListener(this);
        elibrary.setOnClickListener(this);
        add_student.setOnClickListener(this);
        logout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v1) {
        Intent i;

        if (v1.getId() == R.id.c5) {
            i = new Intent(this, add_student.class);
            startActivity(i);
        }

        // Handle other clicks here
    }
}
