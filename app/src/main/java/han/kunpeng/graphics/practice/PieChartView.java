package han.kunpeng.graphics.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * PieChartView
 *
 * @author William Han
 * @date 2017/11/08
 */
public class PieChartView extends View {
    public PieChartView(Context context) {
        super(context);
    }

    public PieChartView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PieChartView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();

        paint.setColor(Color.RED);
        canvas.drawArc(0, 0, 1024, 1024, -30, 120, true,paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(0, 0, 1024, 1024, 90, 120, true,paint);

        paint.setColor(Color.BLUE);
        canvas.drawArc(0, 0, 1024, 1024, 210, 120, true,paint);
    }
}
