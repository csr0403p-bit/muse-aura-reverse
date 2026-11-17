package com.facebook.aura.analytics.hatch;

import com.facebook.aura.analytics.impl.AnalyticsEventReceivedListener;

/* loaded from: classes3.dex */
public final class HatchDeviceInfoBackgroundTrigger implements AnalyticsEventReceivedListener {
    public static final int $stable = 0;
    public static final HatchDeviceInfoBackgroundTrigger INSTANCE = new HatchDeviceInfoBackgroundTrigger();

    @Override // com.facebook.aura.analytics.impl.AnalyticsEventReceivedListener
    public void onAnalyticsEventReceived() {
        HatchDeviceInfoLogger.INSTANCE.onBackgroundAnalyticsEvent();
    }
}
