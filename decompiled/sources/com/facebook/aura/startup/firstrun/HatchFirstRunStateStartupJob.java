package com.facebook.aura.startup.firstrun;

import X.AnonymousClass002;
import X.Bs8;
import X.BzK;
import X.C0881AGi;
import X.C4JM;
import X.C4oT;
import X.C7384Etj;
import X.C7467Ex0;
import X.C7548F2f;
import X.CFK;
import X.HtJ;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefStore;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefs;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionlessStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class HatchFirstRunStateStartupJob implements SessionlessStartupJob {
    public static final String KEY_LAST_FIRST_RUN_TIME = "last_first_run_time";
    public static final String TAG = "HatchFirstRunStateStartupJob";
    public static final HatchFirstRunStateStartupJob INSTANCE = new HatchFirstRunStateStartupJob();
    public static final C7467Ex0 NOT_FIRST_RUN = new C7467Ex0(false, false);

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
        return AppJobId.FIRST_RUN_STATE;
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

    private final C7467Ex0 computeFirstRunInfo() throws PackageManager.NameNotFoundException {
        Application applicationA00 = C4JM.A00();
        try {
            PackageInfo packageInfo = applicationA00.getPackageManager().getPackageInfo(applicationA00.getPackageName(), 0);
            C4oT c4oT = AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.FIRST_RUN);
            long jMax = Math.max(packageInfo.firstInstallTime, packageInfo.lastUpdateTime);
            if (jMax <= c4oT.getLong(KEY_LAST_FIRST_RUN_TIME, 0L)) {
                return NOT_FIRST_RUN;
            }
            BzK bzKA9q = c4oT.A9q();
            bzKA9q.AYp(KEY_LAST_FIRST_RUN_TIME, jMax);
            bzKA9q.apply();
            return new C7467Ex0(AnonymousClass002.A1M((jMax > packageInfo.firstInstallTime ? 1 : (jMax == packageInfo.firstInstallTime ? 0 : -1))), jMax == packageInfo.lastUpdateTime);
        } catch (PackageManager.NameNotFoundException e) {
            CFK.A0H(TAG, "Cannot read own PackageInfo: %s", e.getMessage());
            return NOT_FIRST_RUN;
        }
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJob
    public Object execute(HtJ<? super Unit> htJ) throws PackageManager.NameNotFoundException {
        AtomicReference<C7548F2f> atomicReference;
        C7548F2f c7548F2f;
        C7467Ex0 c7467Ex0ComputeFirstRunInfo = computeFirstRunInfo();
        C7384Etj.A0Y(c7467Ex0ComputeFirstRunInfo, 0);
        do {
            atomicReference = C7548F2f.A01;
            c7548F2f = atomicReference.get();
            C7384Etj.A0X(c7548F2f);
        } while (!Bs8.A00(c7548F2f, new C7548F2f(c7467Ex0ComputeFirstRunInfo), atomicReference));
        return Unit.INSTANCE;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.FIRST_RUN_STATE;
    }
}
