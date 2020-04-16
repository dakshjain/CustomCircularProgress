package com.example.customcircularprogress;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etProgress;
    private CircleProgressBar circleProgressBar;
    private Button btnAnimate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        etProgress = (EditText) findViewById(R.id.et_progress);
        btnAnimate =  (Button) findViewById(R.id.btn_animate);
        circleProgressBar  = (CircleProgressBar) findViewById(R.id.progress_circular);


        btnAnimate.setOnClickListener(v -> {
            circleProgressBar.setProgressWithAnimation(Integer.parseInt(etProgress.getText().toString()));
        });



    }
}

