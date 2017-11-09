package han.kunpeng.graphics.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * ArcView
 *
 * @author William Han
 * @date 2017/11/08
 */
public class ArcView extends View {

    public ArcView(Context context) {
        super(context);
    }

    public ArcView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ArcView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();

        // 120° 的红色扇形
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(0, 0, 512, 512, -30, 120, true, paint);

        // 120° 的绿色扇形
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawArc(0, 0, 512, 512, 91, 120, false, paint);

        // 120° 的 蓝色弧线
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(88);
        canvas.drawArc(0, 0, 512, 512, -149, 120, false, paint);
    }
}
