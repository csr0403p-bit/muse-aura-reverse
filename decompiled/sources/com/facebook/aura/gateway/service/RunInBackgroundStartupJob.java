package com.facebook.aura.gateway.service;

import X.AbstractC3358CGz;
import X.C0881AGi;
import X.C3cG;
import X.HtJ;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class RunInBackgroundStartupJob implements SessionedStartupJob {
    public static final RunInBackgroundStartupJob INSTANCE = new RunInBackgroundStartupJob();

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
        return AppJobId.RUN_IN_BACKGROUND_SERVICE;
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
        if (C3cG.A0D(abstractC3358CGz).getRunInBackgroundEnabled()) {
            HatchForegroundService.Companion.startPersistent(C3cG.A06());
        }
        return Unit.INSTANCE;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.RUN_IN_BACKGROUND_SERVICE;
    }
}
