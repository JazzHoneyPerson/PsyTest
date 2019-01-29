package colortest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.tester.psychotest.R;

public class ColorTestActivity extends AppCompatActivity {
    ColorTestPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_test);
        try {
            presenter = new ColorTestPresenter(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event){
        return presenter.onTouchEvent(event);//presenter.onTouch(v, event);
    }

    public void setBackGroundColor(int color){
        getWindow().getDecorView().setBackgroundColor(color);
    }
}
