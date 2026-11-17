package com.facebook.aura.startup.mobileconfig;

import X.AnonymousClass003;
import X.C0881AGi;
import X.C31u;
import X.C4JM;
import X.C60P;
import X.C7396EuZ;
import X.EK5;
import X.F3R;
import X.HtJ;
import X.HzP;
import X.InterfaceC7359EnW;
import android.app.Application;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import com.facebook.aura.startup.mobileconfig.MC;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class AuraMobileConfigsFetchStartupJob implements SessionedStartupJob {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(AuraMobileConfigsFetchStartupJob.class, "emergencyPushEnabled", "getEmergencyPushEnabled()Z");
    public static final AuraMobileConfigsFetchStartupJob INSTANCE = new AuraMobileConfigsFetchStartupJob();
    public static final C31u emergencyPushEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_emergency_push);

    @DebugMetadata(c = "com.facebook.aura.startup.mobileconfig.AuraMobileConfigsFetchStartupJob", f = "AuraMobileConfigsFetchStartupJob.kt", l = {80}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.startup.mobileconfig.AuraMobileConfigsFetchStartupJob$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraMobileConfigsFetchStartupJob.this.execute(null, this);
        }
    }

    private final boolean getEmergencyPushEnabled() {
        return C31u.A01(this, emergencyPushEnabled$delegate, $$delegatedProperties, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.startup.mobileconfig.AuraMobileConfigsFetchStartupJob.AnonymousClass1
            if (r0 == 0) goto L61
            r5 = r8
            com.facebook.aura.startup.mobileconfig.AuraMobileConfigsFetchStartupJob$execute$1 r5 = (com.facebook.aura.startup.mobileconfig.AuraMobileConfigsFetchStartupJob.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L40
            if (r0 != r2) goto L67
            X.Hwg.A00(r1)
        L21:
            boolean r0 = X.AnonymousClass001.A1X(r1)
            if (r0 == 0) goto L37
            com.facebook.aura.common.prefs.AuraDevicePrefs r1 = com.facebook.aura.common.prefs.AuraDevicePrefs.INSTANCE
            com.facebook.aura.common.prefs.AuraDevicePrefStore r0 = com.facebook.aura.common.prefs.AuraDevicePrefStore.MOBILE_CONFIG_FETCH
            X.BzK r1 = X.C60O.A0F(r0, r1)
            java.lang.String r0 = "needs_blocking_fetch"
            r1.A0A(r0, r3)
            r1.apply()
        L37:
            r6.enqueuePeriodicFetch()
            r6.syncPeriodicEmergencyPush()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L40:
            X.Hwg.A00(r1)
            com.facebook.aura.startup.appjob.StartupPhase r1 = r6.getPhase()
            com.facebook.aura.startup.appjob.StartupPhase r0 = com.facebook.aura.startup.appjob.StartupPhase.BLOCKING
            if (r1 != r0) goto L5b
            com.facebook.aura.mobileconfig.AuraMobileConfig r1 = com.facebook.aura.mobileconfig.AuraMobileConfig.INSTANCE
            r0 = 0
            r5.L$0 = r0
            r5.I$0 = r2
            r5.label = r2
            java.lang.Object r1 = r1.safeAfterLogin(r5)
            if (r1 != r4) goto L21
            return r4
        L5b:
            com.facebook.aura.mobileconfig.AuraMobileConfig r0 = com.facebook.aura.mobileconfig.AuraMobileConfig.INSTANCE
            r0.safeFetchSessionedConfigs()
            goto L37
        L61:
            com.facebook.aura.startup.mobileconfig.AuraMobileConfigsFetchStartupJob$execute$1 r5 = new com.facebook.aura.startup.mobileconfig.AuraMobileConfigsFetchStartupJob$execute$1
            r5.<init>(r8)
            goto L12
        L67:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.mobileconfig.AuraMobileConfigsFetchStartupJob.execute(X.CGz, X.HtJ):java.lang.Object");
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
        return AppJobId.FETCH_MOBILE_CONFIGS;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public StartupPhase getPhase() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.MOBILE_CONFIG_FETCH).getBoolean("needs_blocking_fetch", true) ? StartupPhase.BLOCKING : StartupPhase.NON_BLOCKING_HIGH_PRIORITY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ProcessScope getProcessScope() {
        return ProcessScope.FOREGROUND_ONLY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public /* bridge */ long getTimeoutMs() {
        return 10000L;
    }

    private final void enqueuePeriodicFetch() {
        Application applicationA00 = C4JM.A00();
        C7396EuZ c7396EuZ = new C7396EuZ(AuraMobileConfigPeriodicFetchWorker.class, TimeUnit.HOURS, 4L);
        C60P.A1U(c7396EuZ);
        C60P.A1V(F3R.A02(applicationA00), c7396EuZ.A01(), AuraMobileConfigsFetchStartupJobKt.PERIODIC_WORK_NAME);
    }

    private final void syncPeriodicEmergencyPush() {
        EK5 ek5A02 = F3R.A02(C4JM.A00());
        if (!getEmergencyPushEnabled()) {
            ek5A02.A0A(AuraMobileConfigsFetchStartupJobKt.EMERGENCY_PUSH_WORK_NAME);
            return;
        }
        C7396EuZ c7396EuZ = new C7396EuZ(AuraMobileConfigEmergencyPushWorker.class, TimeUnit.HOURS, 1L);
        C60P.A1U(c7396EuZ);
        C60P.A1V(ek5A02, c7396EuZ.A01(), AuraMobileConfigsFetchStartupJobKt.EMERGENCY_PUSH_WORK_NAME);
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ResumePolicy getResumePolicy() {
        return C60P.A06();
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.FETCH_MOBILE_CONFIGS;
    }
}
