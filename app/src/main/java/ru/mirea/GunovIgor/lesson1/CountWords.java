package ru.mirea.GunovIgor.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CountWords extends AppCompatActivity {
    Button button;
    EditText editText;
    String student = "Студент №9 Группа БСБО-03-20";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_words);
        button = findViewById(R.id.buton1);
        editText = findViewById(R.id.txt1);
    }
    public void onClickNewActivity(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),student + " Колличество символов = " + editText.getText().length(),Toast.LENGTH_SHORT);
        toast.show();
    }
}