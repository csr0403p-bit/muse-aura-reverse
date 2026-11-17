package com.facebook.aura.battery;

import X.C3581CVc;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class AuraBatteryEventSnapshot {
    public final long appInstanceId;
    public final long currentSequence;
    public final boolean isAppInForeground;
    public final C3581CVc metrics;

    public AuraBatteryEventSnapshot(C3581CVc c3581CVc, boolean z, long j, long j2) {
        C7384Etj.A0Y(c3581CVc, 0);
        this.metrics = c3581CVc;
        this.isAppInForeground = z;
        this.appInstanceId = j;
        this.currentSequence = j2;
    }

    public final long getAppInstanceId() {
        return this.appInstanceId;
    }

    public final long getCurrentSequence() {
        return this.currentSequence;
    }

    public final C3581CVc getMetrics() {
        return this.metrics;
    }

    public final boolean isAppInForeground() {
        return this.isAppInForeground;
    }
}
