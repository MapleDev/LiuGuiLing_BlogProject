package com.xznn.zhangguiling_blogproject.my_view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by LGL on 2016/1/8.
 */
public class PathView extends View {

    public PathView(Context context) {
        super(context);
    }

    public PathView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 创建画笔
        Paint p = new Paint();
        p.setColor(Color.BLACK);

        p.reset();
        //设置空心
        p.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.moveTo(100, 320);//设置Path的起点
        path.quadTo(150, 310, 170, 400);  //设置路径点和终点
        canvas.drawPath(path, p);
    }
}
