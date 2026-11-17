package com.facebook.aura.startup.appjob;

import X.AnonymousClass801;
import java.util.List;

/* loaded from: classes3.dex */
public class SessionlessStartupJobRegistrationStatic {
    public static List<AppJobId> getDependsOn(int i) {
        return AnonymousClass801.A0R(i);
    }

    public static SessionlessStartupJob getJob(int i) {
        return AnonymousClass801.A0H(i);
    }

    public static AppJobKey getJobId(int i) {
        return AnonymousClass801.A0A(i);
    }

    public static int[] getKeys() {
        return AnonymousClass801.A0r();
    }

    public static StartupPhase getPhase(int i) {
        return AnonymousClass801.A0J(i);
    }

    public static ProcessScope getProcessScope(int i) {
        return AnonymousClass801.A0D(i);
    }

    public static ResumePolicy getResumePolicy(int i) {
        return AnonymousClass801.A0F(i);
    }
}
