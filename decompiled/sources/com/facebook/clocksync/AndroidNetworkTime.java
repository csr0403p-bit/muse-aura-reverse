package com.facebook.clocksync;

import android.os.SystemClock;
import java.time.DateTimeException;

/* loaded from: classes3.dex */
public final class AndroidNetworkTime {
    public static final AndroidNetworkTime INSTANCE = new AndroidNetworkTime();

    public static final long[] read() {
        try {
            return new long[]{SystemClock.elapsedRealtime(), SystemClock.currentNetworkTimeClock().millis(), SystemClock.elapsedRealtime()};
        } catch (DateTimeException unused) {
            return null;
        }
    }
}
