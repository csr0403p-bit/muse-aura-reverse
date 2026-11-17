package X;

import android.content.Context;

/* loaded from: classes5.dex */
public final class CUF {
    public static final CUF A01 = new CUF();
    public CUG A00 = null;

    public static CUG A00(Context context) {
        CUG cug;
        CUF cuf = A01;
        synchronized (cuf) {
            cug = cuf.A00;
            if (cug == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                cug = new CUG(context);
                cuf.A00 = cug;
            }
        }
        return cug;
    }
}
