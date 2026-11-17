package com.facebook.aura.startup.appjob;

import X.AnonymousClass801;
import java.util.List;

/* loaded from: classes3.dex */
public class SessionedStartupJobRegistrationStatic {
    public static List<AppJobId> getDependsOn(int i) {
        return AnonymousClass801.A0Q(i);
    }

    public static SessionedStartupJob getJob(int i) {
        return AnonymousClass801.A0G(i);
    }

    public static AppJobKey getJobId(int i) {
        return AnonymousClass801.A0B(i);
    }

    public static int[] getKeys() {
        return AnonymousClass801.A0q();
    }

    public static StartupPhase getPhase(int i) {
        return AnonymousClass801.A0I(i);
    }

    public static ProcessScope getProcessScope(int i) {
        return AnonymousClass801.A0C(i);
    }

    public static ResumePolicy getResumePolicy(int i) {
        return AnonymousClass801.A0E(i);
    }
}
