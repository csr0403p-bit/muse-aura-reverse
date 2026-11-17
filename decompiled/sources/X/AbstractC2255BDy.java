package X;

import android.os.Looper;

/* renamed from: X.BDy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2255BDy {
    public static final long A00;

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        A00 = id;
    }
}
