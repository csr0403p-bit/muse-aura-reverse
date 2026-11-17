package com.facebook.aura.startup.preloads;

import X.AbstractC3358CGz;
import X.C0881AGi;
import X.HtJ;
import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.aura.common.appcontext.AuraAppContext;
import com.facebook.aura.preloads.HatchPreloadsTosRepository;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import com.facebook.oxygen.preloads.sdk.firstparty.settings.AppmanagerRemoteException;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchPreloadsTosAcceptStartupJob implements SessionedStartupJob {
    public static final HatchPreloadsTosAcceptStartupJob INSTANCE = new HatchPreloadsTosAcceptStartupJob();

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public Object execute(AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) throws AppmanagerRemoteException, PackageManager.NameNotFoundException {
        Context context = AuraAppContext.INSTANCE.getContext();
        if (context != null) {
            HatchPreloadsTosRepository hatchPreloadsTosRepository = HatchPreloadsTosRepository.INSTANCE;
            if (hatchPreloadsTosRepository.shouldAcceptTosSilently(context)) {
                hatchPreloadsTosRepository.recordAccepted(context);
            }
        }
        return Unit.INSTANCE;
    }

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
        return AppJobId.PRELOADS_TOS_ACCEPT;
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

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.PRELOADS_TOS_ACCEPT;
    }
}
