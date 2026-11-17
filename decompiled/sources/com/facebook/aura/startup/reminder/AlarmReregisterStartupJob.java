package com.facebook.aura.startup.reminder;

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

/* loaded from: classes3.dex */
public final class AlarmReregisterStartupJob implements SessionedStartupJob {
    public static final AlarmReregisterStartupJob INSTANCE = new AlarmReregisterStartupJob();
    public static final String TAG = "AlarmReregisterJob";

    @DebugMetadata(c = "com.facebook.aura.startup.reminder.AlarmReregisterStartupJob", f = "AlarmReregisterStartupJob.kt", l = {50}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.startup.reminder.AlarmReregisterStartupJob$execute$1, reason: invalid class name */
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
            return AlarmReregisterStartupJob.this.execute(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r5, X.HtJ<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.facebook.aura.startup.reminder.AlarmReregisterStartupJob.AnonymousClass1
            if (r0 == 0) goto L1e
            r5 = r6
            com.facebook.aura.startup.reminder.AlarmReregisterStartupJob$execute$1 r5 = (com.facebook.aura.startup.reminder.AlarmReregisterStartupJob.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L28
            goto L24
        L1e:
            com.facebook.aura.startup.reminder.AlarmReregisterStartupJob$execute$1 r5 = new com.facebook.aura.startup.reminder.AlarmReregisterStartupJob$execute$1
            r5.<init>(r6)
            goto L12
        L24:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L42
            goto L52
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            com.facebook.aura.commands.alarm.HatchAlarmScheduler r2 = com.facebook.aura.commands.alarm.HatchAlarmScheduler.INSTANCE     // Catch: java.lang.Exception -> L42
            android.app.Application r1 = X.C4JM.A00()     // Catch: java.lang.Exception -> L42
            r0 = 0
            r5.L$0 = r0     // Catch: java.lang.Exception -> L42
            r5.label = r3     // Catch: java.lang.Exception -> L42
            java.lang.Object r0 = r2.reregisterAll(r1, r5)     // Catch: java.lang.Exception -> L42
            if (r0 != r4) goto L52
            return r4
        L42:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "Failed to re-arm alarms: "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "AlarmReregisterJob"
            X.CFK.A06(r0, r1)
        L52:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.reminder.AlarmReregisterStartupJob.execute(X.CGz, X.HtJ):java.lang.Object");
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
        return AppJobId.ALARM_REREGISTER;
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
        return ResumePolicy.OncePerProcess.INSTANCE;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public /* bridge */ long getTimeoutMs() {
        return 10000L;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.ALARM_REREGISTER;
    }
}
