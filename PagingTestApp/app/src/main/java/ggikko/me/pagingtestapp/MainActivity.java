package ggikko.me.pagingtestapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import butterknife.OnClick;

public class MainActivity extends BaseActivity {
    public static final int FLAGS_CLEAR_AND_NEW_TASK = Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK;

    public static void startOnTop(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.addFlags(FLAGS_CLEAR_AND_NEW_TASK);
        context.startActivity(intent);
    }

    @OnClick(R.id.nextButton)
    void nextButtonClicked() {
        MainTwoActivity.start(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
