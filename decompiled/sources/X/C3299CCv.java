package X;

import android.content.Context;

/* renamed from: X.CCv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3299CCv {
    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r3v0 X.CCv) */
    public static final synchronized CCw A00(Context context, C3299CCv c3299CCv) {
        CCw cCw;
        synchronized (c3299CCv) {
            C7384Etj.A0Y(context, 0);
            cCw = CCw.A00;
            if (cCw == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                cCw = new CCw(context, C3298CCu.A00(context));
                CCw.A00 = cCw;
            }
        }
        return cCw;
    }
}
