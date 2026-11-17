package com.facebook.traffic.nts.tasos.tasosnetworkinfo;

import X.C06H;
import X.C7384Etj;
import X.ETi;
import com.facebook.jni.HybridData;
import com.facebook.traffic.nts.providers.radiosignal.TasosCellularMetrics;
import com.facebook.traffic.nts.providers.radiosignal.TasosWifiMetrics;

/* loaded from: classes5.dex */
public final class TasosNetworkInfo {
    public static final Companion Companion = new Companion();
    public final HybridData mHybridData;

    public TasosNetworkInfo(HybridData hybridData) {
        C7384Etj.A0Y(hybridData, 0);
        this.mHybridData = hybridData;
    }

    public final native TasosCellularMetrics getTasosCellularMetrics();

    public final native TasosWifiMetrics getTasosWifiMetrics();

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        ETi.loadLibrary("tasosnetworkinfo");
    }

    public final void releaseHybrid() {
        this.mHybridData.resetNative();
    }
}
