package han.kunpeng.graphics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;
import timber.log.Timber;

/**
 * MainActivity
 *
 * @author William Han
 * @date 2017/11/10
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        Timber.d("[onCreate]");
    }

    @OnClick(R.id.button_open_practice_activity)
    public void openCircleActivity() {
        Timber.d("[openCircleActivity]");
        Intent intent = new Intent(this, PracticeActivity.class);
        startActivity(intent);
    }
}
