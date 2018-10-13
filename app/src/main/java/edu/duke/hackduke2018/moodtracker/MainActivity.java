package edu.duke.hackduke2018.moodtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static android.content.ContentValues.TAG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        final Button freeformButton = findViewById(R.id.freeform_button);
        final Button promptsButton = findViewById(R.id.prompt_button);
        final Button quizButton = findViewById(R.id.quiz_button);

        freeformButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toFreeform();
            }
        });

        promptsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toPrompts();
            }
        });

        quizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toQuiz();
            }
        });
    }

    private void toFreeform() {
       Log.d(TAG, "To Freeform");
       Intent intent = new Intent(this, TextBoxActivity.class);
       startActivity(intent);

    }

    private void toPrompts() {
        Log.d(TAG, "To Prompts");
//        Intent intent = new Intent(this, Prompts.class);
//        startActivity(intent);
    }

    private void toQuiz() {
        Log.d(TAG, "To Quizzes");
//        Intent intent = new Intent(this, Quiz.class);
//        startActivity(intent);
    }
}
