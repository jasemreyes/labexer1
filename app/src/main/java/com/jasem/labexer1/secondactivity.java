package com.jasem.labexer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {

    TextView RA1;
    TextView FG1;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        RA1 = (TextView) findViewById(R.id.RA1);
        FG1 = (TextView) findViewById(R.id.FG1);
        back = (Button) findViewById(R.id.back);

        String raw = getIntent().getExtras().getString("raw");
        String eval = getIntent().getExtras().getString("eval");
        RA1.setText(raw);
        FG1.setText(eval);
    }

    public void MainActivity(View view) {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);

    }
}