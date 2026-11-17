package com.facebook.aura.startup.conversation;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C0881AGi;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GAt;
import X.GBM;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC10560Hsz;
import android.os.SystemClock;
import com.facebook.aura.conversation.repo.LoadChatHistoryOutcome;
import com.facebook.aura.conversation.viewmodel.HatchComposerDraftStore;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchConversationPrefetchStartupJob implements SessionedStartupJob {
    public static final HatchConversationPrefetchStartupJob INSTANCE = new HatchConversationPrefetchStartupJob();
    public static final AtomicBoolean firstRunStarted = C60O.A1E();
    public static final InterfaceC10560Hsz<Unit> firstRunFinished = new GAt(null);

    @DebugMetadata(c = "com.facebook.aura.startup.conversation.HatchConversationPrefetchStartupJob", f = "HatchConversationPrefetchStartupJob.kt", l = {134, 138, 143, 150, 153, 154, 157, 163}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.startup.conversation.HatchConversationPrefetchStartupJob$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public long J$1;
        public long J$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConversationPrefetchStartupJob.this.execute(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.conversation.HatchConversationPrefetchStartupJob$execute$2", f = "HatchConversationPrefetchStartupJob.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.startup.conversation.HatchConversationPrefetchStartupJob$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AbstractC3358CGz $userSession;
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
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchComposerDraftStore.Companion.forCurrentVm(this.$userSession).prewarmIfDraftStored();
            return Unit.INSTANCE;
        }
    }

    private final void releaseFirstRunWaitersIfNeeded(boolean z) {
        if (z) {
            HoC hoC = firstRunFinished;
            if (hoC.AOG()) {
                return;
            }
            CFK.A05(HatchConversationPrefetchStartupJobKt.TAG, "execute: first run finished, releasing dependent prefetch jobs");
            ((GBM) hoC).A0R(Unit.INSTANCE);
        }
    }

    public final Object awaitFirstRunFinished(HtJ<? super Unit> htJ) {
        Object objA0W = C3cG.A0W(firstRunFinished, htJ);
        return objA0W != EnumC10460Hji.A02 ? Unit.INSTANCE : objA0W;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0110 A[Catch: Exception -> 0x0203, all -> 0x0219, TryCatch #1 {Exception -> 0x0203, blocks: (B:63:0x01ec, B:64:0x01ef, B:65:0x01fa, B:56:0x01bd, B:57:0x01c0, B:59:0x01c7, B:15:0x0052, B:53:0x01a0, B:17:0x0065, B:48:0x0181, B:19:0x0079, B:43:0x0141, B:45:0x0163, B:21:0x008d, B:44:0x0151, B:23:0x009f, B:35:0x0102, B:37:0x0110, B:40:0x0128, B:25:0x00b0, B:32:0x00ec, B:28:0x00d0), top: B:74:0x0026, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0128 A[Catch: Exception -> 0x0203, all -> 0x0219, TryCatch #1 {Exception -> 0x0203, blocks: (B:63:0x01ec, B:64:0x01ef, B:65:0x01fa, B:56:0x01bd, B:57:0x01c0, B:59:0x01c7, B:15:0x0052, B:53:0x01a0, B:17:0x0065, B:48:0x0181, B:19:0x0079, B:43:0x0141, B:45:0x0163, B:21:0x008d, B:44:0x0151, B:23:0x009f, B:35:0x0102, B:37:0x0110, B:40:0x0128, B:25:0x00b0, B:32:0x00ec, B:28:0x00d0), top: B:74:0x0026, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0180 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a0 A[Catch: Exception -> 0x0203, all -> 0x0219, TryCatch #1 {Exception -> 0x0203, blocks: (B:63:0x01ec, B:64:0x01ef, B:65:0x01fa, B:56:0x01bd, B:57:0x01c0, B:59:0x01c7, B:15:0x0052, B:53:0x01a0, B:17:0x0065, B:48:0x0181, B:19:0x0079, B:43:0x0141, B:45:0x0163, B:21:0x008d, B:44:0x0151, B:23:0x009f, B:35:0x0102, B:37:0x0110, B:40:0x0128, B:25:0x00b0, B:32:0x00ec, B:28:0x00d0), top: B:74:0x0026, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c7 A[Catch: Exception -> 0x0203, all -> 0x0219, TryCatch #1 {Exception -> 0x0203, blocks: (B:63:0x01ec, B:64:0x01ef, B:65:0x01fa, B:56:0x01bd, B:57:0x01c0, B:59:0x01c7, B:15:0x0052, B:53:0x01a0, B:17:0x0065, B:48:0x0181, B:19:0x0079, B:43:0x0141, B:45:0x0163, B:21:0x008d, B:44:0x0151, B:23:0x009f, B:35:0x0102, B:37:0x0110, B:40:0x0128, B:25:0x00b0, B:32:0x00ec, B:28:0x00d0), top: B:74:0x0026, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e9  */
    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r22, X.HtJ<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.conversation.HatchConversationPrefetchStartupJob.execute(X.CGz, X.HtJ):java.lang.Object");
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
        return AppJobId.CONVERSATION_PREFETCH;
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

    private final void logLoadChatHistoryResult(LoadChatHistoryOutcome loadChatHistoryOutcome, long j, long j2, boolean z) {
        long jUptimeMillis = SystemClock.uptimeMillis() - j;
        long jUptimeMillis2 = SystemClock.uptimeMillis() - j2;
        StringBuilder sbA0z = C60O.A0z("execute: loadChatHistory returned in ", jUptimeMillis);
        sbA0z.append("ms (outcome=");
        sbA0z.append(loadChatHistoryOutcome);
        sbA0z.append(", total=");
        sbA0z.append(jUptimeMillis2);
        sbA0z.append("ms, isFirstRun=");
        sbA0z.append(z);
        CFK.A05(HatchConversationPrefetchStartupJobKt.TAG, AnonymousClass001.A0v(")", sbA0z));
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public /* bridge */ /* synthetic */ AppJobKey getJobId() {
        return AppJobId.CONVERSATION_PREFETCH;
    }
}
