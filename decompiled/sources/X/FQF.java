package X;

import android.os.SystemClock;

/* loaded from: classes6.dex */
public final class FQF implements DK9 {
    public static final FQF A00 = new FQF();

    @Override // X.DK9
    public final long now() {
        return SystemClock.elapsedRealtime();
    }

    @Override // X.DK9
    public final long nowNanos() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
