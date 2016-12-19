package ggikko.me.pagingtestapp.second;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import butterknife.OnClick;
import ggikko.me.pagingtestapp.BaseActivity;
import ggikko.me.pagingtestapp.R;

public class SecondActivity extends BaseActivity {

    @OnClick(R.id.nextButton)
    void nextButtonClicked() {
        SecondTwoActvitiy.start(this);
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, SecondActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
