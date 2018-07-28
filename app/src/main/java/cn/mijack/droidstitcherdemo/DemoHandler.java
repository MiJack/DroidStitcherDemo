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
        com.mijack.Xlog.logMethodEnter("void cn.mijack.droidstitcherdemo.DemoHandler.handleMessage(android.os.Message)",this,msg);try{if (msg.what==CODE){System.out.println("get a code");}else {System.out.println("get a message");}com.mijack.Xlog.logMethodExit("void cn.mijack.droidstitcherdemo.DemoHandler.handleMessage(android.os.Message)",this);}catch(Throwable throwable){com.mijack.Xlog.logMethodExitWithThrowable("void cn.mijack.droidstitcherdemo.DemoHandler.handleMessage(android.os.Message)",this,throwable);throw throwable;}
    }
}
