package com.xznn.zhangguiling_blogproject.my_view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Administrator on 16/10/02.
 */

public class MyView extends View {

    private Paint mPaint;

    public MyView(Context context) {
        super(context);
        Log.d("DDD", "====== MyView(Context context) ======");
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Log.d("DDD", "====== MyView(Context context, AttributeSet attrs) ======");
        mPaint = new Paint();
        mPaint.setColor(Color.RED);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.d("DDD", "====== onMeasure() ======");
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        Log.d("DDD", "====== getAccessibilityClassName() ======");
        return super.getAccessibilityClassName();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d("DDD", "====== onDetachedFromWindow() ======");
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.d("DDD", "====== onLayout() ======");
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("DDD", "====== onTouchEvent() ======");
        return super.onTouchEvent(event);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d("DDD", "====== onAttachedToWindow() ======");
    }

    @Override
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Log.d("DDD", "====== drawableStateChanged() ======");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d("DDD", "====== onDraw() ======");
        canvas.drawLine(0, 0, 100, 100, mPaint);
    }

    @Override
    protected void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(state);
        Log.d("DDD", "====== onRestoreInstanceState() ======");
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        Log.d("DDD", "====== onSaveInstanceState() ======");
        return super.onSaveInstanceState();
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Log.d("DDD", "====== draw() ======");
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        Log.d("DDD", "====== onSizeChanged() ======");
    }
}
