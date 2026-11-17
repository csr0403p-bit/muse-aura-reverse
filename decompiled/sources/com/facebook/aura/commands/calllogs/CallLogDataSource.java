package com.facebook.aura.commands.calllogs;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C2nw;
import X.C3UX;
import X.C4JM;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7pd;
import X.C7qW;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import android.net.Uri;
import android.provider.CallLog;
import com.facebook.aura.commands.core.TelephonyFeatureUtils;
import com.facebook.aura.nodes.datasource.BackfillStrategy;
import com.facebook.aura.nodes.datasource.DataSource;
import com.facebook.aura.nodes.datasource.DataSourceContext;
import com.facebook.aura.nodes.datasource.DataSourcePublishPipeline;
import com.facebook.aura.nodes.datasource.DataSourceResult;
import com.facebook.aura.nodes.datasource.NodeSyncTimestamps;
import com.facebook.aura.nodes.datasource.ProactiveDelivery;
import com.facebook.aura.nodes.datasource.ProactiveSnapshotSync;
import com.facebook.aura.nodes.datasource.ProactiveTrigger;
import com.facebook.aura.nodes.registry.HatchDataSourceRegistration;
import com.facebook.aura.notifications.push.AuraCvmPushReplayStore;
import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class CallLogDataSource implements DataSource, HatchDataSourceRegistration {
    public static final long BACKFILL_CHUNK_DAYS = 30;
    public static final int BACKFILL_LIMIT = Integer.MAX_VALUE;
    public static final int PROACTIVE_SYNC_LIMIT = 5;
    public static final String description = "Device call log entries. Each entry has `number`, `name` (the contact name cached by the phone, may be null), and `direction` \u2014 one of incoming, outgoing, missed, voicemail, rejected, blocked, answered_externally. `direction` is the ONLY authoritative source for whether the user placed, received, or missed a call; outgoing means the user made the call. For when the call happened use `date_local` (the user's local wall-clock time), `date_local_date` (their local calendar day), and `date_weekday` (their local weekday name). `type` and `date` are raw internal values \u2014 `type` is an Android enum integer and `date` is UTC epoch milliseconds. NEVER show either to the user, never fall back to `type` to determine direction, and never use `date` to compute the day or weekday: it names the wrong day for calls made in the evening. `duration` is in SECONDS. An entry records only that a call occurred; it carries no information about what the call was about.";
    public static final boolean emitsProactively = true;
    public static final ProactiveTrigger proactiveTrigger;
    public static final String sourceId = "call_log";
    public static final boolean supportsBackfill = true;
    public static final CallLogDataSource INSTANCE = new CallLogDataSource();
    public static final List<String> permissionRequired = Collections.singletonList("android.permission.READ_CALL_LOG");

    public final class CallLogBackfillStrategy implements BackfillStrategy {
        public final long chunkDays = 30;

        @Override // com.facebook.aura.nodes.datasource.BackfillStrategy
        public long getChunkDays() {
            return this.chunkDays;
        }

        @Override // com.facebook.aura.nodes.datasource.BackfillStrategy
        public /* bridge */ void onWindowAccepted() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        @Override // com.facebook.aura.nodes.datasource.BackfillStrategy
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object windowSnapshot(long r8, long r10, X.HtJ<? super kotlinx.serialization.json.JsonObject> r12) {
            /*
                r7 = this;
                boolean r0 = r12 instanceof com.facebook.aura.commands.calllogs.CallLogDataSource$CallLogBackfillStrategy$windowSnapshot$1
                if (r0 == 0) goto L23
                r6 = r12
                com.facebook.aura.commands.calllogs.CallLogDataSource$CallLogBackfillStrategy$windowSnapshot$1 r6 = (com.facebook.aura.commands.calllogs.CallLogDataSource$CallLogBackfillStrategy$windowSnapshot$1) r6
                int r2 = r6.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L23
                int r2 = r2 - r1
                r6.label = r2
            L12:
                java.lang.Object r2 = r6.result
                X.Hji r5 = X.EnumC10460Hji.A02
                int r1 = r6.label
                r4 = 0
                r0 = 1
                if (r1 == 0) goto L2e
                if (r1 != r0) goto L29
                long r10 = r6.J$1
                long r8 = r6.J$0
                goto L4b
            L23:
                com.facebook.aura.commands.calllogs.CallLogDataSource$CallLogBackfillStrategy$windowSnapshot$1 r6 = new com.facebook.aura.commands.calllogs.CallLogDataSource$CallLogBackfillStrategy$windowSnapshot$1
                r6.<init>(r7, r12)
                goto L12
            L29:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L2e:
                X.Hwg.A00(r2)
                com.facebook.aura.commands.calllogs.CallLogDataSource r3 = com.facebook.aura.commands.calllogs.CallLogDataSource.INSTANCE     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L7d
                java.lang.Long r2 = X.C3cG.A0S(r8)     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L7d
                java.lang.Long r1 = X.C3cG.A0S(r10)     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L7d
                r6.J$0 = r8     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L7d
                r6.J$1 = r10     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L7d
                r6.label = r0     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L7d
                r0 = 2147483647(0x7fffffff, float:NaN)
                java.lang.Object r2 = com.facebook.aura.commands.calllogs.CallLogDataSource.access$readSnapshot(r3, r0, r2, r1, r6)     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L7d
                if (r2 != r5) goto L4e
                return r5
            L4b:
                X.Hwg.A00(r2)     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L7d
            L4e:
                X.HxE r2 = (X.HxE) r2     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L7d
                A r0 = r2.first
                kotlinx.serialization.json.JsonArray r0 = (kotlinx.serialization.json.JsonArray) r0
                B r5 = r2.second
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L5d
                return r4
            L5d:
                return r5
            L5e:
                r0 = move-exception
                java.lang.String r2 = r0.getMessage()
                java.lang.String r0 = "call_log backfill window read failed "
                java.lang.StringBuilder r1 = X.C60O.A0z(r0, r8)
                java.lang.String r0 = ".."
                r1.append(r0)
                r1.append(r10)
                java.lang.String r0 = ": "
                java.lang.String r1 = X.C60P.A1M(r0, r2, r1)
                java.lang.String r0 = "CallLogDataSource"
                X.CFK.A06(r0, r1)
                return r4
            L7d:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.calllogs.CallLogDataSource.CallLogBackfillStrategy.windowSnapshot(long, long, X.HtJ):java.lang.Object");
        }

        @Override // com.facebook.aura.nodes.datasource.BackfillStrategy
        public JsonObject ackStub() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C2nw c2nwA02 = C7qW.A02();
            return C60O.A1I(AuraCvmPushReplayStore.ENTRIES_KEY, C7pd.A00(C7pd.A02(Long.valueOf(jCurrentTimeMillis), "syncedAt", c2nwA02)), c2nwA02);
        }

        @Override // com.facebook.aura.nodes.datasource.BackfillStrategy
        public /* bridge */ int estimatedChunks(long j, long j2) {
            return BackfillStrategy.CC.$default$estimatedChunks(this, j, j2);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calllogs.CallLogDataSource$backfill$2", f = "CallLogDataSource.kt", l = {148}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calllogs.CallLogDataSource$backfill$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super DataSourceResult>, Object> {
        public final /* synthetic */ DataSourceContext $ctx;
        public final /* synthetic */ String $endDate;
        public final /* synthetic */ String $startDate;
        public long J$0;
        public long J$1;
        public long J$2;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, DataSourceContext dataSourceContext, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$startDate = str;
            this.$endDate = str2;
            this.$ctx = dataSourceContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$startDate, this.$endDate, this.$ctx, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            String strA0M;
            String str;
            long jA05;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return obj;
            }
            Hwg.A00(obj);
            String str2 = this.$startDate;
            if (str2 == null || str2.length() == 0) {
                return new DataSourceResult.Error("missing_start_date", "start_date is required for call_log backfill");
            }
            try {
                long jA052 = C60Q.A05(str2);
                long jCurrentTimeMillis = System.currentTimeMillis();
                String str3 = this.$endDate;
                if (str3 != null) {
                    try {
                        jA05 = C60Q.A05(str3);
                    } catch (DateTimeParseException e) {
                        strA0M = FGI.A0M("end_date must be ISO-8601: ", e.getMessage());
                        str = "invalid_end_date";
                        return new DataSourceResult.Error(str, strA0M);
                    }
                } else {
                    jA05 = jCurrentTimeMillis;
                }
                String strIso8601Utc = this.$endDate;
                if (strIso8601Utc == null) {
                    strIso8601Utc = NodeSyncTimestamps.INSTANCE.iso8601Utc(jA05);
                }
                DataSourcePublishPipeline dataSourcePublishPipeline = DataSourcePublishPipeline.INSTANCE;
                DataSourceContext dataSourceContext = this.$ctx;
                String sourceId = CallLogDataSource.INSTANCE.getSourceId();
                String str4 = this.$startDate;
                CallLogBackfillStrategy callLogBackfillStrategy = new CallLogBackfillStrategy();
                this.L$0 = null;
                this.J$0 = jA052;
                this.J$1 = jCurrentTimeMillis;
                this.J$2 = jA05;
                this.label = 1;
                Object objDeliver = dataSourcePublishPipeline.deliver(dataSourceContext, sourceId, jA052, jA05, str4, strIso8601Utc, callLogBackfillStrategy, this);
                return objDeliver == enumC10460Hji ? enumC10460Hji : objDeliver;
            } catch (DateTimeParseException e2) {
                strA0M = FGI.A0M("start_date must be ISO-8601: ", e2.getMessage());
                str = "invalid_start_date";
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super DataSourceResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calllogs.CallLogDataSource$proactiveSync$2", f = "CallLogDataSource.kt", l = {110, 111}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calllogs.CallLogDataSource$proactiveSync$2, reason: invalid class name and case insensitive filesystem */
    public final class C111082 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super DataSourceResult>, Object> {
        public final /* synthetic */ DataSourceContext $ctx;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111082(DataSourceContext dataSourceContext, HtJ<? super C111082> htJ) {
            super(2, htJ);
            this.$ctx = dataSourceContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C111082(this.$ctx, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super DataSourceResult> htJ) {
            return new C111082(this.$ctx, htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                CallLogDataSource callLogDataSource = CallLogDataSource.INSTANCE;
                this.label = 1;
                obj = CallLogDataSource.readSnapshot$default(callLogDataSource, 5, null, null, this, 6, null);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        Hwg.A00(obj);
                    }
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HxE hxE = (HxE) obj;
            JsonArray jsonArray = (JsonArray) hxE.first;
            JsonObject jsonObject = (JsonObject) hxE.second;
            ProactiveSnapshotSync proactiveSnapshotSync = ProactiveSnapshotSync.INSTANCE;
            DataSourceContext dataSourceContext = this.$ctx;
            String sourceId = CallLogDataSource.INSTANCE.getSourceId();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            obj = proactiveSnapshotSync.publishIfChanged(dataSourceContext, sourceId, jsonArray, jsonObject, this);
            return obj == enumC10460Hji ? enumC10460Hji : obj;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calllogs.CallLogDataSource", f = "CallLogDataSource.kt", l = {169}, m = "readSnapshot", v = 2)
    /* renamed from: com.facebook.aura.commands.calllogs.CallLogDataSource$readSnapshot$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
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
            return CallLogDataSource.this.readSnapshot(0, null, null, this);
        }
    }

    static {
        Uri uri = CallLog.Calls.CONTENT_URI;
        C7384Etj.A0V(uri);
        proactiveTrigger = new ProactiveTrigger.ContentObserver(uri, true, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readSnapshot(int r12, java.lang.Long r13, java.lang.Long r14, X.HtJ<? super X.HxE<kotlinx.serialization.json.JsonArray, kotlinx.serialization.json.JsonObject>> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.facebook.aura.commands.calllogs.CallLogDataSource.AnonymousClass1
            if (r0 == 0) goto L5d
            r10 = r15
            com.facebook.aura.commands.calllogs.CallLogDataSource$readSnapshot$1 r10 = (com.facebook.aura.commands.calllogs.CallLogDataSource.AnonymousClass1) r10
            int r2 = r10.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r10.label = r2
        L12:
            java.lang.Object r4 = r10.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r10.label
            r0 = 1
            if (r1 == 0) goto L40
            if (r1 != r0) goto L88
            X.Hwg.A00(r4)
        L20:
            com.facebook.aura.commands.calllogs.CanonicalCallLogPayload r4 = (com.facebook.aura.commands.calllogs.CanonicalCallLogPayload) r4
            X.7pd r2 = X.C7pd.A01()
            java.util.List<com.facebook.aura.commands.calllogs.CanonicalCallLogEntry> r0 = r4.entries
            java.util.Iterator r1 = r0.iterator()
        L2c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r1.next()
            com.facebook.aura.commands.calllogs.CanonicalCallLogEntry r0 = (com.facebook.aura.commands.calllogs.CanonicalCallLogEntry) r0
            kotlinx.serialization.json.JsonObject r0 = r0.toJson()
            r2.A06(r0)
            goto L2c
        L40:
            X.Hwg.A00(r4)
            com.facebook.aura.commands.calllogs.DeviceCallLogReader r3 = com.facebook.aura.commands.calllogs.DeviceCallLogReader.INSTANCE
            android.app.Application r4 = X.C4JM.A00()
            r6 = 0
            r10.L$0 = r6
            r10.L$1 = r6
            r5 = r12
            r10.I$0 = r12
            r10.label = r0
            r8 = r13
            r9 = r14
            r7 = r6
            java.lang.Object r4 = r3.readCallLog(r4, r5, r6, r7, r8, r9, r10)
            if (r4 != r2) goto L20
            return r2
        L5d:
            com.facebook.aura.commands.calllogs.CallLogDataSource$readSnapshot$1 r10 = new com.facebook.aura.commands.calllogs.CallLogDataSource$readSnapshot$1
            r10.<init>(r15)
            goto L12
        L63:
            kotlinx.serialization.json.JsonArray r3 = X.C7pd.A00(r2)
            X.2nw r2 = X.C60O.A1K()
            java.lang.String r1 = "platform"
            java.lang.String r0 = r4.platform
            X.C7qW.A06(r1, r0, r2)
            long r0 = r4.syncedAt
            java.lang.Long r1 = X.C3cG.A0S(r0)
            java.lang.String r0 = "syncedAt"
            X.C7qW.A05(r1, r0, r2)
            java.lang.String r0 = "entries"
            kotlinx.serialization.json.JsonObject r0 = X.C60O.A1I(r0, r3, r2)
            X.HxE r2 = X.C3cG.A0r(r3, r0)
            return r2
        L88:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.calllogs.CallLogDataSource.readSnapshot(int, java.lang.Long, java.lang.Long, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object readSnapshot$default(CallLogDataSource callLogDataSource, int i, Long l, Long l2, HtJ htJ, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            l = null;
        }
        if ((i2 & 4) != 0) {
            l2 = null;
        }
        return callLogDataSource.readSnapshot(i, l, l2, htJ);
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
    public boolean isEnabled() {
        return TelephonyFeatureUtils.INSTANCE.hasCalling(C4JM.A00());
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public Object backfill(String str, String str2, DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, str2, dataSourceContext, null));
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public Object proactiveSync(DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C111082(dataSourceContext, null));
    }
}
