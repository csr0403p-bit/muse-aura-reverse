package com.facebook.aura.startup.preloads;

import X.AbstractC3358CGz;
import X.C0881AGi;
import X.C4JM;
import X.C60P;
import X.C7396EuZ;
import X.F3R;
import X.HtJ;
import android.app.Application;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchPreloadsFppStartupJob implements SessionedStartupJob {
    public static final HatchPreloadsFppStartupJob INSTANCE = new HatchPreloadsFppStartupJob();

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public List<AppJobId> getDependsOn() {
        return C0881AGi.A00;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public SessionedStartupJob getJob() {
        return this;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public AppJobId getJobId() {
        return AppJobId.PRELOADS_FPP_REPORT;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public StartupPhase getPhase() {
        return StartupPhase.NON_BLOCKING_LOW_PRIORITY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ProcessScope getProcessScope() {
        return ProcessScope.FOREGROUND_ONLY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ResumePolicy getResumePolicy() {
        return ResumePolicy.OncePerProcess.INSTANCE;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public /* bridge */ long getTimeoutMs() {
        return 10000L;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public Object execute(AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        Application applicationA00 = C4JM.A00();
        C60P.A1V(F3R.A02(applicationA00), new C7396EuZ(HatchPreloadsFppWorker.class, TimeUnit.HOURS, 12L).A01(), HatchPreloadsFppStartupJobKt.PERIODIC_WORK_NAME);
        return Unit.INSTANCE;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.PRELOADS_FPP_REPORT;
    }
}
