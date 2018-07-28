package cn.mijack.droidstitcherdemo;

/**
 * @author Mi&Jack
 * @since 2018/7/28
 */
public class DemoRunnable implements Runnable {
    @Override
    public void run() {
        com.mijack.Xlog.logMethodEnter("void cn.mijack.droidstitcherdemo.DemoRunnable.run()",this);try{System.out.println("demo");com.mijack.Xlog.logMethodExit("void cn.mijack.droidstitcherdemo.DemoRunnable.run()",this);}catch(Throwable throwable){com.mijack.Xlog.logMethodExitWithThrowable("void cn.mijack.droidstitcherdemo.DemoRunnable.run()",this,throwable);throw throwable;}
    }
}
