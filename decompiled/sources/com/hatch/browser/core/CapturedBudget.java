package com.hatch.browser.core;

import X.BMp;
import X.BV4;
import X.C06H;
import X.C7384Etj;
import android.os.SystemClock;
import com.hatch.browser.protocol.Budget;

/* loaded from: classes6.dex */
public final class CapturedBudget {
    public final long capturedNanos;
    public final Budget original;
    public static final Companion Companion = new Companion();
    public static final int $stable = Budget.$stable;

    public final class Companion {
        public final CapturedBudget captureAtReceipt(Budget budget) {
            C7384Etj.A0Y(budget, 0);
            return new CapturedBudget(budget, SystemClock.elapsedRealtimeNanos());
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public CapturedBudget(Budget budget, long j) {
        this.original = budget;
        this.capturedNanos = j;
    }

    public final Budget forExecution() {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - this.capturedNanos;
        if (jElapsedRealtimeNanos < 0) {
            jElapsedRealtimeNanos = 0;
        }
        long j = jElapsedRealtimeNanos / 1000000;
        Budget budget = this.original;
        long jA03 = BV4.A03(budget.remainingMs);
        return new Budget(BMp.A01(j, jA03) >= 0 ? 0 : (int) (jA03 - j), budget.expiresAtUnixMs);
    }

    public /* synthetic */ CapturedBudget(Budget budget, long j, C06H c06h) {
        this(budget, j);
    }
}
