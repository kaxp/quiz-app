package com.example.kapil.quizapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    // Question 1
    RadioButton question1_choice3;

    // Question 2
    CheckBox question2_choice1;
    CheckBox question2_choice2;
    CheckBox question2_choice3;
    CheckBox question2_choice4;

    // Question 3
    RadioButton question3_choice2;

    // Question 4
    CheckBox question4_choice1;
    CheckBox question4_choice2;
    CheckBox question4_choice3;
    CheckBox question4_choice4;

    // Question 5
    RadioButton question5_choice2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {
        CharSequence resultsDisplay;
        Log.e(LOG_TAG, " " + this.findViewById(R.id.question3_choice3));
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int final_score;

        //------------------------------------------------------------------------------------------
        // Question 1 - Correct Answer is #3 (Operating System)
        //------------------------------------------------------------------------------------------
        Boolean answer1;

        question1_choice3 = this.findViewById(R.id.question1_choice3);
        answer1 = question1_choice3.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 2  - Correct Answers are #1 (Chain)
        //------------------------------------------------------------------------------------------
        Boolean answer2_choice1;
        Boolean answer2_choice2;
        Boolean answer2_choice3;
        Boolean answer2_choice4;
        question2_choice1 = this.findViewById(R.id.question2_choice1);
        question2_choice2 = this.findViewById(R.id.question2_choice2);
        question2_choice3 = this.findViewById(R.id.question2_choice3);
        question2_choice4 = this.findViewById(R.id.question2_choice4);
        answer2_choice1 = question2_choice1.isChecked();
        answer2_choice2 = question2_choice2.isChecked();
        answer2_choice3 = question2_choice3.isChecked();
        answer2_choice4 = question2_choice4.isChecked();
        if (answer2_choice1 && !answer2_choice2 && !answer2_choice3 && !answer2_choice4) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 3  - Correct Answers is #2 "Query Language"
        //------------------------------------------------------------------------------------------
        Boolean answer3;
        question3_choice2 = this.findViewById(R.id.question3_choice2);
        answer3 = question3_choice2.isChecked();
        if (answer3) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 4  - Correct Answers are #4 (Updating)
        //------------------------------------------------------------------------------------------
        Boolean answer4_choice1;
        Boolean answer4_choice2;
        Boolean answer4_choice3;
        Boolean answer4_choice4;
        question4_choice1 = this.findViewById(R.id.question4_choice1);
        question4_choice2 = this.findViewById(R.id.question4_choice2);
        question4_choice3 = this.findViewById(R.id.question4_choice3);
        question4_choice4 = this.findViewById(R.id.question4_choice4);
        answer4_choice1 = question4_choice1.isChecked();
        answer4_choice2 = question4_choice2.isChecked();
        answer4_choice3 = question4_choice3.isChecked();
        answer4_choice4 = question4_choice4.isChecked();
        if (!answer4_choice1 && !answer4_choice2 && !answer4_choice3 && answer4_choice4) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Question 5  - Correct Answers is #2 "It's Fun"
        //------------------------------------------------------------------------------------------
        Boolean answer5;
        question5_choice2 = this.findViewById(R.id.question5_choice2);
        answer5 = question5_choice2.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }

        //------------------------------------------------------------------------------------------
        // Final Score
        //------------------------------------------------------------------------------------------
        final_score = answer1_score + answer2_score + answer3_score +
                answer4_score + answer5_score;

        if (final_score == 5) {
            resultsDisplay = "Perfect! You scored 5 out of 5";
        } else {
            resultsDisplay = "Try again. You scored " + final_score + " out of 5";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}