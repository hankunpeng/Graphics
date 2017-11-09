package han.kunpeng.graphics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import timber.log.Timber;

/**
 * MainActivity
 *
 * @author William Han
 * @date 2017/11/08
 */
public class MainActivity extends AppCompatActivity {
    @BindView(R.id.button_open_circle_activity)
    Button buttonOpenCircleActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timber.d("[onCreate] [ButterKnife.bind] begin");
        ButterKnife.bind(this);
        Timber.d("[onCreate] [ButterKnife.bind] end");
    }

    @OnClick(R.id.button_open_circle_activity)
    public void openCircleActivity() {
        Timber.d("[openCircleActivity]");
        Intent intent = new Intent(this, PracticeActivity.class);
        startActivity(intent);
    }
}
