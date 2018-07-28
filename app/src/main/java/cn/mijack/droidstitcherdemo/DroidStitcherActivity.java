package cn.mijack.droidstitcherdemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


/**
 * @author Mi&Jack
 * @since 2018/7/28
 */
public class DroidStitcherActivity extends Activity {
    TextView textView;
    Button button;
    Handler handler = new DroidStitcherHandler();
    private int UPDATE_RESULT = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setOnClickListener(new DroidStitcherClickListener());
    }

    public class DroidStitcherHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == UPDATE_RESULT) {
                textView.setText(String.valueOf(msg.obj));
            }
        }
    }

    public class DroidStitcherClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            textView.setText("do some working");
            new DroidStitcherThread().start();
        }
    }

    public class DroidStitcherThread extends Thread {
        @Override
        public void run() {
            try {
                // simulate some hard working
                Random random = new Random();
                String s = String.valueOf(random.nextInt());
                Thread.sleep(1000);
                Message msg = Message.obtain();
                msg.what = UPDATE_RESULT;
                msg.obj = s;
                handler.sendMessage(msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
