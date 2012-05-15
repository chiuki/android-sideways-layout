package com.sqisland.android.sideways_layout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class SidewaysLayout extends LinearLayout {

  public SidewaysLayout(Context context) {
    super(context);
  }

  public SidewaysLayout(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public SidewaysLayout(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
  }

  @Override
  protected void onMeasure(int widthSpec, int heightSpec) {
    super.onMeasure(widthSpec, heightSpec);
    setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
  }

  @Override
  protected void dispatchDraw(Canvas canvas) {
    canvas.save();
    canvas.translate(0, getHeight());
    canvas.rotate(-90, 0, 0);
    super.dispatchDraw(canvas);
    canvas.restore();
  }
}
