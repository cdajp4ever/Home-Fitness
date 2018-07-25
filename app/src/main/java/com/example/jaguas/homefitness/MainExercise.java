package com.example.jaguas.homefitness;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.jaguas.homefitness.ExerciseList.intentcont;

public class MainExercise extends AppCompatActivity {

    public static String animationname;
    private ImageView animationimg;
    public int resId;
    private int counter = 1;
    private TextView work;
    private TextView rest;
    private TextView set;
    private ImageButton startStop;
    private boolean stopngo = true;
    private CountDownTimer myLapTimer;
    private CountDownTimer myRestTimer;
    public View myView;
    private AnimationDrawable animExercise;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_exercise);

        animationname = getIntent().getStringExtra(intentcont);

        resId = getResources().getIdentifier(animationname, "drawable", MainActivity.PACKAGE_NAME);
        animationimg = findViewById(R.id.animatioexercise);
        animationimg.setBackgroundResource(resId);
        animExercise = (AnimationDrawable) animationimg.getBackground();
        animExercise.start();
//        animationimg.setImageResource(resId);
        work = findViewById(R.id.lapTimer);
        rest = findViewById(R.id.restTimer);
        set = findViewById(R.id.setCount);
        startStop = findViewById(R.id.startBtn);



    }

    public void startBtn(View view) {

        myView = view;
        if (counter <= 10){
            timers();
            set.setText("Set: " + counter);
        } else{
            Intent intent = new Intent(this, ExerciseList.class);
            startActivity(intent);
            Toast.makeText(this, R.string.exerciseDone,Toast.LENGTH_SHORT).show();

        }
    }

    private void timers() {
        if (stopngo) {
            myLapTimer = new CountDownTimer(30000, 1000) {
                public void onTick(long millisUntilFinished) {
                    work.setText("Lap: " + millisUntilFinished / 1000);

                }

                public void onFinish() {
                    work.setText(R.string.lapzero);
                    myRestTimer = new CountDownTimer(10000, 1000) {
                        @Override
                        public void onTick(long l) {
                            rest.setText("Break: " + l / 1000);

                        }

                        @Override
                        public void onFinish() {
                            rest.setText(R.string.restzero);
                            counter++;
                            startBtn(myView);
                        }
                    }.start();
                }
            }.start();
        }
    }
}




