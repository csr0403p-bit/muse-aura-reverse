package com.facebook.aura.commands.sms;

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
import X.HzP;
import android.content.Context;
import android.net.Uri;
import android.provider.Telephony;
import com.facebook.aura.commands.core.TelephonyFeatureUtils;
import com.facebook.aura.nodes.datasource.BackfillStrategy;
import com.facebook.aura.nodes.datasource.DataSource;
import com.facebook.aura.nodes.datasource.DataSourceContext;
import com.facebook.aura.nodes.datasource.DataSourcePublishPipeline;
import com.facebook.aura.nodes.datasource.DataSourceResult;
import com.facebook.aura.nodes.datasource.NodeSyncTimestamps;
import com.facebook.aura.nodes.datasource.ProactiveDelivery;
import com.facebook.aura.nodes.datasource.ProactiveTrigger;
import com.facebook.aura.nodes.registry.HatchDataSourceRegistration;
import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class SmsDataSource implements DataSource, HatchDataSourceRegistration {
    public static final long BACKFILL_CHUNK_DAYS = 30;
    public static final int BACKFILL_LIMIT = Integer.MAX_VALUE;
    public static final int PROACTIVE_GRACE_READ_LIMIT = 200;
    public static final int PROACTIVE_PUBLISH_LIMIT = 25;
    public static final int PROACTIVE_SYNC_LIMIT = 5;
    public static final String description = "Device text messages (SMS, MMS, and RCS) from the phone's messaging app. Each message has the sender/recipient address (E.164 when available), resolved contact name, body text, read state, direction (inbound or outbound), kind (sms/mms/rcs), attachment types (image/video/audio/contact/text/other), and for group threads the full participant list. `direction` determines who sent each message: `inbound` means `address`/`contactName` identifies the sender; `outbound` means the user sent it and `address`/`contactName` identifies the recipient. Do not infer the author from `contactName` alone. Attachments (voice notes, images, video, files) additionally carry an `attachments` entry, each with an `attachmentId`. When an entry already has an `uploadedPath`, retrieve that path to view, play, or transcribe the file. When it does not, the file is still on the phone \u2014 call `message.attachment.get` with its `attachmentId` to fetch it, then retrieve the `uploadedPath` that command returns. For when a message was sent or received use `timestamp_local` (the user's local wall-clock time), `timestamp_local_date` (their local calendar day), and `timestamp_weekday` (their local weekday name). `timestampMs` is UTC epoch milliseconds and is internal \u2014 NEVER show it to the user and never use it to compute the day, date, or weekday: it names the wrong day for messages sent in the evening. Show the weekday using `timestamp_weekday` verbatim; never derive it yourself.";
    public static final boolean emitsProactively = true;
    public static final ProactiveTrigger proactiveTrigger;
    public static final String sourceId = "sms";
    public static final boolean supportsBackfill = true;
    public static final SmsDataSource INSTANCE = new SmsDataSource();
    public static final List<String> permissionRequired = Collections.singletonList("android.permission.READ_SMS");

    public final class SmsBackfillStrategy implements BackfillStrategy {
        public final long chunkDays = 30;

        @Override // com.facebook.aura.nodes.datasource.BackfillStrategy
        public long getChunkDays() {
            return this.chunkDays;
        }

        @Override // com.facebook.aura.nodes.datasource.BackfillStrategy
        public /* bridge */ void onWindowAccepted() {
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
        @Override // com.facebook.aura.nodes.datasource.BackfillStrategy
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object windowSnapshot(long r11, long r13, X.HtJ<? super kotlinx.serialization.json.JsonObject> r15) {
            /*
                r10 = this;
                boolean r0 = r15 instanceof com.facebook.aura.commands.sms.SmsDataSource$SmsBackfillStrategy$windowSnapshot$1
                if (r0 == 0) goto L23
                r9 = r15
                com.facebook.aura.commands.sms.SmsDataSource$SmsBackfillStrategy$windowSnapshot$1 r9 = (com.facebook.aura.commands.sms.SmsDataSource$SmsBackfillStrategy$windowSnapshot$1) r9
                int r2 = r9.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L23
                int r2 = r2 - r1
                r9.label = r2
            L12:
                java.lang.Object r4 = r9.result
                X.Hji r2 = X.EnumC10460Hji.A02
                int r1 = r9.label
                r3 = 0
                r0 = 1
                if (r1 == 0) goto L2e
                if (r1 != r0) goto L29
                long r13 = r9.J$1
                long r11 = r9.J$0
                goto L4f
            L23:
                com.facebook.aura.commands.sms.SmsDataSource$SmsBackfillStrategy$windowSnapshot$1 r9 = new com.facebook.aura.commands.sms.SmsDataSource$SmsBackfillStrategy$windowSnapshot$1
                r9.<init>(r10, r15)
                goto L12
            L29:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L2e:
                X.Hwg.A00(r4)
                com.facebook.aura.commands.sms.SmsDataSource r4 = com.facebook.aura.commands.sms.SmsDataSource.INSTANCE     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L7d
                android.app.Application r5 = X.C4JM.A00()     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L7d
                java.lang.Long r7 = X.C3cG.A0S(r11)     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L7d
                java.lang.Long r8 = X.C3cG.A0S(r13)     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L7d
                r9.J$0 = r11     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L7d
                r9.J$1 = r13     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L7d
                r9.label = r0     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L7d
                r6 = 2147483647(0x7fffffff, float:NaN)
                java.lang.Object r4 = com.facebook.aura.commands.sms.SmsDataSource.access$buildPayload(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L7d
                if (r4 != r2) goto L52
                return r2
            L4f:
                X.Hwg.A00(r4)     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L7d
            L52:
                kotlinx.serialization.json.JsonObject r4 = (kotlinx.serialization.json.JsonObject) r4     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L7d
                com.facebook.aura.commands.sms.SmsDataSource r0 = com.facebook.aura.commands.sms.SmsDataSource.INSTANCE
                boolean r0 = com.facebook.aura.commands.sms.SmsDataSource.access$isEmptyPayload(r0, r4)
                if (r0 == 0) goto L5d
                return r3
            L5d:
                return r4
            L5e:
                r0 = move-exception
                java.lang.String r2 = r0.getMessage()
                java.lang.String r0 = "sms backfill window read failed "
                java.lang.StringBuilder r1 = X.C60O.A0z(r0, r11)
                java.lang.String r0 = ".."
                r1.append(r0)
                r1.append(r13)
                java.lang.String r0 = ": "
                java.lang.String r1 = X.C60P.A1M(r0, r2, r1)
                java.lang.String r0 = "SmsDataSource"
                X.CFK.A06(r0, r1)
                return r3
            L7d:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.SmsDataSource.SmsBackfillStrategy.windowSnapshot(long, long, X.HtJ):java.lang.Object");
        }

        @Override // com.facebook.aura.nodes.datasource.BackfillStrategy
        public JsonObject ackStub() {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C2nw c2nwA02 = C7qW.A02();
            return C60O.A1I("messages", C7pd.A00(C7pd.A02(Long.valueOf(jCurrentTimeMillis), "syncedAtMs", c2nwA02)), c2nwA02);
        }

        @Override // com.facebook.aura.nodes.datasource.BackfillStrategy
        public /* bridge */ int estimatedChunks(long j, long j2) {
            return BackfillStrategy.CC.$default$estimatedChunks(this, j, j2);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.sms.SmsDataSource$backfill$2", f = "SmsDataSource.kt", l = {199}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.sms.SmsDataSource$backfill$2, reason: invalid class name */
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
                return new DataSourceResult.Error("missing_start_date", "start_date is required for sms backfill");
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
                String sourceId = SmsDataSource.INSTANCE.getSourceId();
                String str4 = this.$startDate;
                SmsBackfillStrategy smsBackfillStrategy = new SmsBackfillStrategy();
                this.L$0 = null;
                this.J$0 = jA052;
                this.J$1 = jCurrentTimeMillis;
                this.J$2 = jA05;
                this.label = 1;
                Object objDeliver = dataSourcePublishPipeline.deliver(dataSourceContext, sourceId, jA052, jA05, str4, strIso8601Utc, smsBackfillStrategy, this);
                return objDeliver == enumC10460Hji ? enumC10460Hji : objDeliver;
            } catch (DateTimeParseException e2) {
                strA0M = FGI.A0M("start_date must be ISO-8601 (e.g. '2025-01-15T00:00:00Z'): ", e2.getMessage());
                str = "invalid_start_date";
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super DataSourceResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.sms.SmsDataSource", f = "SmsDataSource.kt", l = {228}, m = "buildPayload", v = 2)
    /* renamed from: com.facebook.aura.commands.sms.SmsDataSource$buildPayload$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmsDataSource.this.buildPayload(null, 0, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.sms.SmsDataSource$proactiveSync$2", f = "SmsDataSource.kt", l = {125, 130}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.sms.SmsDataSource$proactiveSync$2, reason: invalid class name and case insensitive filesystem */
    public final class C111362 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super DataSourceResult>, Object> {
        public final /* synthetic */ DataSourceContext $ctx;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111362(DataSourceContext dataSourceContext, HtJ<? super C111362> htJ) {
            super(2, htJ);
            this.$ctx = dataSourceContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C111362(this.$ctx, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super DataSourceResult> htJ) {
            return new C111362(this.$ctx, htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                X.Hji r7 = X.EnumC10460Hji.A02
                int r0 = r8.label
                r6 = 2
                r1 = 1
                if (r0 == 0) goto L26
                if (r0 == r1) goto L3a
                if (r0 != r6) goto Ld3
                java.lang.Object r6 = r8.L$1
                java.util.List r6 = (java.util.List) r6
                java.lang.Object r0 = r8.L$0
                android.content.Context r5 = X.C60P.A02(r0, r9)
            L16:
                boolean r0 = X.AnonymousClass001.A1X(r9)
                if (r0 != 0) goto L69
                java.lang.String r2 = "publish_failed"
                java.lang.String r1 = "Failed to publish sms payload"
                com.facebook.aura.nodes.datasource.DataSourceResult$Error r0 = new com.facebook.aura.nodes.datasource.DataSourceResult$Error
                r0.<init>(r2, r1)
                return r0
            L26:
                X.Hwg.A00(r9)
                android.app.Application r5 = X.C4JM.A00()
                com.facebook.aura.commands.sms.SmsDataSource r0 = com.facebook.aura.commands.sms.SmsDataSource.INSTANCE
                r8.L$0 = r5
                r8.label = r1
                java.lang.Object r9 = com.facebook.aura.commands.sms.SmsDataSource.access$readProactiveMessages(r0, r5, r8)
                if (r9 != r7) goto L40
            L39:
                return r7
            L3a:
                java.lang.Object r0 = r8.L$0
                android.content.Context r5 = X.C60P.A02(r0, r9)
            L40:
                java.util.List r9 = (java.util.List) r9
                boolean r0 = r9.isEmpty()
                if (r0 != 0) goto Ldb
                long r2 = java.lang.System.currentTimeMillis()
                com.facebook.aura.nodes.datasource.DataSourceContext r4 = r8.$ctx
                com.facebook.aura.commands.sms.SmsDataSource r0 = com.facebook.aura.commands.sms.SmsDataSource.INSTANCE
                java.lang.String r1 = r0.getSourceId()
                kotlinx.serialization.json.JsonObject r0 = com.facebook.aura.commands.sms.SmsDataSource.access$toPayloadJson(r0, r9, r2)
                r8.L$0 = r5
                r8.L$1 = r9
                r8.J$0 = r2
                r8.label = r6
                java.lang.Object r0 = r4.publish(r1, r0, r8)
                if (r0 == r7) goto L39
                r6 = r9
                r9 = r0
                goto L16
            L69:
                long r2 = com.facebook.aura.commands.sms.SmsSyncPrefsKt.lastSyncedSmsDate(r5)
                java.util.Iterator r7 = r6.iterator()
                boolean r0 = r7.hasNext()
                if (r0 != 0) goto La8
                r0 = 0
            L79:
                long r7 = java.lang.Math.max(r0, r2)
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L84
                com.facebook.aura.commands.sms.SmsSyncPrefsKt.setLastSyncedSmsDate(r5, r0)
            L84:
                int r0 = X.AnonymousClass005.A0C(r6)
                java.util.LinkedHashMap r4 = X.C60O.A15(r0)
                java.util.Iterator r3 = r6.iterator()
            L90:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto Ld8
                java.lang.Object r0 = r3.next()
                com.facebook.aura.commands.sms.CanonicalSmsMessage r0 = (com.facebook.aura.commands.sms.CanonicalSmsMessage) r0
                java.lang.String r2 = r0.messageId
                long r0 = r0.timestampMs
                java.lang.Long r0 = X.C3cG.A0S(r0)
                r4.put(r2, r0)
                goto L90
            La8:
                java.lang.Object r0 = r7.next()
                com.facebook.aura.commands.sms.CanonicalSmsMessage r0 = (com.facebook.aura.commands.sms.CanonicalSmsMessage) r0
                long r0 = r0.timestampMs
                java.lang.Long r4 = X.C3cG.A0S(r0)
            Lb4:
                boolean r0 = r7.hasNext()
                if (r0 == 0) goto Lce
                java.lang.Object r0 = r7.next()
                com.facebook.aura.commands.sms.CanonicalSmsMessage r0 = (com.facebook.aura.commands.sms.CanonicalSmsMessage) r0
                long r0 = r0.timestampMs
                java.lang.Long r1 = X.C3cG.A0S(r0)
                int r0 = r4.compareTo(r1)
                if (r0 >= 0) goto Lb4
                r4 = r1
                goto Lb4
            Lce:
                long r0 = r4.longValue()
                goto L79
            Ld3:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            Ld8:
                com.facebook.aura.commands.sms.SmsSyncPrefsKt.recordPublishedIds(r5, r4, r7)
            Ldb:
                com.facebook.aura.nodes.datasource.DataSourceResult$Ok r0 = com.facebook.aura.nodes.datasource.DataSourceResult.Ok.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.SmsDataSource.C111362.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.sms.SmsDataSource", f = "SmsDataSource.kt", l = {240, 248}, m = "readEnriched", v = 2)
    /* renamed from: com.facebook.aura.commands.sms.SmsDataSource$readEnriched$1, reason: invalid class name and case insensitive filesystem */
    public final class C111371 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C111371(HtJ<? super C111371> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmsDataSource.this.readEnriched(null, 0, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.sms.SmsDataSource", f = "SmsDataSource.kt", l = {153, 159}, m = "readProactiveMessages", v = 2)
    /* renamed from: com.facebook.aura.commands.sms.SmsDataSource$readProactiveMessages$1, reason: invalid class name and case insensitive filesystem */
    public final class C111381 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C111381(HtJ<? super C111381> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmsDataSource.this.readProactiveMessages(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object buildPayload(android.content.Context r8, int r9, java.lang.Long r10, java.lang.Long r11, X.HtJ<? super kotlinx.serialization.json.JsonObject> r12) {
        /*
            r7 = this;
            r3 = r12
            boolean r0 = r12 instanceof com.facebook.aura.commands.sms.SmsDataSource.AnonymousClass1
            if (r0 == 0) goto L6a
            r12 = r3
            com.facebook.aura.commands.sms.SmsDataSource$buildPayload$1 r12 = (com.facebook.aura.commands.sms.SmsDataSource.AnonymousClass1) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6a
            int r2 = r2 - r1
            r12.label = r2
        L13:
            java.lang.Object r2 = r12.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r12.label
            r5 = 1
            if (r0 == 0) goto L38
            if (r0 != r5) goto L70
            java.lang.Object r8 = r12.L$5
            android.content.Context r8 = (android.content.Context) r8
            java.lang.Object r1 = r12.L$4
            com.facebook.aura.commands.sms.SmsMediaUploader r1 = (com.facebook.aura.commands.sms.SmsMediaUploader) r1
            X.Hwg.A00(r2)
        L29:
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = r1.withUploadedPaths(r8, r2)
            long r0 = java.lang.System.currentTimeMillis()
            kotlinx.serialization.json.JsonObject r0 = r7.toPayloadJson(r2, r0)
            return r0
        L38:
            X.Hwg.A00(r2)
            if (r10 != 0) goto L50
            long r0 = com.facebook.aura.commands.sms.SmsSyncPrefsKt.lastSyncedSmsDate(r8)
            java.lang.Long r10 = X.C3cG.A0S(r0)
            long r3 = r10.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L50
            r10 = 0
        L50:
            com.facebook.aura.commands.sms.SmsMediaUploader r1 = com.facebook.aura.commands.sms.SmsMediaUploader.INSTANCE
            r0 = 0
            r12.L$0 = r0
            r12.L$1 = r0
            r12.L$2 = r0
            r12.L$3 = r0
            r12.L$4 = r1
            r12.L$5 = r8
            r12.I$0 = r9
            r12.label = r5
            java.lang.Object r2 = r7.readEnriched(r8, r9, r10, r11, r12)
            if (r2 != r6) goto L29
            return r6
        L6a:
            com.facebook.aura.commands.sms.SmsDataSource$buildPayload$1 r12 = new com.facebook.aura.commands.sms.SmsDataSource$buildPayload$1
            r12.<init>(r3)
            goto L13
        L70:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.SmsDataSource.buildPayload(android.content.Context, int, java.lang.Long, java.lang.Long, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readEnriched(android.content.Context r10, int r11, java.lang.Long r12, java.lang.Long r13, X.HtJ<? super java.util.List<com.facebook.aura.commands.sms.CanonicalSmsMessage>> r14) {
        /*
            r9 = this;
            r5 = r10
            r6 = r11
            r3 = r14
            boolean r0 = r14 instanceof com.facebook.aura.commands.sms.SmsDataSource.C111371
            if (r0 == 0) goto L61
            r11 = r3
            com.facebook.aura.commands.sms.SmsDataSource$readEnriched$1 r11 = (com.facebook.aura.commands.sms.SmsDataSource.C111371) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r11.label = r2
        L15:
            java.lang.Object r4 = r11.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r11.label
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L2b
            if (r2 == r0) goto L45
            if (r2 != r1) goto L67
            X.Hwg.A00(r4)
        L26:
            com.facebook.aura.commands.sms.CanonicalSmsPayload r4 = (com.facebook.aura.commands.sms.CanonicalSmsPayload) r4
            java.util.List<com.facebook.aura.commands.sms.CanonicalSmsMessage> r0 = r4.messages
            return r0
        L2b:
            X.Hwg.A00(r4)
            com.facebook.aura.commands.sms.DeviceSmsReader r4 = com.facebook.aura.commands.sms.DeviceSmsReader.INSTANCE
            r11.L$0 = r10
            r7 = 0
            r11.L$1 = r7
            r11.L$2 = r7
            r11.I$0 = r6
            r11.label = r0
            r8 = r12
            r9 = r13
            r10 = r7
            java.lang.Object r4 = r4.readSms(r5, r6, r7, r8, r9, r10, r11)
            if (r4 != r3) goto L4d
            return r3
        L45:
            int r6 = r11.I$0
            java.lang.Object r0 = r11.L$0
            android.content.Context r5 = X.C60P.A02(r0, r4)
        L4d:
            com.facebook.aura.commands.sms.CanonicalSmsPayload r4 = (com.facebook.aura.commands.sms.CanonicalSmsPayload) r4
            r0 = 0
            r11.L$0 = r0
            r11.L$1 = r0
            r11.L$2 = r0
            r11.I$0 = r6
            r11.label = r1
            java.lang.Object r4 = com.facebook.aura.commands.sms.DeviceContactResolverKt.enrichContactNames(r4, r5, r11)
            if (r4 != r3) goto L26
            return r3
        L61:
            com.facebook.aura.commands.sms.SmsDataSource$readEnriched$1 r11 = new com.facebook.aura.commands.sms.SmsDataSource$readEnriched$1
            r11.<init>(r14)
            goto L15
        L67:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.SmsDataSource.readEnriched(android.content.Context, int, java.lang.Long, java.lang.Long, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[LOOP:0: B:13:0x0037->B:15:0x003d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readProactiveMessages(android.content.Context r13, X.HtJ<? super java.util.List<com.facebook.aura.commands.sms.CanonicalSmsMessage>> r14) {
        /*
            r12 = this;
            r3 = r14
            r10 = r13
            boolean r0 = r14 instanceof com.facebook.aura.commands.sms.SmsDataSource.C111381
            r9 = r12
            if (r0 == 0) goto L85
            r14 = r3
            com.facebook.aura.commands.sms.SmsDataSource$readProactiveMessages$1 r14 = (com.facebook.aura.commands.sms.SmsDataSource.C111381) r14
            int r2 = r14.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L85
            int r2 = r2 - r1
            r14.label = r2
        L15:
            java.lang.Object r1 = r14.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r14.label
            r7 = 2
            r3 = 1
            if (r0 == 0) goto L4a
            if (r0 == r3) goto Laf
            if (r0 != r7) goto L94
            java.lang.Object r8 = r14.L$2
            java.util.Set r8 = (java.util.Set) r8
            java.lang.Object r0 = r14.L$0
            android.content.Context r10 = X.C60P.A02(r0, r1)
        L2d:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r1.iterator()
        L37:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.commands.sms.CanonicalSmsMessage r0 = (com.facebook.aura.commands.sms.CanonicalSmsMessage) r0
            java.lang.String r0 = r0.messageId
            X.C60Q.A1H(r0, r1, r3, r8)
            goto L37
        L4a:
            X.Hwg.A00(r1)
            long r0 = com.facebook.aura.commands.sms.SmsSyncPrefsKt.lastSyncedSmsDate(r13)
            java.lang.Long r0 = X.C3cG.A0S(r0)
            long r0 = r0.longValue()
            r5 = 0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L99
            java.util.Set r8 = com.facebook.aura.commands.sms.SmsSyncPrefsKt.recentlyPublishedIds(r13)
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 - r2
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L6d
            r0 = 0
        L6d:
            java.lang.Long r12 = X.C3cG.A0S(r0)
            r14.L$0 = r13
            r13 = 0
            r14.L$1 = r13
            r14.L$2 = r8
            r14.J$0 = r0
            r14.label = r7
            r11 = 200(0xc8, float:2.8E-43)
            java.lang.Object r1 = r9.readEnriched(r10, r11, r12, r13, r14)
            if (r1 != r4) goto L2d
            return r4
        L85:
            com.facebook.aura.commands.sms.SmsDataSource$readProactiveMessages$1 r14 = new com.facebook.aura.commands.sms.SmsDataSource$readProactiveMessages$1
            r14.<init>(r3)
            goto L15
        L8b:
            r0 = 25
            java.util.List r1 = X.AbstractC0878AGe.A0a(r3, r0)
            com.facebook.aura.commands.sms.SmsMediaUploader r0 = com.facebook.aura.commands.sms.SmsMediaUploader.INSTANCE
            goto Lbc
        L94:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L99:
            r12 = 0
            com.facebook.aura.commands.sms.SmsMediaUploader r0 = com.facebook.aura.commands.sms.SmsMediaUploader.INSTANCE
            r14.L$0 = r12
            r14.L$1 = r12
            r14.L$2 = r0
            r14.L$3 = r13
            r14.label = r3
            r11 = 5
            r13 = r12
            java.lang.Object r1 = r9.readEnriched(r10, r11, r12, r13, r14)
            if (r1 != r4) goto Lba
            return r4
        Laf:
            java.lang.Object r10 = r14.L$3
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r0 = r14.L$2
            com.facebook.aura.commands.sms.SmsMediaUploader r0 = (com.facebook.aura.commands.sms.SmsMediaUploader) r0
            X.Hwg.A00(r1)
        Lba:
            java.util.List r1 = (java.util.List) r1
        Lbc:
            java.util.List r0 = r0.withUploadedPaths(r10, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.SmsDataSource.readProactiveMessages(android.content.Context, X.HtJ):java.lang.Object");
    }

    static {
        Uri uri = Telephony.MmsSms.CONTENT_URI;
        C7384Etj.A0V(uri);
        proactiveTrigger = new ProactiveTrigger.ContentObserver(uri, true, 2000L);
    }

    public static /* synthetic */ Object buildPayload$default(SmsDataSource smsDataSource, Context context, int i, Long l, Long l2, HtJ htJ, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 5;
        }
        if ((i2 & 4) != 0) {
            l = null;
        }
        if ((i2 & 8) != 0) {
            l2 = null;
        }
        return smsDataSource.buildPayload(context, i, l, l2, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isEmptyPayload(JsonObject jsonObject) {
        JsonArray jsonArray;
        Object obj = jsonObject.get("messages");
        if (!(obj instanceof JsonArray) || (jsonArray = (JsonArray) obj) == null) {
            return true;
        }
        return jsonArray.isEmpty();
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
        return TelephonyFeatureUtils.INSTANCE.hasMessaging(C4JM.A00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject toPayloadJson(List<CanonicalSmsMessage> list, long j) {
        C2nw c2nwA02 = C7qW.A02();
        C7pd c7pdA02 = C7pd.A02(Long.valueOf(j), "syncedAtMs", c2nwA02);
        Iterator<CanonicalSmsMessage> it = list.iterator();
        while (it.hasNext()) {
            c7pdA02.A06(it.next().toJson());
        }
        return C60O.A1I("messages", C7pd.A00(c7pdA02), c2nwA02);
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public Object backfill(String str, String str2, DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, str2, dataSourceContext, null));
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public Object proactiveSync(DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C111362(dataSourceContext, null));
    }
}
