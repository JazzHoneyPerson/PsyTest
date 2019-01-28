package com.tester.psychotest.main;

import android.content.Intent;
import android.view.View;

import com.tester.psychotest.R;

import colortest.ColorTestActivity;
import transition.TransitionActivity;

public class MainPreseter {
    private MainActivity activity;
    MainPreseter(MainActivity activity) {
        this.activity = activity;
    }
    public void onColorTestButtonClick(View view) {
        Intent intent = new Intent(activity, TransitionActivity.class);
        intent.putExtra("information", R.string.full_name_hint);
        intent.putExtra("class_name", "colortest.ColorTestActivity");
        activity.startActivity(intent);
    }
}
