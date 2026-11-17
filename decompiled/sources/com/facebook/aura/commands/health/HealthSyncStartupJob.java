package com.facebook.aura.commands.health;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C0881AGi;
import X.C3UX;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class HealthSyncStartupJob implements SessionedStartupJob {
    public static final HealthSyncStartupJob INSTANCE = new HealthSyncStartupJob();

    @DebugMetadata(c = "com.facebook.aura.commands.health.HealthSyncStartupJob", f = "HealthSyncStartupJob.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoGravity, 44}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.commands.health.HealthSyncStartupJob$execute$1, reason: invalid class name */
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
            return HealthSyncStartupJob.this.execute(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.health.HealthSyncStartupJob$execute$2", f = "HealthSyncStartupJob.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.health.HealthSyncStartupJob$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HealthSyncManager $manager;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HealthSyncManager healthSyncManager, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$manager = healthSyncManager;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$manager, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass2(this.$manager, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HealthSyncManager healthSyncManager = this.$manager;
                    this.label = 1;
                    if (healthSyncManager.runTrailingResyncIfDue(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(HealthSyncStartupJobKt.TAG, "Health trailing resync failed", e2);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.commands.health.HealthSyncStartupJob.AnonymousClass1
            if (r0 == 0) goto L5b
            r6 = r9
            com.facebook.aura.commands.health.HealthSyncStartupJob$execute$1 r6 = (com.facebook.aura.commands.health.HealthSyncStartupJob.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r2 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 == r1) goto L3d
            if (r0 != r4) goto L61
            X.Hwg.A00(r2)
        L23:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L26:
            X.Hwg.A00(r2)
            com.facebook.aura.commands.health.HealthSyncManager$Companion r0 = com.facebook.aura.commands.health.HealthSyncManager.Companion
            com.facebook.aura.commands.health.HealthSyncManager r3 = r0.getInstance(r8)
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r3
            r6.label = r1
            java.lang.Object r0 = r3.configureMonitoring(r6)
            if (r0 != r5) goto L44
            return r5
        L3d:
            java.lang.Object r3 = r6.L$1
            com.facebook.aura.commands.health.HealthSyncManager r3 = (com.facebook.aura.commands.health.HealthSyncManager) r3
            X.Hwg.A00(r2)
        L44:
            X.78T r2 = X.AnonymousClass001.A0y()
            r1 = 0
            com.facebook.aura.commands.health.HealthSyncStartupJob$execute$2 r0 = new com.facebook.aura.commands.health.HealthSyncStartupJob$execute$2
            r0.<init>(r3, r1)
            r6.L$0 = r1
            r6.L$1 = r1
            r6.label = r4
            java.lang.Object r0 = X.GAo.A00(r6, r2, r0)
            if (r0 != r5) goto L23
            return r5
        L5b:
            com.facebook.aura.commands.health.HealthSyncStartupJob$execute$1 r6 = new com.facebook.aura.commands.health.HealthSyncStartupJob$execute$1
            r6.<init>(r9)
            goto L12
        L61:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.health.HealthSyncStartupJob.execute(X.CGz, X.HtJ):java.lang.Object");
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
        return AppJobId.HEALTH_SYNC;
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
        return AppJobId.HEALTH_SYNC;
    }
}
