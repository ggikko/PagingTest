package ggikko.me.pagingtestapp.first;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import butterknife.OnClick;
import ggikko.me.pagingtestapp.BaseActivity;
import ggikko.me.pagingtestapp.R;

public class FirstTwoActivity extends BaseActivity {

    public static final int FirstTwoActivity = 1002;

    @OnClick(R.id.nextButton)
    void nextButtonClicked() {
        FirstThreeActivity.startForResult(this, FirstTwoActivity);
    }

    public static void startForResult(Activity activity, int requestCode) {
        Intent intent = new Intent(activity, FirstTwoActivity.class);
        activity.startActivityForResult(intent, requestCode);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == FirstTwoActivity) {
            if(resultCode == RESULT_OK){
                Intent intent = new Intent();
                intent.putExtra("test2", "test2");
                intent.putExtra("test3", data.getStringExtra("test3"));
                setResult(RESULT_OK, intent);
                finish();
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_two);
    }
}
