package com.opiyo.marabytes;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class Opiyomarabytesemail extends RelativeLayout {
    public Opiyomarabytesemail(Context context) {
        super(context);
        init();
    }

    public Opiyomarabytesemail(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.lay1, this);
    }
}
