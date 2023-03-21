package com.dream7c.myrehabilitation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CardsActivity extends AppCompatActivity {
    private int currentPage = 0;
    // cards
    private int[] cardImages = new int[] {
            R.drawable.card1,
            R.drawable.card2,
            R.drawable.card3,
            R.drawable.card4,
            R.drawable.card5,
            R.drawable.card6,
            R.drawable.card7,
            R.drawable.card8,
            R.drawable.card9,
            R.drawable.card10,
            R.drawable.card11,
            R.drawable.card12,
            R.drawable.card13,
            R.drawable.card14,
            R.drawable.card15,
            R.drawable.card16,
            R.drawable.card17,
            R.drawable.card18,
            R.drawable.card19,
            R.drawable.card20,
            R.drawable.card21,
            R.drawable.card22,
            R.drawable.card23,
            R.drawable.card24,
            R.drawable.card25,
            R.drawable.card26,
            R.drawable.card27,
            R.drawable.card28,
            R.drawable.card29,
            R.drawable.card30,
    };
    private int cardsCount = cardImages.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);
        changeToTargetPage(0);
        setTitle(MainActivity.targetActivityTitle);
        // onClick
        Button btn_previousPage = findViewById(R.id.btn_previousPage);
        btn_previousPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentPage > 0) {
                    changeToTargetPage(--currentPage);
                }
            }
        });
        Button btn_nextPage = findViewById(R.id.btn_nextPage);
        btn_nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentPage < cardsCount - 1) {
                    changeToTargetPage(++currentPage);
                }
            }
        });
    }

    @SuppressLint("SetTextI18n")
    private void changeToTargetPage(int pageIndex) {
        ImageView img_card = findViewById(R.id.img_card);
        img_card.setImageResource(cardImages[pageIndex]);
        TextView tx_pageNumber = findViewById(R.id.tx_pageNumber);
        tx_pageNumber.setText((pageIndex + 1) + " / " + cardsCount);
    }
}
