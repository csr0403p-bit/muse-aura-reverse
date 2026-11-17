package com.facebook.aura.pairs;

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
public final class ConnectionsTabStartupJob implements SessionedStartupJob {
    public static final int $stable = 0;
    public static final ConnectionsTabStartupJob INSTANCE = new ConnectionsTabStartupJob();

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsTabStartupJob", f = "ConnectionsTabStartupJob.kt", l = {40, R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsTabStartupJob$execute$1, reason: invalid class name */
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
            return ConnectionsTabStartupJob.this.execute(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.pairs.ConnectionsTabStartupJob.AnonymousClass1
            if (r0 == 0) goto L78
            r3 = r8
            com.facebook.aura.pairs.ConnectionsTabStartupJob$execute$1 r3 = (com.facebook.aura.pairs.ConnectionsTabStartupJob.AnonymousClass1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L78
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r1 = r3.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L26
            if (r0 == r6) goto L5b
            if (r0 != r5) goto L7e
            X.Hwg.A00(r1)
        L23:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L26:
            X.Hwg.A00(r1)
            com.facebook.aura.pairs.ConnectionsTabStore$Companion r0 = com.facebook.aura.pairs.ConnectionsTabStore.Companion
            com.facebook.aura.pairs.ConnectionsTabStore r0 = r0.getInstance(r7)
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.hasStarted
            boolean r1 = X.C3cI.A1W(r0)
            r2 = r1 ^ 1
            com.facebook.aura.utils.HatchUtil r0 = com.facebook.aura.utils.HatchUtil.INSTANCE
            boolean r0 = r0.isConnectionsTabEnabled()
            if (r0 == 0) goto L23
            com.facebook.aura.pairs.PairsInviteMailbox$Companion r0 = com.facebook.aura.pairs.PairsInviteMailbox.Companion
            com.facebook.aura.pairs.PairsInviteMailbox r0 = r0.getInstance(r7)
            r0.startPullTriggers()
            if (r1 != 0) goto L23
            com.facebook.aura.gateway.HatchGatewayConnection r0 = X.C60O.A05(r7)
            r3.L$0 = r7
            r3.I$0 = r2
            r3.label = r6
            java.lang.Object r0 = r0.awaitConnected(r3)
            if (r0 != r4) goto L63
            return r4
        L5b:
            int r2 = r3.I$0
            java.lang.Object r0 = r3.L$0
            X.CGz r7 = X.C60O.A0D(r0, r1)
        L63:
            com.facebook.aura.pairs.ConnectionsTabStore$Companion r0 = com.facebook.aura.pairs.ConnectionsTabStore.Companion
            com.facebook.aura.pairs.ConnectionsTabStore r1 = r0.getInstance(r7)
            r0 = 0
            r3.L$0 = r0
            r3.I$0 = r2
            r3.label = r5
            r0 = 0
            java.lang.Object r0 = r1.refresh(r0, r3)
            if (r0 != r4) goto L23
            return r4
        L78:
            com.facebook.aura.pairs.ConnectionsTabStartupJob$execute$1 r3 = new com.facebook.aura.pairs.ConnectionsTabStartupJob$execute$1
            r3.<init>(r8)
            goto L12
        L7e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsTabStartupJob.execute(X.CGz, X.HtJ):java.lang.Object");
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
        return AppJobId.CONNECTIONS_TAB;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public StartupPhase getPhase() {
        return StartupPhase.NON_BLOCKING_LOW_PRIORITY;
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
        return AppJobId.CONNECTIONS_TAB;
    }
}
