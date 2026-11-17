package com.facebook.aura.commands.calendar;

import X.C60Q;
import X.C9oY;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class CalendarEventsDeleteHandlerKt {
    public static final String PARAM_TARGETS = "targets";
    public static final String PARAM_TARGETS_JSON = "targets_json";
    public static final String TAG = "CalendarEventsDeleteHandler";

    public static final CalendarDeleteRequest parseDeleteTarget(int i, JsonObject jsonObject) {
        String strA04;
        JsonPrimitive jsonPrimitive;
        JsonPrimitive jsonPrimitive2;
        String strA0k = C60Q.A0k("targets_json[", i);
        if (!jsonObject.containsKey("event_id")) {
            throw C60Q.A0U(strA0k, ".event_id is required. Get it from the `events` array of the `calendar` data source.");
        }
        Object obj = jsonObject.get("event_id");
        String strA042 = null;
        if (!(obj instanceof JsonPrimitive) || (jsonPrimitive2 = (JsonPrimitive) obj) == null || (strA04 = C9oY.A04(jsonPrimitive2)) == null) {
            strA04 = "";
        }
        CalendarEventTarget calendarEventTarget = CalendarEventTargetKt.parseCalendarEventTarget(strA04);
        if (calendarEventTarget == null) {
            throw C60Q.A0U(strA0k, ".event_id is not a valid event id (expected a number or '<id>#<occurrence ISO date>')");
        }
        Object obj2 = jsonObject.get("scope");
        if ((obj2 instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj2) != null) {
            strA042 = C9oY.A04(jsonPrimitive);
        }
        return new CalendarDeleteRequest(calendarEventTarget, "all_events".equals(strA042));
    }
}
