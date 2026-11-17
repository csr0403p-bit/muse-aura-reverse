package com.facebook.aura.startup.vms;

import X.C60P;
import X.HtJ;
import X.HzP;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class FetchVmsStartupJob implements SessionedStartupJob {
    public static final FetchVmsStartupJob INSTANCE = new FetchVmsStartupJob();

    @DebugMetadata(c = "com.facebook.aura.startup.vms.FetchVmsStartupJob", f = "FetchVmsStartupJob.kt", l = {60}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.startup.vms.FetchVmsStartupJob$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FetchVmsStartupJob.this.execute(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.startup.vms.FetchVmsStartupJob.AnonymousClass1
            if (r0 == 0) goto L63
            r3 = r8
            com.facebook.aura.startup.vms.FetchVmsStartupJob$execute$1 r3 = (com.facebook.aura.startup.vms.FetchVmsStartupJob.AnonymousClass1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r1 = r3.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r5 = 1
            if (r0 == 0) goto L23
            if (r0 != r5) goto L69
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            com.facebook.aura.user.provider.AuraViewerDataProvider$Companion r0 = com.facebook.aura.user.provider.AuraViewerDataProvider.Companion
            java.lang.Object r6 = X.C60P.A1J(r0, r7)
            com.facebook.aura.user.provider.AuraUserData r6 = (com.facebook.aura.user.provider.AuraUserData) r6
            if (r6 == 0) goto L20
            java.lang.Boolean r0 = r6.hasHatchAccess
            boolean r0 = X.AnonymousClass002.A1b(r0, r5)
            if (r0 == 0) goto L20
            boolean r0 = r6.hasCompletedHatchActivation
            if (r0 == 0) goto L20
            com.facebook.aura.confidentialvm.ConfidentialVmSetupGate$Companion r0 = com.facebook.aura.confidentialvm.ConfidentialVmSetupGate.Companion
            com.facebook.aura.confidentialvm.ConfidentialVmSetupGate r0 = r0.getInstance(r7)
            X.1BN<java.lang.Boolean> r0 = r0.isSetupRequired
            boolean r1 = X.C3cH.A1R(r0)
            r2 = 0
            r0 = 0
            com.facebook.aura.activation.data.ActivationState r1 = r6.getCurrentActivationState(r0, r1, r0)
            com.facebook.aura.activation.data.ActivationState r0 = com.facebook.aura.activation.data.ActivationState.FULLY_ACTIVATED
            if (r1 != r0) goto L20
            com.facebook.aura.gateway.HatchVmRepository r1 = com.facebook.aura.gateway.HatchVmRepository.INSTANCE
            com.facebook.aura.gateway.VmFetchSource r0 = com.facebook.aura.gateway.VmFetchSource.STARTUP_JOB
            r3.L$0 = r2
            r3.L$1 = r2
            r3.label = r5
            java.lang.Object r0 = r1.fetchAndCacheExistingVm(r7, r0, r3)
            if (r0 != r4) goto L20
            return r4
        L63:
            com.facebook.aura.startup.vms.FetchVmsStartupJob$execute$1 r3 = new com.facebook.aura.startup.vms.FetchVmsStartupJob$execute$1
            r3.<init>(r8)
            goto L12
        L69:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.vms.FetchVmsStartupJob.execute(X.CGz, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public List<AppJobId> getDependsOn() {
        return Collections.singletonList(AppJobId.FETCH_USER_DATA);
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public SessionedStartupJob getJob() {
        return this;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public AppJobId getJobId() {
        return AppJobId.FETCH_VMS;
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

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.FETCH_VMS;
    }
}
