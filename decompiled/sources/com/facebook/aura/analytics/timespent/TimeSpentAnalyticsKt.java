package com.facebook.aura.analytics.timespent;

import X.C5246DeB;
import X.C5249DeE;
import com.facebook.aura.analytics.timespent.config.TimeSpentMC;

/* loaded from: classes5.dex */
public abstract class TimeSpentAnalyticsKt {
    public static final String TAG = "TimeSpentAnalytics";

    public static final TimeSpentAnalytics providesTimeSpentAnalytics() {
        return ((TimeSpentMC) C5246DeB.A01(C5249DeE.A00(), 65557)).getBitArrayInteractionLoggingEnabled() ? new TimeSpentAnalyticsImpl() : new TimeSpentAnalyticsNoOp();
    }
}
