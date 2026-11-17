package com.facebook.aura.startup.fresco;

import X.AbstractC3422CMk;
import X.C0881AGi;
import X.C4JM;
import X.EjO;
import X.HtJ;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionlessStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class AuraFrescoStartupJob implements SessionlessStartupJob {
    public static final AuraFrescoStartupJob INSTANCE = new AuraFrescoStartupJob();

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJob, com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public List<AppJobId> getDependsOn() {
        return C0881AGi.A00;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public SessionlessStartupJob getJob() {
        return this;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public AppJobId getJobId() {
        return AppJobId.FRESCO;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public StartupPhase getPhase() {
        return StartupPhase.BLOCKING;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJob, com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public ProcessScope getProcessScope() {
        return ProcessScope.ALL_PROCESSES;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJob, com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public ResumePolicy getResumePolicy() {
        return ResumePolicy.OncePerProcess.INSTANCE;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJob
    public /* bridge */ long getTimeoutMs() {
        return 10000L;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJob
    public Object execute(HtJ<? super Unit> htJ) {
        AuraVitoImageProvider auraVitoImageProvider = new AuraVitoImageProvider(C4JM.A00());
        synchronized (EjO.class) {
            if (EjO.A00 != null) {
                AbstractC3422CMk.A03("FrescoVitoProvider", "Fresco Vito already initialized! Vito must be initialized only once.");
            }
            EjO.A00 = auraVitoImageProvider;
        }
        return Unit.INSTANCE;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.FRESCO;
    }
}
