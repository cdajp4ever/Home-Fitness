package com.example.jaguas.homefitness;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
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
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class ExerciseList extends AppCompatActivity {

    private String[] kinds = {"Belly", "Back", "Chest", "Arms", "Legs"};
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

                if(position == 0) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(ExerciseList.this);
                    builder.setTitle(R.string.selectExecise)
                            .setItems(R.array.belly, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int which) {
                                    switch (which){
                                        case 0:

                                            //need to check where to put the initial intent and
                                            // then put the extra to change the recycler view
                                    }
                                }
                            });
                    AlertDialog dialog = builder.create();
                    dialog.show();

                } else if (position == 1) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(ExerciseList.this);
                    builder.setTitle(R.string.selectExecise)
                            .setItems(R.array.back, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                } else if (position == 2) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(ExerciseList.this);
                    builder.setTitle(R.string.selectExecise)
                            .setItems(R.array.chest, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            });
                    AlertDialog dialog = builder.create();
                    dialog.show();


                } else if (position == 3) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(ExerciseList.this);
                    builder.setTitle(R.string.selectExecise)
                            .setItems(R.array.arms, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            });
                    AlertDialog dialog = builder.create();
                    dialog.show();


                } else if (position == 4) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(ExerciseList.this);
                    builder.setTitle(R.string.selectExecise)
                            .setItems(R.array.legs, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            });
                    AlertDialog dialog = builder.create();
                    dialog.show();


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

}