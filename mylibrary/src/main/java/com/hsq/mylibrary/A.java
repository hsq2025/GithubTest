package com.hsq.mylibrary;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by Administrator on 2018/5/10.
 */

public class A extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("sfd水电费sdfdfsdfgadfsdd ");
        setContentView(textView);
    }
}
