package han.kunpeng.graphics.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * PointView
 *
 * @author William Han
 * @date 2017/11/08
 */
public class PointView extends View {

    public PointView(Context context) {
        super(context);
    }

    public PointView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PointView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();

        // 控制点的大小
        paint.setStrokeWidth(32);

        // 圆点
        // paint.setStrokeCap(Paint.Cap.ROUND);

        // 方点
        paint.setStrokeCap(Paint.Cap.SQUARE);

        canvas.drawPoint(256, 256, paint);
    }
}
