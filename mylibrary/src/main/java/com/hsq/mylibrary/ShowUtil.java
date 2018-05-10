package com.hsq.mylibrary;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/4/13.
 */

public class ShowUtil {
    public static void showShortToast(Context context, String msg) {
        Toast.makeText(context, msg + "", Toast.LENGTH_SHORT).show();
    }

    public static void showLongToast(Context context, String msg) {
        Toast.makeText(context, msg + "", Toast.LENGTH_LONG).show();
    }

    public static void showLog(Context context, Object msg) {
        Log.i("测试", msg + "");
    }
}
