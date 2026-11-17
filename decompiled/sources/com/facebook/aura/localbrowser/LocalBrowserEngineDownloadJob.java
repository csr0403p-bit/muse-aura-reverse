package com.facebook.aura.localbrowser;

import X.AbstractC3358CGz;
import X.C0881AGi;
import X.C60P;
import X.EnumC10460Hji;
import X.HtJ;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import com.facebook.aura.localbrowser.config.LocalBrowserConfig;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.FeatureAppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class LocalBrowserEngineDownloadJob implements SessionedStartupJob {
    public static final int $stable = 0;
    public static final LocalBrowserEngineDownloadJob INSTANCE = new LocalBrowserEngineDownloadJob();
    public static final AppJobKey key = new FeatureAppJobKey("LOCAL_BROWSER_ENGINE_DOWNLOAD");

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public Object execute(AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        Object objDownloadEngine;
        if (LocalBrowserConfig.INSTANCE.getExperiment().isEnabled && !ConfidentialSessionGate.Companion.getInstance(abstractC3358CGz).getShouldHideUnsupportedCvmFeatures()) {
            LocalBrowserRuntime companion = LocalBrowserRuntime.Companion.getInstance(abstractC3358CGz);
            if (companion.isEnabled() && (objDownloadEngine = companion.downloadEngine(htJ)) == EnumC10460Hji.A02) {
                return objDownloadEngine;
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
    public AppJobKey getJobId() {
        return key;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public StartupPhase getPhase() {
        return StartupPhase.NON_BLOCKING_LOW_PRIORITY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ProcessScope getProcessScope() {
        return ProcessScope.FOREGROUND_ONLY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public /* bridge */ long getTimeoutMs() {
        return 10000L;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ResumePolicy getResumePolicy() {
        return C60P.A06();
    }
}
