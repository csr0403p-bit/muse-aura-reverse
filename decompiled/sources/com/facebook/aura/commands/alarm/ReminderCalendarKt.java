package com.facebook.aura.commands.alarm;

import X.C7384Etj;

/* loaded from: classes3.dex */
public abstract class ReminderCalendarKt {
    public static final String EVENT_MIME_TYPE = "vnd.android.cursor.item/event";
    public static final String TAG = "ReminderCalendar";

    public static final long nextOccurrence(ShadowReminder shadowReminder, long j) {
        C7384Etj.A0Y(shadowReminder, 0);
        long jComputeNextAfter$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm = shadowReminder.triggerTimeMs;
        if (jComputeNextAfter$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm < j) {
            Recurrence recurrenceEffectiveRecurrence = shadowReminder.effectiveRecurrence();
            if (recurrenceEffectiveRecurrence != null) {
                Integer num = recurrenceEffectiveRecurrence.count;
                if (num == null) {
                    return AlarmTimeUtil.INSTANCE.computeNextAfter$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(shadowReminder.hour, shadowReminder.minute, recurrenceEffectiveRecurrence, j - 1, shadowReminder.anchorMs, shadowReminder.zoneId());
                }
                int iIntValue = num.intValue();
                jComputeNextAfter$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm = shadowReminder.triggerTimeMs;
                int i = 1;
                while (jComputeNextAfter$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm < j) {
                    if (i < iIntValue) {
                        jComputeNextAfter$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm = AlarmTimeUtil.INSTANCE.computeNextAfter$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm(shadowReminder.hour, shadowReminder.minute, recurrenceEffectiveRecurrence, jComputeNextAfter$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm, shadowReminder.anchorMs, shadowReminder.zoneId());
                        if (jComputeNextAfter$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm == -1) {
                            break;
                        }
                        i++;
                    }
                }
            }
            return -1L;
        }
        return jComputeNextAfter$fbandroid_express_aura_java_com_facebook_aura_commands_alarm_alarm;
    }
}
