package com.zestzone.constraint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn_relative_positioning);
        btn1.setOnClickListener(this);
        Button btn2 = findViewById(R.id.btn_circular_positioning);
        btn2.setOnClickListener(this);
        Button btn3 = findViewById(R.id.btn_percent);
        btn3.setOnClickListener(this);
        Button btn4 = findViewById(R.id.btn_chain);
        btn4.setOnClickListener(this);
        Button btn5 = findViewById(R.id.btn_gone_margin);
        btn5.setOnClickListener(this);
        Button btn6 = findViewById(R.id.btn_optimizer);
        btn6.setOnClickListener(this);
        Button btn7 = findViewById(R.id.btn_guide_line);
        btn7.setOnClickListener(this);
        Button btn8 = findViewById(R.id.btn_group);
        btn8.setOnClickListener(this);
        Button btn9 = findViewById(R.id.btn_barrier);
        btn9.setOnClickListener(this);
        Button btn10 = findViewById(R.id.btn_placeHolder);
        btn10.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_relative_positioning: {
                startActivity(new Intent(this, RelativePositionActivity.class));
            }
            break;
            case R.id.btn_circular_positioning: {
                startActivity(new Intent(this, CircularPositionActivity.class));

            }
            break;
            case R.id.btn_percent: {
                startActivity(new Intent(this, PercentActivity.class));

            }
            break;
            case R.id.btn_chain: {
                startActivity(new Intent(this, ChainActivity.class));

            }
            break;
            case R.id.btn_gone_margin: {
                startActivity(new Intent(this, GoneMarginActivity.class));

            }
            break;
            case R.id.btn_optimizer: {
                startActivity(new Intent(this, OptimizerActivity.class));

            }
            break;
            case R.id.btn_guide_line: {
                startActivity(new Intent(this, GuideLineActivity.class));

            }
            break;
            case R.id.btn_group: {
                startActivity(new Intent(this, GroupActivity.class));

            }
            break;
            case R.id.btn_barrier: {
                startActivity(new Intent(this, RelativePositionActivity.class));

            }
            break;
            case R.id.btn_placeHolder:{
                startActivity(new Intent(this, PlaceHolderActivity.class));
            }
            break;
            default:
                break;
        }
    }
}
