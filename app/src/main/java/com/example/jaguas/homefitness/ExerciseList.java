package com.example.jaguas.homefitness;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class ExerciseList extends AppCompatActivity {

    private String[] kinds = {"Belly", "Back", "Chest", "Arms", "Legs"};
    private TextView pos1, pos2, pos3, pos4, pos5;
    public static String intentcont = "";

    private int[] img = {R.drawable.abs, R.drawable.back, R.drawable.chest, R.drawable.arms,
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
                                    Intent intent = new Intent(getBaseContext(), MainExercise.class);
                                    switch (which){
                                        case 0:
                                            intent.putExtra(intentcont,"crunches");
                                            break;
                                        case 1:
                                            intent.putExtra(intentcont,"reversecrunches");
                                            break;
                                        case 2:
                                            intent.putExtra(intentcont,"flutterkicks");
                                            break;
                                        case 3:
                                            intent.putExtra(intentcont,"sittingtwists");
                                            break;
                                        case 4:
                                            intent.putExtra(intentcont,"kneetoelbow");
                                            break;
                                        default:
                                            break;

                                    }
                                    startActivity(intent);
                                }
                            });
                    AlertDialog dialog = builder.create();
                    dialog.show();

                } else if (position == 1) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(ExerciseList.this);
                    builder.setTitle(R.string.selectExecise)
                            .setItems(R.array.back, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int which) {
                                    Intent intent = new Intent(getBaseContext(), MainExercise.class);
                                    switch (which){
                                        case 0:
                                            intent.putExtra(intentcont,"reversesnowangels");
                                            break;
                                        case 1:
                                            intent.putExtra(intentcont,"superman");
                                            break;
                                        case 2:
                                            intent.putExtra(intentcont,"hiphinge");
                                            break;
                                        case 3:
                                            intent.putExtra(intentcont,"bridging");
                                            break;
                                        case 4:
                                            intent.putExtra(intentcont,"twister");
                                            break;
                                        default:
                                            break;
                                    }
                                    startActivity(intent);

                                }
                            });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                } else if (position == 2) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(ExerciseList.this);
                    builder.setTitle(R.string.selectExecise)
                            .setItems(R.array.chest, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int which) {
                                    Intent intent = new Intent(getBaseContext(), MainExercise.class);
                                    switch (which){
                                        case 0:
                                            intent.putExtra(intentcont,"rotational");
                                            break;
                                        case 1:
                                            intent.putExtra(intentcont,"singleleg");
                                            break;
                                        case 2:
                                            intent.putExtra(intentcont,"backext");
                                            break;
                                        case 3:
                                            intent.putExtra(intentcont,"tripush");
                                            break;
                                        case 4:
                                            intent.putExtra(intentcont,"diamond");
                                            break;
                                        default:
                                            break;

                                    }
                                    startActivity(intent);
                                }
                            });
                    AlertDialog dialog = builder.create();
                    dialog.show();


                } else if (position == 3) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(ExerciseList.this);
                    builder.setTitle(R.string.selectExecise)
                            .setItems(R.array.arms, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int which) {
                                    Intent intent = new Intent(getBaseContext(), MainExercise.class);
                                    switch (which){
                                        case 0:
                                            intent.putExtra(intentcont,"pushups");
                                            break;
                                        case 1:
                                            intent.putExtra(intentcont,"onearmside");
                                            break;
                                        case 2:
                                            intent.putExtra(intentcont,"thewindmill");
                                            break;
                                        case 3:
                                            intent.putExtra(intentcont,"swingarms");
                                            break;
                                        case 4:
                                            intent.putExtra(intentcont,"floordips");
                                            break;
                                        default:
                                            break;

                                    }
                                    startActivity(intent);
                                }
                            });
                    AlertDialog dialog = builder.create();
                    dialog.show();


                } else if (position == 4) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(ExerciseList.this);
                    builder.setTitle(R.string.selectExecise)
                            .setItems(R.array.legs, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int which) {
                                    Intent intent = new Intent(getBaseContext(), MainExercise.class);
                                    switch (which){
                                        case 0:
                                            intent.putExtra(intentcont,"singlelegcircule");
                                            break;
                                        case 1:
                                            intent.putExtra(intentcont,"squat");
                                            break;
                                        case 2:
                                            intent.putExtra(intentcont,"sidelunge");
                                            break;
                                        case 3:
                                            intent.putExtra(intentcont,"singleleghip");
                                            break;
                                        case 4:
                                            intent.putExtra(intentcont,"droplunge");
                                            break;
                                        default:
                                            break;

                                    }
                                    startActivity(intent);
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