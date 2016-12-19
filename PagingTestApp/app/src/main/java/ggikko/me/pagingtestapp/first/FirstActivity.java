package ggikko.me.pagingtestapp.first;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import butterknife.OnClick;
import ggikko.me.pagingtestapp.BaseActivity;
import ggikko.me.pagingtestapp.R;

public class FirstActivity extends BaseActivity {

    public static final int FirstActivity = 1001;

    @OnClick(R.id.nextButton)
    void nextButtonClicked() {
        FirstTwoActivity.startForResult(this, FirstActivity);
    }

    public static void startForResult(Activity activity, int requestCode) {
        Intent intent = new Intent(activity, FirstActivity.class);
        activity.startActivityForResult(intent, requestCode);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == FirstActivity) {
            if(resultCode == RESULT_OK){
                Intent intent = new Intent();
                intent.putExtra("test1", "test1");
                intent.putExtra("test2", data.getStringExtra("test2"));
                intent.putExtra("test3", data.getStringExtra("test3"));
                setResult(RESULT_OK, intent);
                finish();
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, FirstActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
}
