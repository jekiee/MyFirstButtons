package com.example.jek.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOk = (Button) findViewById(R.id.btnOk);
        Button btnCancel = (Button) findViewById(R.id.btnCancel);
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOk:
                final TextView textView = (TextView) findViewById(R.id.tvOut);
                textView.setText("Нажата кнопка OK");
                break;
            case R.id.btnCancel:
                final TextView textView1 = (TextView) findViewById(R.id.tvOut);
                textView1.setText("Нажата кнопка Cancel");
                break;
        }
    }
}



