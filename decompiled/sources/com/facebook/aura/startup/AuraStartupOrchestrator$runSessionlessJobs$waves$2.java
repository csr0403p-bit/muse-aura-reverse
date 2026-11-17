package com.facebook.aura.startup;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass801;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import java.util.List;

/* loaded from: classes3.dex */
public final class AuraStartupOrchestrator$runSessionlessJobs$waves$2 extends AbstractC7559F3s implements G0U<Integer, List<? extends AppJobKey>> {
    public static final AuraStartupOrchestrator$runSessionlessJobs$waves$2 INSTANCE = new AuraStartupOrchestrator$runSessionlessJobs$waves$2();

    public AuraStartupOrchestrator$runSessionlessJobs$waves$2() {
        super(1);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ List<? extends AppJobKey> invoke(Integer num) {
        List<AppJobId> listA0R = AnonymousClass801.A0R(AnonymousClass001.A0F(num));
        C7384Etj.A0U(listA0R);
        return listA0R;
    }

    public final List<AppJobKey> invoke(int i) {
        List<AppJobId> listA0R = AnonymousClass801.A0R(i);
        C7384Etj.A0U(listA0R);
        return listA0R;
    }
}
