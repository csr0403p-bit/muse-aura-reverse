package X;

import android.os.SystemClock;

/* loaded from: classes6.dex */
public abstract class Hs5 {
    public final long A00() {
        return this instanceof C10591Hxe ? SystemClock.elapsedRealtime() * 1000000 : SystemClock.elapsedRealtimeNanos();
    }
}
