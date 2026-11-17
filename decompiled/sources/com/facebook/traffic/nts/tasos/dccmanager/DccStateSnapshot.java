package com.facebook.traffic.nts.tasos.dccmanager;

import X.C7384Etj;

/* loaded from: classes6.dex */
public final class DccStateSnapshot {
    public final boolean active;
    public final String constraintLevel;
    public final double cpuUtil;
    public final boolean dccGrantPresent;
    public final boolean dccManaged;
    public final int dccMitigationsAllowed;
    public final int dccMitigationsApplied;
    public final int mode;

    public DccStateSnapshot(boolean z, String str, int i, boolean z2, int i2, int i3, boolean z3, double d) {
        C7384Etj.A0Y(str, 1);
        this.active = z;
        this.constraintLevel = str;
        this.mode = i;
        this.dccManaged = z2;
        this.dccMitigationsApplied = i2;
        this.dccMitigationsAllowed = i3;
        this.dccGrantPresent = z3;
        this.cpuUtil = d;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getConstraintLevel() {
        return this.constraintLevel;
    }

    public final double getCpuUtil() {
        return this.cpuUtil;
    }

    public final boolean getDccGrantPresent() {
        return this.dccGrantPresent;
    }

    public final boolean getDccManaged() {
        return this.dccManaged;
    }

    public final int getDccMitigationsAllowed() {
        return this.dccMitigationsAllowed;
    }

    public final int getDccMitigationsApplied() {
        return this.dccMitigationsApplied;
    }

    public final int getMode() {
        return this.mode;
    }
}
