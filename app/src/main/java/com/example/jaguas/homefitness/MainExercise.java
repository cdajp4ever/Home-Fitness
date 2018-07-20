package com.example.jaguas.homefitness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import static com.example.jaguas.homefitness.ExerciseList.intentcont;

public class MainExercise extends AppCompatActivity {

    public static String animationname;
    ImageView animationimg;
    public int resId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_exercise);

        animationname = getIntent().getStringExtra(intentcont);

        resId = getResources().getIdentifier(animationname,"drawable",MainActivity.PACKAGE_NAME);
        animationimg = findViewById(R.id.animatioexercise);

        animationimg.setImageResource(resId);


    }
}
