package com.facebook.aura.startup.analytics;

import X.AbstractC3358CGz;
import X.C0881AGi;
import X.C60P;
import X.C7384Etj;
import X.CH0;
import X.HtJ;
import com.facebook.aura.analytics.impl.AbraPigeonIdentity;
import com.facebook.aura.analytics.impl.MetaAnalyticsSessionManager;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class AnalyticsIdentityStartupJob implements SessionedStartupJob {
    public static final AnalyticsIdentityStartupJob INSTANCE = new AnalyticsIdentityStartupJob();

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public Object execute(AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        String str = ((CH0) abstractC3358CGz).A01;
        AnalyticsIdentityStartupJob$execute$identity$1 analyticsIdentityStartupJob$execute$identity$1 = new AnalyticsIdentityStartupJob$execute$identity$1(str);
        C7384Etj.A0Y(str, 0);
        MetaAnalyticsSessionManager.instance.notifyOnUserLoggedIn(new AbraPigeonIdentity(str, analyticsIdentityStartupJob$execute$identity$1));
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
        return AppJobId.ANALYTICS_IDENTITY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public StartupPhase getPhase() {
        return StartupPhase.BLOCKING;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ProcessScope getProcessScope() {
        return ProcessScope.ALL_PROCESSES;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public /* bridge */ long getTimeoutMs() {
        return 10000L;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ResumePolicy getResumePolicy() {
        return C60P.A06();
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.ANALYTICS_IDENTITY;
    }
}
