package com.dubu.skijangter.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Window;
import com.dubu.skijangter.R;


public class SplashActivity extends Activity {

    Intent intent;
    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        intent = new Intent(this, CarouselActivity.class);
        Handler handler = new Handler() {

            public void handleMessage(Message msg) {
                startActivity(intent);
                finish();
            }
        };

        handler.sendEmptyMessageDelayed(0, 3000);
    }

}
