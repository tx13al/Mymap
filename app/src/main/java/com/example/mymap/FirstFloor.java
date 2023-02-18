package com.example.mymap;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class FirstFloor extends View {

    private Paint paint;
    private int width;
    private int height;


    public FirstFloor(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setStrokeWidth(5f);
    }
    public void setPaintColor(int color) {
        paint.setColor(color);
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        width = getWidth();
        height = getHeight();

        canvas.drawLine(450, 200,450+110, 200, paint);

        canvas.drawLine(450+110, 200, 450+110+110, 200, paint);

        canvas.drawLine(450, 200, 450, 200+239, paint);
        canvas.drawLine(450+110+110, 200, 450+110+110, 200+239, paint);
        canvas.drawLine(450+(110+110)/2, 200, 450+(110+110)/2, 200+239, paint);
        canvas.drawLine(450, 200+239,450+220, 200+239, paint);
        canvas.drawLine(450, 200+239,450, 200+239+122, paint);
        canvas.drawLine(450, 200+239+122,450, 200+239+122+144, paint);
        //canvas.drawLine(450, 200+239+122+144,450, 200+239+122+144+837, paint);
        canvas.drawLine(450-91, 200+239+122+144+837,450-91, 200+239+122+144+837+266, paint);
        canvas.drawLine(450-91, 200+239+122+144+837,450, 200+239+122+144+837, paint);
        canvas.drawLine(450-91, 200+239+122+144+837+266,450-91+568, 200+239+122+144+837+266, paint);
        canvas.drawLine(450-91+568, 200+239+122+144+837,450-91+568, 200+239+122+144+837+266, paint);
        canvas.drawLine(450-91+568, 200+239+122+144+837,450-91+568-317, 200+239+122+144+837, paint);
        canvas.drawLine(450-91+568-317, 200+239+122+144+837-239,450-91+568-317, 200+239+122+144+837, paint);
        canvas.drawLine(450-91+568-317+75, 200+239+122+144+837-239-81,450-91+568-317+75, 200+239+122+144+837-239, paint);
        canvas.drawLine(450-91+568-317, 200+239+122+144+837-239-81,450-91+568-317, 200+239+122+144+837-239-81-236, paint);
        canvas.drawLine(450-91+568-317, 200+239+122+144+837-239-81-236,450+110+110, 200+239+122+144+837-239-81-236, paint);
        canvas.drawLine(450+110+110, 200+239+122+144+837-239-81-236,450+110+110, 200+239+122+144+81, paint);
        canvas.drawLine(450+110+110+60, 200+239+122+144,450+110+110+60, 200+239+122+144+81, paint);
        canvas.drawLine(450+110+110, 200+239+122+144,450+110+110, 200+239, paint);
        canvas.drawLine(450+110+110, 200+239+122+144,450+110+110+60, 200+239+122+144, paint);
        canvas.drawLine(450+110+110, 200+239+122+144+81,450+110+110+60, 200+239+122+144+81, paint);
        canvas.drawLine(450-91+568-317+75, 200+239+122+144+837-239-81,450-91+568-317, 200+239+122+144+837-239-81, paint);
        canvas.drawLine(450-91+568-317+75, 200+239+122+144+837-239,450-91+568-317, 200+239+122+144+837-239, paint);
        canvas.drawLine(450,200+239+122+76+68+52,450-120,200+239+122+76+68+52,paint);
        canvas.drawLine(450-120,200+239+122+76+68+52+195,450-120,200+239+122+76+68+52,paint);
        canvas.drawLine(450,200+239+122+76+68+52+195,450-120,200+239+122+76+68+52+195,paint);
        canvas.drawLine(450,200+239+122+76+68+52+195,450,200+239+122+76+68+52+195+590,paint);
        canvas.drawLine(450,200+239+122,450+61,200+239+122,paint);
        canvas.drawLine(450+61,200+239+122,450+61,200+239,paint);
        canvas.drawLine(450+61,200+239+122+144,450+61,200+239+122,paint);
        canvas.drawLine(450+61,200+239+122+144,450,200+239+122+144,paint);
        canvas.drawLine(450+110+110-133,200+239+110,450+110+110,200+239+110,paint);
        canvas.drawLine(450+110+110-133,200+239+110+47+11,450+110+110,200+239+110+47+11,paint);
        canvas.drawLine(450+110+110-133,200+239+122+144,450+110+110,200+239+122+144,paint);
        canvas.drawLine(450-120,200+239+122+144+52+78,450,200+239+122+144+52+78,paint);
        canvas.drawLine(450-120,200+239+122+144+52+78+39,450,200+239+122+144+52+78+39,paint);
        canvas.drawLine(450,200+239+122+144+52+78,450,200+239+122+144+52,paint);
        canvas.drawLine(450,200+239+122+144+52+78+39,450,200+239+122+144+52+78+39+78,paint);
        
    }
}
