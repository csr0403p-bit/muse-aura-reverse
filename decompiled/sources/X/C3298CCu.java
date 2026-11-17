package X;

import android.content.Context;

/* renamed from: X.CCu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3298CCu {
    public static CCz A00;

    public static final synchronized CCz A00(Context context) {
        CCz cCz;
        C7384Etj.A0Y(context, 0);
        cCz = A00;
        if (cCz == null) {
            cCz = new CCz(context);
            A00 = cCz;
        }
        return cCz;
    }
}
