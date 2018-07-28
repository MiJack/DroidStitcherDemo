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
        switch (msg.what) {
            case CODE:
                System.out.println("get a code");
                return;
            default:
                System.out.println("get a message");

        }
    }
}
