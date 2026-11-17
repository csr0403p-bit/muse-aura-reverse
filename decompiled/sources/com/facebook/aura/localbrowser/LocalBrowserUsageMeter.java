package com.facebook.aura.localbrowser;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class LocalBrowserUsageMeter {
    public static final int $stable = 8;
    public int active;
    public long since;
    public long totalMs;

    public final synchronized void start() {
        int i = this.active;
        this.active = i + 1;
        if (i == 0) {
            this.since = SystemClock.elapsedRealtime();
        }
    }

    public final synchronized void stop() {
        int i = this.active;
        if (i != 0) {
            int i2 = i - 1;
            this.active = i2;
            if (i2 == 0) {
                this.totalMs += SystemClock.elapsedRealtime() - this.since;
            }
        }
    }

    public final synchronized long take() {
        long j;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        j = this.totalMs + (this.active > 0 ? jElapsedRealtime - this.since : 0L);
        this.totalMs = 0L;
        this.since = jElapsedRealtime;
        return j;
    }
}
