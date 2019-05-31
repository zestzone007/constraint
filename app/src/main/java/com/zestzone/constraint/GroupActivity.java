package com.zestzone.constraint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;

import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GroupActivity extends AppCompatActivity {

    Group group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        group = findViewById(R.id.group);
        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (group.getVisibility() == View.VISIBLE) {
                    group.setVisibility(View.INVISIBLE);
                } else {
                    group.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
