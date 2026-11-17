package com.facebook.aura.commands.alarm;

import X.AnonymousClass003;
import X.AnonymousClass004;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.EG6;
import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.facebook.aura.utils.HatchStringUtils;

/* loaded from: classes3.dex */
public final class HatchAlarmNotifier {
    public static final HatchAlarmNotifier INSTANCE = new HatchAlarmNotifier();

    public final void show(Context context, String str, String str2) {
        boolean zA1b = AnonymousClass004.A1b(context, str);
        C7384Etj.A0Y(str2, 2);
        ensureChannel(context);
        int iNotificationId = notificationId(str);
        Intent intentA08 = C60R.A08(context);
        PendingIntent activity = intentA08 != null ? PendingIntent.getActivity(context, iNotificationId, intentA08, 201326592) : null;
        Intent intent = new Intent(context, (Class<?>) AlarmFireReceiver.class);
        intent.setAction(AlarmFireReceiver.ACTION_ALARM_DISMISS);
        intent.putExtra(AlarmFireReceiver.EXTRA_ALARM_ID, str);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, iNotificationId, intent, 201326592);
        EG6 eg6 = new EG6(context, HatchAlarmNotifierKt.CHANNEL_ID);
        eg6.A03(R.drawable.ic_lock_idle_alarm);
        eg6.A08(str2);
        eg6.A0I = "alarm";
        eg6.A04 = 2;
        eg6.A07.flags |= 2;
        eg6.A05 = zA1b ? 1 : 0;
        if (activity != null) {
            eg6.A09 = activity;
        }
        eg6.A04(broadcast, context.getString(com.facebook.aura.R.string._name_removed__res_0x7f120027), R.drawable.ic_menu_close_clear_cancel);
        try {
            C60R.A07(context).notify(iNotificationId, C60Q.A07(eg6));
            C60Q.A1I("Alarm notification posted: id=", str, HatchAlarmNotifierKt.TAG);
        } catch (Exception e) {
            C60O.A1P("Failed to post alarm notification: ", e.getMessage(), HatchAlarmNotifierKt.TAG);
        }
    }

    private final void ensureChannel(Context context) {
        NotificationManager notificationManagerA07 = C60R.A07(context);
        if (notificationManagerA07.getNotificationChannel(HatchAlarmNotifierKt.CHANNEL_ID) == null) {
            NotificationChannel notificationChannel = new NotificationChannel(HatchAlarmNotifierKt.CHANNEL_ID, context.getString(com.facebook.aura.R.string._name_removed__res_0x7f120ab5), 4);
            notificationChannel.setSound(null, null);
            notificationManagerA07.createNotificationChannel(notificationChannel);
        }
    }

    private final int notificationId(String str) {
        return (str.hashCode() & 65535) + HatchAlarmNotifierKt.NOTIFICATION_ID_BASE;
    }

    public final void cancel$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(Context context, String str) {
        NotificationManager notificationManager;
        AnonymousClass003.A0u(context, str);
        Object systemService = context.getSystemService("notification");
        if (!(systemService instanceof NotificationManager) || (notificationManager = (NotificationManager) systemService) == null) {
            return;
        }
        notificationManager.cancel(notificationId(str));
    }

    public final void show$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(Context context, ShadowAlarm shadowAlarm) {
        AnonymousClass003.A0u(context, shadowAlarm);
        String str = shadowAlarm.id;
        String strSanitizeForNotification = HatchStringUtils.INSTANCE.sanitizeForNotification(shadowAlarm.label);
        if (strSanitizeForNotification.length() == 0) {
            strSanitizeForNotification = context.getString(com.facebook.aura.R.string._name_removed__res_0x7f120ab6);
        }
        show(context, str, strSanitizeForNotification);
    }
}
