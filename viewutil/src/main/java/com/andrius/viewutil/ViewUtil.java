package com.andrius.viewutil;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;

public class ViewUtil {

    public static String getText(TextView tv) {
        return tv.getText().toString();
    }

    public static int getNumber(TextView tv) {
        String text = tv.getText().toString();
        return text.isEmpty() ? 0 : Integer.valueOf(text);
    }

    public static void setText(TextView tv, String text) {
        if (text == null) text = "";
        tv.setText(text);
    }

    public static void setTextHideEmpty(TextView tv, String text) {
        if (text == null) text = "";
        tv.setText(text);
        tv.setVisibility(text.trim().isEmpty() ? View.GONE : View.VISIBLE);
    }

    public static void setBackgroundTint(View view, int color) {
        Drawable background = view.getBackground();
        background.mutate().setColorFilter(color, PorterDuff.Mode.SRC_IN);
    }
}
