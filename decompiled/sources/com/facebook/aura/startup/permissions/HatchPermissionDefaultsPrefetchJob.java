package com.facebook.aura.startup.permissions;

import X.C0881AGi;
import X.C60P;
import X.HtJ;
import X.HzP;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchPermissionDefaultsPrefetchJob implements SessionedStartupJob {
    public static final HatchPermissionDefaultsPrefetchJob INSTANCE = new HatchPermissionDefaultsPrefetchJob();
    public static final String TAG = "HatchPermissionDefaultsPrefetchJob";

    @DebugMetadata(c = "com.facebook.aura.startup.permissions.HatchPermissionDefaultsPrefetchJob", f = "HatchPermissionDefaultsPrefetchJob.kt", l = {44, 48}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.startup.permissions.HatchPermissionDefaultsPrefetchJob$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
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
            return HatchPermissionDefaultsPrefetchJob.this.execute(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r6, X.HtJ<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.startup.permissions.HatchPermissionDefaultsPrefetchJob.AnonymousClass1
            if (r0 == 0) goto L5a
            r4 = r7
            com.facebook.aura.startup.permissions.HatchPermissionDefaultsPrefetchJob$execute$1 r4 = (com.facebook.aura.startup.permissions.HatchPermissionDefaultsPrefetchJob.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r2 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L26
            if (r1 == r0) goto L3a
            if (r1 != r3) goto L60
            X.Hwg.A00(r2)
        L23:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L26:
            X.Hwg.A00(r2)
            com.facebook.aura.gateway.HatchGatewayConnection r2 = X.C60O.A05(r6)
            r4.L$0 = r6
            r4.label = r0
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r2 = r2.awaitConnected(r0, r4)
            if (r2 != r5) goto L40
            return r5
        L3a:
            java.lang.Object r0 = r4.L$0
            X.CGz r6 = X.C60O.A0D(r0, r2)
        L40:
            boolean r0 = X.AnonymousClass001.A1X(r2)
            if (r0 == 0) goto L23
            com.facebook.aura.permissions.defaults.PermissionSettingsRepository$Companion r0 = com.facebook.aura.permissions.defaults.PermissionSettingsRepository.Companion
            com.facebook.aura.permissions.defaults.PermissionSettingsRepository r2 = r0.getInstance(r6)
            r0 = 0
            r4.L$0 = r0
            r4.label = r3
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r0 = r2.fetchConnectorDefault(r0, r4)
            if (r0 != r5) goto L23
            return r5
        L5a:
            com.facebook.aura.startup.permissions.HatchPermissionDefaultsPrefetchJob$execute$1 r4 = new com.facebook.aura.startup.permissions.HatchPermissionDefaultsPrefetchJob$execute$1
            r4.<init>(r7)
            goto L12
        L60:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.permissions.HatchPermissionDefaultsPrefetchJob.execute(X.CGz, X.HtJ):java.lang.Object");
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
        return AppJobId.FETCH_PERMISSION_DEFAULTS;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public StartupPhase getPhase() {
        return StartupPhase.NON_BLOCKING_HIGH_PRIORITY;
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

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.FETCH_PERMISSION_DEFAULTS;
    }
}
