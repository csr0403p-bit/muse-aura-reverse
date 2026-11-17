package androidx.media3.exoplayer;

import X.C6154Dwx;
import X.Dy6;
import X.FGI;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class ExoPlaybackException extends PlaybackException {
    public final boolean isRecoverable;
    public final Dy6 mediaPeriodId;
    public final C6154Dwx rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final int type;

    public static ExoPlaybackException A00(IOException iOException, int i) {
        return new ExoPlaybackException(null, null, TextUtils.isEmpty(null) ? "Source error" : FGI.A0U("Source error", ": ", null), null, iOException, i, 0, -1, 4, SystemClock.elapsedRealtime(), false);
    }

    public static ExoPlaybackException A01(RuntimeException runtimeException, int i) {
        return new ExoPlaybackException(null, null, TextUtils.isEmpty(null) ? "Unexpected runtime error" : FGI.A0U("Unexpected runtime error", ": ", null), null, runtimeException, i, 2, -1, 4, SystemClock.elapsedRealtime(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ExoPlaybackException(X.C6154Dwx r12, X.Dy6 r13, java.lang.String r14, java.lang.String r15, java.lang.Throwable r16, int r17, int r18, int r19, int r20, long r21, boolean r23) {
        /*
            r11 = this;
            android.os.Bundle r6 = android.os.Bundle.EMPTY
            r5 = r11
            r7 = r14
            r8 = r16
            r9 = r17
            r10 = r21
            r5.<init>(r6, r7, r8, r9, r10)
            r2 = 0
            r1 = 1
            r4 = r18
            r3 = r23
            if (r23 == 0) goto L18
            r0 = 0
            if (r4 != r1) goto L19
        L18:
            r0 = 1
        L19:
            X.C1G.A07(r0)
            if (r16 != 0) goto L21
            r0 = 3
            if (r4 != r0) goto L22
        L21:
            r2 = 1
        L22:
            X.C1G.A07(r2)
            r5.type = r4
            r5.rendererName = r15
            r0 = r19
            r5.rendererIndex = r0
            r5.rendererFormat = r12
            r0 = r20
            r5.rendererFormatSupport = r0
            r5.mediaPeriodId = r13
            r5.isRecoverable = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlaybackException.<init>(X.Dwx, X.Dy6, java.lang.String, java.lang.String, java.lang.Throwable, int, int, int, int, long, boolean):void");
    }

    public final ExoPlaybackException A02(Dy6 dy6) {
        String message = getMessage();
        Throwable cause = getCause();
        int i = this.errorCode;
        int i2 = this.type;
        return new ExoPlaybackException(this.rendererFormat, dy6, message, this.rendererName, cause, i, i2, this.rendererIndex, this.rendererFormatSupport, this.timestampMs, this.isRecoverable);
    }
}
