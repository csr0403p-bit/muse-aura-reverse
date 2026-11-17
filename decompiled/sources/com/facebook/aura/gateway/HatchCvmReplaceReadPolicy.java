package com.facebook.aura.gateway;

import X.AbstractC3358CGz;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.CFK;
import X.InterfaceC7549F2g;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class HatchCvmReplaceReadPolicy implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final int MAX_PAUSE_DOUBLINGS = 4;
    public static final long MAX_RATE_LIMIT_PAUSE_MS = 300000;
    public static final long NOT_FOUND_PAUSE_MS = 900000;
    public static final long RATE_LIMIT_PAUSE_MS = 30000;
    public static final String TAG = "HatchCvmReplaceReadPolicy";
    public final Object lock;
    public final HashMap<String, Long> notFoundUntilMs;
    public int rateLimitStreak;
    public long rateLimitedUntilMs;

    public final HatchCvmReplaceReadBlock blockFor(String str, long j) {
        HatchCvmReplaceReadBlock hatchCvmReplaceReadBlock;
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            if (j < this.rateLimitedUntilMs) {
                hatchCvmReplaceReadBlock = HatchCvmReplaceReadBlock.RATE_LIMITED;
            } else {
                Long l = this.notFoundUntilMs.get(str);
                hatchCvmReplaceReadBlock = j < (l != null ? l.longValue() : 0L) ? HatchCvmReplaceReadBlock.NOT_FOUND : null;
            }
        }
        return hatchCvmReplaceReadBlock;
    }

    public final void onNotFound(String str, long j) {
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            this.notFoundUntilMs.put(str, Long.valueOf(j + 900000));
        }
    }

    public final void onReadSucceeded(String str) {
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            this.rateLimitStreak = 0;
            this.notFoundUntilMs.remove(str);
        }
    }

    public final void rearm(String str) {
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            this.notFoundUntilMs.remove(str);
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        synchronized (this.lock) {
            this.rateLimitedUntilMs = 0L;
            this.rateLimitStreak = 0;
            this.notFoundUntilMs.clear();
        }
    }

    public final void onRateLimited(long j) {
        long j2;
        synchronized (this.lock) {
            int i = this.rateLimitStreak;
            if (i > 4) {
                i = 4;
            }
            j2 = 30000 << i;
            if (j2 > 300000) {
                j2 = 300000;
            }
            this.rateLimitedUntilMs = Math.max(this.rateLimitedUntilMs, j + j2);
            this.rateLimitStreak = i + 1;
        }
        CFK.A0H(TAG, "cvm-replace-state rate limited; pausing reads for %d s", Long.valueOf(j2 / 1000));
    }

    public final class Companion {
        public final HatchCvmReplaceReadPolicy getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchCvmReplaceReadPolicy) abstractC3358CGz.A03(HatchCvmReplaceReadPolicy.class, HatchCvmReplaceReadPolicy$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ HatchCvmReplaceReadPolicy(C06H c06h) {
        this();
    }

    public HatchCvmReplaceReadPolicy() {
        this.lock = C3cG.A0T();
        this.notFoundUntilMs = new HashMap<>();
    }
}
