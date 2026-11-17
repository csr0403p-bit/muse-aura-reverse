package com.facebook.aura.startup;

import X.AbstractC7559F3s;
import X.AnonymousClass801;
import X.G0U;
import com.facebook.aura.startup.appjob.AppJobKey;

/* loaded from: classes3.dex */
public final class AuraStartupOrchestrator$runSessionlessJobs$waves$1 extends AbstractC7559F3s implements G0U<Integer, AppJobKey> {
    public static final AuraStartupOrchestrator$runSessionlessJobs$waves$1 INSTANCE = new AuraStartupOrchestrator$runSessionlessJobs$waves$1();

    public AuraStartupOrchestrator$runSessionlessJobs$waves$1() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ AppJobKey invoke(Integer num) {
        return AnonymousClass801.A0A(num.intValue());
    }

    public final AppJobKey invoke(int i) {
        return AnonymousClass801.A0A(i);
    }
}
