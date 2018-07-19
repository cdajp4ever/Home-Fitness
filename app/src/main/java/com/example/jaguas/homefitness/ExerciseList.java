package com.example.jaguas.homefitness;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ExerciseList extends AppCompatActivity {

    // TEST COMMIT AND PUSH

    private String[] kinds = {"Belly", "Back", "Chest", "Arms", "Legs"};
    private String[] belly = {"Crunchers", "Reverse Crunchers", "Flutter Kicks", "Sitting Twists", "Knee to Elbow"};
    private String[] back = {"Reverse Snow Angels", "Superman", "Hip Hinge", "Flying Passe", "Twister"};
    private String[] chest = {"Rotational press-up", "Single Leg Push Up", "Wide Push Up", "Narrow/Tricep Push Up", "Diamond push-up"};
    private String[] arms = {"Push-Ups", "One-Arm Side Push-Up", "The Windmill", "The Wave Goodbye", "Close-grip pushup"};
    private String[] legs = {"Single-leg circle", "Squat Jump", "Side Lunge", "Single-Leg Hip Raise", "Alternating Drop Lunge"};
    private TextView pos1, pos2, pos3, pos4, pos5;

    private int[] img = {R.drawable.belly, R.drawable.back, R.drawable.chest, R.drawable.arms,
            R.drawable.legs};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView lv = findViewById(R.id.list_part);
        MyAdapter adapter = new MyAdapter(this, R.layout.mylist, kinds, img);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                pos1 = findViewById(R.id.one);
                pos2 = findViewById(R.id.two);
                pos3 = findViewById(R.id.three);
                pos4 = findViewById(R.id.four);
                pos5 = findViewById(R.id.five);
                AlertDialog.Builder builder = new AlertDialog.Builder(ExerciseList.this);
                LayoutInflater inflater = getLayoutInflater();
                View dialogView = inflater.inflate(R.layout.dialog, null);

                builder.setView(dialogView);
                if(position == 0) {
                    final TextView textView1 = dialogView.findViewById(R.id.one);
                    textView1.setText(belly[0]);
                    final TextView textView2 = dialogView.findViewById(R.id.two);
                    textView2.setText(belly[1]);
                    final TextView textView3 = dialogView.findViewById(R.id.three);
                    textView3.setText(belly[2]);
                    final TextView textView4 = dialogView.findViewById(R.id.four);
                    textView4.setText(belly[3]);
                    final TextView textView5 = dialogView.findViewById(R.id.five);
                    textView5.setText(belly[4]);
                    final AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                } else if (position == 1) {
                    final TextView textView1 = dialogView.findViewById(R.id.one);
                    textView1.setText(back[0]);
                    final TextView textView2 = dialogView.findViewById(R.id.two);
                    textView2.setText(back[1]);
                    final TextView textView3 = dialogView.findViewById(R.id.three);
                    textView3.setText(back[2]);
                    final TextView textView4 = dialogView.findViewById(R.id.four);
                    textView4.setText(back[3]);
                    final TextView textView5 = dialogView.findViewById(R.id.five);
                    textView5.setText(back[4]);
                    final AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                } else if (position == 2) {
                    final TextView textView1 = dialogView.findViewById(R.id.one);
                    textView1.setText(chest[0]);
                    final TextView textView2 = dialogView.findViewById(R.id.two);
                    textView2.setText(chest[1]);
                    final TextView textView3 = dialogView.findViewById(R.id.three);
                    textView3.setText(chest[2]);
                    final TextView textView4 = dialogView.findViewById(R.id.four);
                    textView4.setText(chest[3]);
                    final TextView textView5 = dialogView.findViewById(R.id.five);
                    textView5.setText(chest[4]);
                    final AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                } else if (position == 3) {
                    final TextView textView1 = dialogView.findViewById(R.id.one);
                    textView1.setText(arms[0]);
                    final TextView textView2 = dialogView.findViewById(R.id.two);
                    textView2.setText(arms[1]);
                    final TextView textView3 = dialogView.findViewById(R.id.three);
                    textView3.setText(arms[2]);
                    final TextView textView4 = dialogView.findViewById(R.id.four);
                    textView4.setText(arms[3]);
                    final TextView textView5 = dialogView.findViewById(R.id.five);
                    textView5.setText(arms[4]);
                    final AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                } else if (position == 4) {
                    final TextView textView1 = dialogView.findViewById(R.id.one);
                    textView1.setText(legs[0]);
                    final TextView textView2 = dialogView.findViewById(R.id.two);
                    textView2.setText(legs[1]);
                    final TextView textView3 = dialogView.findViewById(R.id.three);
                    textView3.setText(legs[2]);
                    final TextView textView4 = dialogView.findViewById(R.id.four);
                    textView4.setText(legs[3]);
                    final TextView textView5 = dialogView.findViewById(R.id.five);
                    textView5.setText(legs[4]);
                    final AlertDialog alertDialog = builder.create();
                    alertDialog.show();

                }
            }
        });
    }

    private class MyAdapter extends ArrayAdapter<String> {
        private int layoutResourceId;
        private String[] data;
        private int[] img_adapter;

        public MyAdapter(Context context, int resource, String[] data, int[] img) {
            super(context, resource, data);
            this.layoutResourceId = resource;
            this.data = data;
            this.img_adapter = img;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(layoutResourceId, parent, false);
            ImageView imgView = convertView.findViewById(R.id.img_exercise);
            TextView textView = convertView.findViewById(R.id.text_exercise);
            imgView.setImageResource(img_adapter[position]);
            textView.setText(data[position]);
            return convertView;
        }
    }
    public void startExercising(View view){
        Intent intent = new Intent(this,MainExercise.class);

        switch (view.getId()){
            case R.id.one:
        }
    }
}