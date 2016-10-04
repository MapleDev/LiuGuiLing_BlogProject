package com.xznn.zhangguiling_blogproject.my_view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * 椭圆
 * Created by LGL on 2016/1/8.
 */
public class OvalView extends View {

    public OvalView(Context context) {
        super(context);
    }

    public OvalView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 创建画笔
        Paint p = new Paint();
        p.setColor(Color.BLACK);
        RectF rectF = new RectF(60, 100, 200, 240);
        rectF.set(210,100,250,130);
        canvas.drawOval(rectF, p);
    }
}
