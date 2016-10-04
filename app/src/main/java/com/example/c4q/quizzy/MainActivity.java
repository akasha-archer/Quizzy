package com.example.c4q.quizzy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.example.c4q.quizzy.R.id.submit_btn;

/**
 * Created by akashaarcher on 9/28/16.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bSumbmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bSubmit = (Button) findViewById(submit_btn);
        bSubmit.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View view) {
        Intent newIntent = new Intent(MainActivity.this, QuizActivity.class);
        startActivity(newIntent);

    }
}

