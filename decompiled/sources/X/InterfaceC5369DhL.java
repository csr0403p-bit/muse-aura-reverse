package X;

import android.net.Uri;
import java.io.IOException;

/* renamed from: X.DhL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC5369DhL extends Du7 {
    void onErrorRecoveryAttempt(IOException iOException, String str, String str2);

    void onImfEventEmsgReceived(byte[] bArr, String str, long j);

    void onLiveTraceEventMessage(Uri uri, String str);

    void onManifestLoadCompleted(C5893Dra c5893Dra, Object obj, Object obj2);

    void onTrackSelectionFallback(C6154Dwx c6154Dwx, C6154Dwx c6154Dwx2, String str, String str2, IOException iOException);
}
