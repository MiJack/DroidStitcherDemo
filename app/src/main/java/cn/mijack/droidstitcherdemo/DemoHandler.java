package cn.mijack.droidstitcherdemo;

import android.os.Handler;
import android.os.Message;

import static cn.mijack.droidstitcherdemo.HandlerTestActivity.CODE;

/**
 * @author Mi&Jack
 * @since 2018/7/28
 */
public class DemoHandler extends Handler {
    @Override
    public void handleMessage(Message msg) {
        if (msg.what==CODE){System.out.println("get a code");}else {System.out.println("get a message");}
    }
}
