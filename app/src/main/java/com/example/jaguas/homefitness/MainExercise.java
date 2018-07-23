package com.example.jaguas.homefitness;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import static com.example.jaguas.homefitness.ExerciseList.intentcont;

public class MainExercise extends AppCompatActivity {

    public static String animationname;
    private ImageView animationimg;
    public int resId;
    public int stopbtnimg;
    public int startbtnimg;
    private TextView work;
    private ImageButton startStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_exercise);

        animationname = getIntent().getStringExtra(intentcont);

        resId = getResources().getIdentifier(animationname,"drawable",MainActivity.PACKAGE_NAME);
        animationimg = findViewById(R.id.animatioexercise);
        animationimg.setImageResource(resId);
        work = findViewById(R.id.lapTimer);
        startStop = findViewById(R.id.startStop);
        stopbtnimg = getResources().getIdentifier("stop","drawable",MainActivity.PACKAGE_NAME);
        startbtnimg = getResources().getIdentifier("start","drawable", MainActivity.PACKAGE_NAME);

    }

    public void startStopBtn(View view) {

        if (work.getText() == "0"){
            new CountDownTimer(30000, 1000){
                public void onTick(long millisUntilFinished){
                    work.setText("" + millisUntilFinished / 1000);
                }
                public void onFinish(){
                    work.setText("0");
                }
            }.start();

            startStop.setImageResource(stopbtnimg);
        } else {

        }



    }
}
