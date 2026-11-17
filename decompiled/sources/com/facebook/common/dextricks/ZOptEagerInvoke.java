package com.facebook.common.dextricks;

import X.BV4;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public class ZOptEagerInvoke {
    public static void run(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Class.forName("com.facebook.common.zopt.ZOpt").getMethod("notePostColdStart", Context.class, Boolean.class).invoke(null, context, null);
        } catch (Exception e) {
            throw BV4.A0e(e);
        }
    }
}
