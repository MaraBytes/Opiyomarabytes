package com.opiyo.marabytes;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class Opiyomarabytespassword extends RelativeLayout {
    public Opiyomarabytespassword(Context context) {
        super(context);
        init();
    }

    public Opiyomarabytespassword(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.lay2, this);
    }
}
