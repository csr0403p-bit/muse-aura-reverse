package com.facebook.aura.startup.userdata;

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
public final class AuraUserDataBackgroundRefreshJob implements SessionedStartupJob {
    public static final AuraUserDataBackgroundRefreshJob INSTANCE = new AuraUserDataBackgroundRefreshJob();
    public static final String TAG = "AuraUserDataBgRefresh";

    @DebugMetadata(c = "com.facebook.aura.startup.userdata.AuraUserDataBackgroundRefreshJob", f = "AuraUserDataBackgroundRefreshJob.kt", l = {R.styleable.maplibre_MapView_maplibre_uiRotateGestures}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.startup.userdata.AuraUserDataBackgroundRefreshJob$execute$1, reason: invalid class name */
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
            return AuraUserDataBackgroundRefreshJob.this.execute(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r6, X.HtJ<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.startup.userdata.AuraUserDataBackgroundRefreshJob.AnonymousClass1
            if (r0 == 0) goto L1e
            r4 = r7
            com.facebook.aura.startup.userdata.AuraUserDataBackgroundRefreshJob$execute$1 r4 = (com.facebook.aura.startup.userdata.AuraUserDataBackgroundRefreshJob.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L28
            goto L24
        L1e:
            com.facebook.aura.startup.userdata.AuraUserDataBackgroundRefreshJob$execute$1 r4 = new com.facebook.aura.startup.userdata.AuraUserDataBackgroundRefreshJob$execute$1
            r4.<init>(r7)
            goto L12
        L24:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L43
            goto L43
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            com.facebook.aura.user.repo.AuraUserRepository$Companion r0 = com.facebook.aura.user.repo.AuraUserRepository.Companion     // Catch: java.lang.Exception -> L43
            com.facebook.aura.user.repo.AuraUserRepository r1 = r0.getInstance(r6)     // Catch: java.lang.Exception -> L43
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Exception -> L43
            r4.label = r2     // Catch: java.lang.Exception -> L43
            r0 = 0
            java.lang.Object r0 = r1.fetchUser(r0, r4)     // Catch: java.lang.Exception -> L43
            if (r0 != r3) goto L43
            return r3
        L43:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.userdata.AuraUserDataBackgroundRefreshJob.execute(X.CGz, X.HtJ):java.lang.Object");
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
        return AppJobId.BACKGROUND_REFRESH_USER_DATA;
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
        return AppJobId.BACKGROUND_REFRESH_USER_DATA;
    }
}
