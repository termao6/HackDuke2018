package edu.duke.hackduke2018.moodtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final RadioGroup answersGroup = findViewById(R.id.answers_radioGroup);

        Button submit = findViewById(R.id.submitButton);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedID = answersGroup.getCheckedRadioButtonId();
                if (selectedID != -1) {
                    RadioButton selectedButton = findViewById(selectedID);
                    Log.d("selectedText", selectedButton.getText().toString());
                    goBack();
                }
            }
        });
    }

    private void goBack() {
        Intent intent = new Intent(this, MainActivity.class);
        Log.d("TAG", "Back to Home");
        finish();
        startActivity(intent);
    }


}
