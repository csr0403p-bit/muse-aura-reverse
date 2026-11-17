package com.facebook.aura.startup;

import X.C7384Etj;
import X.DBB;

/* loaded from: classes5.dex */
public final class AuraStartupMetricTracker$startupDoneCallback$1 implements DBB {
    public final /* synthetic */ AuraStartupMetricTracker this$0;

    public void navCancelStartAsync(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.this$0.navCancelStartAsync(str);
    }

    public AuraStartupMetricTracker$startupDoneCallback$1(AuraStartupMetricTracker auraStartupMetricTracker) {
        this.this$0 = auraStartupMetricTracker;
    }

    @Override // X.DBB
    public void endStart(short s, String str, long j, String str2, String str3) {
        this.this$0.endStart(s, str, j, str2, str3);
    }
}
