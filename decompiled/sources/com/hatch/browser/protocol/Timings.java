package com.hatch.browser.protocol;

import X.BV4;
import X.C06H;
import X.FGI;

/* loaded from: classes6.dex */
public final class Timings {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public int executionMs;
    public int observationMs;
    public int queuedMs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Timings) {
                Timings timings = (Timings) obj;
                if (this.queuedMs != timings.queuedMs || this.executionMs != timings.executionMs || this.observationMs != timings.observationMs) {
                }
            }
            return false;
        }
        return true;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* renamed from: copy-zly0blg$default, reason: not valid java name */
    public static /* synthetic */ Timings m3785copyzly0blg$default(Timings timings, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = timings.queuedMs;
        }
        if ((i4 & 2) != 0) {
            i2 = timings.executionMs;
        }
        if ((i4 & 4) != 0) {
            i3 = timings.observationMs;
        }
        return new Timings(i, i2, i3);
    }

    /* renamed from: component1-pVg5ArA, reason: not valid java name */
    public final int m3786component1pVg5ArA() {
        return this.queuedMs;
    }

    /* renamed from: component2-pVg5ArA, reason: not valid java name */
    public final int m3787component2pVg5ArA() {
        return this.executionMs;
    }

    /* renamed from: component3-pVg5ArA, reason: not valid java name */
    public final int m3788component3pVg5ArA() {
        return this.observationMs;
    }

    /* renamed from: copy-zly0blg, reason: not valid java name */
    public final Timings m3789copyzly0blg(int i, int i2, int i3) {
        return new Timings(i, i2, i3);
    }

    /* renamed from: getExecutionMs-pVg5ArA, reason: not valid java name */
    public final int m3790getExecutionMspVg5ArA() {
        return this.executionMs;
    }

    /* renamed from: getObservationMs-pVg5ArA, reason: not valid java name */
    public final int m3791getObservationMspVg5ArA() {
        return this.observationMs;
    }

    /* renamed from: getQueuedMs-pVg5ArA, reason: not valid java name */
    public final int m3792getQueuedMspVg5ArA() {
        return this.queuedMs;
    }

    public int hashCode() {
        return (((this.queuedMs * 31) + this.executionMs) * 31) + this.observationMs;
    }

    /* renamed from: setExecutionMs-WZ4Q5Ns, reason: not valid java name */
    public final void m3793setExecutionMsWZ4Q5Ns(int i) {
        this.executionMs = i;
    }

    /* renamed from: setObservationMs-WZ4Q5Ns, reason: not valid java name */
    public final void m3794setObservationMsWZ4Q5Ns(int i) {
        this.observationMs = i;
    }

    /* renamed from: setQueuedMs-WZ4Q5Ns, reason: not valid java name */
    public final void m3795setQueuedMsWZ4Q5Ns(int i) {
        this.queuedMs = i;
    }

    public String toString() {
        return FGI.A0k("Timings(queuedMs=", String.valueOf(BV4.A03(this.queuedMs)), ", executionMs=", String.valueOf(BV4.A03(this.executionMs)), ", observationMs=", String.valueOf(BV4.A03(this.observationMs)), ")");
    }

    public /* synthetic */ Timings(int i, int i2, int i3, C06H c06h) {
        this(i, i2, i3);
    }

    public Timings(int i, int i2, int i3) {
        this.queuedMs = i;
        this.executionMs = i2;
        this.observationMs = i3;
    }
}
