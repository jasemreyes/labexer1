package com.jasem.labexer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText q1;
    EditText q2;
    EditText sw;
    EditText le;
    EditText me;
    Button compute;

    double RA1;
    String eval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        q1 = (EditText) findViewById(R.id.q1);
        q2 = (EditText) findViewById(R.id.q2);
        sw = (EditText) findViewById(R.id.sw);
        le = (EditText) findViewById(R.id.le);
        me = (EditText) findViewById(R.id.me);
        compute = (Button) findViewById(R.id.compute);
    }
    public void secondactivity(View view){


        Double q1score = Double.parseDouble(q1.getText().toString());
        Double q2score = Double.parseDouble(q2.getText().toString());
        Double swscore= Double.parseDouble(sw.getText().toString());
        Double lescore = Double.parseDouble(le.getText().toString());
        Double mescore = Double.parseDouble(me.getText().toString());

        RA1 = (q1score * .1) + (q2score * .1) + (swscore * .1) + (lescore * .4) + (mescore * .3);

        if(RA1 < 60.00){
            eval= "Failed";
        }
        else if(RA1 >= 60.00 && RA1 <= 65.99){
            eval= "3.0";
        }
        else if(RA1 >=66.00 && RA1 <= 70.99){
            eval="2.75";
        }
        else if(RA1 >=71.00 && RA1 <= 75.99){
            eval="2.50";
        }
        else if(RA1 >=76.00 && RA1 <= 80.99){
            eval="2.25";
        }
        else if(RA1 >=81.00 && RA1 <= 85.99){
            eval="2.00";
        }
        else if(RA1 >=86.00 && RA1 <= 90.99){
            eval="1.75";
        }
        else if(RA1 >=91.00 && RA1 <= 92.99){
            eval="1.50";
        }
        else if(RA1 >=93.00 && RA1 <= 94.99){
            eval="1.25";
        }
        else if(RA1 >=95.00 && RA1 <= 100.00){
            eval="1.00";
        }

        String RA2 = String.valueOf(RA1);

        Intent intent = new Intent(this, secondactivity.class);

        intent.putExtra("raw", RA2);
        intent.putExtra("eval", eval);
        startActivity(intent);
    }
}



