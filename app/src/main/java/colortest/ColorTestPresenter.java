package colortest;

import android.graphics.Color;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

import java.util.Random;
import java.util.logging.LogRecord;

public class ColorTestPresenter {
    ColorTestActivity activity;
    int currentColor;

    final Random random = new Random();
    final Handler handler = new Handler();
    final Runnable runnableLightUp = new Runnable() {
        @Override
        public void run() {
            lightUp();
        }
    };

    ColorTestPresenter(ColorTestActivity activity) throws InterruptedException {
        this.activity = activity;
        sleepRandom();
        //lightUp();
        //lightUp();
    }
    void lightUp(){
        currentColor = Color.RED;
        activity.setBackGroundColor(currentColor);
    }

    void lightDown(){
        currentColor = Color.WHITE;
        activity.setBackGroundColor(currentColor);
    }

    void sleepRandom() throws InterruptedException {
        int randomNumber = random.nextInt(5)+2;
        handler.postDelayed(runnableLightUp,randomNumber*1000);
    }

    boolean onTouchEvent(MotionEvent event){
        if(event.getAction() == MotionEvent.ACTION_DOWN){
            if(currentColor == Color.RED){
                lightDown();
            }
            else{
              lightUp();
            }
            return true;
        }
        return false;
    }

}
