package cn.mijack.droidstitcherdemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/**
 * @author Mi&Jack
 * @since 2018/7/28
 */
public class HandlerTestActivity extends Activity {

    public static final int CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Handler handler = new DemoHandler();
// "android.os.Handler post java.lang.Runnable",
        handler.post(new DemoRunnable());
//  "android.os.Handler postAtTime java.lang.Runnable long",
        handler.postAtTime(new DemoRunnable(), 10);
//  "android.os.Handler postAtTime java.lang.Runnable java.lang.Object long",
        handler.postAtTime(new DemoRunnable(), new Object(), 10);
//  "android.os.Handler postDelayed java.lang.Runnable long",
        handler.postDelayed(new DemoRunnable(), 10);
//  "android.os.Handler postAtFrontOfQueue java.lang.Runnable",
        handler.postAtFrontOfQueue(new DemoRunnable());
//  "android.os.Handler sendMessage android.os.Message",
        handler.sendMessage(Message.obtain(handler, new DemoRunnable()));
//  "android.os.Handler sendEmptyMessage int",
        handler.sendEmptyMessage(CODE);
//  "android.os.Handler sendEmptyMessageDelayed int long",
        handler.sendEmptyMessageDelayed(CODE, 100);
//  "android.os.Handler sendEmptyMessageAtTime int long",
        handler.sendEmptyMessageAtTime(CODE, 100);
//  "android.os.Handler sendMessageDelayed android.os.Message long",
        handler.sendMessageDelayed(Message.obtain(handler, new DemoRunnable()), 100);
//  "android.os.Handler sendMessageAtTime android.os.Message long",
        handler.sendMessageAtTime(Message.obtain(handler, new DemoRunnable()), 1000);
//  "android.os.Handler sendMessageAtFrontOfQueue android.os.Message"
        handler.sendMessageAtFrontOfQueue(Message.obtain(handler, new DemoRunnable()));
    }
}
