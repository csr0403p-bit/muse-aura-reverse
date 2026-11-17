package com.facebook.aura.startup.onboarding;

import X.AnonymousClass001;
import X.C0881AGi;
import X.C31u;
import X.C60O;
import X.HtJ;
import X.HzP;
import X.InterfaceC7359EnW;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchInviteCodeRedeemStartupJob implements SessionedStartupJob {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = C60O.A1b(HatchInviteCodeRedeemStartupJob.class, "enabled", "<v#0>", 0);
    public static final HatchInviteCodeRedeemStartupJob INSTANCE = new HatchInviteCodeRedeemStartupJob();
    public static final String TAG = "HatchInviteCodeRedeemStartupJob";

    @DebugMetadata(c = "com.facebook.aura.startup.onboarding.HatchInviteCodeRedeemStartupJob", f = "HatchInviteCodeRedeemStartupJob.kt", l = {56}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.startup.onboarding.HatchInviteCodeRedeemStartupJob$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchInviteCodeRedeemStartupJob.this.execute(null, this);
        }
    }

    public static final boolean execute$lambda$0(C31u<Object, Boolean> c31u) {
        return AnonymousClass001.A1X(C31u.A00(c31u, $$delegatedProperties));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r9, X.HtJ<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.startup.onboarding.HatchInviteCodeRedeemStartupJob.AnonymousClass1
            if (r0 == 0) goto L9c
            r5 = r10
            com.facebook.aura.startup.onboarding.HatchInviteCodeRedeemStartupJob$execute$1 r5 = (com.facebook.aura.startup.onboarding.HatchInviteCodeRedeemStartupJob.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r5.label
            java.lang.String r6 = "HatchInviteCodeRedeemStartupJob"
            r4 = 1
            if (r0 == 0) goto L53
            if (r0 != r4) goto La3
            java.lang.Object r2 = r5.L$2
            java.lang.Object r8 = r5.L$1
            com.facebook.aura.analytics.hatch.HatchDeferredInviteCodeStore$PendingInviteCode r8 = (com.facebook.aura.analytics.hatch.HatchDeferredInviteCodeStore.PendingInviteCode) r8
            X.Hwg.A00(r1)
        L28:
            com.facebook.aura.activation.repo.AuraActivationRepository$RedeemInviteCodeResult r1 = (com.facebook.aura.activation.repo.AuraActivationRepository.RedeemInviteCodeResult) r1
            if (r1 != 0) goto L34
            java.lang.String r0 = "Silent invite code redemption returned no response; retaining for retry"
        L2e:
            X.CFK.A06(r6, r0)
        L31:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L34:
            boolean r0 = r1.success
            if (r0 != 0) goto L4d
            java.lang.String r0 = r1.error
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Silent invite code redemption failed: %s"
            X.CFK.A0H(r6, r0, r1)
            com.facebook.aura.activation.data.ActivationState r0 = com.facebook.aura.activation.data.ActivationState.FULLY_ACTIVATED
            if (r2 == r0) goto L4d
            com.facebook.aura.analytics.hatch.HatchDeferredInviteCodeStore r0 = com.facebook.aura.analytics.hatch.HatchDeferredInviteCodeStore.INSTANCE
            r0.releaseToManualEntry(r8)
            goto L31
        L4d:
            com.facebook.aura.analytics.hatch.HatchDeferredInviteCodeStore r0 = com.facebook.aura.analytics.hatch.HatchDeferredInviteCodeStore.INSTANCE
            r0.completeSilentRedemption(r8)
            goto L31
        L53:
            X.Hwg.A00(r1)
            com.facebook.aura.analytics.hatch.HatchDeferredInviteCodeStore r2 = com.facebook.aura.analytics.hatch.HatchDeferredInviteCodeStore.INSTANCE
            long r0 = java.lang.System.currentTimeMillis()
            com.facebook.aura.analytics.hatch.HatchDeferredInviteCodeStore$PendingInviteCode r8 = r2.pendingReferrerCodeForSilentRedemption(r0)
            if (r8 == 0) goto L31
            com.facebook.aura.user.provider.AuraViewerDataProvider$Companion r0 = com.facebook.aura.user.provider.AuraViewerDataProvider.Companion
            java.lang.Object r1 = X.C60P.A1J(r0, r9)
            com.facebook.aura.user.provider.AuraUserData r1 = (com.facebook.aura.user.provider.AuraUserData) r1
            if (r1 == 0) goto L99
            r3 = 0
            r0 = 0
            com.facebook.aura.activation.data.ActivationState r2 = r1.getCurrentActivationState(r0, r0, r0)
            if (r2 == 0) goto L99
            X.Exw r0 = com.facebook.aura.startup.onboarding.MC.hatch_gtm.app_install_silent_redeem_code
            X.31u r0 = com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(r0)
            boolean r0 = execute$lambda$0(r0)
            if (r0 == 0) goto L31
            com.facebook.aura.activation.repo.AuraActivationRepository$Companion r0 = com.facebook.aura.activation.repo.AuraActivationRepository.Companion
            com.facebook.aura.activation.repo.AuraActivationRepository r1 = r0.getInstance(r9)
            java.lang.String r0 = r8.code
            r5.L$0 = r3
            r5.L$1 = r8
            r5.L$2 = r2
            r5.L$3 = r3
            r5.label = r4
            java.lang.Object r1 = r1.redeemInviteCode(r0, r4, r4, r5)
            if (r1 != r7) goto L28
            return r7
        L99:
            java.lang.String r0 = "User data is unavailable; retaining the invite code for the next resume"
            goto L2e
        L9c:
            com.facebook.aura.startup.onboarding.HatchInviteCodeRedeemStartupJob$execute$1 r5 = new com.facebook.aura.startup.onboarding.HatchInviteCodeRedeemStartupJob$execute$1
            r5.<init>(r10)
            goto L12
        La3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.onboarding.HatchInviteCodeRedeemStartupJob.execute(X.CGz, X.HtJ):java.lang.Object");
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
        return AppJobId.INVITE_CODE_SILENT_REDEEM;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public StartupPhase getPhase() {
        return StartupPhase.NON_BLOCKING_HIGH_PRIORITY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ProcessScope getProcessScope() {
        return ProcessScope.FOREGROUND_ONLY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ResumePolicy getResumePolicy() {
        return ResumePolicy.EveryResume.INSTANCE;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public /* bridge */ long getTimeoutMs() {
        return 10000L;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.INVITE_CODE_SILENT_REDEEM;
    }
}
