package com.facebook.aura.commands.calendar;

import X.AGH;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C3cG;
import X.C60O;
import X.C9jH;
import com.facebook.aura.nodes.core.NodeArgType;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class CalendarCommandSpecs {
    public static final NodeCommandSpec CALENDAR_EVENTS_CREATE;
    public static final NodeCommandSpec CALENDAR_EVENTS_DELETE;
    public static final NodeCommandSpec CALENDAR_EVENTS_UPDATE;
    public static final NodeCommandSpec CALENDAR_REMINDERS_LIST;
    public static final NodeCommandSpec CALENDAR_REMINDERS_REMOVE;
    public static final NodeCommandSpec CALENDAR_REMINDERS_SET;
    public static final NodeCommandSpec CALENDAR_SEARCH;
    public static final CalendarCommandSpecs INSTANCE = new CalendarCommandSpecs();

    static {
        NodeArgType nodeArgType = NodeArgType.STRING;
        CALENDAR_SEARCH = new NodeCommandSpec("Search or browse the device's calendars and return matching events. `start_date` is required. Pass `query` to find events by keyword \u2014 it does a typo-tolerant, accent-insensitive match across the event title, description, location, organizer, and attendees, and ranks the best matches first. Use it for requests like 'When is my dentist appointment?', 'Find my 1:1 with Sarah', 'Look for the budget review'. Omit `query` to simply list everything in a date range, for requests like 'What's on my calendar next week?' or 'Do I have anything Friday afternoon?'. `start_date` and `end_date` (ISO-8601) bound the window; when `end_date` is omitted, a keyword search spans two years from the start, and a plain browse defaults to one month from the start. Returns events with their id, title, start/end time, location, calendar, and recurrence info.", AnonymousClass006.A10("start_date", C60O.A09(nodeArgType, "Inclusive start of the window, ISO-8601, e.g. '2025-01-15T00:00:00Z'. Required.")), AnonymousClass007.A0d("end_date", C60O.A09(nodeArgType, "Inclusive end of the window, ISO-8601. Optional. The window must be at most two years."), C3cG.A0r("query", C60O.A09(nodeArgType, "Free-text keywords to match against event title, description, location, organizer, and attendees. Typo-tolerant. Omit to list all events in the window."))), Collections.singletonList("calendar"), null, "Search results from the user's calendar. `start_date`/`end_date` are UTC and for internal use only \u2014 NEVER show them to the user and never use them to compute the day, date, or weekday. Display the date/time from the local fields instead: for a timed event (`is_all_day`=false) use `start_local`/`end_local` (the event's local wall-clock time); for an all-day event (`is_all_day`=true) use `start_local_date` (first day) through `end_local_date` (last day, INCLUSIVE) \u2014 note the UTC `end_date` is exclusive (midnight after the last day) and must not be shown. If `start_local_date` equals `end_local_date` it is a single all-day day. Always show the weekday using the provided `start_weekday`/`end_weekday` verbatim; never derive the weekday yourself.", 0L);
        Map mapA10 = AnonymousClass006.A10(CalendarEventsCreateHandlerKt.PARAM_EVENTS_JSON, C60O.A09(nodeArgType, "JSON array string of event objects. Always use an array, even for one event: [{\"title\":\"Team standup\",\"start_time\":\"2025-01-15T15:00:00Z\"}]."));
        List listSingletonList = Collections.singletonList("calendar");
        C9jH c9jHA0E = AGH.A0E();
        CALENDAR_EVENTS_CREATE = new NodeCommandSpec("Create a new calendar event. `calendar_id` is optional. Only pass it when a matching calendar ID is available in the current `calendars` array published by the `calendar` data source. Do not guess calendar IDs and do not reuse stale IDs from memory; omit `calendar_id` when unsure, when no calendar preference was requested, or when the current data-source payload does not contain a matching calendar. When `calendar_id` is omitted or stale, Android creates the event in the best visible, syncing writable calendar available. Picking a calendar: (1) if the user names a provider in the canonical list ('Google', 'Outlook', 'Samsung', 'Yahoo', 'Exchange', 'iCloud', 'Fastmail', 'Proton'), filter the `calendars` array by the matching `provider` field. Within those filtered results, prefer calendars with `is_owner_account=true` AND `is_primary=true` (the user's own primary calendar) over shared/group calendars like Google 'Family' or subscribed calendars \u2014 only pick a non-owner calendar if the user explicitly names it (e.g. 'Family calendar', 'work shared calendar'). Do NOT fall back on is_primary across providers in this case. (2) if the user names a provider not in the canonical list, do a case-insensitive substring match of the spoken name against `account_type`, `account_name`, and `display_name` and pick from any matches; (3) if the user names an account by email, match on account_name; (4) only if the user gives no signal, pick the calendar with `is_owner_account=true` AND `is_primary=true`, preferring Google > Outlook > Exchange > iCloud > Yahoo > Samsung. On Samsung devices is_primary often points at a Samsung system calendar the user does not actively use, and a Google account auto-creates a 'Family' group calendar \u2014 neither should be the default pick when ambiguous. Use this for requests like 'Schedule a meeting at 3pm', 'Add lunch with Sarah to my calendar', 'Block off tomorrow morning'. To create a repeating event (e.g. 'every night at 10pm', 'every weekday standup'), pass an iCalendar `rrule` such as 'FREQ=DAILY' or 'FREQ=WEEKLY;BYDAY=MO,TU,WE,TH,FR'; a recurring event sets its length with `duration` (ISO-8601, e.g. 'PT1H', default 1 hour) and must NOT also pass `end_time`. Always pass `events_json`, a JSON array string of event objects, even for one event. Each object must include `title` and `start_time`; optional per-event fields are `calendar_id`, `end_time`, `description`, `location`, `all_day`, `timezone`, `reminder_minutes`, `rrule`, and `duration`.", mapA10, c9jHA0E, listSingletonList, null, "Confirmation that the calendar event was created.", 0L);
        CALENDAR_EVENTS_UPDATE = new NodeCommandSpec("Update an existing calendar event. Only the fields you provide will be changed; omitted fields stay the same. Use this for requests like 'Move my 3pm meeting to 4pm', 'Change the location of my lunch meeting', 'Rename my afternoon event', 'Make my standup repeat every weekday', 'Remind me 15 minutes before'. Get the event_id from the `events` array of the `calendar` data source first. Pass `rrule` (with optional `duration`, ISO-8601, default 'PT1H') to make an event repeat \u2014 do not also pass `end_time` in that case. Pass `reminder_minutes` to set the alert lead time (replaces existing reminders), `timezone` to change the event time zone, or `calendar_id` to move the event to another calendar. For a recurring event, passing an occurrence's composite id ('<id>#<occurrence ISO date>') edits just that occurrence (only `title`, `start_time`, `end_time`, `description`, `location`, `all_day` apply); pass the bare numeric id or `scope`='all_events' to change the whole series. Always pass `updates_json`, a JSON array string of update objects, even for one event. Each object must include `event_id` and may include `scope` ('this_event' or 'all_events'); optional per-event fields are `title`, `start_time`, `end_time`, `description`, `location`, `all_day`, `rrule`, `duration`, `reminder_minutes`, `timezone`, and `calendar_id`.", AnonymousClass006.A10("updates_json", C60O.A09(nodeArgType, "JSON array string of update objects. Always use an array, even for one event: [{\"event_id\":123,\"start_time\":\"2025-01-15T16:00:00Z\"}].")), c9jHA0E, Collections.singletonList("calendar"), null, "Confirmation that the calendar event was updated.", 0L);
        CALENDAR_EVENTS_DELETE = new NodeCommandSpec("Delete a calendar event. Use this for requests like 'Cancel my 4pm call', 'Remove the meeting tomorrow', 'Delete my dentist appointment'. Get the event_id from the `events` array of the `calendar` data source first. For a recurring event, the data source gives each occurrence a composite id of the form '<id>#<occurrence ISO date>'; passing that id deletes just that one occurrence, while passing the bare numeric id (or `scope`= 'all_events') deletes the whole series. Always pass `targets_json`, a JSON array string of target objects, even for one event. Each object must include `event_id` and may include `scope` ('this_event' or 'all_events'). Always confirm with the user before deleting.", AnonymousClass006.A10("targets_json", C60O.A09(nodeArgType, "JSON array string of target objects. Always use an array, even for one event: [{\"event_id\":123}].")), c9jHA0E, Collections.singletonList("calendar"), null, "Confirmation that the calendar event was deleted.", 0L);
        CALENDAR_REMINDERS_SET = new NodeCommandSpec("Set or update a reminder on a calendar event. By default this replaces any existing reminders on the event; pass `replace`=false to add an extra alert instead. Use this for requests like 'Remind me 30 minutes before my next meeting', 'Set an alert 1 hour before the dentist appointment', 'Also remind me a day before'. Get the event_id from the `events` array of the `calendar` data source first. Always pass `reminders_json`, a JSON array string of reminder objects, even for one reminder. Each object must include `event_id` and `minutes_before`; optional `replace` (default true).", AnonymousClass006.A10("reminders_json", C60O.A09(nodeArgType, "JSON array string of reminder objects. Always use an array, even for one reminder: [{\"event_id\":123,\"minutes_before\":30}].")), c9jHA0E, Collections.singletonList("calendar"), null, "Confirmation that the reminder was set on the calendar event.", 0L);
        CALENDAR_REMINDERS_LIST = new NodeCommandSpec("List the reminders (alerts) currently set on one or more calendar events. Use this for 'What reminders are on my dentist appointment?' or before adding/removing an alert. Get the event_id from the `events` array of the `calendar` data source first. Always pass `targets_json`, a JSON array string of target objects, even for one event. Each object must include `event_id`. Returns each event's reminders with their `minutes_before`.", AnonymousClass006.A10("targets_json", C60O.A09(nodeArgType, "JSON array string of target objects. Always use an array, even for one event: [{\"event_id\":123}].")), c9jHA0E, Collections.singletonList("calendar"), null, "The reminders set on the requested calendar events.", 0L);
        CALENDAR_REMINDERS_REMOVE = new NodeCommandSpec("Remove reminders (alerts) from a calendar event. Use this for 'Remove the alert on my meeting' or 'Turn off the 1-day reminder for my trip'. Get the event_id from the `events` array of the `calendar` data source first. Omit `minutes_before` to remove all reminders on the event, or pass it to remove only the matching alert. Always pass `targets_json`, a JSON array string of target objects, even for one event. Each object must include `event_id`; optional `minutes_before`.", AnonymousClass006.A10("targets_json", C60O.A09(nodeArgType, "JSON array string of target objects. Always use an array, even for one event: [{\"event_id\":123,\"minutes_before\":30}].")), c9jHA0E, Collections.singletonList("calendar"), null, "Confirmation of how many reminders were removed.", 0L);
    }

    public final NodeCommandSpec getCALENDAR_EVENTS_CREATE() {
        return CALENDAR_EVENTS_CREATE;
    }

    public final NodeCommandSpec getCALENDAR_EVENTS_DELETE() {
        return CALENDAR_EVENTS_DELETE;
    }

    public final NodeCommandSpec getCALENDAR_EVENTS_UPDATE() {
        return CALENDAR_EVENTS_UPDATE;
    }

    public final NodeCommandSpec getCALENDAR_REMINDERS_LIST() {
        return CALENDAR_REMINDERS_LIST;
    }

    public final NodeCommandSpec getCALENDAR_REMINDERS_REMOVE() {
        return CALENDAR_REMINDERS_REMOVE;
    }

    public final NodeCommandSpec getCALENDAR_REMINDERS_SET() {
        return CALENDAR_REMINDERS_SET;
    }

    public final NodeCommandSpec getCALENDAR_SEARCH() {
        return CALENDAR_SEARCH;
    }
}
