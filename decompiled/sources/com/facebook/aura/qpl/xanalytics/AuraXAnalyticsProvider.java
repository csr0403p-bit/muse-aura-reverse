package com.facebook.aura.qpl.xanalytics;

import X.AbstractC5321DgF;
import X.C79;
import X.DJU;
import X.F0C;
import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.facebook.xanalytics.XAnalyticsHolder;

/* loaded from: classes5.dex */
public final class AuraXAnalyticsProvider implements DJU {
    public static final AuraXAnalyticsProvider INSTANCE = new AuraXAnalyticsProvider();
    public static final F0C analyticsAdapterHolder$delegate = AbstractC5321DgF.A02(C79.A0C, AuraXAnalyticsProvider$analyticsAdapterHolder$2.INSTANCE);

    private final XAnalyticsAdapterHolder getAnalyticsAdapterHolder() {
        return (XAnalyticsAdapterHolder) analyticsAdapterHolder$delegate.getValue();
    }

    @Override // X.DJU
    public XAnalyticsHolder getXAnalyticsNative() {
        return (XAnalyticsHolder) analyticsAdapterHolder$delegate.getValue();
    }
}
