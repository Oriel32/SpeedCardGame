package com.example.speedcardgame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.speedcardgame.PlayActivity.beginner;
import static com.example.speedcardgame.PlayActivity.easy;
import static com.example.speedcardgame.PlayActivity.hard;
import static com.example.speedcardgame.PlayActivity.reflex;

public class ChampActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnPlay;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champ);
        initViews();
    }

    private void initViews() {
        if (getIntent().getExtras()!=null&&getIntent().getExtras().getInt("phase") == 4){
            AlertDialog.Builder builder = new AlertDialog.Builder(ChampActivity.this);
            builder.setTitle("Champions!");
            builder.setMessage("You did it! You won the championship!");
            builder.setCancelable(false);
            builder.setPositiveButton("Go Back To Menu", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(ChampActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        btnPlay = findViewById(R.id.btnPlayTour);
        btnPlay.setOnClickListener(this);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        if (getIntent().getExtras()!=null) {
            if (getIntent().getExtras().getInt("phase") == 2) {
                tv1.setText("You");
                tv2.setText("bot 4");
                tv3.setText("bot 5");
                tv4.setText("bot 7");
            }
            if (getIntent().getExtras().getInt("phase") == 3) {
                tv1.setText("You");
                tv2.setText("bot 5");
            }
        }
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("championship", true);

        if(getIntent().getExtras()==null) {
            intent.putExtra("Mode", easy);
            intent.putExtra("phase", 1);
            startActivity(intent);
        }
        else {

            if (getIntent().getExtras().getInt("phase") == 2) {
                tv1.setText("You");
                tv2.setText("bot 4");
                tv3.setText("bot 5");
                tv4.setText("bot 7");
                intent.putExtra("Mode", hard);
                intent.putExtra("phase", 2);
                startActivity(intent);
            }

            if (getIntent().getExtras().getInt("phase") == 3) {
                tv1.setText("You");
                tv2.setText("bot 5");
                intent.putExtra("Mode", reflex);
                intent.putExtra("phase", 3);
                startActivity(intent);
            }
        }

    }
}