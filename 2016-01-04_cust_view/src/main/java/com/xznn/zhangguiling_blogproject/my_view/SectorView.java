package com.xznn.zhangguiling_blogproject.my_view;

/**
 * Created by Administrator on 16/10/04.
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * 扇形
 * Created by LGL on 2016/1/8.
 */
public class SectorView extends View {

    public SectorView(Context context) {
        super(context);
    }

    public SectorView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 创建画笔
        Paint p = new Paint();
        p.setColor(Color.BLACK);
        RectF rectF = new RectF(60, 100, 200, 240);
        canvas.drawArc(rectF, 200, 130, true, p);
    }
}
