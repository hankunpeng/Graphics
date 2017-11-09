package han.kunpeng.graphics.util;

import timber.log.Timber;

/**
 * MainActivity
 *
 * @author William Han
 * @date 2017/11/02
 */
public class ThreadAwareDebugTree extends Timber.DebugTree {

    @Override
    protected void log(int priority, String tag, String message, Throwable t) {
        if (tag != null) {
            String threadName = Thread.currentThread().getName();
            tag = "<" + threadName + "> " + tag;
        }
        super.log(priority, tag, message, t);
    }

    @Override
    protected String createStackElementTag(StackTraceElement element) {
        // 日志显示行号
        return super.createStackElementTag(element) + "(Line " + element.getLineNumber() + ")";
    }
}
