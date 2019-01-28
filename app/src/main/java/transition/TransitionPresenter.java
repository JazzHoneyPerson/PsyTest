package transition;

import android.content.Intent;
import android.view.View;

public class TransitionPresenter {
    private TransitionActivity activity;
    private String nextActivityName;
    TransitionPresenter(TransitionActivity activity) {
        this.activity = activity;
        Intent intent = activity.getIntent();
        Integer informationAboutTestId = intent.getIntExtra("information",-1);
        nextActivityName = intent.getStringExtra("class_name");
        activity.setInformationAboutTest(informationAboutTestId);
    }
    public void onOkButtonClick(View view) throws ClassNotFoundException {
        Class clazz = Class.forName(nextActivityName);
        Intent intent = new Intent(activity, clazz);
        activity.startActivity(intent);
    }
}
