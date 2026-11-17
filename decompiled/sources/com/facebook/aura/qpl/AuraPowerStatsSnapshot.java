package com.facebook.aura.qpl;

import X.C3177C1g;
import X.C7384Etj;

/* loaded from: classes5.dex */
public final class AuraPowerStatsSnapshot {
    public final Long dozeExitMsAgo;
    public final String dozeMode;
    public final C3177C1g power;

    public AuraPowerStatsSnapshot(C3177C1g c3177C1g, String str, Long l) {
        C7384Etj.A0Y(c3177C1g, 0);
        this.power = c3177C1g;
        this.dozeMode = str;
        this.dozeExitMsAgo = l;
    }

    public final Long getDozeExitMsAgo() {
        return this.dozeExitMsAgo;
    }

    public final String getDozeMode() {
        return this.dozeMode;
    }

    public final C3177C1g getPower() {
        return this.power;
    }
}
