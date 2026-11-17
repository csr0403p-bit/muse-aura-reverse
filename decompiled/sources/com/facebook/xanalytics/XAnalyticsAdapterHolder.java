package com.facebook.xanalytics;

import X.AnonymousClass003;
import X.AnonymousClass004;
import X.C3463COl;
import X.C5065DTb;
import X.C60P;
import X.C7384Etj;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public final class XAnalyticsAdapterHolder extends XAnalyticsHolder {
    public static final C5065DTb Companion = new C5065DTb();
    public final XAnalyticsAdapter adapter;

    public static final native HybridData initHybrid(XAnalyticsAdapter xAnalyticsAdapter);

    public final String getStructureSamplingConfig(String str) {
        C7384Etj.A0Y(str, 0);
        return this.adapter.getStructureSamplingConfig(str);
    }

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public void logCounter(String str, long j) {
        C7384Etj.A0Y(str, 0);
        this.adapter.logCounter(str, j, "counters");
    }

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public void logRealtimeEvent(String str, String str2) {
        this.adapter.logEvent(str, str2, null, C60P.A1Y(str, str2), -1.0d);
    }

    static {
        C3463COl.loadLibrary("xanalyticsadapter-jni");
    }

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public void cleanup() {
        this.adapter.cleanup();
    }

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public void flush() {
        this.adapter.flush();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public XAnalyticsAdapterHolder(XAnalyticsAdapter xAnalyticsAdapter) {
        HybridData hybridDataInitHybrid = initHybrid(xAnalyticsAdapter);
        C7384Etj.A0X(hybridDataInitHybrid);
        super(hybridDataInitHybrid);
        this.adapter = xAnalyticsAdapter;
    }

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public void logEvent(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        logEvent(str, str2, null);
    }

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public void logCounter(String str, long j, String str2) {
        AnonymousClass003.A0v(str, str2);
        this.adapter.logCounter(str, j, str2);
    }

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public void logEvent(String str, String str2, String str3) {
        this.adapter.logEvent(str, str2, str3, AnonymousClass004.A1b(str, str2), -1.0d);
    }

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public void logRealtimeEvent(String str, String str2, String str3) {
        this.adapter.logEvent(str, str2, str3, C60P.A1Y(str, str2), -1.0d);
    }
}
