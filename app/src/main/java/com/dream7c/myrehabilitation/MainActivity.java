package com.dream7c.myrehabilitation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static String targetActivityTitle = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // onClick
        Button buttonIntroduction = findViewById(R.id.btn_introduction);
        buttonIntroduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFromMainActivity(IntroductionActivity.class, "Introduction");
            }
        });
        Button buttonScenes = findViewById(R.id.btn_scenes);
        buttonScenes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFromMainActivity(ScenesActivity.class, "Scenes");
            }
        });
        Button buttonCards = findViewById(R.id.btn_cards);
        buttonCards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFromMainActivity(CardsActivity.class, "Cards");
            }
        });
        Button buttonAuthor = findViewById(R.id.btn_author);
        buttonAuthor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFromMainActivity(AuthorActivity.class, "Author");
            }
        });
    }

    private void loadFromMainActivity(Class c, String title) {
        targetActivityTitle = title;
        Intent newIntent = new Intent(MainActivity.this, c);
        startActivity(newIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setCancelable(false)
                        .setTitle("About")
                        .setMessage("My Rehabilitation\n\nalpha\n\nAuthor: Zhenghao Li")
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        })
                        .show();
                break;
        }
        return false;
    }
}
