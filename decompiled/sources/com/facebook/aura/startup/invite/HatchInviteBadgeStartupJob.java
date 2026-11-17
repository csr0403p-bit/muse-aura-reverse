package com.facebook.aura.startup.invite;

import X.C0881AGi;
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
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class HatchInviteBadgeStartupJob implements SessionedStartupJob {
    public static final HatchInviteBadgeStartupJob INSTANCE = new HatchInviteBadgeStartupJob();

    @DebugMetadata(c = "com.facebook.aura.startup.invite.HatchInviteBadgeStartupJob", f = "HatchInviteBadgeStartupJob.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight, R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.startup.invite.HatchInviteBadgeStartupJob$execute$1, reason: invalid class name */
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
            return HatchInviteBadgeStartupJob.this.execute(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r6, X.HtJ<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.startup.invite.HatchInviteBadgeStartupJob.AnonymousClass1
            if (r0 == 0) goto L58
            r4 = r7
            com.facebook.aura.startup.invite.HatchInviteBadgeStartupJob$execute$1 r4 = (com.facebook.aura.startup.invite.HatchInviteBadgeStartupJob.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r5 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 == r1) goto L40
            if (r0 != r2) goto L5e
            X.Hwg.A00(r5)
        L23:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L26:
            X.Hwg.A00(r5)
            com.facebook.aura.utils.HatchUtil r0 = com.facebook.aura.utils.HatchUtil.INSTANCE
            boolean r0 = r0.isInviteFriendsEnabled()
            if (r0 == 0) goto L23
            com.facebook.aura.gateway.HatchGatewayConnection r0 = X.C60O.A05(r6)
            r4.L$0 = r6
            r4.label = r1
            java.lang.Object r0 = r0.awaitConnected(r4)
            if (r0 != r3) goto L46
            return r3
        L40:
            java.lang.Object r0 = r4.L$0
            X.CGz r6 = X.C60O.A0D(r0, r5)
        L46:
            com.facebook.aura.invite.HatchInviteBadgeRepository$Companion r0 = com.facebook.aura.invite.HatchInviteBadgeRepository.Companion
            com.facebook.aura.invite.HatchInviteBadgeRepository r1 = r0.getInstance(r6)
            r0 = 0
            r4.L$0 = r0
            r4.label = r2
            java.lang.Object r0 = r1.fetchBadgeState(r4)
            if (r0 != r3) goto L23
            return r3
        L58:
            com.facebook.aura.startup.invite.HatchInviteBadgeStartupJob$execute$1 r4 = new com.facebook.aura.startup.invite.HatchInviteBadgeStartupJob$execute$1
            r4.<init>(r7)
            goto L12
        L5e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.invite.HatchInviteBadgeStartupJob.execute(X.CGz, X.HtJ):java.lang.Object");
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
        return AppJobId.INVITE_BADGE_FETCH;
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
        return AppJobId.INVITE_BADGE_FETCH;
    }
}
