package X;

import android.media.metrics.LogSessionId;

/* loaded from: classes5.dex */
public final class E70 {
    public LogSessionId A00 = LogSessionId.LOG_SESSION_ID_NONE;

    public final void A00(LogSessionId logSessionId) {
        C1G.A08(this.A00.equals(LogSessionId.LOG_SESSION_ID_NONE));
        this.A00 = logSessionId;
    }
}
