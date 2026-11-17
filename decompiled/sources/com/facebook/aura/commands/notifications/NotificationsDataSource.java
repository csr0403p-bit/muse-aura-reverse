package com.facebook.aura.commands.notifications;

import X.A6B;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.B3i;
import X.C06G;
import X.C0881AGi;
import X.C2nw;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7pd;
import X.C7qW;
import X.C8d6;
import X.C9258GBl;
import X.C9oY;
import X.CFK;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.InterfaceC2261BLa;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.facebook.aura.nodes.datasource.DataSource;
import com.facebook.aura.nodes.datasource.DataSourceContext;
import com.facebook.aura.nodes.datasource.DataSourceResult;
import com.facebook.aura.nodes.datasource.ProactiveDelivery;
import com.facebook.aura.nodes.datasource.ProactiveTrigger;
import com.facebook.aura.nodes.registry.HatchDataSourceRegistration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public final class NotificationsDataSource implements DataSource, HatchDataSourceRegistration {
    public static final String description = "Active notifications surfaced by the system notification listener. Each entry has `app`, `app_package`, `title`, `body`, `sender`, `category` (one of msg, email, social, call, missed_call, other \u2014 `call` is a placed or in-progress call, `missed_call` is one the user missed; never treat them as the same thing), and `dedup_key` (a stable id for the same physical message across re-emissions \u2014 use it to avoid reporting a notification twice). In messaging notifications, `sender` identifies each message's author, including the user's own replies. `title` labels the notification or conversation, not necessarily the sender. For when it arrived use `timestamp_local` (the user's local wall-clock time), `timestamp_local_date` (their local calendar day), and `timestamp_weekday` (their local weekday name). `timestamp` is UTC and internal \u2014 NEVER show it to the user and never use it to compute the day, date, or weekday: it names the wrong day for notifications that arrived in the evening. Show the weekday using `timestamp_weekday` verbatim.";
    public static final boolean emitsProactively = true;
    public static final String sourceId = "notifications";
    public static final boolean supportsBackfill = false;
    public static final NotificationsDataSource INSTANCE = new NotificationsDataSource();
    public static final List<String> permissionRequired = Collections.singletonList("@notification_listener");
    public static final ProactiveTrigger proactiveTrigger = ProactiveTrigger.NotificationListener.INSTANCE;
    public static final InterfaceC2261BLa publishMutex = new C9258GBl();

    public final class PreparedPayload extends C06G {
        public final List<String> dedupKeys;
        public final long newWatermark;
        public final long nowMs;
        public final JsonObject payload;

        public PreparedPayload(JsonObject jsonObject, long j, List<String> list, long j2) {
            C7384Etj.A0Y(list, 2);
            this.payload = jsonObject;
            this.newWatermark = j;
            this.dedupKeys = list;
            this.nowMs = j2;
        }

        public static /* synthetic */ PreparedPayload copy$default(PreparedPayload preparedPayload, JsonObject jsonObject, long j, List list, long j2, int i, Object obj) {
            JsonObject jsonObject2 = jsonObject;
            long j3 = j;
            List list2 = list;
            long j4 = j2;
            if ((i & 1) != 0) {
                jsonObject2 = preparedPayload.payload;
            }
            if ((i & 2) != 0) {
                j3 = preparedPayload.newWatermark;
            }
            if ((i & 4) != 0) {
                list2 = preparedPayload.dedupKeys;
            }
            if ((i & 8) != 0) {
                j4 = preparedPayload.nowMs;
            }
            C7384Etj.A0Y(list2, 2);
            return new PreparedPayload(jsonObject2, j3, list2, j4);
        }

        public final PreparedPayload copy(JsonObject jsonObject, long j, List<String> list, long j2) {
            C7384Etj.A0Y(list, 2);
            return new PreparedPayload(jsonObject, j, list, j2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof PreparedPayload) {
                    PreparedPayload preparedPayload = (PreparedPayload) obj;
                    if (!C7384Etj.areEqual(this.payload, preparedPayload.payload) || this.newWatermark != preparedPayload.newWatermark || !C7384Etj.areEqual(this.dedupKeys, preparedPayload.dedupKeys) || this.nowMs != preparedPayload.nowMs) {
                    }
                }
                return false;
            }
            return true;
        }

        public final JsonObject component1() {
            return this.payload;
        }

        public final long component2() {
            return this.newWatermark;
        }

        public final List<String> component3() {
            return this.dedupKeys;
        }

        public final long component4() {
            return this.nowMs;
        }

        public final List<String> getDedupKeys() {
            return this.dedupKeys;
        }

        public final long getNewWatermark() {
            return this.newWatermark;
        }

        public final long getNowMs() {
            return this.nowMs;
        }

        public final JsonObject getPayload() {
            return this.payload;
        }

        public int hashCode() {
            return AnonymousClass005.A0F(this.dedupKeys, AnonymousClass006.A06(this.newWatermark, AnonymousClass006.A0D(this.payload) * 31)) + C3cG.A02(this.nowMs);
        }

        public String toString() {
            return super.toString();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.notifications.NotificationsDataSource$proactiveSync$2", f = "NotificationsDataSource.kt", l = {354, 119, 130}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.notifications.NotificationsDataSource$proactiveSync$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super DataSourceResult>, Object> {
        public final /* synthetic */ DataSourceContext $ctx;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DataSourceContext dataSourceContext, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$ctx = dataSourceContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$ctx, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super DataSourceResult> htJ) {
            return new AnonymousClass2(this.$ctx, htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0096 A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:33:0x00b9, B:34:0x00bc, B:36:0x00c2, B:37:0x00c8, B:25:0x008d, B:26:0x0090, B:28:0x0096, B:29:0x009c), top: B:45:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c2 A[Catch: all -> 0x00d3, TryCatch #0 {all -> 0x00d3, blocks: (B:33:0x00b9, B:34:0x00bc, B:36:0x00c2, B:37:0x00c8, B:25:0x008d, B:26:0x0090, B:28:0x0096, B:29:0x009c), top: B:45:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c8 A[Catch: all -> 0x00d3, TRY_LEAVE, TryCatch #0 {all -> 0x00d3, blocks: (B:33:0x00b9, B:34:0x00bc, B:36:0x00c2, B:37:0x00c8, B:25:0x008d, B:26:0x0090, B:28:0x0096, B:29:0x009c), top: B:45:0x000c }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 218
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.notifications.NotificationsDataSource.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.notifications.NotificationsDataSource$publishNow$2", f = "NotificationsDataSource.kt", l = {354, 177, 213}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.notifications.NotificationsDataSource$publishNow$2, reason: invalid class name and case insensitive filesystem */
    public final class C111292 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111292(AbstractC3358CGz abstractC3358CGz, HtJ<? super C111292> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C111292 c111292 = new C111292(this.$userSession, htJ);
            c111292.L$0 = obj;
            return c111292;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00bc A[Catch: all -> 0x0132, TryCatch #1 {all -> 0x0132, blocks: (B:23:0x00aa, B:24:0x00ad, B:27:0x00b4, B:29:0x00bc, B:30:0x00c3, B:32:0x00c7, B:34:0x00cc, B:35:0x00e5), top: B:58:0x00aa }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c3 A[Catch: all -> 0x0132, TryCatch #1 {all -> 0x0132, blocks: (B:23:0x00aa, B:24:0x00ad, B:27:0x00b4, B:29:0x00bc, B:30:0x00c3, B:32:0x00c7, B:34:0x00cc, B:35:0x00e5), top: B:58:0x00aa }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0117 A[Catch: all -> 0x012e, TryCatch #4 {all -> 0x012e, blocks: (B:38:0x0102, B:39:0x0105, B:45:0x0117, B:47:0x0126, B:46:0x011d, B:43:0x010d), top: B:61:0x0102 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x011d A[Catch: all -> 0x012e, TryCatch #4 {all -> 0x012e, blocks: (B:38:0x0102, B:39:0x0105, B:45:0x0117, B:47:0x0126, B:46:0x011d, B:43:0x010d), top: B:61:0x0102 }] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 311
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.notifications.NotificationsDataSource.C111292.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C111292) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [X.AGi] */
    public final PreparedPayload buildPreparedPayload$fbandroid_express_aura_java_com_facebook_aura_commands_notifications_notifications(Context context) {
        long j;
        JsonObject jsonObjectA1I;
        ?? A0h;
        C7384Etj.A0Y(context, 0);
        NotificationRepoImpl notificationRepoImpl = NotificationRepoHolder.repo;
        if (notificationRepoImpl == null) {
            CFK.A06(NotificationsDataSourceKt.TAG, "NotificationRepo not available");
            return null;
        }
        long jLastSyncedPostTime = NotificationSyncPrefsKt.lastSyncedPostTime(context);
        B3i b3i = new B3i(new NotificationsDataSource$buildPreparedPayload$candidates$1(context), AbstractC0878AGe.A06(notificationRepoImpl.activeProvider.getActiveNotifications()), false);
        NotificationsDataSource$buildPreparedPayload$candidates$2 notificationsDataSource$buildPreparedPayload$candidates$2 = NotificationsDataSource$buildPreparedPayload$candidates$2.INSTANCE;
        C7384Etj.A0Y(notificationsDataSource$buildPreparedPayload$candidates$2, 1);
        List listA02 = A6B.A02(A6B.A07(new C8d6(new Comparator() { // from class: com.facebook.aura.commands.notifications.NotificationsDataSource$buildPreparedPayload$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return C60Q.A01(Long.valueOf(((StatusBarNotification) t).getPostTime()), ((StatusBarNotification) t2).getPostTime());
            }
        }, A6B.A03(new NotificationsDataSource$buildPreparedPayload$candidates$3(jLastSyncedPostTime), new B3i(notificationsDataSource$buildPreparedPayload$candidates$2, b3i, false))), 50));
        if (listA02.isEmpty()) {
            return new PreparedPayload(null, jLastSyncedPostTime, C0881AGi.A00, System.currentTimeMillis());
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Set<String> setRecentlyShippedKeys = NotificationSyncPrefsKt.recentlyShippedKeys(context, jCurrentTimeMillis);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA02.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(NotificationSerializer.INSTANCE.toJson((StatusBarNotification) it.next(), context), arrayListA0h);
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (Object obj : arrayListA0h) {
            String strDedupKey = INSTANCE.dedupKey((JsonObject) obj);
            if (strDedupKey.length() > 0) {
                C60Q.A1H(strDedupKey, obj, arrayListA0h2, setRecentlyShippedKeys);
            }
        }
        Iterator it2 = listA02.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        long postTime = ((StatusBarNotification) it2.next()).getPostTime();
        loop2: while (true) {
            j = postTime;
            while (it2.hasNext()) {
                postTime = ((StatusBarNotification) it2.next()).getPostTime();
                if (j < postTime) {
                    break;
                }
            }
        }
        if (arrayListA0h2.isEmpty()) {
            jsonObjectA1I = null;
            A0h = C0881AGi.A00;
        } else {
            C2nw c2nwA02 = C7qW.A02();
            C7pd c7pdA02 = C7pd.A02(Long.valueOf(jCurrentTimeMillis), "syncedAt", c2nwA02);
            Iterator it3 = arrayListA0h2.iterator();
            while (it3.hasNext()) {
                c7pdA02.A06(C60Q.A11(it3));
            }
            jsonObjectA1I = C60O.A1I("notifications", C7pd.A00(c7pdA02), c2nwA02);
            ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h2);
            Iterator it4 = arrayListA0h2.iterator();
            while (it4.hasNext()) {
                arrayListA0i.add(INSTANCE.dedupKey((JsonObject) it4.next()));
            }
            A0h = C3cG.A0h();
            Iterator it5 = arrayListA0i.iterator();
            while (it5.hasNext()) {
                AnonymousClass007.A19(A0h, it5);
            }
        }
        return new PreparedPayload(jsonObjectA1I, j, A0h, jCurrentTimeMillis);
    }

    private final String dedupKey(JsonObject jsonObject) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        Object obj = jsonObject.get("dedup_key");
        return (!(obj instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj) == null || (strA04 = C9oY.A04(jsonPrimitive)) == null) ? "" : strA04;
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

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject emptyNotificationsPayload(long j) {
        C2nw c2nwA02 = C7qW.A02();
        return C60O.A1I("notifications", C7pd.A00(C7pd.A02(Long.valueOf(j), "syncedAt", c2nwA02)), c2nwA02);
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public /* bridge */ Object backfill(String str, String str2, DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ) {
        return DataSource.CC.backfill$suspendImpl(this, str, str2, dataSourceContext, htJ);
    }

    public final void commitPublished$fbandroid_express_aura_java_com_facebook_aura_commands_notifications_notifications(Context context, PreparedPayload preparedPayload) {
        AnonymousClass003.A0u(context, preparedPayload);
        long j = preparedPayload.newWatermark;
        if (j > 0) {
            NotificationSyncPrefsKt.setLastSyncedPostTime(context, j);
        }
        if (preparedPayload.dedupKeys.isEmpty()) {
            return;
        }
        List<String> list = preparedPayload.dedupKeys;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass002.A1J(it.next(), Long.valueOf(preparedPayload.nowMs), arrayListA0i);
        }
        NotificationSyncPrefsKt.markShipped(context, arrayListA0i, preparedPayload.nowMs);
    }

    @Override // com.facebook.aura.nodes.datasource.DataSource
    public Object proactiveSync(DataSourceContext dataSourceContext, HtJ<? super DataSourceResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(dataSourceContext, null));
    }

    public final Object publishNow(AbstractC3358CGz abstractC3358CGz, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C111292(abstractC3358CGz, null));
    }
}
