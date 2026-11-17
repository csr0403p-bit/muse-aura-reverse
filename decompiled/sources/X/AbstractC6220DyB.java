package X;

import android.media.metrics.LogSessionId;

/* renamed from: X.DyB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6220DyB {
    public static void A00(E6Y e6y, C6217Dy7 c6217Dy7) {
        LogSessionId logSessionIdA00 = e6y.A00();
        if (logSessionIdA00.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        c6217Dy7.A01.setString("log-session-id", logSessionIdA00.getStringId());
    }
}
