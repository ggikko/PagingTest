package ggikko.me.pagingtestapp.second;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import butterknife.OnClick;
import ggikko.me.pagingtestapp.BaseActivity;
import ggikko.me.pagingtestapp.MainActivity;
import ggikko.me.pagingtestapp.R;

public class SecondTwoActvitiy extends BaseActivity {

    @OnClick(R.id.nextButton)
    void nextButtonClicked() {
        MainActivity.startOnTop(this);
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, SecondTwoActvitiy.class);
        context.startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_two_actvitiy);
    }
}
