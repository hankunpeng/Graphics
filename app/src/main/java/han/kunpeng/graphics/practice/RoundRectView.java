package han.kunpeng.graphics.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * RoundRectView
 *
 * @author William Han
 * @date 2017/11/08
 */
public class RoundRectView extends View {

    public RoundRectView(Context context) {
        super(context);
    }

    public RoundRectView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RoundRectView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        canvas.drawRoundRect(0, 0, 512, 512, 16, 16, paint);
    }
}
