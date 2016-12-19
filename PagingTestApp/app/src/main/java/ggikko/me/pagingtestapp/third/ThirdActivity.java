package ggikko.me.pagingtestapp.third;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import ggikko.me.pagingtestapp.BaseActivity;
import ggikko.me.pagingtestapp.R;

public class ThirdActivity extends BaseActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, ThirdActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
}
