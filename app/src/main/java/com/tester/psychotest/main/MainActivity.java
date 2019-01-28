package com.tester.psychotest.main;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.tester.psychotest.R;

public class MainActivity extends AppCompatActivity {

    public String username;
    private MainPreseter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.full_name).toString();
        presenter = new MainPreseter(this);
    }

    public void onColorTestButtonClick(View view) {
        presenter.onColorTestButtonClick(view);
    }
}
