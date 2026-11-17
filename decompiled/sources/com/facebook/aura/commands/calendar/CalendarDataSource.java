package com.facebook.aura.commands.calendar;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C0881AGi;
import X.C3UX;
import X.C3cG;
import X.C4JM;
import X.C60Q;
import X.C7384Etj;
import X.C9hr;
import X.C9oY;
import X.C9sU;
import X.EnumC10460Hji;
import X.F0C;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.net.Uri;
import android.provider.CalendarContract;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.nodes.datasource.BackfillStrategy;
import com.facebook.aura.nodes.datasource.DataSource;
import com.facebook.aura.nodes.datasource.DataSourceContext;
import com.facebook.aura.nodes.datasource.DataSourcePublishPipeline;
import com.facebook.aura.nodes.datasource.DataSourceResult;
import com.facebook.aura.nodes.datasource.NodeSyncDiff;
import com.facebook.aura.nodes.datasource.NodeSyncTimestamps;
import com.facebook.aura.nodes.datasource.ProactiveDelivery;
import com.facebook.aura.nodes.datasource.ProactiveTrigger;
import com.facebook.aura.nodes.registry.HatchDataSourceRegistration;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class CalendarDataSource implements DataSource, HatchDataSourceRegistration {
    public static final long BACKFILL_CHUNK_DAYS = 30;
    public static final long DAY_MS = 86400000;
    public static final long DEFAULT_BACKFILL_WINDOW_MS = 2592000000L;
    public static final long PROACTIVE_DEBOUNCE_MS = 5000;
    public static final long PROACTIVE_FUTURE_DAYS = 14;
    public static final long PROACTIVE_PAST_DAYS = 7;
    public static final String description = "Device calendars and events (id, title, start/end time, location, provider). `start_date`/`end_date` are UTC and for internal use only \u2014 NEVER show them to the user and never use them to compute the day, date, or weekday. Display the date/time from the local fields instead: for a timed event (`is_all_day`=false) use `start_local`/`end_local` (the event's local wall-clock time); for an all-day event (`is_all_day`=true) use `start_local_date` (first day) through `end_local_date` (last day, INCLUSIVE) \u2014 note the UTC `end_date` is exclusive (midnight after the last day) and must not be shown. If `start_local_date` equals `end_local_date` it is a single all-day day. Always show the weekday using the provided `start_weekday`/`end_weekday` verbatim; never derive the weekday yourself.";
    public static final boolean emitsProactively = true;
    public static final ProactiveTrigger proactiveTrigger;
    public static final String sourceId = "calendar";
    public static final boolean supportsBackfill = true;
    public static final CalendarDataSource INSTANCE = new CalendarDataSource();
    public static final List<String> permissionRequired = Collections.singletonList("android.permission.READ_CALENDAR");

    public final class CalendarBackfillStrategy implements BackfillStrategy {
        public final long chunkDays;
        public final Set<String> emitted;
        public List<String> pendingIds;
        public final CalendarRepository repo;

        public CalendarBackfillStrategy(CalendarRepository calendarRepository) {
            C7384Etj.A0Y(calendarRepository, 0);
            this.repo = calendarRepository;
            this.emitted = C3cG.A0k();
            this.pendingIds = C0881AGi.A00;
            this.chunkDays = 30L;
        }

        @Override // com.facebook.aura.nodes.datasource.BackfillStrategy
        public long getChunkDays() {
            return this.chunkDays;
        }

        @Override // com.facebook.aura.nodes.datasource.BackfillStrategy
        public void onWindowAccepted() {
            this.emitted.addAll(this.pendingIds);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
        @Override // com.facebook.aura.nodes.datasource.BackfillStrategy
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object windowSnapshot(long r12, long r14, X.HtJ<? super kotlinx.serialization.json.JsonObject> r16) {
            /*
                r11 = this;
                r3 = r16
                r8 = r14
                r6 = r12
                boolean r0 = r3 instanceof com.facebook.aura.commands.calendar.CalendarDataSource$CalendarBackfillStrategy$windowSnapshot$1
                if (r0 == 0) goto L27
                r10 = r3
                com.facebook.aura.commands.calendar.CalendarDataSource$CalendarBackfillStrategy$windowSnapshot$1 r10 = (com.facebook.aura.commands.calendar.CalendarDataSource$CalendarBackfillStrategy$windowSnapshot$1) r10
                int r2 = r10.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L27
                int r2 = r2 - r1
                r10.label = r2
            L16:
                java.lang.Object r3 = r10.result
                X.Hji r2 = X.EnumC10460Hji.A02
                int r1 = r10.label
                r4 = 0
                r0 = 1
                if (r1 == 0) goto L32
                if (r1 != r0) goto L2d
                long r8 = r10.J$1
                long r6 = r10.J$0
                goto L44
            L27:
                com.facebook.aura.commands.calendar.CalendarDataSource$CalendarBackfillStrategy$windowSnapshot$1 r10 = new com.facebook.aura.commands.calendar.CalendarDataSource$CalendarBackfillStrategy$windowSnapshot$1
                r10.<init>(r11, r3)
                goto L16
            L2d:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L32:
                X.Hwg.A00(r3)
                com.facebook.aura.commands.calendar.CalendarRepository r5 = r11.repo     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> Lb2
                r10.J$0 = r12     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> Lb2
                r10.J$1 = r14     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> Lb2
                r10.label = r0     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> Lb2
                java.lang.Object r3 = r5.listEventsForSync$fbandroid_express_aura_java_com_facebook_aura_commands_calendar_calendar(r6, r8, r10)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> Lb2
                if (r3 != r2) goto L47
                return r2
            L44:
                X.Hwg.A00(r3)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> Lb2
            L47:
                java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> Lb2
                java.util.ArrayList r5 = X.C3cG.A0h()
                java.util.Iterator r3 = r3.iterator()
            L51:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L66
                java.lang.Object r2 = r3.next()
                r0 = r2
                com.facebook.aura.commands.calendar.CalendarEventPayloadJson r0 = (com.facebook.aura.commands.calendar.CalendarEventPayloadJson) r0
                java.util.Set<java.lang.String> r1 = r11.emitted
                java.lang.String r0 = r0.event_id
                X.C60Q.A1H(r0, r2, r5, r1)
                goto L51
            L66:
                java.util.ArrayList r2 = X.AnonymousClass003.A0i(r5)
                java.util.Iterator r1 = r5.iterator()
            L6e:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L80
                java.lang.Object r0 = r1.next()
                com.facebook.aura.commands.calendar.CalendarEventPayloadJson r0 = (com.facebook.aura.commands.calendar.CalendarEventPayloadJson) r0
                java.lang.String r0 = r0.event_id
                r2.add(r0)
                goto L6e
            L80:
                r11.pendingIds = r2
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto Lb1
                long r10 = java.lang.System.currentTimeMillis()
                com.facebook.aura.commands.calendar.CalendarDataSource r4 = com.facebook.aura.commands.calendar.CalendarDataSource.INSTANCE
                kotlinx.serialization.json.JsonObject r0 = com.facebook.aura.commands.calendar.CalendarDataSource.access$buildFullSnapshot(r4, r5, r6, r8, r10)
                return r0
            L93:
                r0 = move-exception
                java.lang.String r2 = r0.getMessage()
                java.lang.String r0 = "calendar backfill window read failed "
                java.lang.StringBuilder r1 = X.C60O.A0z(r0, r6)
                java.lang.String r0 = ".."
                r1.append(r0)
                r1.append(r8)
                java.lang.String r0 = ": "
                java.lang.String r1 = X.C60P.A1M(r0, r2, r1)
                java.lang.String r0 = "CalendarDataSource"
                X.CFK.A06(r0, r1)
            Lb1:
                return r4
            Lb2:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.calendar.CalendarDataSource.CalendarBackfillStrategy.windowSnapshot(long, long, X.HtJ):java.lang.Object");
        }

        @Override // com.facebook.aura.nodes.datasource.BackfillStrategy
        public JsonObject ackStub() {
            return CalendarDataSource.INSTANCE.buildFullSnapshot(C0881AGi.A00, 0L, 0L, System.currentTimeMillis());
        }

        @Override // com.facebook.aura.nodes.datasource.BackfillStrategy
        public /* bridge */ int estimatedChunks(long j, long j2) {
            return BackfillStrategy.CC.$default$estimatedChunks(this, j, j2);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarDataSource$backfill$2", f = "CalendarDataSource.kt", l = {132}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarDataSource$backfill$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super DataSourceResult>, Object> {
        public final /* synthetic */ DataSourceContext $ctx;
        public final /* synthetic */ String $endDate;
        public final /* synthetic */ String $startDate;
        public long J$0;
        public long J$1;
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
            String str2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                String str3 = this.$startDate;
                if (str3 == null || str3.length() == 0) {
                    return new DataSourceResult.Error("missing_start_date", "start_date is required for calendar backfill");
                }
                try {
                    jA05 = C60Q.A05(str3);
                    str2 = this.$endDate;
                } catch (DateTimeParseException e) {
                    strA0M = FGI.A0M("start_date must be ISO-8601: ", e.getMessage());
                    str = "invalid_start_date";
                }
                try {
                    long jA052 = str2 != null ? C60Q.A05(str2) : 2592000000L + jA05;
                    String strIso8601Utc = this.$endDate;
                    if (strIso8601Utc == null) {
                        strIso8601Utc = NodeSyncTimestamps.INSTANCE.iso8601Utc(jA052);
                    }
                    DataSourcePublishPipeline dataSourcePublishPipeline = DataSourcePublishPipeline.INSTANCE;
                    DataSourceContext dataSourceContext = this.$ctx;
                    String sourceId = CalendarDataSource.INSTANCE.getSourceId();
                    String str4 = this.$startDate;
                    CalendarBackfillStrategy calendarBackfillStrategy = new CalendarBackfillStrategy(CalendarRepository.Companion.getInstance(C4JM.A00()));
                    this.L$0 = null;
                    this.J$0 = jA05;
                    this.J$1 = jA052;
                    this.label = 1;
                    obj = dataSourcePublishPipeline.deliver(dataSourceContext, sourceId, jA05, jA052, str4, strIso8601Utc, calendarBackfillStrategy, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } catch (DateTimeParseException e2) {
                    strA0M = FGI.A0M("end_date must be ISO-8601: ", e2.getMessage());
                    str = "invalid_end_date";
                    return new DataSourceResult.Error(str, strA0M);
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super DataSourceResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarDataSource$proactiveSync$2", f = "CalendarDataSource.kt", l = {VoiceCallForegroundService.AVATAR_TARGET_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarDataSource$proactiveSync$2, reason: invalid class name and case insensitive filesystem */
    public final class C110962 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super DataSourceResult>, Object> {
        public final /* synthetic */ DataSourceContext $ctx;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110962(DataSourceContext dataSourceContext, HtJ<? super C110962> htJ) {
            super(2, htJ);
            this.$ctx = dataSourceContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C110962(this.$ctx, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super DataSourceResult> htJ) {
            return new C110962(this.$ctx, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                CalendarDataSource calendarDataSource = CalendarDataSource.INSTANCE;
                DataSourceContext dataSourceContext = this.$ctx;
                this.label = 1;
                obj = calendarDataSource.runDeltaSync(dataSourceContext, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarDataSource", f = "CalendarDataSource.kt", l = {163, 200, 226}, m = "runDeltaSync", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarDataSource$runDeltaSync$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public long J$1;
        public long J$2;
        public long J$3;
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
            return CalendarDataSource.this.runDeltaSync(null, this);
        }
    }

    static {
        Uri uri = CalendarContract.CONTENT_URI;
        C7384Etj.A0V(uri);
        proactiveTrigger = new ProactiveTrigger.ContentObserver(uri, true, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject buildFullSnapshot(List<CalendarEventPayloadJson> list, long j, long j2, long j3) {
        F0C<C9hr<Object>>[] f0cArr = CalendarFullSnapshotPayloadJson.$childSerializers;
        NodeSyncTimestamps nodeSyncTimestamps = NodeSyncTimestamps.INSTANCE;
        return toJsonObject(new CalendarFullSnapshotPayloadJson("android", nodeSyncTimestamps.iso8601Utc(j3), nodeSyncTimestamps.iso8601Utc(j), nodeSyncTimestamps.iso8601Utc(j2), list));
    }

    private final String contentHash(CalendarEventPayloadJson calendarEventPayloadJson) {
        return NodeSyncDiff.INSTANCE.sha256Hex(HatchJsonKt.HatchJson.A02(calendarEventPayloadJson, CalendarEventPayloadJson$$serializer.INSTANCE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0305  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runDeltaSync(com.facebook.aura.nodes.datasource.DataSourceContext r51, X.HtJ<? super com.facebook.aura.nodes.datasource.DataSourceResult> r52) {
        /*
            Method dump skipped, instructions count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.calendar.CalendarDataSource.runDeltaSync(com.facebook.aura.nodes.datasource.DataSourceContext, X.HtJ):java.lang.Object");
    }

    private final JsonObject toJsonObject(CalendarDeltaPayloadJson calendarDeltaPayloadJson) {
        C9sU c9sU = HatchJsonKt.HatchJson;
        F0C<C9hr<Object>>[] f0cArr = CalendarDeltaPayloadJson.$childSerializers;
        return C9oY.A05(c9sU.A03(calendarDeltaPayloadJson, CalendarDeltaPayloadJson$$serializer.INSTANCE));
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
    public /* bridge */ boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public Object backfill(String str, String str2, DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, str2, dataSourceContext, null));
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public Object proactiveSync(DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C110962(dataSourceContext, null));
    }

    private final JsonObject toJsonObject(CalendarFullSnapshotPayloadJson calendarFullSnapshotPayloadJson) {
        C9sU c9sU = HatchJsonKt.HatchJson;
        F0C<C9hr<Object>>[] f0cArr = CalendarFullSnapshotPayloadJson.$childSerializers;
        return C9oY.A05(c9sU.A03(calendarFullSnapshotPayloadJson, CalendarFullSnapshotPayloadJson$$serializer.INSTANCE));
    }
}
