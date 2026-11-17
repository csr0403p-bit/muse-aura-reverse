package X;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* renamed from: X.Dho, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5397Dho {
    public static void A00(MediaDrm mediaDrm, E6Y e6y, byte[] bArr) {
        LogSessionId logSessionIdA00 = e6y.A00();
        if (logSessionIdA00.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(logSessionIdA00);
    }

    public static boolean A01(MediaDrm mediaDrm, String str, int i) {
        return mediaDrm.requiresSecureDecoder(str, i);
    }
}
