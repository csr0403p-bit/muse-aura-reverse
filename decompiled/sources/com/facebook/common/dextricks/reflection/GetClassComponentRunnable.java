package com.facebook.common.dextricks.reflection;

import X.ETi;
import android.util.Log;

/* loaded from: classes5.dex */
public class GetClassComponentRunnable implements Runnable {
    public final Class<?> clzz;
    public final int kind;
    public final String name;
    public Object result;
    public final String signature;

    @Override // java.lang.Runnable
    public native void run();

    static {
        if (ETi.A0A()) {
            ETi.loadLibrary("dextricks-early");
        } else {
            Log.w("GetClassComponentRunnable", "SoLoader not initialized, loading dextricks-early with System.loadLibrary");
            System.loadLibrary("dextricks-early");
        }
    }

    public GetClassComponentRunnable(Class<?> cls, String str, String str2, int i) {
        this.clzz = cls;
        this.name = str;
        this.signature = str2;
        this.kind = i;
    }
}
