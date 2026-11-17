package com.facebook.aura.startup.appjob;

import X.AbstractC3358CGz;
import X.C0881AGi;
import X.C60P;
import X.HtJ;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public interface SessionedStartupJob extends SessionedStartupJobRegistration {

    /* renamed from: com.facebook.aura.startup.appjob.SessionedStartupJob$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static long $default$getTimeoutMs(SessionedStartupJob sessionedStartupJob) {
            return 10000L;
        }

        public static /* synthetic */ long access$getTimeoutMs$jd(SessionedStartupJob sessionedStartupJob) {
            return 10000L;
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static List<AppJobId> getDependsOn(SessionedStartupJob sessionedStartupJob) {
            return C0881AGi.A00;
        }

        @Deprecated
        public static ProcessScope getProcessScope(SessionedStartupJob sessionedStartupJob) {
            return ProcessScope.FOREGROUND_ONLY;
        }

        @Deprecated
        public static long getTimeoutMs(SessionedStartupJob sessionedStartupJob) {
            return 10000L;
        }

        @Deprecated
        public static ResumePolicy getResumePolicy(SessionedStartupJob sessionedStartupJob) {
            return C60P.A06();
        }
    }

    Object execute(AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ);

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    List<AppJobId> getDependsOn();

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    ProcessScope getProcessScope();

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    ResumePolicy getResumePolicy();

    long getTimeoutMs();
}
