package com.facebook.aura.commands.alarm;

import X.AnonymousClass003;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import X.EG6;
import android.R;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.notifications.suppression.HatchNotificationSuppression;
import com.facebook.aura.utils.HatchStringUtils;

/* loaded from: classes3.dex */
public final class HatchReminderNotifier {
    public static final HatchReminderNotifier INSTANCE = new HatchReminderNotifier();

    public final void show$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(Context context, ShadowReminder shadowReminder) {
        C7384Etj.A0Y(context, 0);
        C7384Etj.A0Y(shadowReminder, 1);
        ensureChannel(context);
        int iNotificationIdFor$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm = notificationIdFor$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(shadowReminder.id);
        Intent intentA08 = C60R.A08(context);
        PendingIntent activity = intentA08 != null ? PendingIntent.getActivity(context, iNotificationIdFor$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm, intentA08, 201326592) : null;
        Intent intent = new Intent(context, (Class<?>) ReminderAlarmReceiver.class);
        intent.setAction(ReminderAlarmReceiver.ACTION_REMINDER_SNOOZE);
        intent.putExtra(ReminderAlarmReceiver.EXTRA_REMINDER_ID, shadowReminder.id);
        intent.putExtra(ReminderAlarmReceiver.EXTRA_REMINDER_LABEL, shadowReminder.label);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, iNotificationIdFor$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm, intent, 201326592);
        EG6 eg6 = new EG6(context, HatchReminderNotifierKt.CHANNEL_ID);
        eg6.A03(R.drawable.ic_popup_reminder);
        String strSanitizeForNotification = HatchStringUtils.INSTANCE.sanitizeForNotification(shadowReminder.label);
        if (C7BY.A0j(strSanitizeForNotification)) {
            strSanitizeForNotification = shadowReminder.label;
        }
        eg6.A08(strSanitizeForNotification);
        eg6.A0I = HatchNodeCardJsonKt.TYPE_REMINDER;
        eg6.A04 = 1;
        eg6.A02();
        eg6.A0T = HatchNotificationSuppression.voiceCallActive;
        eg6.A04(broadcast, context.getString(com.facebook.aura.R.string._name_removed__res_0x7f120baa), 0);
        if (activity != null) {
            eg6.A09 = activity;
        }
        try {
            C60R.A07(context).notify(iNotificationIdFor$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm, C60Q.A07(eg6));
            C60Q.A1I("Reminder notification posted: id=", shadowReminder.id, HatchReminderNotifierKt.TAG);
        } catch (Exception e) {
            C60O.A1P("Failed to post reminder notification: ", e.getMessage(), HatchReminderNotifierKt.TAG);
        }
    }

    private final void ensureChannel(Context context) {
        NotificationManager notificationManagerA07 = C60R.A07(context);
        if (notificationManagerA07.getNotificationChannel(HatchReminderNotifierKt.CHANNEL_ID) == null) {
            C60Q.A15(notificationManagerA07, HatchReminderNotifierKt.CHANNEL_NAME, HatchReminderNotifierKt.CHANNEL_ID, 4);
        }
    }

    public final void cancel$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(Context context, String str) {
        NotificationManager notificationManager;
        AnonymousClass003.A0u(context, str);
        Object systemService = context.getSystemService("notification");
        if (!(systemService instanceof NotificationManager) || (notificationManager = (NotificationManager) systemService) == null) {
            return;
        }
        notificationManager.cancel(notificationIdFor$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(str));
    }

    public final int notificationIdFor$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(String str) {
        return (C60R.A03(str) & 65535) + HatchReminderNotifierKt.NOTIFICATION_ID_BASE;
    }
}
