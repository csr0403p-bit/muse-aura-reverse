package com.facebook.traffic.nts;

import X.ETi;

/* loaded from: classes6.dex */
public final class TrafficNTSModule {
    public static final TrafficNTSModule INSTANCE = new TrafficNTSModule();

    public static final void loadLibrary() {
        ETi.loadLibrary("trafficntsmanager");
    }
}
