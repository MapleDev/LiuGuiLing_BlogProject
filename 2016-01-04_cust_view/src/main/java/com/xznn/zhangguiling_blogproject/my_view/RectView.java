package com.xznn.zhangguiling_blogproject.my_view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * 矩形
 * Created by LGL on 2016/1/7.
 */
public class RectView extends View {

    //无参
    public RectView(Context context) {
        super(context);
    }

    //有参
    public RectView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 创建画笔
        Paint p = new Paint();
        //设置实心
        p.setStyle(Paint.Style.FILL);
        // 设置红色
        p.setColor(Color.BLACK);
        // 设置画笔的锯齿效果
        p.setAntiAlias(true);
        //绘制
        canvas.drawRect(50, 100, 300, 300, p);

    }
}
