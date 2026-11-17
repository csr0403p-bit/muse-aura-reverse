package com.facebook.aura.startup.appjob;

import X.C0881AGi;
import X.C60P;
import X.HtJ;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public interface SessionlessStartupJob extends SessionlessStartupJobRegistration {

    /* renamed from: com.facebook.aura.startup.appjob.SessionlessStartupJob$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static long $default$getTimeoutMs(SessionlessStartupJob sessionlessStartupJob) {
            return 10000L;
        }

        public static /* synthetic */ long access$getTimeoutMs$jd(SessionlessStartupJob sessionlessStartupJob) {
            return 10000L;
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static List<AppJobId> getDependsOn(SessionlessStartupJob sessionlessStartupJob) {
            return C0881AGi.A00;
        }

        @Deprecated
        public static ProcessScope getProcessScope(SessionlessStartupJob sessionlessStartupJob) {
            return ProcessScope.FOREGROUND_ONLY;
        }

        @Deprecated
        public static long getTimeoutMs(SessionlessStartupJob sessionlessStartupJob) {
            return 10000L;
        }

        @Deprecated
        public static ResumePolicy getResumePolicy(SessionlessStartupJob sessionlessStartupJob) {
            return C60P.A06();
        }
    }

    Object execute(HtJ<? super Unit> htJ);

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    List<AppJobId> getDependsOn();

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    ProcessScope getProcessScope();

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    ResumePolicy getResumePolicy();

    long getTimeoutMs();
}
