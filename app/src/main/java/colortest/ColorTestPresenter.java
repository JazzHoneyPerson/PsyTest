package colortest;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;

import java.util.Random;

public class ColorTestPresenter {
    ColorTestActivity activity;
    int currentColor;

    final Random random = new Random();

    ColorTestPresenter(ColorTestActivity activity) throws InterruptedException {
        this.activity = activity;
        //sleepRandom();
        //lightUp();
        //lightUp();
    }
    void lightUp(){
        currentColor = Color.RED;
        activity.setBackGroundColor(currentColor);
    }

    void lightDown(){
        //currentColor = Color.WHITE;
       // activity.setBackGroundColor(currentColor);
    }

    void sleepRandom() throws InterruptedException {
        int randomNumber = random.nextInt(5)+2;
        Thread.sleep(randomNumber*1000);
    }

    boolean onTouch(View view, MotionEvent event){
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
