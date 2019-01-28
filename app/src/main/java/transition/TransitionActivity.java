package transition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tester.psychotest.R;

public class TransitionActivity extends AppCompatActivity {
    TransitionPresenter presenter;
    TextView informationAboutTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);
        informationAboutTest = findViewById(R.id.infromation_about_test);
        presenter = new TransitionPresenter(this);
    }
    public void onOkButtonClick(View view) throws ClassNotFoundException {
        presenter.onOkButtonClick(view);
    }
    public void setInformationAboutTest(Integer id)
    {
        informationAboutTest.setText(id);
    }

}
