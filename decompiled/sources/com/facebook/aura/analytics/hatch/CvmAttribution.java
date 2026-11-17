package com.facebook.aura.analytics.hatch;

import X.C7384Etj;

/* loaded from: classes5.dex */
public final class CvmAttribution {
    public final int sessionGeneration;
    public final String vmHostname;
    public final String vmId;

    public CvmAttribution(String str, String str2, int i) {
        C7384Etj.A0Y(str, 0);
        this.vmId = str;
        this.vmHostname = str2;
        this.sessionGeneration = i;
    }

    public final int getSessionGeneration() {
        return this.sessionGeneration;
    }

    public final String getVmHostname() {
        return this.vmHostname;
    }

    public final String getVmId() {
        return this.vmId;
    }
}
