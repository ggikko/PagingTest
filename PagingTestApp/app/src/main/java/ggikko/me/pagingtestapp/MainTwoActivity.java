package ggikko.me.pagingtestapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import butterknife.OnClick;

public class MainTwoActivity extends BaseActivity {

    @OnClick(R.id.nextButton)
    void nextButtonClicked() {
        MainThreeActivity.start(this);
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, MainTwoActivity.class);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);
    }
}
