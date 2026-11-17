package androidx.media3.common;

import android.os.Bundle;

/* loaded from: classes5.dex */
public class PlaybackException extends Exception {
    public final int errorCode;
    public final Bundle extras;
    public final long timestampMs;

    public PlaybackException(Bundle bundle, String str, Throwable th, int i, long j) {
        super(str, th);
        this.errorCode = i;
        this.extras = bundle;
        this.timestampMs = j;
    }
}
