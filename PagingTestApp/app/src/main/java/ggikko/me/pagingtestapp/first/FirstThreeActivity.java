package ggikko.me.pagingtestapp.first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import butterknife.OnClick;
import ggikko.me.pagingtestapp.BaseActivity;
import ggikko.me.pagingtestapp.R;

public class FirstThreeActivity extends BaseActivity {

    @OnClick(R.id.nextButton)
    void nextButtonClicked() {
        Intent intent = new Intent();
        intent.putExtra("test3", "test3");
        setResult(RESULT_OK, intent);
        finish();
    }

    public static void startForResult(Activity activity, int requestCode) {
        Intent intent = new Intent(activity, FirstThreeActivity.class);
        activity.startActivityForResult(intent, requestCode);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_three);
    }
}
