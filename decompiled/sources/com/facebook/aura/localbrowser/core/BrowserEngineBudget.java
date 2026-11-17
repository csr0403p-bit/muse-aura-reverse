package com.facebook.aura.localbrowser.core;

import X.ATD;
import X.BV4;
import X.C06H;
import X.C7384Etj;
import android.os.SystemClock;
import com.hatch.browser.core.CapturedBudget;
import com.hatch.browser.protocol.Budget;

/* loaded from: classes6.dex */
public final class BrowserEngineBudget {
    public final CapturedBudget captured;
    public static final Companion Companion = new Companion();
    public static final int $stable = CapturedBudget.$stable;

    public final class Companion {
        public final BrowserEngineBudget capture(long j) {
            return new BrowserEngineBudget(new CapturedBudget(new Budget((int) ATD.A07(j, 0L, 4294967295L), null), SystemClock.elapsedRealtimeNanos()));
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public final BrowserEngineBudget capture(Budget budget) {
            C7384Etj.A0Y(budget, 0);
            return new BrowserEngineBudget(new CapturedBudget(budget, SystemClock.elapsedRealtimeNanos()));
        }
    }

    public final Budget forExecution$fbandroid_express_aura_java_com_facebook_aura_localbrowser_core_core() {
        return this.captured.forExecution();
    }

    public final long getRemainingMs() {
        return BV4.A03(this.captured.forExecution().remainingMs);
    }

    public BrowserEngineBudget(CapturedBudget capturedBudget) {
        this.captured = capturedBudget;
    }

    public /* synthetic */ BrowserEngineBudget(CapturedBudget capturedBudget, C06H c06h) {
        this(capturedBudget);
    }
}
