package com.facebook.aura.startup;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass801;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.startup.appjob.AppJobKey;

/* loaded from: classes3.dex */
public final class AuraStartupOrchestrator$runBlockingSessionedJobs$waves$1 extends AbstractC7559F3s implements G0U<Integer, AppJobKey> {
    public static final AuraStartupOrchestrator$runBlockingSessionedJobs$waves$1 INSTANCE = new AuraStartupOrchestrator$runBlockingSessionedJobs$waves$1();

    public AuraStartupOrchestrator$runBlockingSessionedJobs$waves$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ AppJobKey invoke(Integer num) {
        AppJobKey appJobKeyA0B = AnonymousClass801.A0B(AnonymousClass001.A0F(num));
        C7384Etj.A0U(appJobKeyA0B);
        return appJobKeyA0B;
    }

    public final AppJobKey invoke(int i) {
        AppJobKey appJobKeyA0B = AnonymousClass801.A0B(i);
        C7384Etj.A0U(appJobKeyA0B);
        return appJobKeyA0B;
    }
}
