package com.facebook.aura.commands.health;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7608F5v;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV4;
import X.C06H;
import X.C31u;
import X.C3UX;
import X.C3cG;
import X.C60N;
import X.C60O;
import X.C7384Etj;
import X.C8954FuV;
import X.C9258GBl;
import X.C9tI;
import X.CFK;
import X.EnumC10460Hji;
import X.FvK;
import X.G0V;
import X.HoC;
import X.HrB;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.InterfaceC2261BLa;
import X.InterfaceC7359EnW;
import X.InterfaceC7549F2g;
import com.facebook.aura.commands.health.MC;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine;
import com.facebook.aura.health.HealthConnectorTelemetry;
import com.facebook.aura.health.HealthSyncTrigger;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.nodes.datasource.DataSourceResult;
import com.facebook.aura.nodes.datasource.NodeSyncBaselineStore;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.meta.health.core.MetaHealthQuery;
import com.meta.health.core.MetaHealthQueryObservationSession;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.TemporalAmount;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class HealthSyncManager implements InterfaceC7549F2g {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {C3cG.A0y(HealthSyncManager.class, "isHealthSyncEnabled", "isHealthSyncEnabled()Z")};
    public static final Companion Companion = new Companion();
    public volatile boolean cleared;
    public HoC debounceJob;
    public final AtomicBoolean firstSyncEmitted;
    public final C31u isHealthSyncEnabled$delegate;
    public final InterfaceC2261BLa mutex;
    public MetaHealthQueryObservationSession observationSession;
    public C3UX observerScope;
    public volatile long observerStartMs;
    public volatile PendingSync pendingSync;
    public final List<FvK> pendingUpdates;
    public HoC processingJob;
    public final InterfaceC2261BLa stageMutex;
    public volatile boolean stagedSyncExecuted;
    public final AbstractC3358CGz userSession;

    public final class PayloadDedupe {
        public final String hash;
        public final DedupeSpec spec;

        public final String getHash() {
            return this.hash;
        }

        public final DedupeSpec getSpec() {
            return this.spec;
        }

        public PayloadDedupe(DedupeSpec dedupeSpec, String str) {
            AnonymousClass003.A0u(dedupeSpec, str);
            this.spec = dedupeSpec;
            this.hash = str;
        }
    }

    public final class PendingSync {
        public final DedupeSpec dedupe;
        public final Instant end;
        public final long observerStartMs;
        public final C8954FuV provider;
        public final MetaHealthQuery query;
        public final Instant start;
        public final String syncMode;
        public final HealthSyncTrigger trigger;
        public final List<FvK> updatesToCommit;

        public /* synthetic */ PendingSync(MetaHealthQuery metaHealthQuery, C8954FuV c8954FuV, Instant instant, Instant instant2, List list, HealthSyncTrigger healthSyncTrigger, String str, long j, DedupeSpec dedupeSpec, int i, C06H c06h) {
            this(metaHealthQuery, c8954FuV, instant, instant2, list, healthSyncTrigger, str, (i & 128) != 0 ? 0L : j, (i & 256) != 0 ? null : dedupeSpec);
        }

        public final DedupeSpec getDedupe() {
            return this.dedupe;
        }

        public final Instant getEnd() {
            return this.end;
        }

        public final long getObserverStartMs() {
            return this.observerStartMs;
        }

        public final C8954FuV getProvider() {
            return this.provider;
        }

        public final MetaHealthQuery getQuery() {
            return this.query;
        }

        public final Instant getStart() {
            return this.start;
        }

        public final String getSyncMode() {
            return this.syncMode;
        }

        public final HealthSyncTrigger getTrigger() {
            return this.trigger;
        }

        public final List<FvK> getUpdatesToCommit() {
            return this.updatesToCommit;
        }

        public PendingSync(MetaHealthQuery metaHealthQuery, C8954FuV c8954FuV, Instant instant, Instant instant2, List<FvK> list, HealthSyncTrigger healthSyncTrigger, String str, long j, DedupeSpec dedupeSpec) {
            AnonymousClass005.A17(metaHealthQuery, c8954FuV, instant, instant2, list);
            AnonymousClass003.A0z(healthSyncTrigger, str);
            this.query = metaHealthQuery;
            this.provider = c8954FuV;
            this.start = instant;
            this.end = instant2;
            this.updatesToCommit = list;
            this.trigger = healthSyncTrigger;
            this.syncMode = str;
            this.observerStartMs = j;
            this.dedupe = dedupeSpec;
        }
    }

    public final class StagedSyncOutcome {
        public final boolean executed;
        public final DataSourceResult result;

        public StagedSyncOutcome(DataSourceResult dataSourceResult, boolean z) {
            C7384Etj.A0Y(dataSourceResult, 0);
            this.result = dataSourceResult;
            this.executed = z;
        }

        public final boolean getExecuted() {
            return this.executed;
        }

        public final DataSourceResult getResult() {
            return this.result;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.health.HealthSyncManager$clearUserData$1", f = "HealthSyncManager.kt", l = {218}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.health.HealthSyncManager$clearUserData$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HealthSyncManager.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HealthSyncManager.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    HealthSyncManager healthSyncManager = HealthSyncManager.this;
                    this.label = 1;
                    if (healthSyncManager.stop(this) == enumC10460Hji) {
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
                CFK.A08(HealthSyncManagerKt.TAG, "Failed to stop health observation on sign-out", e2);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.health.HealthSyncManager", f = "HealthSyncManager.kt", l = {622}, m = "commitAnchors", v = 2)
    /* renamed from: com.facebook.aura.commands.health.HealthSyncManager$commitAnchors$1, reason: invalid class name and case insensitive filesystem */
    public final class C111181 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C111181(HtJ<? super C111181> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthSyncManager.this.commitAnchors(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.health.HealthSyncManager", f = "HealthSyncManager.kt", l = {105, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 118, 641, 150, 152}, m = "configureMonitoring", v = 2)
    /* renamed from: com.facebook.aura.commands.health.HealthSyncManager$configureMonitoring$1, reason: invalid class name and case insensitive filesystem */
    public final class C111191 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C111191(HtJ<? super C111191> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthSyncManager.this.configureMonitoring(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.health.HealthSyncManager", f = "HealthSyncManager.kt", l = {451, 480, 482}, m = "executeStagedSync", v = 2)
    /* renamed from: com.facebook.aura.commands.health.HealthSyncManager$executeStagedSync$1, reason: invalid class name and case insensitive filesystem */
    public final class C111201 extends HzP {
        public int I$0;
        public int I$1;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C111201(HtJ<? super C111201> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthSyncManager.this.executeStagedSync(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.health.HealthSyncManager", f = "HealthSyncManager.kt", l = {641}, m = "handleObservationUpdate", v = 2)
    /* renamed from: com.facebook.aura.commands.health.HealthSyncManager$handleObservationUpdate$1, reason: invalid class name and case insensitive filesystem */
    public final class C111211 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C111211(HtJ<? super C111211> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthSyncManager.this.handleObservationUpdate(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.health.HealthSyncManager", f = "HealthSyncManager.kt", l = {641, 328, 341, 352}, m = "processObservationBatch", v = 2)
    /* renamed from: com.facebook.aura.commands.health.HealthSyncManager$processObservationBatch$1, reason: invalid class name and case insensitive filesystem */
    public final class C111221 extends HzP {
        public Object L$0;
        public Object L$1;
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

        public C111221(HtJ<? super C111221> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthSyncManager.this.processObservationBatch(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.health.HealthSyncManager", f = "HealthSyncManager.kt", l = {641, 422}, m = "runStagedSync", v = 2)
    /* renamed from: com.facebook.aura.commands.health.HealthSyncManager$runStagedSync$1, reason: invalid class name and case insensitive filesystem */
    public final class C111231 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C111231(HtJ<? super C111231> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthSyncManager.this.runStagedSync(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.health.HealthSyncManager", f = "HealthSyncManager.kt", l = {230, HatchLinkOrderStateMachine.MAX_EMAIL_LENGTH, 270}, m = "runTrailingResyncIfDue", v = 2)
    /* renamed from: com.facebook.aura.commands.health.HealthSyncManager$runTrailingResyncIfDue$1, reason: invalid class name and case insensitive filesystem */
    public final class C111241 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C111241(HtJ<? super C111241> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthSyncManager.this.runTrailingResyncIfDue(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.health.HealthSyncManager", f = "HealthSyncManager.kt", l = {641, 195, 196}, m = "stop", v = 2)
    /* renamed from: com.facebook.aura.commands.health.HealthSyncManager$stop$1, reason: invalid class name and case insensitive filesystem */
    public final class C111251 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C111251(HtJ<? super C111251> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthSyncManager.this.stop(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleObservationUpdate(X.FvK r10, com.meta.health.core.MetaHealthQuery r11, X.C8954FuV r12, X.HtJ<? super kotlin.Unit> r13) {
        /*
            r9 = this;
            r8 = r12
            r7 = r11
            boolean r0 = r13 instanceof com.facebook.aura.commands.health.HealthSyncManager.C111211
            r5 = r9
            if (r0 == 0) goto L33
            r4 = r13
            com.facebook.aura.commands.health.HealthSyncManager$handleObservationUpdate$1 r4 = (com.facebook.aura.commands.health.HealthSyncManager.C111211) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L33
            int r2 = r2 - r1
            r4.label = r2
        L15:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            r9 = 0
            if (r1 == 0) goto L3e
            if (r1 != r0) goto L39
            java.lang.Object r1 = r4.L$3
            X.BLa r1 = (X.InterfaceC2261BLa) r1
            java.lang.Object r8 = r4.L$2
            X.FuV r8 = (X.C8954FuV) r8
            java.lang.Object r7 = r4.L$1
            com.meta.health.core.MetaHealthQuery r7 = (com.meta.health.core.MetaHealthQuery) r7
            java.lang.Object r10 = r4.L$0
            X.Hwg.A00(r3)
            goto L54
        L33:
            com.facebook.aura.commands.health.HealthSyncManager$handleObservationUpdate$1 r4 = new com.facebook.aura.commands.health.HealthSyncManager$handleObservationUpdate$1
            r4.<init>(r13)
            goto L15
        L39:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3e:
            X.Hwg.A00(r3)
            X.BLa r1 = r5.mutex
            r4.L$0 = r10
            r4.L$1 = r11
            r4.L$2 = r12
            r4.L$3 = r1
            r4.label = r0
            java.lang.Object r0 = r1.APs(r9, r4)
            if (r0 != r2) goto L54
            return r2
        L54:
            X.3UX r6 = r5.observerScope     // Catch: java.lang.Throwable -> L7b
            if (r6 != 0) goto L5e
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7b
            r1.Ahe(r9)
            return r0
        L5e:
            java.util.List<X.FvK> r0 = r5.pendingUpdates     // Catch: java.lang.Throwable -> L7b
            r0.add(r10)     // Catch: java.lang.Throwable -> L7b
            X.HoC r0 = r5.debounceJob     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L6a
            r0.A5w(r9)     // Catch: java.lang.Throwable -> L7b
        L6a:
            com.facebook.aura.commands.health.HealthSyncManager$handleObservationUpdate$2$1 r4 = new com.facebook.aura.commands.health.HealthSyncManager$handleObservationUpdate$2$1     // Catch: java.lang.Throwable -> L7b
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L7b
            X.Hqc r0 = X.AnonymousClass001.A11(r4, r6)     // Catch: java.lang.Throwable -> L7b
            r5.debounceJob = r0     // Catch: java.lang.Throwable -> L7b
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L7b
            r1.Ahe(r9)
            return r0
        L7b:
            r0 = move-exception
            r1.Ahe(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.health.HealthSyncManager.handleObservationUpdate(X.FvK, com.meta.health.core.MetaHealthQuery, X.FuV, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.cleared = true;
        C3UX c3ux = this.observerScope;
        if (c3ux != null) {
            Hxb.A03(null, c3ux);
        }
        AnonymousClass001.A1J(new AnonymousClass1(null), Hxb.A02(AnonymousClass001.A0y()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0057 -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object commitAnchors(java.util.List<X.FvK> r8, X.HtJ<? super kotlin.Unit> r9) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.commands.health.HealthSyncManager.C111181
            if (r0 == 0) goto L23
            r6 = r9
            com.facebook.aura.commands.health.HealthSyncManager$commitAnchors$1 r6 = (com.facebook.aura.commands.health.HealthSyncManager.C111181) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            r5 = r7
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L2d
            if (r0 != r4) goto L60
            java.lang.Object r3 = r6.L$1
            java.util.Iterator r3 = (java.util.Iterator) r3
            goto L29
        L23:
            com.facebook.aura.commands.health.HealthSyncManager$commitAnchors$1 r6 = new com.facebook.aura.commands.health.HealthSyncManager$commitAnchors$1
            r6.<init>(r9)
            goto L12
        L29:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L52
            goto L34
        L2d:
            X.Hwg.A00(r1)
            java.util.Iterator r3 = r8.iterator()
        L34:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r1 = r3.next()
            X.FvK r1 = (X.FvK) r1
            r0 = 0
            r6.L$0 = r0     // Catch: java.lang.Exception -> L52
            r6.L$1 = r3     // Catch: java.lang.Exception -> L52
            r6.L$2 = r0     // Catch: java.lang.Exception -> L52
            r6.label = r4     // Catch: java.lang.Exception -> L52
            X.G0U<X.HtJ<? super kotlin.Unit>, java.lang.Object> r0 = r1.A01     // Catch: java.lang.Exception -> L52
            java.lang.Object r0 = r0.invoke(r6)     // Catch: java.lang.Exception -> L52
            if (r0 != r7) goto L34
            goto L5f
        L52:
            r2 = move-exception
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L64
            java.lang.String r1 = "Failed to commit observation anchor"
            java.lang.String r0 = "HealthSyncManager"
            X.CFK.A08(r0, r1, r2)
            goto L34
        L5f:
            return r5
        L60:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
        L64:
            throw r2
        L65:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.health.HealthSyncManager.commitAnchors(java.util.List, X.HtJ):java.lang.Object");
    }

    private final boolean isHealthSyncEnabled() {
        return AnonymousClass001.A1X(this.isHealthSyncEnabled$delegate.getValue(this, $$delegatedProperties[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.facebook.aura.commands.health.HealthSyncManager] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processObservationBatch(com.meta.health.core.MetaHealthQuery r20, X.C8954FuV r21, X.HtJ<? super kotlin.Unit> r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.health.HealthSyncManager.processObservationBatch(com.meta.health.core.MetaHealthQuery, X.FuV, X.HtJ):java.lang.Object");
    }

    private final long readProactiveWatermark() {
        return readStoredLong(HealthSyncManagerKt.WATERMARK_DATATYPE, HealthSyncManagerKt.WATERMARK_KEY);
    }

    private final String readStored(String str, String str2) {
        Map<String, String> map;
        NodeSyncBaselineStore.Baseline baseline = new NodeSyncBaselineStore(this.userSession).read(str);
        if (baseline == null || (map = baseline.hashes) == null) {
            return null;
        }
        return C60O.A0p(str2, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runStagedSync(com.facebook.aura.commands.health.HealthSyncManager.PendingSync r9, X.HtJ<? super com.facebook.aura.commands.health.HealthSyncManager.StagedSyncOutcome> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.commands.health.HealthSyncManager.C111231
            if (r0 == 0) goto L26
            r6 = r10
            com.facebook.aura.commands.health.HealthSyncManager$runStagedSync$1 r6 = (com.facebook.aura.commands.health.HealthSyncManager.C111231) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r2 = r6.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r5 = 2
            r0 = 1
            r4 = 0
            if (r1 == 0) goto L3d
            if (r1 == r0) goto L31
            if (r1 != r5) goto L2c
            java.lang.Object r3 = r6.L$1
            X.BLa r3 = (X.InterfaceC2261BLa) r3
            goto L6f
        L26:
            com.facebook.aura.commands.health.HealthSyncManager$runStagedSync$1 r6 = new com.facebook.aura.commands.health.HealthSyncManager$runStagedSync$1
            r6.<init>(r10)
            goto L12
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            java.lang.Object r3 = r6.L$1
            X.BLa r3 = (X.InterfaceC2261BLa) r3
            java.lang.Object r9 = r6.L$0
            com.facebook.aura.commands.health.HealthSyncManager$PendingSync r9 = (com.facebook.aura.commands.health.HealthSyncManager.PendingSync) r9
            X.Hwg.A00(r2)
            goto L4f
        L3d:
            X.Hwg.A00(r2)
            X.BLa r3 = r8.stageMutex
            r6.L$0 = r9
            r6.L$1 = r3
            r6.label = r0
            java.lang.Object r0 = r3.APs(r4, r6)
            if (r0 != r7) goto L4f
            return r7
        L4f:
            r8.pendingSync = r9     // Catch: java.lang.Throwable -> L89
            r0 = 0
            r8.stagedSyncExecuted = r0     // Catch: java.lang.Throwable -> L89
            com.facebook.aura.nodes.HatchNodeClient$Companion r2 = com.facebook.aura.nodes.HatchNodeClient.Companion     // Catch: java.lang.Throwable -> L83
            X.CGz r1 = r8.userSession     // Catch: java.lang.Throwable -> L83
            android.app.Application r0 = X.C4JM.A00()     // Catch: java.lang.Throwable -> L83
            com.facebook.aura.nodes.HatchNodeClient r1 = r2.getInstance(r1, r0)     // Catch: java.lang.Throwable -> L83
            com.facebook.aura.commands.health.HealthDataSource r0 = com.facebook.aura.commands.health.HealthDataSource.INSTANCE     // Catch: java.lang.Throwable -> L83
            r6.L$0 = r4     // Catch: java.lang.Throwable -> L83
            r6.L$1 = r3     // Catch: java.lang.Throwable -> L83
            r6.label = r5     // Catch: java.lang.Throwable -> L83
            java.lang.Object r2 = r1.runProactiveSync(r0, r6)     // Catch: java.lang.Throwable -> L83
            if (r2 != r7) goto L72
            return r7
        L6f:
            X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> L81
        L72:
            com.facebook.aura.nodes.datasource.DataSourceResult r2 = (com.facebook.aura.nodes.datasource.DataSourceResult) r2     // Catch: java.lang.Throwable -> L81
            boolean r1 = r8.stagedSyncExecuted     // Catch: java.lang.Throwable -> L81
            com.facebook.aura.commands.health.HealthSyncManager$StagedSyncOutcome r0 = new com.facebook.aura.commands.health.HealthSyncManager$StagedSyncOutcome     // Catch: java.lang.Throwable -> L81
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L81
            r8.pendingSync = r4     // Catch: java.lang.Throwable -> L87
            r3.Ahe(r4)
            return r0
        L81:
            r0 = move-exception
            goto L84
        L83:
            r0 = move-exception
        L84:
            r8.pendingSync = r4     // Catch: java.lang.Throwable -> L87
            throw r0     // Catch: java.lang.Throwable -> L87
        L87:
            r0 = move-exception
            goto L8a
        L89:
            r0 = move-exception
        L8a:
            r3.Ahe(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.health.HealthSyncManager.runStagedSync(com.facebook.aura.commands.health.HealthSyncManager$PendingSync, X.HtJ):java.lang.Object");
    }

    private final void writeStored(String str, String str2, String str3, String str4) {
        new NodeSyncBaselineStore(this.userSession).commit(str, new NodeSyncBaselineStore.Baseline(str2, AnonymousClass006.A10(str3, str4), null, 4, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (stop(r7) != r8) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[Catch: all -> 0x019d, TryCatch #8 {all -> 0x019d, blocks: (B:34:0x00a6, B:36:0x00aa, B:37:0x00ae, B:39:0x00b2, B:40:0x00b6, B:42:0x00ba, B:43:0x00bd, B:45:0x00c3, B:46:0x00c6, B:48:0x00d1, B:49:0x00d4, B:51:0x00f3, B:52:0x00f6, B:53:0x0105, B:54:0x0114), top: B:108:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae A[Catch: all -> 0x019d, TryCatch #8 {all -> 0x019d, blocks: (B:34:0x00a6, B:36:0x00aa, B:37:0x00ae, B:39:0x00b2, B:40:0x00b6, B:42:0x00ba, B:43:0x00bd, B:45:0x00c3, B:46:0x00c6, B:48:0x00d1, B:49:0x00d4, B:51:0x00f3, B:52:0x00f6, B:53:0x0105, B:54:0x0114), top: B:108:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017e A[Catch: all -> 0x019b, TryCatch #6 {all -> 0x019b, blocks: (B:69:0x0158, B:70:0x015b, B:92:0x0195, B:86:0x017a, B:88:0x017e, B:89:0x0189, B:91:0x018b), top: B:107:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0189 A[Catch: all -> 0x019b, TRY_LEAVE, TryCatch #6 {all -> 0x019b, blocks: (B:69:0x0158, B:70:0x015b, B:92:0x0195, B:86:0x017a, B:88:0x017e, B:89:0x0189, B:91:0x018b), top: B:107:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object configureMonitoring(X.HtJ<? super kotlin.Unit> r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.health.HealthSyncManager.configureMonitoring(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Failed to calculate best type for var: r5v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:558)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r5v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r5v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:555)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r5v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r5v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:558)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r5v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r5v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:555)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r5v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r5v2 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:558)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r5v2 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r5v2 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:555)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r5v2 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r6v3 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:390)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:355)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:558)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r6v3 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:390)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:355)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r6v3 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:390)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:355)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:555)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r6v3 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:390)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:355)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:390)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:355)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:558)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:390)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:355)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:390)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:355)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:555)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r7v1 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:390)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:355)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:188)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0222: MOVE (r7 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:546), block:B:60:0x020f */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0258: MOVE (r8 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:600), block:B:64:0x024d */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0283: MOVE (r8 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:643), block:B:67:0x027a */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[PHI: r0
  0x0045: PHI (r0v1 boolean) = (r0v34 boolean), (r0v35 boolean) binds: [B:3:0x0008, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017a A[Catch: MetaHealthError -> 0x020e, Exception -> 0x0240, TryCatch #2 {MetaHealthError -> 0x020e, Exception -> 0x0240, blocks: (B:48:0x01c1, B:49:0x01c4, B:51:0x01cb, B:52:0x01d8, B:54:0x01fa, B:56:0x0202, B:57:0x020b, B:40:0x0171, B:41:0x0174, B:43:0x017a, B:45:0x019f, B:28:0x00db, B:29:0x00de, B:31:0x010e, B:33:0x012f, B:37:0x014e, B:25:0x00a4), top: B:69:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01cb A[Catch: MetaHealthError -> 0x020e, Exception -> 0x0240, TryCatch #2 {MetaHealthError -> 0x020e, Exception -> 0x0240, blocks: (B:48:0x01c1, B:49:0x01c4, B:51:0x01cb, B:52:0x01d8, B:54:0x01fa, B:56:0x0202, B:57:0x020b, B:40:0x0171, B:41:0x0174, B:43:0x017a, B:45:0x019f, B:28:0x00db, B:29:0x00de, B:31:0x010e, B:33:0x012f, B:37:0x014e, B:25:0x00a4), top: B:69:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01fa A[Catch: MetaHealthError -> 0x020e, Exception -> 0x0240, TryCatch #2 {MetaHealthError -> 0x020e, Exception -> 0x0240, blocks: (B:48:0x01c1, B:49:0x01c4, B:51:0x01cb, B:52:0x01d8, B:54:0x01fa, B:56:0x0202, B:57:0x020b, B:40:0x0171, B:41:0x0174, B:43:0x017a, B:45:0x019f, B:28:0x00db, B:29:0x00de, B:31:0x010e, B:33:0x012f, B:37:0x014e, B:25:0x00a4), top: B:69:0x0025 }] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.aura.commands.health.HealthSyncManager$PendingSync] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.facebook.aura.commands.health.HealthSyncManager] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.facebook.aura.health.HealthConnectorTelemetry] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.facebook.aura.health.HealthConnectorTelemetry] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeStagedSync(com.facebook.aura.nodes.datasource.DataSourceContext r26, X.HtJ<? super com.facebook.aura.nodes.datasource.DataSourceResult> r27) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.health.HealthSyncManager.executeStagedSync(com.facebook.aura.nodes.datasource.DataSourceContext, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5 A[Catch: MetaHealthError -> 0x0103, Exception -> 0x0115, TryCatch #3 {MetaHealthError -> 0x0103, Exception -> 0x0115, blocks: (B:36:0x00ea, B:37:0x00ed, B:39:0x00f5, B:41:0x00f9, B:32:0x00a5, B:33:0x00a8, B:29:0x0092), top: B:56:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runTrailingResyncIfDue(X.HtJ<? super kotlin.Unit> r21) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.health.HealthSyncManager.runTrailingResyncIfDue(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object stop(X.HtJ<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.facebook.aura.commands.health.HealthSyncManager.C111251
            if (r0 == 0) goto L97
            r7 = r11
            com.facebook.aura.commands.health.HealthSyncManager$stop$1 r7 = (com.facebook.aura.commands.health.HealthSyncManager.C111251) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L97
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r2 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r1 = r7.label
            r8 = 3
            r9 = 2
            r0 = 1
            r5 = 0
            if (r1 == 0) goto L32
            if (r1 == r0) goto L2a
            if (r1 == r9) goto L7f
            if (r1 != r8) goto L9e
            X.Hwg.A00(r2)
        L27:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L2a:
            java.lang.Object r4 = r7.L$0
            X.BLa r4 = (X.InterfaceC2261BLa) r4
            X.Hwg.A00(r2)
            goto L42
        L32:
            X.Hwg.A00(r2)
            X.BLa r4 = r10.mutex
            r7.L$0 = r4
            r7.label = r0
            java.lang.Object r0 = r4.APs(r5, r7)
            if (r0 != r6) goto L42
            return r6
        L42:
            X.HoC r0 = r10.debounceJob     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L49
            r0.A5w(r5)     // Catch: java.lang.Throwable -> La3
        L49:
            r10.debounceJob = r5     // Catch: java.lang.Throwable -> La3
            X.HoC r3 = r10.processingJob     // Catch: java.lang.Throwable -> La3
            r10.processingJob = r5     // Catch: java.lang.Throwable -> La3
            java.util.List<X.FvK> r0 = r10.pendingUpdates     // Catch: java.lang.Throwable -> La3
            r0.clear()     // Catch: java.lang.Throwable -> La3
            com.meta.health.core.MetaHealthQueryObservationSession r0 = r10.observationSession     // Catch: java.lang.Throwable -> La3
            r10.observationSession = r5     // Catch: java.lang.Throwable -> La3
            java.util.concurrent.atomic.AtomicBoolean r2 = r10.firstSyncEmitted     // Catch: java.lang.Throwable -> La3
            r1 = 0
            r2.set(r1)     // Catch: java.lang.Throwable -> La3
            r1 = 0
            r10.observerStartMs = r1     // Catch: java.lang.Throwable -> La3
            X.3UX r1 = r10.observerScope     // Catch: java.lang.Throwable -> La3
            r10.observerScope = r5     // Catch: java.lang.Throwable -> La3
            r4.Ahe(r5)
            if (r1 == 0) goto L6e
            X.Hxb.A03(r5, r1)
        L6e:
            if (r3 == 0) goto L86
            r7.L$0 = r0
            r7.L$1 = r5
            r7.L$2 = r5
            r7.label = r9
            java.lang.Object r1 = r3.APQ(r7)
            if (r1 != r6) goto L86
            return r6
        L7f:
            java.lang.Object r0 = r7.L$0
            com.meta.health.core.MetaHealthQueryObservationSession r0 = (com.meta.health.core.MetaHealthQueryObservationSession) r0
            X.Hwg.A00(r2)
        L86:
            if (r0 == 0) goto L27
            r7.L$0 = r5
            r7.L$1 = r5
            r7.L$2 = r5
            r7.label = r8
            java.lang.Object r0 = r0.A00(r7)
            if (r0 != r6) goto L27
            return r6
        L97:
            com.facebook.aura.commands.health.HealthSyncManager$stop$1 r7 = new com.facebook.aura.commands.health.HealthSyncManager$stop$1
            r7.<init>(r11)
            goto L12
        L9e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        La3:
            r0 = move-exception
            r4.Ahe(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.health.HealthSyncManager.stop(X.HtJ):java.lang.Object");
    }

    /* loaded from: classes3.dex */
    public final class Companion {
        public final HealthSyncManager getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HealthSyncManager) abstractC3358CGz.A03(HealthSyncManager.class, new HealthSyncManager$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HealthSyncManager(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.mutex = new C9258GBl();
        this.pendingUpdates = C3cG.A0h();
        this.firstSyncEmitted = BV4.A12(false);
        this.isHealthSyncEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.health_connect_connector_enabled);
        this.stageMutex = new C9258GBl();
    }

    private final void advanceProactiveWatermark(Instant instant) {
        writeStored(HealthSyncManagerKt.WATERMARK_DATATYPE, "proactive", HealthSyncManagerKt.WATERMARK_KEY, String.valueOf(Math.max(readProactiveWatermark(), Math.min(instant.toEpochMilli(), System.currentTimeMillis()))));
    }

    private final Instant proactiveWindowStart(Instant instant, Instant instant2, int i) {
        long proactiveWatermark = readProactiveWatermark();
        Instant instantMinus = instant2.minus((TemporalAmount) HealthSyncManagerKt.OBSERVER_MAX_LOOKBACK);
        if (proactiveWatermark > 0) {
            C7384Etj.A0X(instantMinus);
            Instant instantA11 = AbstractC7608F5v.A11(proactiveWatermark);
            if (instantMinus.compareTo(instantA11) >= 0) {
                instantA11 = instantMinus;
            }
            instantMinus = instantA11;
        }
        C7384Etj.A0X(instantMinus);
        Instant instant3 = (Instant) HrB.A01(instant, instantMinus);
        if (instant3.isAfter(instant)) {
            HealthConnectorTelemetry healthConnectorTelemetry = HealthConnectorTelemetry.INSTANCE;
            String strA00 = C60N.A00(82);
            long seconds = Duration.between(instant, instant2).getSeconds();
            long seconds2 = Duration.between(instant3, instant2).getSeconds();
            if (seconds2 < 0) {
                seconds2 = 0;
            }
            healthConnectorTelemetry.syncWindowClamped(strA00, seconds, seconds2, i);
        }
        return instant3;
    }

    private final long readStoredLong(String str, String str2) {
        Long lA0s;
        String stored = readStored(str, str2);
        if (stored == null || (lA0s = C9tI.A0s(stored)) == null) {
            return 0L;
        }
        return lA0s.longValue();
    }

    public /* synthetic */ HealthSyncManager(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
