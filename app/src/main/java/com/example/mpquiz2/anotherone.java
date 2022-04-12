package com.example.mpquiz2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class anotherone extends AppCompatActivity {
    TextView box1, box2, box3, box4, box5, box6, box7, box8, box9;
    TextView asn1, asn2, asn3, asn4, asn5, asn6, asn7, asn8, asn9;
    int i;
    boolean check;
    TextView guesstimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anotherone);
        box1 = findViewById(R.id.m0);
        box2 = findViewById(R.id.m1);
        box3 = findViewById(R.id.m2);
        box4 = findViewById(R.id.m3);
        box5 = findViewById(R.id.m4);
        box6 = findViewById(R.id.m5);
        box7 = findViewById(R.id.m6);
        box8 = findViewById(R.id.m7);
        box9 = findViewById(R.id.m8);
        asn1 = findViewById(R.id.asn1);
        asn2 = findViewById(R.id.asn2);
        asn3 = findViewById(R.id.asn3);
        asn4 = findViewById(R.id.asn4);
        asn5 = findViewById(R.id.asn5);
        asn6 = findViewById(R.id.asn6);
        asn7 = findViewById(R.id.asn7);
        asn8 = findViewById(R.id.asn8);
        asn9 = findViewById(R.id.asn9);
        guesstimer = findViewById(R.id.guesstimer);
        asn1.setEnabled(false);
        asn2.setEnabled(false);
        asn3.setEnabled(false);
        asn4.setEnabled(false);
        asn5.setEnabled(false);
        asn6.setEnabled(false);
        asn7.setEnabled(false);
        asn8.setEnabled(false);
        asn9.setEnabled(false);
    }

    public void finish_game(View v){
        if(((ColorDrawable)box1.getBackground()).getColor() == ((ColorDrawable)asn1.getBackground()).getColor() &&
                ((ColorDrawable)box2.getBackground()).getColor() == ((ColorDrawable)asn2.getBackground()).getColor() &&
                ((ColorDrawable)box3.getBackground()).getColor() == ((ColorDrawable)asn3.getBackground()).getColor() &&
                ((ColorDrawable)box4.getBackground()).getColor() == ((ColorDrawable)asn4.getBackground()).getColor() &&
                ((ColorDrawable)box5.getBackground()).getColor() == ((ColorDrawable)asn5.getBackground()).getColor() &&
                ((ColorDrawable)box6.getBackground()).getColor() == ((ColorDrawable)asn6.getBackground()).getColor() &&
                ((ColorDrawable)box7.getBackground()).getColor() == ((ColorDrawable)asn7.getBackground()).getColor() &&
                ((ColorDrawable)box8.getBackground()).getColor() == ((ColorDrawable)asn8.getBackground()).getColor() &&
                ((ColorDrawable)box9.getBackground()).getColor() == ((ColorDrawable)asn9.getBackground()).getColor()
        ){
            box1.setVisibility(View.VISIBLE);
            box2.setVisibility(View.VISIBLE);
            box3.setVisibility(View.VISIBLE);
            box4.setVisibility(View.VISIBLE);
            box5.setVisibility(View.VISIBLE);
            box6.setVisibility(View.VISIBLE);
            box7.setVisibility(View.VISIBLE);
            box8.setVisibility(View.VISIBLE);
            box9.setVisibility(View.VISIBLE);
            guesstimer.setText("Win");
        }else{
            box1.setVisibility(View.VISIBLE);
            box2.setVisibility(View.VISIBLE);
            box3.setVisibility(View.VISIBLE);
            box4.setVisibility(View.VISIBLE);
            box5.setVisibility(View.VISIBLE);
            box6.setVisibility(View.VISIBLE);
            box7.setVisibility(View.VISIBLE);
            box8.setVisibility(View.VISIBLE);
            box9.setVisibility(View.VISIBLE);
            guesstimer.setText("Lose");
        }
    }

    public void play(View v){
        box1.setVisibility(View.VISIBLE);
        box2.setVisibility(View.VISIBLE);
        box3.setVisibility(View.VISIBLE);
        box4.setVisibility(View.VISIBLE);
        box5.setVisibility(View.VISIBLE);
        box6.setVisibility(View.VISIBLE);
        box7.setVisibility(View.VISIBLE);
        box8.setVisibility(View.VISIBLE);
        box9.setVisibility(View.VISIBLE);
        Random rand = new Random();
        String cBox1 = random_color(rand.nextInt(3));
        String cBox2 = random_color(rand.nextInt(3));
        String cBox3 = random_color(rand.nextInt(3));
        String cBox4 = random_color(rand.nextInt(3));
        String cBox5 = random_color(rand.nextInt(3));
        String cBox6 = random_color(rand.nextInt(3));
        String cBox7 = random_color(rand.nextInt(3));
        String cBox8 = random_color(rand.nextInt(3));
        String cBox9 = random_color(rand.nextInt(3));
        box1.setBackgroundColor(Color.parseColor(cBox1));
        box2.setBackgroundColor(Color.parseColor(cBox2));
        box3.setBackgroundColor(Color.parseColor(cBox3));
        box4.setBackgroundColor(Color.parseColor(cBox4));
        box5.setBackgroundColor(Color.parseColor(cBox5));
        box6.setBackgroundColor(Color.parseColor(cBox6));
        box7.setBackgroundColor(Color.parseColor(cBox7));
        box8.setBackgroundColor(Color.parseColor(cBox8));
        box9.setBackgroundColor(Color.parseColor(cBox9));
        if(tmr()){
            asn1.setEnabled(true);
            asn2.setEnabled(true);
            asn3.setEnabled(true);
            asn4.setEnabled(true);
            asn5.setEnabled(true);
            asn6.setEnabled(true);
            asn7.setEnabled(true);
            asn8.setEnabled(true);
            asn9.setEnabled(true);
        }
    }

    public String random_color(int a){
        if(a == 0){
            // green
            return "#B9F8D3";
        }else if(a == 1){
            // pink
            return "#E78EA9";
        }else if(a == 2){
            // cream
            return "#FFFBE7";
        }
        return "error";
    }

    public void click_color(View v){
        switch (v.getId()){
            case R.id.asn1:
                choose_color(asn1);
                break;
            case R.id.asn2:
                choose_color(asn2);
                break;
            case R.id.asn3:
                choose_color(asn3);
                break;
            case R.id.asn4:
                choose_color(asn4);
                break;
            case R.id.asn5:
                choose_color(asn5);
                break;
            case R.id.asn6:
                choose_color(asn6);
                break;
            case R.id.asn7:
                choose_color(asn7);
                break;
            case R.id.asn8:
                choose_color(asn8);
                break;
            case R.id.asn9:
                choose_color(asn9);
                break;
        }
    }

    private void choose_color(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(anotherone.this, R.style.AlertDialogTheme);
        View view = LayoutInflater.from(anotherone.this).inflate(
                R.layout.layout_warning_dialog,(ConstraintLayout)findViewById(R.id.layoutDialogContainer)
        );
        builder.setView(view);

        final AlertDialog alertDialog = builder.create();
        view.findViewById(R.id.btngreen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (v.getId()){
                    case R.id.asn1:
                        asn1.setBackgroundColor(Color.parseColor("#B9F8D3"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn2:
                        asn2.setBackgroundColor(Color.parseColor("#B9F8D3"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn3:
                        asn3.setBackgroundColor(Color.parseColor("#B9F8D3"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn4:
                        asn4.setBackgroundColor(Color.parseColor("#B9F8D3"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn5:
                        asn5.setBackgroundColor(Color.parseColor("#B9F8D3"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn6:
                        asn6.setBackgroundColor(Color.parseColor("#B9F8D3"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn7:
                        asn7.setBackgroundColor(Color.parseColor("#B9F8D3"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn8:
                        asn8.setBackgroundColor(Color.parseColor("#B9F8D3"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn9:
                        asn9.setBackgroundColor(Color.parseColor("#B9F8D3"));
                        alertDialog.dismiss();
                        break;
                }
            }
        });
        view.findViewById(R.id.btnpink).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (v.getId()){
                    case R.id.asn1:
                        asn1.setBackgroundColor(Color.parseColor("#E78EA9"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn2:
                        asn2.setBackgroundColor(Color.parseColor("#E78EA9"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn3:
                        asn3.setBackgroundColor(Color.parseColor("#E78EA9"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn4:
                        asn4.setBackgroundColor(Color.parseColor("#E78EA9"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn5:
                        asn5.setBackgroundColor(Color.parseColor("#E78EA9"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn6:
                        asn6.setBackgroundColor(Color.parseColor("#E78EA9"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn7:
                        asn7.setBackgroundColor(Color.parseColor("#E78EA9"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn8:
                        asn8.setBackgroundColor(Color.parseColor("#E78EA9"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn9:
                        asn9.setBackgroundColor(Color.parseColor("#E78EA9"));
                        alertDialog.dismiss();
                        break;
                }
            }
        });
        view.findViewById(R.id.btncream).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (v.getId()){
                    case R.id.asn1:
                        asn1.setBackgroundColor(Color.parseColor("#FFFBE7"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn2:
                        asn2.setBackgroundColor(Color.parseColor("#FFFBE7"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn3:
                        asn3.setBackgroundColor(Color.parseColor("#FFFBE7"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn4:
                        asn4.setBackgroundColor(Color.parseColor("#FFFBE7"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn5:
                        asn5.setBackgroundColor(Color.parseColor("#FFFBE7"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn6:
                        asn6.setBackgroundColor(Color.parseColor("#FFFBE7"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn7:
                        asn7.setBackgroundColor(Color.parseColor("#FFFBE7"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn8:
                        asn8.setBackgroundColor(Color.parseColor("#FFFBE7"));
                        alertDialog.dismiss();
                        break;
                    case R.id.asn9:
                        asn9.setBackgroundColor(Color.parseColor("#FFFBE7"));
                        alertDialog.dismiss();
                        break;
                }
            }
        });
        if (alertDialog.getWindow() != null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialog.show();
    }

    private boolean tmr(){
        i = 0;
        boolean t = true;
        Handler hnd = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while(t) {
                    try{
                        i++;
                        Thread.sleep(1000);
                        if(i == 10){
                            check = true;
                            box1.setVisibility(View.INVISIBLE);
                            box2.setVisibility(View.INVISIBLE);
                            box3.setVisibility(View.INVISIBLE);
                            box4.setVisibility(View.INVISIBLE);
                            box5.setVisibility(View.INVISIBLE);
                            box6.setVisibility(View.INVISIBLE);
                            box7.setVisibility(View.INVISIBLE);
                            box8.setVisibility(View.INVISIBLE);
                            box9.setVisibility(View.INVISIBLE);
                            break;
                        }
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    hnd.post(new Runnable() {
                        @Override
                        public void run() {
                            guesstimer.setText(""+i);
                        }
                    });
                }
            }
        };
        new Thread(runnable).start();
        return true;
    }
}