package com.facebook.aura.startup.userdata;

import X.AbstractC3358CGz;
import X.C0881AGi;
import X.C3cG;
import X.C60P;
import X.HtJ;
import X.HzP;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import com.facebook.aura.user.provider.AuraUserDataFetchState;
import com.facebook.aura.user.provider.HatchGatewayConnectOwnership;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class AuraUserDataStartupJob implements SessionedStartupJob {
    public static final AuraUserDataStartupJob INSTANCE = new AuraUserDataStartupJob();
    public static final String TAG = "AuraUserDataStartupJob";

    @DebugMetadata(c = "com.facebook.aura.startup.userdata.AuraUserDataStartupJob", f = "AuraUserDataStartupJob.kt", l = {82}, m = "fetchIfNeeded", v = 2)
    /* renamed from: com.facebook.aura.startup.userdata.AuraUserDataStartupJob$fetchIfNeeded$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraUserDataStartupJob.this.fetchIfNeeded(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchIfNeeded(X.AbstractC3358CGz r13, X.HtJ<? super kotlin.Unit> r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.userdata.AuraUserDataStartupJob.fetchIfNeeded(X.CGz, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public Object execute(AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        HatchGatewayConnectOwnership.Companion.getInstance(abstractC3358CGz);
        return C3cG.A0U(fetchIfNeeded(abstractC3358CGz, htJ));
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
        return AppJobId.FETCH_USER_DATA;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public StartupPhase getPhase() {
        return AuraUserDataFetchState.INSTANCE.isFirstFetchPending() ? StartupPhase.BLOCKING : StartupPhase.NON_BLOCKING_CRITICAL_PRIORITY;
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
        return AppJobId.FETCH_USER_DATA;
    }
}
