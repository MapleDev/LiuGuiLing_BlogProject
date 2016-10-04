package com.xznn.zhangguiling_blogproject.my_view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.xznn.zhangguiling_blogproject.R;

/**
 * Created by LGL on 2016/1/8.
 */
public class TvIvView extends View {
    public TvIvView(Context context) {
        super(context);
    }

    public TvIvView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint p = new Paint();
        p.setColor(Color.RED);

        //文本
        canvas.drawText("自定义文本", 250, 330, p);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        //图片
        canvas.drawBitmap(bitmap, 250, 360, p);
    }
}
