package com.xznn.zhangguiling_blogproject.my_view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by Administrator on 16/10/04.
 */
/**
 * 圆
 * Created by LGL on 2016/1/7.
 */
public class CircleView extends View {

    int width;
    int height;

    //无参
    public CircleView(Context context) {
        super(context);
        init();
    }

    //有参
    public CircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        //获取屏幕的宽高
        //Android绘图机制（一）——自定义View的基础属性和方法里面有讲
        WindowManager wm = (WindowManager) getContext()
                .getSystemService(Context.WINDOW_SERVICE);

        width = wm.getDefaultDisplay().getWidth();
        height = wm.getDefaultDisplay().getHeight();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint p = new Paint();
        p.setColor(Color.BLACK);
        // 设置画笔的锯齿效果
        p.setAntiAlias(true);
        canvas.drawCircle(width / 2, height / 2, width / 2, p);
    }
}