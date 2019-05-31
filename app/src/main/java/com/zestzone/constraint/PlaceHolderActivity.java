package com.zestzone.constraint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Placeholder;

import android.os.Bundle;
import android.widget.TextView;

public class PlaceHolderActivity extends AppCompatActivity {

    Placeholder placeholder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_holder);
        placeholder = findViewById(R.id.placeHolder);
        TextView textView = findViewById(R.id.text);
        placeholder.setContentId(textView.getId());
    }
}
