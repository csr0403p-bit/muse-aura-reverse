package com.facebook.aura.startup.onboarding;

import X.C60P;
import X.HtJ;
import X.HzP;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
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
public final class AuraNonBlockingOnboardingJob implements SessionedStartupJob {
    public static final AuraNonBlockingOnboardingJob INSTANCE = new AuraNonBlockingOnboardingJob();
    public static final String TAG = "AuraNonBlockingOnboardingJob";

    @DebugMetadata(c = "com.facebook.aura.startup.onboarding.AuraNonBlockingOnboardingJob", f = "AuraNonBlockingOnboardingJob.kt", l = {58, HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.startup.onboarding.AuraNonBlockingOnboardingJob$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraNonBlockingOnboardingJob.this.execute(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.startup.onboarding.AuraNonBlockingOnboardingJob.AnonymousClass1
            if (r0 == 0) goto L27
            r3 = r9
            com.facebook.aura.startup.onboarding.AuraNonBlockingOnboardingJob$execute$1 r3 = (com.facebook.aura.startup.onboarding.AuraNonBlockingOnboardingJob.AnonymousClass1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r2 = r3.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r7 = 2
            r1 = 1
            java.lang.String r4 = "AuraNonBlockingOnboardingJob"
            if (r0 == 0) goto L32
            if (r0 == r1) goto L5f
            if (r0 != r7) goto L2d
            java.lang.Object r5 = r3.L$1
            com.facebook.aura.onboarding.OnboardingStartupGate r5 = (com.facebook.aura.onboarding.OnboardingStartupGate) r5
            goto L85
        L27:
            com.facebook.aura.startup.onboarding.AuraNonBlockingOnboardingJob$execute$1 r3 = new com.facebook.aura.startup.onboarding.AuraNonBlockingOnboardingJob$execute$1
            r3.<init>(r9)
            goto L12
        L2d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L32:
            X.Hwg.A00(r2)
            java.lang.String r0 = "execute: start (refreshing gate)"
            X.CFK.A05(r4, r0)
            com.facebook.aura.onboarding.OnboardingStartupGate$Companion r0 = com.facebook.aura.onboarding.OnboardingStartupGate.Companion
            com.facebook.aura.onboarding.OnboardingStartupGate r5 = r0.getInstance(r8)
            boolean r0 = r5.hasCompletedOnboarding()
            if (r0 != 0) goto L4e
            java.lang.String r0 = "execute: skip \u2014 onboarding is incomplete; screen-owned onboarding flow owns the fetch"
            X.CFK.A05(r4, r0)
        L4b:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L4e:
            com.facebook.aura.gateway.HatchGatewayConnection r0 = X.C60O.A05(r8)
            r3.L$0 = r8
            r3.L$1 = r5
            r3.label = r1
            java.lang.Object r0 = r0.awaitConnected(r3)
            if (r0 != r6) goto L69
            return r6
        L5f:
            java.lang.Object r5 = r3.L$1
            com.facebook.aura.onboarding.OnboardingStartupGate r5 = (com.facebook.aura.onboarding.OnboardingStartupGate) r5
            java.lang.Object r0 = r3.L$0
            X.CGz r8 = X.C60O.A0D(r0, r2)
        L69:
            com.facebook.aura.onboarding.OnboardingStateManager$Companion r0 = com.facebook.aura.onboarding.OnboardingStateManager.Companion
            com.facebook.aura.onboarding.OnboardingStateManager r0 = r0.getInstance(r8)
            java.lang.String r2 = r0.getSelectedVariant()
            com.facebook.aura.onboarding.OnboardingIntroApi r1 = com.facebook.aura.onboarding.OnboardingIntroApi.INSTANCE     // Catch: java.lang.Exception -> Lae
            r0 = 0
            r3.L$0 = r0     // Catch: java.lang.Exception -> Lae
            r3.L$1 = r5     // Catch: java.lang.Exception -> Lae
            r3.L$2 = r0     // Catch: java.lang.Exception -> Lae
            r3.label = r7     // Catch: java.lang.Exception -> Lae
            java.lang.Object r1 = r1.m1615getIntroBWLJW6A(r8, r2, r0, r3)     // Catch: java.lang.Exception -> Lae
            if (r1 != r6) goto L89
            goto Lad
        L85:
            java.lang.Object r1 = X.AnonymousClass001.A0q(r2)     // Catch: java.lang.Exception -> Lae
        L89:
            boolean r0 = r1 instanceof X.C10571Hud     // Catch: java.lang.Exception -> Lae
            if (r0 == 0) goto L8e
            r1 = 0
        L8e:
            com.facebook.aura.onboarding.OnboardingIntroResponse r1 = (com.facebook.aura.onboarding.OnboardingIntroResponse) r1     // Catch: java.lang.Exception -> Lae
            if (r1 != 0) goto L98
            java.lang.String r0 = "execute: fetch returned null, leaving gate unchanged"
            X.CFK.A04(r4, r0)
            goto L4b
        L98:
            boolean r0 = r1.getNeedsUiFlow()
            r3 = r0 ^ 1
            java.lang.String r2 = r1.mode
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "execute: non-blocking fetch succeeded mode=%s setCompleted=%s"
            X.CFK.A02(r2, r1, r4, r0)
            r5.setCompleted(r3)
            goto L4b
        Lad:
            return r6
        Lae:
            r1 = move-exception
            java.lang.String r0 = "execute: fetch threw, leaving gate unchanged"
            X.CFK.A08(r4, r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.onboarding.AuraNonBlockingOnboardingJob.execute(X.CGz, X.HtJ):java.lang.Object");
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
        return AppJobId.NON_BLOCKING_ONBOARDING;
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
        return AppJobId.NON_BLOCKING_ONBOARDING;
    }
}
