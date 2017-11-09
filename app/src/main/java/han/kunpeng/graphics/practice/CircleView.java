package han.kunpeng.graphics.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * CircleView
 *
 * @author William Han
 * @date 2017/11/08
 */
public class CircleView extends View {

    public CircleView(Context context) {
        super(context);
    }

    public CircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 实心圆
        // Paint paint = new Paint();
        // canvas.drawCircle(256, 256, 256, paint);

        // 空心圆
        // Paint paint = new Paint();
        // paint.setStyle(Paint.Style.STROKE);
        // canvas.drawCircle(256, 256, 256, paint);

        // 蓝色实心圆
        // Paint paint = new Paint();
        // paint.setColor(Color.BLUE);
        // canvas.drawCircle(256, 256, 256, paint);

        // 线宽为 32 的空心圆
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(32);
        canvas.drawCircle(256, 256, 256, paint);
    }
}
