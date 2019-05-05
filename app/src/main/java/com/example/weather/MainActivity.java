package com.example.weather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button pressbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pressbutton= (Button) findViewById(R.id.bbutton);
        pressbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                acc2();

            }
        });

    }
    public void acc2()
    {
        Intent intent = new Intent(this, Acc2.class);
        startActivity(intent);
    }
}
