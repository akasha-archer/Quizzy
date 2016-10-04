package com.example.c4q.quizzy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends QuizActivity {

    private Question currentQuestion;
    private Question[] copyOfQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        Button button = (Button) findViewById(R.id.cheat_btn);
        copyOfQuestions = super.questionBank;

        button.setVisibility(View.GONE);
        TextView questionTV = (TextView) findViewById(R.id.question_text_view);

        Intent intent = getIntent();
        int myIndex = intent.getExtras().getInt("CURRENT INDEX");
        currentQuestion = copyOfQuestions[myIndex];

        boolean answer = currentQuestion.isAnswerTrue().;
        questionTV.setText(currentQuestion.getTextResId() + ": " + answer);  //another way of writing the boolean line above
        questionTV.append(" " + currentQuestion.isAnswerTrue());

//        String myQuestion = intent.getExtras().getString("CURRENT QUESTION");
//        boolean myAnswer = intent.getExtras().getBoolean("CURRENT ANSWER");
//
//        questionTV.setText(myQuestion + ": " + myAnswer);

        //toast "the answer is true" or "the answer is false"
    }



}
