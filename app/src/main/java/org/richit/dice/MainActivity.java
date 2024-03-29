package org.richit.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView leftDice=findViewById(R.id.leftDice);
        final ImageView rightDice=findViewById(R.id.rightDice);
        Button btn=findViewById(R.id.btn);

        final int[] diceArray={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random=new Random();
                int number=random.nextInt(6);
                Log.d("LeftDice","Number "+number);
                leftDice.setImageResource(diceArray[number]);

                int number2=random.nextInt(6);
                Log.d("LeftDice","Number "+number2);
                rightDice.setImageResource(diceArray[number2]);
            }
        });
    }
}
