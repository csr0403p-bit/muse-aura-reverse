package com.facebook.aura.commands.alarm;

import X.AGH;
import X.AnonymousClass006;
import X.C0881AGi;
import X.C60O;
import X.C9jH;
import com.facebook.aura.nodes.core.NodeArgType;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import java.util.Map;

/* loaded from: classes3.dex */
public final class AlarmCommandSpecs {
    public static final NodeCommandSpec ALARM_DISMISS;
    public static final NodeCommandSpec ALARM_DISMISS_ALL;
    public static final NodeCommandSpec ALARM_LIST;
    public static final NodeCommandSpec ALARM_SET;
    public static final NodeCommandSpec ALARM_UPDATE;
    public static final AlarmCommandSpecs INSTANCE = new AlarmCommandSpecs();
    public static final NodeCommandSpec REMINDER_DISMISS;
    public static final NodeCommandSpec REMINDER_DISMISS_ALL;
    public static final NodeCommandSpec REMINDER_LIST;
    public static final NodeCommandSpec REMINDER_SET;
    public static final NodeCommandSpec REMINDER_SNOOZE;
    public static final NodeCommandSpec REMINDER_UPDATE;

    static {
        NodeArgType nodeArgType = NodeArgType.STRING;
        Map mapA10 = AnonymousClass006.A10(AlarmHandlersKt.PARAM_ALARMS_JSON, C60O.A09(nodeArgType, "JSON array string of alarm objects. Always use an array, even for one alarm: [{\"hour\":7,\"minutes\":0,\"message\":\"Wake up\"}]. `days` is a comma-separated recurring weekday mask using Calendar day constants 1=Sunday through 7=Saturday and must not be combined with `date`."));
        C9jH c9jHA0E = AGH.A0E();
        C0881AGi c0881AGi = C0881AGi.A00;
        ALARM_SET = new NodeCommandSpec("Set a new alarm on the user's device. The alarm appears in the device clock app and rings there; on a device with no clock app it falls back to an in-app alarm that rings with the device alarm tone. Use this for anything the user calls an alarm or a wake-up, including relative ones: 'Set an alarm for 7am', 'Wake me up at 6:30', 'Set an alarm for 10 minutes from now', 'Wake me in 20 minutes', or 'Set a recurring alarm for weekdays at 8am'. Prefer this over reminder.set whenever the user says 'alarm' or 'wake me', even when the time is only minutes away. An alarm has no relative-offset field: for 'in N minutes/hours', add N to the current device time and pass the resulting absolute `hour` and `minutes`. For repeats beyond a weekday mask, pass `frequency` ('DAILY', 'WEEKLY', 'MONTHLY', 'YEARLY') with an optional `interval`, and bound it with `count` or `until`; such alarms are driven in-app since the system clock app only supports a weekday mask. Always pass `alarms_json`, a JSON array string of alarm objects, even for one alarm. Each object must include `hour` and `minutes`; optional per-alarm fields are `message`, `days`, `vibrate`, `frequency`, `interval`, `count`, `until`, and `timezone` (an IANA id; defaults to the device time zone).", mapA10, c9jHA0E, c0881AGi, null, "Confirmation that the alarm is set on the device; it is already active and needs no further steps.", 30000L);
        ALARM_DISMISS = new NodeCommandSpec("Dismiss an upcoming alarm. Target by alarm_id (from alarm.list, or from alarm.set only when the alarm was scheduled in-app) or by label. In-app alarms (set on devices with no clock app) are dismissed directly; alarms in the device's clock app are dismissed via that app. Use this for requests like 'Dismiss my alarm', 'Cancel the 7am alarm', 'Turn off the alarm'. Always pass `targets_json`, a JSON array string of target objects, even for one alarm. Each object must include `alarm_id` or `message`.", AnonymousClass006.A10("targets_json", C60O.A09(nodeArgType, "JSON array string of alarm dismiss target objects. Always use an array, even for one alarm: [{\"alarm_id\":\"...\"}] or [{\"message\":\"Wake up\"}]. Prefer alarm_id over message.")), c9jHA0E, c0881AGi, null, "Result of dismissing the alarm.", 0L);
        REMINDER_SET = new NodeCommandSpec("Set a new reminder on the user's device. The reminder is saved as an event in the user's calendar, whose alert notifies at the chosen time. When the phone can't do that (no calendar app, calendar access off, or no calendar account), it sets nothing and returns an error; then offer to set the reminder yourself as a chat reminder. Reminders are distinct from alarms, which ring through the system clock app. If the user says 'alarm' or 'wake me', use alarm.set instead, even when the time is relative like 'in 10 minutes'. Use this for requests like 'Remind me to stretch in 2 hours', 'Remind me to take my medicine at 3pm', 'Remind me every weekday at 9am to stand up', or 'Remind me to call mom on May 15 at 9am' (supply date='2026-05-15' for future-dated reminders more than 24 hours away). For richer repeats, pass `frequency` ('DAILY', 'WEEKLY', 'MONTHLY', 'YEARLY') with an optional `interval` (e.g. frequency='DAILY', interval=3 for every 3 days). Bound a repeating reminder with `count` (total number of times) or `until` (ISO-8601 end date); for MONTHLY/YEARLY pass `date` as the start so the day-of-month is anchored. Always pass `reminders_json`, a JSON array string of reminder objects, even for one reminder. Each object must include `hour` and `minutes`; optional per-reminder fields are `message`, `days`, `date`, `frequency`, `interval`, `count`, `until`, and `timezone` (an IANA id like 'America/Los_Angeles'; defaults to the device time zone).", AnonymousClass006.A10("reminders_json", C60O.A09(nodeArgType, "JSON array string of reminder objects. Always use an array, even for one reminder: [{\"hour\":15,\"minutes\":0,\"message\":\"Stretch\"}]. `date` is required inside an object whenever the user mentions a specific day, day-of-week, or relative day offset; omit it only for requests within the next 24 hours with no date reference. `days` is a comma-separated recurring weekday mask using Calendar day constants 1=Sunday through 7=Saturday and must not be combined with `date`.")), c9jHA0E, c0881AGi, null, "Confirmation that the reminder is set on the device; it will notify at the chosen time and needs no further steps.", 0L);
        REMINDER_DISMISS = new NodeCommandSpec("Dismiss an upcoming reminder. Target by alarm_id (from reminder.list) or by label. Use this for requests like 'Dismiss my reminder', 'Cancel the stretch reminder', 'Turn off the reminder'. Always pass `targets_json`, a JSON array string of target objects, even for one reminder. Each object must include `alarm_id` or `message`.", AnonymousClass006.A10("targets_json", C60O.A09(nodeArgType, "JSON array string of reminder dismiss target objects. Always use an array, even for one reminder: [{\"alarm_id\":\"...\"}] or [{\"message\":\"Stretch\"}]. Prefer alarm_id over message.")), c9jHA0E, c0881AGi, null, "Confirmation that the reminder was dismissed.", 0L);
        ALARM_LIST = new NodeCommandSpec("List the ALARMS set with alarm.set, from the app's own record of them. This is not the phone's full alarm list: Android doesn't let apps read the Clock app's alarms, so changes made directly in Clock are not reflected. An alarm the user created in Clock won't appear, and one they edited or deleted there may still be listed as it was. Use this before dismissing alarms by id, to confirm an alarm you set was saved correctly (including its trigger date/time), or when the user asks 'what alarms do I have?'. Returns { alarms: [...] } where each entry contains: id, label, hour, minute, trigger_time_ms (absolute epoch), trigger_time_iso (human-readable ISO-8601 in device local time), days, days_weekdays, vibrate, type ('ALARM'). For reminders use reminder.list.", null, null, null, null, "Alarms set with alarm.set, from the app's own record. This is not what the Clock app currently holds: alarms created in Clock are missing, and ones edited or deleted there may be out of date. When you answer, say the list covers alarms set through you; an empty list means none of those, not that the phone has no alarms. Show the time from `trigger_time_iso`, which is already in the device's local time. For a recurring alarm, name the days from `days_weekdays` (a list of full weekday names). `days` is a raw CSV of Java Calendar constants where 1=Sunday through 7=Saturday \u2014 NOT the ISO numbering where 1=Monday \u2014 so never read it directly or you will report the alarm one day late.", 0L, 94, null);
        REMINDER_LIST = new NodeCommandSpec("List all currently-scheduled REMINDERS on the device. Use this before dismissing reminders by id, to confirm a previously-set reminder was persisted correctly, or when the user asks 'what reminders do I have?'. Returns { reminders: [...] } with the same fields as alarm.list except vibrate, and type='REMINDER'. For alarms use alarm.list.", null, null, null, null, "The user's currently scheduled reminders on the device. Show the time from `trigger_time_iso`, which is already in the device's local time. For a recurring reminder, name the days from `days_weekdays` (a list of full weekday names). `days` is a raw CSV of Java Calendar constants where 1=Sunday through 7=Saturday \u2014 NOT the ISO numbering where 1=Monday \u2014 so never read it directly or you will report the reminder one day late. `delivery` is 'calendar' for a reminder saved as a calendar event, or 'in_app' for an app notification Android can deliver late.", 0L, 94, null);
        ALARM_DISMISS_ALL = new NodeCommandSpec("Dismiss every scheduled ALARM on the device at once (reminders are NOT affected \u2014 use reminder.dismiss_all for those). Use this for requests like 'cancel all my alarms', 'clear my alarms', 'remove every alarm'. For a single specific alarm use alarm.dismiss instead. Returns dismissed_count when there is no clock app; when a clock app is present, a card is shown so the user can finish clearing alarms in it.", null, null, null, null, "Result of dismissing all alarms.", 0L, 94, null);
        REMINDER_DISMISS_ALL = new NodeCommandSpec("Dismiss every scheduled REMINDER on the device at once (alarms are NOT affected \u2014 use alarm.dismiss_all for those). Use this for requests like 'clear all my reminders', 'remove every reminder', 'cancel all my reminders'. For a single specific reminder use reminder.dismiss instead. Returns removed_count and removed_ids.", null, null, null, null, "Confirmation of how many reminders were cleared, with their ids.", 0L, 94, null);
        REMINDER_UPDATE = new NodeCommandSpec("Change an existing reminder. Use this for requests like 'Move my medicine reminder to 4pm', 'Rename my stretch reminder', 'Make my standup reminder repeat every weekday'. Get the reminder's `alarm_id` from reminder.list first. Only the fields you pass change; omit the rest to keep them. To change how it repeats, pass any of `days`, `date`, `frequency`, `interval`, `count`, `until` (the same meanings as reminder.set). Always pass `updates_json`, a JSON array string of update objects, even for one reminder. Each object must include `alarm_id`; optional fields are `hour`, `minutes`, `message`, `days`, `date`, `frequency`, `interval`, `count`, and `until`.", AnonymousClass006.A10("updates_json", C60O.A09(nodeArgType, "JSON array string of update objects. Always use an array, even for one reminder: [{\"alarm_id\":\"...\",\"hour\":16,\"minutes\":0}].")), c9jHA0E, c0881AGi, null, "Confirmation that the reminder was updated.", 0L);
        REMINDER_SNOOZE = new NodeCommandSpec("Snooze a reminder so it fires again shortly. Use this for requests like 'Snooze my reminder', 'Remind me again in 15 minutes'. Get the `alarm_id` from reminder.list. Always pass `targets_json`, a JSON array string of target objects, even for one reminder. Each object must include `alarm_id`; optional `snooze_minutes` sets the delay (defaults to 10 minutes).", AnonymousClass006.A10("targets_json", C60O.A09(nodeArgType, "JSON array string of snooze target objects. Always use an array, even for one reminder: [{\"alarm_id\":\"...\",\"snooze_minutes\":15}].")), c9jHA0E, c0881AGi, null, "Confirmation that the reminder was snoozed.", 0L);
        ALARM_UPDATE = new NodeCommandSpec("Change an existing alarm. Use this for requests like 'Move my 7am alarm to 6:30', 'Turn off vibration on my wake-up alarm'. Get the `alarm_id` from alarm.list first. Only works for alarms this app scheduled in-app; alarms in the system Clock app must be changed there. Only the fields you pass change. To change how it repeats, pass any of `days`, `date`, `frequency`, `interval`, `count`, `until`. Always pass `updates_json`, a JSON array string of update objects, even for one alarm. Each object must include `alarm_id`; optional fields are `hour`, `minutes`, `message`, `vibrate`, `days`, `date`, `frequency`, `interval`, `count`, and `until`.", AnonymousClass006.A10("updates_json", C60O.A09(nodeArgType, "JSON array string of update objects. Always use an array, even for one alarm: [{\"alarm_id\":\"...\",\"hour\":6,\"minutes\":30}].")), c9jHA0E, c0881AGi, null, "Confirmation that the alarm was updated.", 0L);
    }

    public final NodeCommandSpec getALARM_DISMISS() {
        return ALARM_DISMISS;
    }

    public final NodeCommandSpec getALARM_DISMISS_ALL() {
        return ALARM_DISMISS_ALL;
    }

    public final NodeCommandSpec getALARM_LIST() {
        return ALARM_LIST;
    }

    public final NodeCommandSpec getALARM_SET() {
        return ALARM_SET;
    }

    public final NodeCommandSpec getALARM_UPDATE() {
        return ALARM_UPDATE;
    }

    public final NodeCommandSpec getREMINDER_DISMISS() {
        return REMINDER_DISMISS;
    }

    public final NodeCommandSpec getREMINDER_DISMISS_ALL() {
        return REMINDER_DISMISS_ALL;
    }

    public final NodeCommandSpec getREMINDER_LIST() {
        return REMINDER_LIST;
    }

    public final NodeCommandSpec getREMINDER_SET() {
        return REMINDER_SET;
    }

    public final NodeCommandSpec getREMINDER_SNOOZE() {
        return REMINDER_SNOOZE;
    }

    public final NodeCommandSpec getREMINDER_UPDATE() {
        return REMINDER_UPDATE;
    }
}
