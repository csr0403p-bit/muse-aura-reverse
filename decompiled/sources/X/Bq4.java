package X;

import android.content.Context;

/* loaded from: classes5.dex */
public abstract class Bq4 {
    public static int A00(Context context) {
        return context.getDeviceId();
    }

    public static Context A01(Context context, int i) {
        return context.createDeviceContext(i);
    }
}
