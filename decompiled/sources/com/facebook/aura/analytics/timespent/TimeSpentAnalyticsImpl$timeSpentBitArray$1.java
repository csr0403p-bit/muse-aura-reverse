package com.facebook.aura.analytics.timespent;

import X.BV4;
import X.C7384Etj;
import X.CG0;
import X.DLT;

/* loaded from: classes5.dex */
public final class TimeSpentAnalyticsImpl$timeSpentBitArray$1 {
    public final /* synthetic */ TimeSpentAnalyticsImpl this$0;

    public DLT acquireEvent(String str) {
        C7384Etj.A0Y(str, 0);
        return new ObservedBitArrayEvent(new CG0(BV4.A0C(), str), this.this$0.analyticsDecorator);
    }

    public TimeSpentAnalyticsImpl$timeSpentBitArray$1(TimeSpentAnalyticsImpl timeSpentAnalyticsImpl) {
        this.this$0 = timeSpentAnalyticsImpl;
    }
}
