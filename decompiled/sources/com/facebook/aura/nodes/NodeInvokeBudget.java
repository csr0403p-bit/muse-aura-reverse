package com.facebook.aura.nodes;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class NodeInvokeBudget {
    public final long replyByElapsedMs;

    public final long cardDeadlineElapsedMs(long j) {
        return (this.replyByElapsedMs - 3000) - j;
    }

    public final long remainingMs() {
        long jElapsedRealtime = this.replyByElapsedMs - SystemClock.elapsedRealtime();
        if (jElapsedRealtime < 1) {
            return 1L;
        }
        return jElapsedRealtime;
    }

    public NodeInvokeBudget(long j, long j2) {
        this.replyByElapsedMs = j + j2;
    }

    public final boolean isExpired() {
        return SystemClock.elapsedRealtime() >= this.replyByElapsedMs;
    }
}
