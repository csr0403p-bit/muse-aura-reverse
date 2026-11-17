package com.facebook.aura.qpl.xanalytics;

import com.facebook.xanalytics.XAnalyticsAdapter;

/* loaded from: classes5.dex */
public final class AuraXAnalyticsAdapter implements XAnalyticsAdapter {
    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public void cleanup() {
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public void flush() {
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public String getStructureSamplingConfig(String str) {
        return "";
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public boolean shouldLog(String str) {
        return true;
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public void logCounter(String str, double d) {
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public void logEventBypassSampling(String str, String str2) {
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public void logEvent(String str, String str2, String str3, boolean z, double d) {
    }

    @Override // com.facebook.xanalytics.XAnalyticsAdapter
    public void logCounter(String str, double d, String str2) {
    }
}
