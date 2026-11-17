package X;

import android.app.ForegroundServiceStartNotAllowedException;

/* renamed from: X.Fr3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8846Fr3 {
    public static ForegroundServiceStartNotAllowedException A00(IllegalStateException illegalStateException) {
        return (ForegroundServiceStartNotAllowedException) illegalStateException;
    }

    public static boolean A01(IllegalStateException illegalStateException) {
        return illegalStateException instanceof ForegroundServiceStartNotAllowedException;
    }
}
