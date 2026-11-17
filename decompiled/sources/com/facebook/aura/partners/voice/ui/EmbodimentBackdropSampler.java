package com.facebook.aura.partners.voice.ui;

import X.C06H;
import X.C3cG;
import java.util.List;

/* loaded from: classes4.dex */
public final class EmbodimentBackdropSampler {
    public static final int $stable = 8;
    public final List<Integer> accepted;
    public final int acceptedTarget;
    public int attempts;
    public final long backoffIntervalMs;
    public boolean finished;
    public final long intervalMs;
    public long lastAttemptMs;
    public long lastEdgeCycleMs;
    public final int maxAttempts;
    public final int strictAttempts;

    public /* synthetic */ EmbodimentBackdropSampler(int i, int i2, int i3, long j, long j2, int i4, C06H c06h) {
        this((i4 & 1) != 0 ? 8 : i, (i4 & 2) != 0 ? 12 : i2, (i4 & 4) != 0 ? 4 : i3, (i4 & 8) != 0 ? 40L : j, (i4 & 16) != 0 ? 500L : j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[PHI: r4
  0x0049: PHI (r4v1 boolean) = (r4v0 boolean), (r4v2 boolean), (r4v2 boolean) binds: [B:8:0x0021, B:10:0x002b, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[PHI: r2
  0x004c: PHI (r2v2 boolean) = (r2v0 boolean), (r2v3 boolean) binds: [B:14:0x004a, B:12:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer completeSample(java.lang.Integer r8) {
        /*
            r7 = this;
            boolean r0 = r7.finished
            r6 = 0
            if (r0 != 0) goto L6f
            int r0 = r7.attempts
            r3 = 1
            int r0 = r0 + 1
            r7.attempts = r0
            if (r8 == 0) goto L1b
            java.util.List<java.lang.Integer> r1 = r7.accepted
            int r0 = r8.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
        L1b:
            int r1 = r7.attempts
            int r0 = r7.strictAttempts
            r5 = 0
            r4 = 0
            if (r1 > r0) goto L49
            r4 = 1
            java.util.List<java.lang.Integer> r0 = r7.accepted
            int r1 = r0.size()
            r0 = 2
            if (r1 < r0) goto L49
            java.util.List<java.lang.Integer> r1 = r7.accepted
            int r0 = X.AnonymousClass002.A0E(r1)
            int r0 = r0 - r3
            int r1 = X.C8j4.A0H(r1, r0)
            java.util.List<java.lang.Integer> r0 = r7.accepted
            java.lang.Object r0 = X.AbstractC0878AGe.A0H(r0)
            int r0 = X.AnonymousClass001.A0F(r0)
            boolean r0 = com.facebook.aura.partners.voice.ui.HatchEmbodimentVideoKt.backdropColorsConverged(r1, r0)
            r2 = 1
            if (r0 != 0) goto L4c
        L49:
            r2 = 0
            if (r4 == 0) goto L5b
        L4c:
            int r1 = r7.attempts
            int r0 = r7.strictAttempts
            if (r1 < r0) goto L5b
            java.util.List<java.lang.Integer> r0 = r7.accepted
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5b
            r5 = 1
        L5b:
            java.util.List<java.lang.Integer> r0 = r7.accepted
            int r1 = r0.size()
            int r0 = r7.acceptedTarget
            if (r1 >= r0) goto L70
            if (r2 != 0) goto L70
            if (r5 != 0) goto L70
            int r1 = r7.attempts
            int r0 = r7.maxAttempts
            if (r1 >= r0) goto L70
        L6f:
            return r6
        L70:
            r7.finished = r3
            java.util.List<java.lang.Integer> r1 = r7.accepted
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L6f
            int r0 = com.facebook.aura.partners.voice.ui.HatchEmbodimentVideoKt.medianBackdropColor(r1)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.ui.EmbodimentBackdropSampler.completeSample(java.lang.Integer):java.lang.Integer");
    }

    public final long edgeSampleDelayMs(long j, boolean z) {
        if (!z) {
            long j2 = this.lastEdgeCycleMs;
            if (j2 != Long.MIN_VALUE) {
                long j3 = 250 - (j - j2);
                if (j3 < 0) {
                    return 0L;
                }
                return j3;
            }
        }
        return 0L;
    }

    public final boolean isFinished() {
        return this.finished;
    }

    public final void reset() {
        this.accepted.clear();
        this.attempts = 0;
        this.lastAttemptMs = Long.MIN_VALUE;
        this.lastEdgeCycleMs = Long.MIN_VALUE;
        this.finished = false;
    }

    public final void resetEdgeCycle() {
        this.lastEdgeCycleMs = Long.MIN_VALUE;
    }

    public final Boolean sampleStrictness(long j) {
        int i;
        boolean z;
        long j2;
        if (!this.finished && (i = this.attempts) < this.maxAttempts) {
            if (i < this.strictAttempts) {
                z = true;
                j2 = this.intervalMs;
            } else {
                z = false;
                j2 = this.backoffIntervalMs;
            }
            long j3 = this.lastAttemptMs;
            if (j3 == Long.MIN_VALUE || j - j3 >= j2) {
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    public final void startEdgeCycle(long j) {
        this.lastEdgeCycleMs = j;
    }

    public final void startSample(long j) {
        this.lastAttemptMs = j;
    }

    public EmbodimentBackdropSampler(int i, int i2, int i3, long j, long j2) {
        this.strictAttempts = i;
        this.maxAttempts = i2;
        this.acceptedTarget = i3;
        this.intervalMs = j;
        this.backoffIntervalMs = j2;
        this.accepted = C3cG.A0h();
        this.lastAttemptMs = Long.MIN_VALUE;
        this.lastEdgeCycleMs = Long.MIN_VALUE;
    }

    public EmbodimentBackdropSampler() {
        this(8, 12, 4, 40L, 500L);
    }
}
