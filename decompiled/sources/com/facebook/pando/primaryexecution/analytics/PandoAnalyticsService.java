package com.facebook.pando.primaryexecution.analytics;

import X.ETi;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;

/* loaded from: classes5.dex */
public final class PandoAnalyticsService extends PandoPrimaryExecution {
    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, int i);

    static {
        ETi.loadLibrary("pando-client-analytics-jni");
    }
}
