package com.facebook.aura.commands.geofence;

import X.AnonymousClass005;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C7BY;
import X.CFK;
import X.EG6;
import X.FGI;
import android.R;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.notifications.suppression.HatchNotificationSuppression;
import com.facebook.aura.utils.HatchStringUtils;

/* loaded from: classes3.dex */
public final class HatchGeofenceNotifier {
    public static final HatchGeofenceNotifier INSTANCE = new HatchGeofenceNotifier();
    public static final int NOTIFICATION_ID_BASE = 9600;

    public final void showReminder(Context context, NodeGeofence nodeGeofence, String str) {
        boolean zA1Z = AnonymousClass005.A1Z(context, nodeGeofence, str);
        ensureChannel(context);
        int iHashCode = (nodeGeofence.id.hashCode() & Integer.MAX_VALUE) + NOTIFICATION_ID_BASE;
        Intent intentA08 = C60R.A08(context);
        PendingIntent activity = intentA08 != null ? PendingIntent.getActivity(context, iHashCode, intentA08, 201326592) : null;
        String str2 = nodeGeofence.notificationLabel;
        if (str2 == null || C7BY.A0j(str2)) {
            str2 = nodeGeofence.label;
        }
        String strSanitizeForNotification = HatchStringUtils.INSTANCE.sanitizeForNotification(str2);
        if (!C7BY.A0j(strSanitizeForNotification)) {
            str2 = strSanitizeForNotification;
        }
        EG6 eg6 = new EG6(context, HatchGeofenceNotifierKt.CHANNEL_ID);
        eg6.A03(R.drawable.ic_menu_mylocation);
        eg6.A08(str2);
        eg6.A0I = HatchNodeCardJsonKt.TYPE_REMINDER;
        eg6.A04 = zA1Z ? 1 : 0;
        eg6.A02();
        eg6.A0T = HatchNotificationSuppression.voiceCallActive;
        if (activity != null) {
            eg6.A09 = activity;
        }
        try {
            C60R.A07(context).notify(iHashCode, C60Q.A07(eg6));
            CFK.A05(HatchGeofenceNotifierKt.TAG, FGI.A0d("Geofence reminder posted: id=", nodeGeofence.id, " trigger=", str));
        } catch (Exception e) {
            C60O.A1P("Failed to post reminder notification: ", e.getMessage(), HatchGeofenceNotifierKt.TAG);
        }
    }

    private final void ensureChannel(Context context) {
        NotificationManager notificationManagerA07 = C60R.A07(context);
        if (notificationManagerA07.getNotificationChannel(HatchGeofenceNotifierKt.CHANNEL_ID) == null) {
            C60Q.A15(notificationManagerA07, HatchGeofenceNotifierKt.CHANNEL_NAME, HatchGeofenceNotifierKt.CHANNEL_ID, 4);
        }
    }
}
