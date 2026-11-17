package com.facebook.aura.shopping.viewmodel;

import android.os.SystemClock;

/* loaded from: classes4.dex */
public final class SelectionBudget {
    public static final int $stable = 0;
    public final long deadlineElapsedMs = SystemClock.elapsedRealtime() + 8000;

    public final long getRemainingMs() {
        long jElapsedRealtime = this.deadlineElapsedMs - SystemClock.elapsedRealtime();
        if (jElapsedRealtime < 0) {
            return 0L;
        }
        return jElapsedRealtime;
    }
}
