package com.facebook.aura.analytics.hatch;

import X.AnonymousClass003;

/* loaded from: classes5.dex */
public final class CvmRun {
    public final String clientCvmUuid;
    public final CvmAttribution vm;

    public final String getClientCvmUuid() {
        return this.clientCvmUuid;
    }

    public final CvmAttribution getVm() {
        return this.vm;
    }

    public CvmRun(CvmAttribution cvmAttribution, String str) {
        AnonymousClass003.A0u(cvmAttribution, str);
        this.vm = cvmAttribution;
        this.clientCvmUuid = str;
    }
}
