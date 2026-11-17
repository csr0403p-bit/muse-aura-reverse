package com.facebook.aura.startup.login;

import X.C0881AGi;
import X.C3cG;
import X.EnumC10460Hji;
import X.HtJ;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.login.nativeflow.NativeLoginPrefetch;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionlessStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class NativeLoginPrefetchStartupJob implements SessionlessStartupJob {
    public static final NativeLoginPrefetchStartupJob INSTANCE = new NativeLoginPrefetchStartupJob();

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJob
    public Object execute(HtJ<? super Unit> htJ) {
        Object objPrime;
        AuraSessionManager auraSessionManager = AuraSessionManager.INSTANCE;
        return (AuraUserSessionStore.INSTANCE.isCurrentUserAuthenticated() || (objPrime = NativeLoginPrefetch.INSTANCE.prime(C3cG.A06(), htJ)) != EnumC10460Hji.A02) ? Unit.INSTANCE : objPrime;
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
        return AppJobId.NATIVE_LOGIN_PREFETCH;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public StartupPhase getPhase() {
        return StartupPhase.NON_BLOCKING_HIGH_PRIORITY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJob, com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public ProcessScope getProcessScope() {
        return ProcessScope.FOREGROUND_ONLY;
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
        return AppJobId.NATIVE_LOGIN_PREFETCH;
    }
}
