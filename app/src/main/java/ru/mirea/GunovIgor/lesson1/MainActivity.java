package ru.mirea.GunovIgor.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    Button button;
    Button button2;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.but1);
        button2 = findViewById(R.id.but4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog = new ProgressBar(MainActivity.this);
                progressDialog.show();
                progressDialog.setContentView(R.layout.progress_dialog);
            }
        });
    }

    public void onClickNewActivity(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("key", "MIREA - ГУНОВ ИГОРЬ СЕРГЕЕВИЧ");
        startActivity(intent);
    }

    public void onClickNewActivity2(View view) {
        Uri address = Uri.parse("http://www.mirea.ru/");
        Intent openLinkIntent = new Intent(Intent.ACTION_VIEW, address);
        startActivity(openLinkIntent);
    }

    public void onClickNewActivity3(View view) {
        Intent intent = new Intent(MainActivity.this, CountWords.class);
        startActivity(intent);
    }
}