package com.facebook.aura.startup.network;

import X.C0881AGi;
import X.HtJ;
import com.facebook.aura.network.state.AuraNetworkMonitor;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionlessStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class AuraNetworkMonitorStartupJob implements SessionlessStartupJob {
    public static final AuraNetworkMonitorStartupJob INSTANCE = new AuraNetworkMonitorStartupJob();

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJob
    public Object execute(HtJ<? super Unit> htJ) {
        AuraNetworkMonitor.INSTANCE.start(null);
        return Unit.INSTANCE;
    }

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
        return AppJobId.NETWORK_MONITOR;
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

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.NETWORK_MONITOR;
    }
}
