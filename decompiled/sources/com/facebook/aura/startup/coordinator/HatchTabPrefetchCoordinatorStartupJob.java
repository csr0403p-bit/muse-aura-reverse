package com.facebook.aura.startup.coordinator;

import X.AbstractC3358CGz;
import X.C0881AGi;
import X.C60P;
import X.EnumC10460Hji;
import X.HtJ;
import X.HzP;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.spaces.repo.HatchSpacesDataSource;
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
public final class HatchTabPrefetchCoordinatorStartupJob implements SessionedStartupJob {
    public static final String TAB_ID_SPACES = "spaces";
    public static final HatchTabPrefetchCoordinatorStartupJob INSTANCE = new HatchTabPrefetchCoordinatorStartupJob();
    public static final AtomicBoolean threadsPrefetchStarted = new AtomicBoolean(false);
    public static final AtomicBoolean feedPrefetchStarted = new AtomicBoolean(false);

    @DebugMetadata(c = "com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob", f = "HatchTabPrefetchCoordinatorStartupJob.kt", l = {96, 98, FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE, 114, AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, 140}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
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
            return HatchTabPrefetchCoordinatorStartupJob.this.execute(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob", f = "HatchTabPrefetchCoordinatorStartupJob.kt", l = {180}, m = "prefetchFeedIfNeeded", v = 2)
    /* renamed from: com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob$prefetchFeedIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    public final class C140051 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C140051(HtJ<? super C140051> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchTabPrefetchCoordinatorStartupJob.this.prefetchFeedIfNeeded(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob", f = "HatchTabPrefetchCoordinatorStartupJob.kt", l = {HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE, 223, 235}, m = "prefetchSideChatHistories", v = 2)
    /* renamed from: com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob$prefetchSideChatHistories$1, reason: invalid class name and case insensitive filesystem */
    public final class C140061 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C140061(HtJ<? super C140061> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchTabPrefetchCoordinatorStartupJob.this.prefetchSideChatHistories(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob", f = "HatchTabPrefetchCoordinatorStartupJob.kt", l = {191, 192}, m = "prefetchThreadsIfNeeded", v = 2)
    /* renamed from: com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob$prefetchThreadsIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    public final class C140071 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C140071(HtJ<? super C140071> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchTabPrefetchCoordinatorStartupJob.this.prefetchThreadsIfNeeded(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob", f = "HatchTabPrefetchCoordinatorStartupJob.kt", l = {150, 152, 153, 156, 158, 162}, m = "preloadTab", v = 2)
    /* renamed from: com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob$preloadTab$1, reason: invalid class name and case insensitive filesystem */
    public final class C140081 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C140081(HtJ<? super C140081> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchTabPrefetchCoordinatorStartupJob.this.preloadTab(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prefetchFeedIfNeeded(X.AbstractC3358CGz r6, X.HtJ<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob.C140051
            if (r0 == 0) goto L1e
            r4 = r7
            com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob$prefetchFeedIfNeeded$1 r4 = (com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob.C140051) r4
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
            com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob$prefetchFeedIfNeeded$1 r4 = new com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob$prefetchFeedIfNeeded$1
            r4.<init>(r7)
            goto L12
        L24:
            X.Hwg.A00(r1)     // Catch: java.util.concurrent.CancellationException -> L53 java.lang.Exception -> L55
            goto L59
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            com.facebook.aura.utils.HatchUtil r0 = com.facebook.aura.utils.HatchUtil.INSTANCE
            boolean r0 = r0.isFeedEnabled()
            if (r0 == 0) goto L59
            java.util.concurrent.atomic.AtomicBoolean r1 = com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob.feedPrefetchStarted
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r2)
            if (r0 == 0) goto L59
            com.facebook.aura.feed.repo.FeedRepository$Companion r0 = com.facebook.aura.feed.repo.FeedRepository.Companion     // Catch: java.util.concurrent.CancellationException -> L53 java.lang.Exception -> L55
            com.facebook.aura.feed.repo.FeedRepository r1 = r0.getInstance(r6)     // Catch: java.util.concurrent.CancellationException -> L53 java.lang.Exception -> L55
            r0 = 0
            r4.L$0 = r0     // Catch: java.util.concurrent.CancellationException -> L53 java.lang.Exception -> L55
            r4.label = r2     // Catch: java.util.concurrent.CancellationException -> L53 java.lang.Exception -> L55
            java.lang.Object r0 = r1.prefetchInitialFeed(r4)     // Catch: java.util.concurrent.CancellationException -> L53 java.lang.Exception -> L55
            if (r0 != r3) goto L59
            return r3
        L53:
            r0 = move-exception
            throw r0
        L55:
            r0 = move-exception
            r0.getMessage()
        L59:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob.prefetchFeedIfNeeded(X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:26:0x00b8, B:60:?], limit reached: 62 */
    /* JADX WARN: Path cross not found for [B:28:0x00bc, B:60:?], limit reached: 62 */
    /* JADX WARN: Path cross not found for [B:30:0x00c0, B:60:?], limit reached: 62 */
    /* JADX WARN: Path cross not found for [B:60:?, B:26:0x00b8], limit reached: 62 */
    /* JADX WARN: Path cross not found for [B:60:?, B:32:0x00c4], limit reached: 62 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a3  */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b6 -> B:13:0x0042). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ba -> B:13:0x0042). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00be -> B:13:0x0042). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c2 -> B:13:0x0042). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d2 -> B:13:0x0042). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0106 -> B:13:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prefetchSideChatHistories(X.AbstractC3358CGz r18, com.facebook.aura.conversation.repo.HatchThreadsRepository r19, X.HtJ<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob.prefetchSideChatHistories(X.CGz, com.facebook.aura.conversation.repo.HatchThreadsRepository, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prefetchThreadsIfNeeded(X.AbstractC3358CGz r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob.C140071
            if (r0 == 0) goto L5f
            r5 = r9
            com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob$prefetchThreadsIfNeeded$1 r5 = (com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob.C140071) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r6 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L26
            if (r0 == r2) goto L47
            if (r0 != r3) goto L65
            X.Hwg.A00(r6)
        L23:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L26:
            X.Hwg.A00(r6)
            java.util.concurrent.atomic.AtomicBoolean r1 = com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob.threadsPrefetchStarted
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r2)
            if (r0 == 0) goto L23
            com.facebook.aura.conversation.repo.HatchThreadsRepository$Companion r0 = com.facebook.aura.conversation.repo.HatchThreadsRepository.Companion
            com.facebook.aura.conversation.repo.HatchThreadsRepository r1 = r0.getInstance(r8)
            com.facebook.aura.conversation.repo.ThreadsView r0 = com.facebook.aura.conversation.repo.ThreadsView.ACTIVE
            r5.L$0 = r8
            r5.L$1 = r1
            r5.label = r2
            java.lang.Object r0 = r1.refresh(r0, r5)
            if (r0 != r4) goto L51
            return r4
        L47:
            java.lang.Object r1 = r5.L$1
            com.facebook.aura.conversation.repo.HatchThreadsRepository r1 = (com.facebook.aura.conversation.repo.HatchThreadsRepository) r1
            java.lang.Object r0 = r5.L$0
            X.CGz r8 = X.C60O.A0D(r0, r6)
        L51:
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r3
            java.lang.Object r0 = r7.prefetchSideChatHistories(r8, r1, r5)
            if (r0 != r4) goto L23
            return r4
        L5f:
            com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob$prefetchThreadsIfNeeded$1 r5 = new com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob$prefetchThreadsIfNeeded$1
            r5.<init>(r9)
            goto L12
        L65:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob.prefetchThreadsIfNeeded(X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object preloadSpaces(AbstractC3358CGz abstractC3358CGz, HtJ<? super Unit> htJ) {
        Object objLoadSpacesData = HatchSpacesDataSource.Companion.getInstance(abstractC3358CGz).loadSpacesData(false, htJ);
        return objLoadSpacesData != EnumC10460Hji.A02 ? Unit.INSTANCE : objLoadSpacesData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object preloadTab(java.lang.String r6, X.AbstractC3358CGz r7, X.HtJ<? super kotlin.Unit> r8) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob.preloadTab(java.lang.String, X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0152 -> B:59:0x0155). Please report as a decompilation issue!!! */
    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r13, X.HtJ<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob.execute(X.CGz, X.HtJ):java.lang.Object");
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
        return AppJobId.TAB_PREFETCH_COORDINATOR;
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
        return AppJobId.TAB_PREFETCH_COORDINATOR;
    }
}
