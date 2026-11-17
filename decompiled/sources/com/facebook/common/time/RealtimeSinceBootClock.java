package com.facebook.common.time;

import X.DK9;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class RealtimeSinceBootClock implements DK9 {
    public static final RealtimeSinceBootClock A00 = new RealtimeSinceBootClock();

    public static RealtimeSinceBootClock get() {
        return A00;
    }

    @Override // X.DK9
    public final long nowNanos() {
        return TimeUnit.MILLISECONDS.toNanos(now());
    }

    @Override // X.DK9
    public final long now() {
        return SystemClock.elapsedRealtime();
    }
}
