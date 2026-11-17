package com.facebook.rtc.logging.connectfunnel.structuredlogger;

import X.C7384Etj;
import X.ETi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;

/* loaded from: classes6.dex */
public final class StructuredAnalyticsLoggerConverter {
    public static final StructuredAnalyticsLoggerConverter $redex_init_class = null;
    public final HybridData mHybridData;

    public StructuredAnalyticsLoggerConverter(XAnalyticsHolder xAnalyticsHolder) {
        C7384Etj.A0Y(xAnalyticsHolder, 0);
        this.mHybridData = initHybrid(xAnalyticsHolder);
    }

    public final native McfReference convertToMcfReference();

    public final native HybridData initHybrid(XAnalyticsHolder xAnalyticsHolder);

    static {
        ETi.loadLibrary("rtcstructuredloggerconverterjni");
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }
}
