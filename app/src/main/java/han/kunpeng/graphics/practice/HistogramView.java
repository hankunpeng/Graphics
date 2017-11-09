package han.kunpeng.graphics.practice;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

/**
 * HistogramView
 *
 * @author William Han
 * @date 2017/11/08
 */
public class HistogramView extends View {
    public HistogramView(Context context) {
        super(context);
    }

    public HistogramView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HistogramView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();

        paint.setColor(Color.RED);
        canvas.drawRect(0, 256, 64, 512, paint);

        paint.setColor(Color.GREEN);
        canvas.drawRect(64, 128, 128, 512, paint);

        paint.setColor(Color.BLUE);
        canvas.drawRect(128, 0, 192, 512, paint);

        paint.setColor(Color.GREEN);
        canvas.drawRect(192, 128, 256, 512, paint);

        paint.setColor(Color.RED);
        canvas.drawRect(256, 256, 320, 512, paint);
    }
}
