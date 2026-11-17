package com.facebook.aura.startup.session;

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
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class HatchPrimarySessionStartupJob implements SessionedStartupJob {
    public static final HatchPrimarySessionStartupJob INSTANCE = new HatchPrimarySessionStartupJob();

    @DebugMetadata(c = "com.facebook.aura.startup.session.HatchPrimarySessionStartupJob", f = "HatchPrimarySessionStartupJob.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight, R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.startup.session.HatchPrimarySessionStartupJob$execute$1, reason: invalid class name */
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
            return HatchPrimarySessionStartupJob.this.execute(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.startup.session.HatchPrimarySessionStartupJob.AnonymousClass1
            if (r0 == 0) goto L50
            r5 = r8
            com.facebook.aura.startup.session.HatchPrimarySessionStartupJob$execute$1 r5 = (com.facebook.aura.startup.session.HatchPrimarySessionStartupJob.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 == r1) goto L38
            if (r0 != r2) goto L56
            X.Hwg.A00(r4)
        L23:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L26:
            X.Hwg.A00(r4)
            com.facebook.aura.gateway.HatchGatewayConnection r0 = X.C60O.A05(r7)
            r5.L$0 = r7
            r5.label = r1
            java.lang.Object r0 = r0.awaitConnected(r5)
            if (r0 != r3) goto L3e
            return r3
        L38:
            java.lang.Object r0 = r5.L$0
            X.CGz r7 = X.C60O.A0D(r0, r4)
        L3e:
            com.facebook.aura.conversation.repo.HatchPrimarySessionRepository$Companion r0 = com.facebook.aura.conversation.repo.HatchPrimarySessionRepository.Companion
            com.facebook.aura.conversation.repo.HatchPrimarySessionRepository r1 = r0.getInstance(r7)
            r0 = 0
            r5.L$0 = r0
            r5.label = r2
            java.lang.Object r0 = r1.ensureLoaded(r5)
            if (r0 != r3) goto L23
            return r3
        L50:
            com.facebook.aura.startup.session.HatchPrimarySessionStartupJob$execute$1 r5 = new com.facebook.aura.startup.session.HatchPrimarySessionStartupJob$execute$1
            r5.<init>(r8)
            goto L12
        L56:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.session.HatchPrimarySessionStartupJob.execute(X.CGz, X.HtJ):java.lang.Object");
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
        return AppJobId.PRIMARY_SESSION_FETCH;
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
        return AppJobId.PRIMARY_SESSION_FETCH;
    }
}
