package com.facebook.aura.commands.health;

import X.AbstractC07127nr;
import X.AnonymousClass004;
import X.C2nw;
import X.C3UX;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7pd;
import X.C7qW;
import X.C8954FuV;
import X.C89G;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hxb;
import X.HzP;
import com.facebook.aura.health.HealthRecordCounts;
import com.facebook.aura.nodes.datasource.BackfillStrategy;
import com.facebook.aura.nodes.datasource.DataSource;
import com.facebook.aura.nodes.datasource.DataSourceContext;
import com.facebook.aura.nodes.datasource.DataSourceResult;
import com.facebook.aura.nodes.datasource.NodeSyncTimestamps;
import com.facebook.aura.nodes.datasource.ProactiveDelivery;
import com.facebook.aura.nodes.datasource.ProactiveTrigger;
import com.facebook.aura.nodes.registry.HatchDataSourceRegistration;
import com.meta.health.core.MetaHealthQuery;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class HealthDataSource implements DataSource, HatchDataSourceRegistration {
    public static final String description = "Health Connect data (aggregates, workouts, sleep, events) pushed via observer-driven background sync. Time fields on these rows are epoch SECONDS, not milliseconds \u2014 `start_epoch_sec`/`end_epoch_sec`, and `start_ts`/`end_ts` on raw samples, which are the same unit despite the shorter name. Every other Hatch data source sends milliseconds, so do not compare these to another source's timestamps without accounting for the 1000x difference. Rows also carry `timezone`, a UTC OFFSET such as \"-07:00\" or \"Z\" (never an IANA region name); use it to place a record in the user's local day rather than reading the epoch value as UTC.";
    public static final boolean emitsProactively = true;
    public static final String sourceId = "health";
    public static final boolean supportsBackfill = true;
    public static final HealthDataSource INSTANCE = new HealthDataSource();
    public static final List<String> permissionRequired = Collections.singletonList("@health_connect");
    public static final ProactiveTrigger proactiveTrigger = new ProactiveTrigger.CallerDriven("MetaHealthQuery observer polls Health Connect Changes API; HealthSyncManager debounces fires and drives the sync through ProactiveSyncRunner onto the client.data_source.publish sink.");
    public static final AtomicReference<HoC> activeBackfillJob = new AtomicReference<>(null);

    /* loaded from: classes6.dex */
    public final class HealthBackfillStrategy implements BackfillStrategy {
        public final long chunkDays;
        public final long endEpochSec;
        public final boolean includeRawSamples;
        public HealthRecordCounts pendingCounts;
        public final C8954FuV provider;
        public final MetaHealthQuery query;
        public final long startEpochSec;
        public final String telemetryProvider;
        public int totalAggregates;
        public int totalEvents;
        public int totalSleep;
        public int totalWorkouts;

        public final HealthRecordCounts accumulatedCounts() {
            return new HealthRecordCounts(this.totalAggregates, this.totalWorkouts, this.totalSleep, this.totalEvents, 0);
        }

        @Override // com.facebook.aura.nodes.datasource.BackfillStrategy
        public JsonObject ackStub() {
            long j = this.startEpochSec;
            long j2 = this.endEpochSec;
            C2nw c2nw = new C2nw();
            C7pd c7pd = new C7pd();
            C2nw c2nw2 = new C2nw();
            C7qW.A06("provider_id", HealthSyncManagerKt.DEFAULT_PROVIDER_ID, c2nw2);
            C7qW.A05(Long.valueOf(j), "start_epoch_sec", c2nw2);
            C7qW.A05(Long.valueOf(j2), "end_epoch_sec", c2nw2);
            c7pd.A06(c2nw2.A00());
            return C60O.A1I("providers", c7pd.A05(), c2nw);
        }

        @Override // com.facebook.aura.nodes.datasource.BackfillStrategy
        public long getChunkDays() {
            return this.chunkDays;
        }

        @Override // com.facebook.aura.nodes.datasource.BackfillStrategy
        public void onWindowAccepted() {
            int i = this.totalAggregates;
            HealthRecordCounts healthRecordCounts = this.pendingCounts;
            this.totalAggregates = i + healthRecordCounts.aggregates;
            this.totalWorkouts += healthRecordCounts.workouts;
            this.totalSleep += healthRecordCounts.sleep;
            this.totalEvents += healthRecordCounts.events;
            this.pendingCounts = new HealthRecordCounts(0, 0, 0, 0, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x0131 A[EDGE_INSN: B:149:0x0131->B:37:0x0131 BREAK  A[LOOP:1: B:39:0x0148->B:151:?], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x010e A[Catch: IncompleteResult -> 0x03bf, Exception -> 0x03e7, LOOP:0: B:28:0x0108->B:30:0x010e, LOOP_END, TryCatch #3 {IncompleteResult -> 0x03bf, Exception -> 0x03e7, blocks: (B:26:0x00fd, B:27:0x0100, B:28:0x0108, B:30:0x010e, B:31:0x0119, B:33:0x0127, B:35:0x012b, B:38:0x0144, B:39:0x0148, B:41:0x014e, B:43:0x015a, B:44:0x0171, B:46:0x0177, B:47:0x0190, B:48:0x0194, B:50:0x019a, B:52:0x01b0, B:54:0x01be, B:55:0x01d6, B:57:0x01dc, B:59:0x01ea, B:62:0x01f0, B:64:0x01f6, B:66:0x0200, B:68:0x0209, B:69:0x020e, B:71:0x022e, B:73:0x0234, B:74:0x023d, B:76:0x0243, B:77:0x025b, B:79:0x0270, B:78:0x0265, B:80:0x0279, B:81:0x028a, B:83:0x0294, B:85:0x029f, B:87:0x02a3, B:89:0x02ab, B:91:0x02af, B:92:0x02bc, B:94:0x02c2, B:95:0x02c6, B:97:0x02d5, B:98:0x02d7, B:100:0x02e5, B:101:0x02eb, B:103:0x02f5, B:104:0x02fb, B:122:0x035c, B:123:0x0364, B:125:0x036a, B:126:0x036e, B:105:0x0301, B:107:0x030e, B:109:0x0314, B:112:0x0327, B:113:0x032c, B:114:0x0338, B:116:0x033e, B:119:0x0352, B:37:0x0131, B:23:0x00d1), top: B:145:0x0022 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x014e A[Catch: IncompleteResult -> 0x03bf, Exception -> 0x03e7, TryCatch #3 {IncompleteResult -> 0x03bf, Exception -> 0x03e7, blocks: (B:26:0x00fd, B:27:0x0100, B:28:0x0108, B:30:0x010e, B:31:0x0119, B:33:0x0127, B:35:0x012b, B:38:0x0144, B:39:0x0148, B:41:0x014e, B:43:0x015a, B:44:0x0171, B:46:0x0177, B:47:0x0190, B:48:0x0194, B:50:0x019a, B:52:0x01b0, B:54:0x01be, B:55:0x01d6, B:57:0x01dc, B:59:0x01ea, B:62:0x01f0, B:64:0x01f6, B:66:0x0200, B:68:0x0209, B:69:0x020e, B:71:0x022e, B:73:0x0234, B:74:0x023d, B:76:0x0243, B:77:0x025b, B:79:0x0270, B:78:0x0265, B:80:0x0279, B:81:0x028a, B:83:0x0294, B:85:0x029f, B:87:0x02a3, B:89:0x02ab, B:91:0x02af, B:92:0x02bc, B:94:0x02c2, B:95:0x02c6, B:97:0x02d5, B:98:0x02d7, B:100:0x02e5, B:101:0x02eb, B:103:0x02f5, B:104:0x02fb, B:122:0x035c, B:123:0x0364, B:125:0x036a, B:126:0x036e, B:105:0x0301, B:107:0x030e, B:109:0x0314, B:112:0x0327, B:113:0x032c, B:114:0x0338, B:116:0x033e, B:119:0x0352, B:37:0x0131, B:23:0x00d1), top: B:145:0x0022 }] */
        /* JADX WARN: Type inference failed for: r11v1, types: [com.facebook.aura.health.HealthConnectorTelemetry] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v11, types: [X.Fun, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r2v2, types: [com.facebook.aura.health.HealthConnectorTelemetry] */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v1, types: [long] */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v2, types: [long] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v8 */
        @Override // com.facebook.aura.nodes.datasource.BackfillStrategy
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object windowSnapshot(long r20, long r22, X.HtJ<? super kotlinx.serialization.json.JsonObject> r24) throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 1109
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.health.HealthDataSource.HealthBackfillStrategy.windowSnapshot(long, long, X.HtJ):java.lang.Object");
        }

        public HealthBackfillStrategy(MetaHealthQuery metaHealthQuery, C8954FuV c8954FuV, long j, long j2, String str, boolean z) {
            boolean zA1b = AnonymousClass004.A1b(metaHealthQuery, c8954FuV);
            C7384Etj.A0Y(str, 4);
            this.query = metaHealthQuery;
            this.provider = c8954FuV;
            this.startEpochSec = j;
            this.endEpochSec = j2;
            this.telemetryProvider = str;
            this.includeRawSamples = z;
            this.chunkDays = 30L;
            this.pendingCounts = new HealthRecordCounts(zA1b ? 1 : 0, zA1b ? 1 : 0, zA1b ? 1 : 0, zA1b ? 1 : 0, zA1b ? 1 : 0);
        }

        @Override // com.facebook.aura.nodes.datasource.BackfillStrategy
        public /* bridge */ int estimatedChunks(long j, long j2) {
            return BackfillStrategy.CC.$default$estimatedChunks(this, j, j2);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.health.HealthDataSource$backfill$2", f = "HealthDataSource.kt", l = {136, 138}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.health.HealthDataSource$backfill$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super DataSourceResult>, Object> {
        public final /* synthetic */ DataSourceContext $ctx;
        public final /* synthetic */ Instant $effectiveEnd;
        public final /* synthetic */ Instant $effectiveStart;
        public final /* synthetic */ String $endEcho;
        public final /* synthetic */ String $startDate;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Instant instant, Instant instant2, String str, String str2, DataSourceContext dataSourceContext, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$effectiveStart = instant;
            this.$effectiveEnd = instant2;
            this.$startDate = str;
            this.$endEcho = str2;
            this.$ctx = dataSourceContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$effectiveStart, this.$effectiveEnd, this.$startDate, this.$endEcho, this.$ctx, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r5 = r14.L$0
                X.3UX r5 = (X.C3UX) r5
                X.Hji r2 = X.EnumC10460Hji.A02
                int r0 = r14.label
                r3 = 2
                r4 = 1
                if (r0 == 0) goto L3a
                if (r0 == r4) goto L72
                if (r0 != r3) goto L90
                java.lang.Object r1 = r14.L$2
                X.HoC r1 = (X.HoC) r1
                java.lang.Object r7 = r14.L$1
                X.Hqv r7 = (X.C10543Hqv) r7
                X.Hwg.A00(r15)
            L1b:
                java.util.concurrent.atomic.AtomicReference<X.HoC> r2 = com.facebook.aura.commands.health.HealthDataSource.activeBackfillJob
                r0 = 0
                X.Bs8.A00(r1, r0, r2)
                boolean r0 = r1.isCancelled()
                if (r0 == 0) goto L31
                java.lang.String r1 = "backfill_cancelled"
                java.lang.String r0 = "Health backfill was replaced by a newer run"
            L2b:
                com.facebook.aura.nodes.datasource.DataSourceResult$Error r2 = new com.facebook.aura.nodes.datasource.DataSourceResult$Error
                r2.<init>(r1, r0)
            L30:
                return r2
            L31:
                T r2 = r7.element
                if (r2 != 0) goto L30
                java.lang.String r1 = "backfill_failed"
                java.lang.String r0 = "Health backfill completed without a result"
                goto L2b
            L3a:
                X.Hwg.A00(r15)
                X.Hqv r7 = X.C3cG.A0z()
                java.lang.Integer r1 = X.C79.A01
                java.time.Instant r8 = r14.$effectiveStart
                java.time.Instant r9 = r14.$effectiveEnd
                java.lang.String r10 = r14.$startDate
                java.lang.String r11 = r14.$endEcho
                com.facebook.aura.nodes.datasource.DataSourceContext r12 = r14.$ctx
                r13 = 0
                com.facebook.aura.commands.health.HealthDataSource$backfill$2$job$1 r6 = new com.facebook.aura.commands.health.HealthDataSource$backfill$2$job$1
                r6.<init>(r7, r8, r9, r10, r11, r12, r13)
                X.6ys r0 = X.C6ys.A00
                X.Hqc r1 = X.GAo.A02(r1, r0, r6, r5)
                java.util.concurrent.atomic.AtomicReference<X.HoC> r0 = com.facebook.aura.commands.health.HealthDataSource.activeBackfillJob
                java.lang.Object r0 = r0.getAndSet(r1)
                X.HoC r0 = (X.HoC) r0
                if (r0 == 0) goto L7d
                r14.L$0 = r13
                r14.L$1 = r7
                r14.L$2 = r1
                r14.label = r4
                java.lang.Object r0 = X.HzS.A00(r14, r0)
                if (r0 != r2) goto L7d
                return r2
            L72:
                java.lang.Object r1 = r14.L$2
                X.HoC r1 = (X.HoC) r1
                java.lang.Object r7 = r14.L$1
                X.Hqv r7 = (X.C10543Hqv) r7
                X.Hwg.A00(r15)
            L7d:
                r1.Afv()
                r0 = 0
                r14.L$0 = r0
                r14.L$1 = r7
                r14.L$2 = r1
                r14.label = r3
                java.lang.Object r0 = r1.APQ(r14)
                if (r0 != r2) goto L1b
                return r2
            L90:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.health.HealthDataSource.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super DataSourceResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.health.HealthDataSource", f = "HealthDataSource.kt", l = {195, 196}, m = "runBackfill", v = 2)
    /* renamed from: com.facebook.aura.commands.health.HealthDataSource$runBackfill$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
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

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthDataSource.this.runBackfill(null, null, null, null, null, this);
        }
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public Object backfill(String str, String str2, DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ) {
        String str3;
        String str4;
        Instant instantNow;
        String strIso8601Utc = str2;
        if (!isEnabled()) {
            str3 = "health_disabled";
            str4 = "Health Connect is not enabled";
        } else if (str == null || str.length() == 0) {
            str3 = "missing_start_date";
            str4 = "start_date is required for health backfill";
        } else {
            C89G c89g = C89G.A02;
            Instant instantA00 = c89g.A00(str);
            if (instantA00 == null) {
                str3 = "invalid_start_date";
                str4 = "Could not parse start_date";
            } else {
                if (str2 != null) {
                    instantNow = c89g.A00(str2);
                    if (instantNow == null) {
                        str3 = "invalid_end_date";
                        str4 = "Could not parse end_date";
                    }
                } else {
                    instantNow = null;
                }
                ZoneId zoneIdA0r = C60Q.A0r();
                if (C7384Etj.areEqual(instantNow, instantA00)) {
                    instantA00 = instantA00.atZone(ZoneOffset.UTC).toLocalDate().atStartOfDay(zoneIdA0r).toInstant();
                    instantNow = instantA00.plusSeconds(86400L);
                }
                if (instantNow == null) {
                    instantNow = Instant.now();
                }
                if (instantNow.isAfter(instantA00)) {
                    if (str2 == null) {
                        strIso8601Utc = NodeSyncTimestamps.INSTANCE.iso8601Utc(instantNow.toEpochMilli());
                    }
                    return Hxb.A00(new AnonymousClass2(instantA00, instantNow, str, strIso8601Utc, dataSourceContext, null), htJ);
                }
                str3 = "invalid_range";
                str4 = "start_date must be before end_date";
            }
        }
        return new DataSourceResult.Error(str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0175  */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3, types: [long] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r19v1, types: [com.facebook.aura.nodes.datasource.DataSourcePublishPipeline] */
    /* JADX WARN: Type inference failed for: r28v2, types: [com.facebook.aura.nodes.datasource.BackfillStrategy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.facebook.aura.health.HealthConnectorTelemetry] */
    /* JADX WARN: Type inference failed for: r3v15, types: [com.facebook.aura.commands.health.HealthDataSource$HealthBackfillStrategy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [com.facebook.aura.commands.health.HealthDataSource$HealthBackfillStrategy] */
    /* JADX WARN: Type inference failed for: r3v21, types: [com.facebook.aura.commands.health.HealthDataSource$HealthBackfillStrategy] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.facebook.aura.commands.health.HealthDataSource$HealthBackfillStrategy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runBackfill(java.time.Instant r24, java.time.Instant r25, java.lang.String r26, java.lang.String r27, com.facebook.aura.nodes.datasource.DataSourceContext r28, X.HtJ<? super com.facebook.aura.nodes.datasource.DataSourceResult> r29) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.health.HealthDataSource.runBackfill(java.time.Instant, java.time.Instant, java.lang.String, java.lang.String, com.facebook.aura.nodes.datasource.DataSourceContext, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nodes.registry.HatchDataSourceRegistration
    public DataSource getDataSource() {
        return this;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public String getDescription() {
        return description;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public boolean getEmitsProactively() {
        return emitsProactively;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public List<String> getPermissionRequired() {
        return permissionRequired;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public /* bridge */ ProactiveDelivery getProactiveDelivery() {
        return ProactiveDelivery.DURABLE;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public ProactiveTrigger getProactiveTrigger() {
        return proactiveTrigger;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public String getSourceId() {
        return sourceId;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public boolean getSupportsBackfill() {
        return supportsBackfill;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public Object proactiveSync(DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ) {
        return HealthSyncManager.Companion.getInstance(dataSourceContext.userSession).executeStagedSync(dataSourceContext, htJ);
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public boolean isEnabled() {
        return HealthDataSourceKt.isHealthEnabled();
    }
}
