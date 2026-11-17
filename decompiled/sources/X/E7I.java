package X;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* loaded from: classes5.dex */
public abstract class E7I {
    public static void A00(AudioTrack audioTrack, E6Y e6y) {
        LogSessionId logSessionIdA00 = e6y.A00();
        if (logSessionIdA00.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        audioTrack.setLogSessionId(logSessionIdA00);
    }
}
