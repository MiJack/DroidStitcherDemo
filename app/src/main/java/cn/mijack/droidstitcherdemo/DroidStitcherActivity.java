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
        com.mijack.Xlog.logMethodEnter("void cn.mijack.droidstitcherdemo.DroidStitcherActivity.onCreate(android.os.Bundle)",this,savedInstanceState);try{super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.setOnClickListener(new DroidStitcherClickListener());com.mijack.Xlog.logMethodExit("void cn.mijack.droidstitcherdemo.DroidStitcherActivity.onCreate(android.os.Bundle)",this);}catch(Throwable throwable){com.mijack.Xlog.logMethodExitWithThrowable("void cn.mijack.droidstitcherdemo.DroidStitcherActivity.onCreate(android.os.Bundle)",this,throwable);throw throwable;}
    }

    public class DroidStitcherHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            com.mijack.Xlog.logMethodEnter("void cn.mijack.droidstitcherdemo.DroidStitcherActivity$DroidStitcherHandler.handleMessage(android.os.Message)",this,msg);try{if (msg.what == UPDATE_RESULT) {
                textView.setText(String.valueOf(msg.obj));
            }com.mijack.Xlog.logMethodExit("void cn.mijack.droidstitcherdemo.DroidStitcherActivity$DroidStitcherHandler.handleMessage(android.os.Message)",this);}catch(Throwable throwable){com.mijack.Xlog.logMethodExitWithThrowable("void cn.mijack.droidstitcherdemo.DroidStitcherActivity$DroidStitcherHandler.handleMessage(android.os.Message)",this,throwable);throw throwable;}
        }
    }

    public class DroidStitcherClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            com.mijack.Xlog.logMethodEnter("void cn.mijack.droidstitcherdemo.DroidStitcherActivity$DroidStitcherClickListener.onClick(android.view.View)",this,v);try{textView.setText("do some working");
            new DroidStitcherThread().start();com.mijack.Xlog.logMethodExit("void cn.mijack.droidstitcherdemo.DroidStitcherActivity$DroidStitcherClickListener.onClick(android.view.View)",this);}catch(Throwable throwable){com.mijack.Xlog.logMethodExitWithThrowable("void cn.mijack.droidstitcherdemo.DroidStitcherActivity$DroidStitcherClickListener.onClick(android.view.View)",this,throwable);throw throwable;}
        }
    }

    public class DroidStitcherThread extends Thread {
        @Override
        public void run() {
            com.mijack.Xlog.logMethodEnter("void cn.mijack.droidstitcherdemo.DroidStitcherActivity$DroidStitcherThread.run()",this);try{try {
                /*// simulate some hard working*/
                Random random = new Random();
                String s = String.valueOf(random.nextInt());
                Thread.sleep(1000);
                Message msg = Message.obtain();
                msg.what = UPDATE_RESULT;
                msg.obj = s;
                handler.sendMessage(msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }com.mijack.Xlog.logMethodExit("void cn.mijack.droidstitcherdemo.DroidStitcherActivity$DroidStitcherThread.run()",this);}catch(Throwable throwable){com.mijack.Xlog.logMethodExitWithThrowable("void cn.mijack.droidstitcherdemo.DroidStitcherActivity$DroidStitcherThread.run()",this,throwable);throw throwable;}
        }
    }
}
