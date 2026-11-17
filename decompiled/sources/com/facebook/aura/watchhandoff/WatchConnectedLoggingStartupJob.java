package com.facebook.aura.watchhandoff;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BzK;
import X.C0881AGi;
import X.C31u;
import X.C3UX;
import X.C3cJ;
import X.C4oT;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import X.InterfaceC7359EnW;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.FeatureAppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import com.facebook.aura.watchhandoff.MC;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class WatchConnectedLoggingStartupJob implements SessionedStartupJob {
    public static final int $stable = 0;
    public static final String LOGGED_KEY = "watch_connected_detected_logged";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(WatchConnectedLoggingStartupJob.class, "enabled", "getEnabled()Z");
    public static final WatchConnectedLoggingStartupJob INSTANCE = new WatchConnectedLoggingStartupJob();
    public static final AppJobKey key = new FeatureAppJobKey("WATCH_CONNECTED_LOGGING");
    public static final C31u enabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_wear.watch_promotion_logging_enabled);

    @DebugMetadata(c = "com.facebook.aura.watchhandoff.WatchConnectedLoggingStartupJob$execute$2", f = "WatchConnectedLoggingStartupJob.kt", l = {59}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.watchhandoff.WatchConnectedLoggingStartupJob$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$userSession, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass2(this.$userSession, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C4oT c4oTUserPrefs;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            boolean zAreEqual = false;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    if (WatchConnectedLoggingStartupJob.INSTANCE.getEnabled() && AuraSessionManager.INSTANCE.isCurrentSession(this.$userSession)) {
                        c4oTUserPrefs = HatchPrefsStore.INSTANCE.userPrefs(this.$userSession);
                        if (!c4oTUserPrefs.getBoolean(WatchConnectedLoggingStartupJob.LOGGED_KEY, false)) {
                            try {
                                WatchConnectedLoggingStartupJob$execute$2$connected$1 watchConnectedLoggingStartupJob$execute$2$connected$1 = new WatchConnectedLoggingStartupJob$execute$2$connected$1(null);
                                this.L$0 = c4oTUserPrefs;
                                this.label = 1;
                                obj = GAX.A01(this, watchConnectedLoggingStartupJob$execute$2$connected$1, 5000L);
                                if (obj == enumC10460Hji) {
                                    return enumC10460Hji;
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                c4oTUserPrefs = (C4oT) this.L$0;
                try {
                    Hwg.A00(obj);
                } catch (Exception unused2) {
                }
                zAreEqual = C7384Etj.areEqual(obj, true);
                if (zAreEqual && WatchConnectedLoggingStartupJob.INSTANCE.getEnabled() && AuraSessionManager.INSTANCE.isCurrentSession(this.$userSession)) {
                    HatchAppEventLogger.INSTANCE.logEvent("watch_connected_detected", null, null, null, null, null, null);
                    BzK bzKA9q = c4oTUserPrefs.A9q();
                    bzKA9q.A0A(WatchConnectedLoggingStartupJob.LOGGED_KEY, true);
                    bzKA9q.commit();
                }
                return Unit.INSTANCE;
            } catch (CancellationException e) {
                throw e;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getEnabled() {
        return C31u.A01(this, enabled$delegate, $$delegatedProperties, 0);
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
    public AppJobKey getJobId() {
        return key;
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

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public Object execute(AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        return C3cJ.A0D(htJ, AnonymousClass001.A0y(), new AnonymousClass2(abstractC3358CGz, null));
    }
}
