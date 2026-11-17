package com.facebook.aura.startup.analytics;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C0881AGi;
import X.C3UX;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import X.C78W;
import X.C8eO;
import X.CH0;
import X.HtJ;
import X.Hxb;
import X.HzC;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class AnalyticsModeStateStartupJob implements SessionedStartupJob {
    public static String collectingUserId;
    public static C3UX scope;
    public static final AnalyticsModeStateStartupJob INSTANCE = new AnalyticsModeStateStartupJob();
    public static final Object lock = C3cG.A0T();

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public Object execute(AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        Unit unit;
        synchronized (lock) {
            String str = collectingUserId;
            String str2 = ((CH0) abstractC3358CGz).A01;
            if (C7384Etj.areEqual(str, str2)) {
                unit = Unit.INSTANCE;
            } else {
                INSTANCE.stopCollecting$fbandroid_express_aura_java_com_facebook_aura_startup_analytics_analytics();
                collectingUserId = str2;
                HzC hzCA05 = C78W.A05(new C8eO(null), C3cG.A0v());
                AnonymousClass001.A1J(new AnalyticsModeStateStartupJob$execute$2$1$1(abstractC3358CGz, null), hzCA05);
                scope = hzCA05;
                unit = Unit.INSTANCE;
            }
        }
        return unit;
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
        return AppJobId.ANALYTICS_MODE_STATE;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public StartupPhase getPhase() {
        return StartupPhase.NON_BLOCKING_HIGH_PRIORITY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ProcessScope getProcessScope() {
        return ProcessScope.ALL_PROCESSES;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public /* bridge */ long getTimeoutMs() {
        return 10000L;
    }

    public final void stopCollecting$fbandroid_express_aura_java_com_facebook_aura_startup_analytics_analytics() {
        synchronized (lock) {
            C3UX c3ux = scope;
            if (c3ux != null) {
                Hxb.A03(null, c3ux);
            }
            scope = null;
            collectingUserId = null;
        }
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ResumePolicy getResumePolicy() {
        return C60P.A06();
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.ANALYTICS_MODE_STATE;
    }
}
