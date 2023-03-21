package com.dream7c.myrehabilitation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AuthorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);
        // initial
        setTitle(MainActivity.targetActivityTitle);
        TextView txAuthor = findViewById(R.id.tx_author);
        txAuthor.setText("\n\nRehabilitation Game\n\nCheif Designer: Zhenghao Li\n\nwww.dream7c.com");
    }
}
