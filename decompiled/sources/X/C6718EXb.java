package X;

import android.os.SystemClock;

/* renamed from: X.EXb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6718EXb {
    public final long A00 = SystemClock.elapsedRealtime();

    public C6718EXb() {
    }

    public final long A00() {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
        if (jElapsedRealtime < 0) {
            return 0L;
        }
        return jElapsedRealtime;
    }

    public /* synthetic */ C6718EXb(long j, int i, C06H c06h) {
    }
}
