package com.facebook.aura.startup.mobileconfig;

import X.C0881AGi;
import X.C60P;
import X.HtJ;
import X.HzP;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionlessStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class AuraSessionlessMobileConfigsFetchStartupJob implements SessionlessStartupJob {
    public static final AuraSessionlessMobileConfigsFetchStartupJob INSTANCE = new AuraSessionlessMobileConfigsFetchStartupJob();
    public static final String TAG = "SessionlessMCFetchJob";

    @DebugMetadata(c = "com.facebook.aura.startup.mobileconfig.AuraSessionlessMobileConfigsFetchStartupJob", f = "AuraSessionlessMobileConfigsFetchStartupJob.kt", l = {61}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.startup.mobileconfig.AuraSessionlessMobileConfigsFetchStartupJob$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraSessionlessMobileConfigsFetchStartupJob.this.execute(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.HtJ<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.startup.mobileconfig.AuraSessionlessMobileConfigsFetchStartupJob.AnonymousClass1
            if (r0 == 0) goto L6b
            r6 = r8
            com.facebook.aura.startup.mobileconfig.AuraSessionlessMobileConfigsFetchStartupJob$execute$1 r6 = (com.facebook.aura.startup.mobileconfig.AuraSessionlessMobileConfigsFetchStartupJob.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            java.lang.String r4 = "SessionlessMCFetchJob"
            r3 = 1
            if (r0 == 0) goto L45
            if (r0 != r3) goto L71
            X.Hwg.A00(r1)
        L22:
            boolean r1 = X.AnonymousClass001.A1X(r1)
            java.lang.String r0 = "Blocking sessionless MC fetch: success="
            java.lang.String r0 = X.FGI.A0r(r0, r1)
            X.CFK.A05(r4, r0)
            if (r1 == 0) goto L42
            com.facebook.aura.common.prefs.AuraDevicePrefs r1 = com.facebook.aura.common.prefs.AuraDevicePrefs.INSTANCE
            com.facebook.aura.common.prefs.AuraDevicePrefStore r0 = com.facebook.aura.common.prefs.AuraDevicePrefStore.SESSIONLESS_MOBILE_CONFIG_FETCH
            X.BzK r2 = X.C60O.A0F(r0, r1)
            java.lang.String r1 = "needs_blocking_fetch"
            r0 = 0
            r2.A0A(r1, r0)
            r2.apply()
        L42:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L45:
            X.Hwg.A00(r1)
            com.facebook.aura.mobileconfig.AuraMobileConfig r0 = com.facebook.aura.mobileconfig.AuraMobileConfig.INSTANCE
            r0.ensureInitialized()
            com.facebook.aura.startup.appjob.StartupPhase r2 = r7.getPhase()
            com.facebook.aura.startup.appjob.StartupPhase r1 = com.facebook.aura.startup.appjob.StartupPhase.BLOCKING
            com.facebook.aura.mobileconfig.session.AuraDeviceSession r0 = r0.getSessionlessMC()
            if (r2 != r1) goto L62
            r6.label = r3
            java.lang.Object r1 = r0.fetchConfigsSynchronously(r6)
            if (r1 != r5) goto L22
            return r5
        L62:
            r0.fetchConfigs()
            java.lang.String r0 = "Non-blocking sessionless MC fetch triggered"
            X.CFK.A05(r4, r0)
            goto L42
        L6b:
            com.facebook.aura.startup.mobileconfig.AuraSessionlessMobileConfigsFetchStartupJob$execute$1 r6 = new com.facebook.aura.startup.mobileconfig.AuraSessionlessMobileConfigsFetchStartupJob$execute$1
            r6.<init>(r8)
            goto L12
        L71:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.mobileconfig.AuraSessionlessMobileConfigsFetchStartupJob.execute(X.HtJ):java.lang.Object");
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
        return AppJobId.FETCH_SESSIONLESS_MOBILE_CONFIGS;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public StartupPhase getPhase() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.SESSIONLESS_MOBILE_CONFIG_FETCH).getBoolean("needs_blocking_fetch", true) ? StartupPhase.BLOCKING : StartupPhase.NON_BLOCKING_HIGH_PRIORITY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJob, com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public ProcessScope getProcessScope() {
        return ProcessScope.ALL_PROCESSES;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJob
    public /* bridge */ long getTimeoutMs() {
        return 10000L;
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJob, com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public ResumePolicy getResumePolicy() {
        return C60P.A06();
    }

    @Override // com.facebook.aura.startup.appjob.SessionlessStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.FETCH_SESSIONLESS_MOBILE_CONFIGS;
    }
}
