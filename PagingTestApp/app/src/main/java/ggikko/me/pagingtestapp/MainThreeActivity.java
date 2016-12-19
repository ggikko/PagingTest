package ggikko.me.pagingtestapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import butterknife.OnClick;
import ggikko.me.pagingtestapp.first.FirstActivity;
import ggikko.me.pagingtestapp.second.SecondActivity;

public class MainThreeActivity extends BaseActivity {

    public static final int MainThreeActivity = 1000;

    @OnClick(R.id.nextButton)
    void nextButtonClicked() {
        FirstActivity.startForResult(this, MainThreeActivity);
    }

    @OnClick(R.id.next2Button)
    void next2ButtonClicked() {
        SecondActivity.start(this);
    }

    public static void start(Context context) {
        Intent intent = new Intent(context, MainThreeActivity.class);
        context.startActivity(intent);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == MainThreeActivity) {
            if(resultCode == RESULT_OK){
                Log.e("ggikko", "test1 : " + data.getStringExtra("test1"));
                Log.e("ggikko", "test2 : " + data.getStringExtra("test2"));
                Log.e("ggikko", "test3 : " + data.getStringExtra("test3"));
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_three);
    }
}
