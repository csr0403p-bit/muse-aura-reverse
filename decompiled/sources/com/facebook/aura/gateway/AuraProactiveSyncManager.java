package com.facebook.aura.gateway;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BzB;
import X.C31u;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import X.C7yC;
import X.EK5;
import X.F1d;
import X.F3R;
import X.InterfaceC7359EnW;
import android.content.Context;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.commands.core.NotificationAccessUtils;
import com.facebook.aura.gateway.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.nodes.HatchNodeClient;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class AuraProactiveSyncManager {
    public static final int $stable = 0;
    public static final String DATATYPE_NOTIFICATIONS = "notifications";
    public static final String DATATYPE_SMS = "sms";
    public static final long DEBOUNCE_DELAY_SECONDS = 5;
    public static final String KEY_DATATYPE = "proactive_sync_datatype";
    public static final String LEGACY_NETWORK_STATE_WORK = "proactive_network_state_sync";
    public static final String WORK_NOTIFICATIONS = "proactive_notifications_sync";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(AuraProactiveSyncManager.class, "notificationSyncDebounceSeconds", "getNotificationSyncDebounceSeconds()I");
    public static final AuraProactiveSyncManager INSTANCE = new AuraProactiveSyncManager();
    public static final C31u notificationSyncDebounceSeconds$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_android.proactive_notification_sync_debounce_seconds);

    public final void cancelAll(Context context) {
        C7384Etj.A0Y(context, 0);
        EK5 ek5A02 = F3R.A02(context);
        ek5A02.A0A(WORK_NOTIFICATIONS);
        ek5A02.A0A(LEGACY_NETWORK_STATE_WORK);
    }

    public final String dataSourceFor(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.equals("notifications")) {
            return "notifications";
        }
        if (str.equals("sms")) {
            return "sms";
        }
        return null;
    }

    public final void enqueueAll(Context context) throws IOException {
        C7384Etj.A0Y(context, 0);
        if (AuraUserSessionStore.INSTANCE.getCurrentSessionForWorkManagerWorker() != null) {
            scheduleNotificationsSync(context);
        }
    }

    public final void scheduleNotificationsSync(Context context) throws IOException {
        C7384Etj.A0Y(context, 0);
        if (isProactiveSyncEnabled(context, "notifications") && NotificationAccessUtils.INSTANCE.isNotificationAccessGranted(context)) {
            long notificationSyncDebounceSeconds = getNotificationSyncDebounceSeconds();
            if (notificationSyncDebounceSeconds < 1) {
                notificationSyncDebounceSeconds = 1;
            }
            scheduleSync(context, WORK_NOTIFICATIONS, "notifications", notificationSyncDebounceSeconds, C7yC.A04);
        }
    }

    private final int getNotificationSyncDebounceSeconds() {
        return AnonymousClass001.A0F(notificationSyncDebounceSeconds$delegate.getValue(this, $$delegatedProperties[0]));
    }

    private final void scheduleSync(Context context, String str, String str2, long j, C7yC c7yC) throws IOException {
        F1d f1d = new F1d(AuraProactiveSyncWorker.class);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        linkedHashMapA0j.put(KEY_DATATYPE, str2);
        BzB bzB = new BzB(linkedHashMapA0j);
        BzB.A00(bzB);
        f1d.A03(bzB);
        f1d.A02(j, TimeUnit.SECONDS);
        F3R.A02(context).A04(c7yC, f1d.A01(), str);
    }

    public static /* synthetic */ void scheduleSync$default(AuraProactiveSyncManager auraProactiveSyncManager, Context context, String str, String str2, long j, C7yC c7yC, int i, Object obj) throws IOException {
        if ((i & 8) != 0) {
            j = 5;
        }
        if ((i & 16) != 0) {
            c7yC = C7yC.A05;
        }
        auraProactiveSyncManager.scheduleSync(context, str, str2, j, c7yC);
    }

    private final String workNameFor(String str) {
        if ("notifications".equals(str)) {
            return WORK_NOTIFICATIONS;
        }
        return null;
    }

    private final boolean hasPermission(Context context, String str) {
        return AnonymousClass002.A1M(context.checkSelfPermission(str));
    }

    public final void cancelSync(Context context, String str) {
        AnonymousClass003.A0u(context, str);
        String strWorkNameFor = workNameFor(str);
        if (strWorkNameFor != null) {
            F3R.A02(context).A0A(strWorkNameFor);
        }
    }

    public final boolean isProactiveSyncEnabled(Context context, String str) {
        AbstractC3358CGz currentSessionForWorkManagerWorker;
        boolean zA1Y = C60P.A1Y(context, str);
        String strDataSourceFor = dataSourceFor(str);
        return (strDataSourceFor == null || (currentSessionForWorkManagerWorker = AuraUserSessionStore.INSTANCE.getCurrentSessionForWorkManagerWorker()) == null) ? zA1Y : HatchNodeClient.Companion.getInstance(currentSessionForWorkManagerWorker, context).dataSourceRegistry.isUserEnabled(strDataSourceFor);
    }
}
