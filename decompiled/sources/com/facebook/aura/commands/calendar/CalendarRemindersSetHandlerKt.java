package com.facebook.aura.commands.calendar;

import X.C60Q;
import X.C9oY;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class CalendarRemindersSetHandlerKt {
    public static final String PARAM_REMINDERS = "reminders";
    public static final String PARAM_REMINDERS_JSON = "reminders_json";
    public static final String TAG = "CalendarRemindersSetHandler";

    public static final CalendarReminderSetRequest parseReminderSetRequest(int i, JsonObject jsonObject) {
        JsonPrimitive jsonPrimitive;
        Long lA03;
        JsonPrimitive jsonPrimitive2;
        Integer numA02;
        int iIntValue;
        boolean zBooleanValue;
        JsonPrimitive jsonPrimitive3;
        Boolean boolA01;
        String strA0k = C60Q.A0k("reminders_json[", i);
        if (!jsonObject.containsKey("event_id")) {
            throw C60Q.A0U(strA0k, ".event_id is required. Get it from the `events` array of the `calendar` data source.");
        }
        Object obj = jsonObject.get("event_id");
        if ((obj instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj) != null && (lA03 = C9oY.A03(jsonPrimitive)) != null) {
            long jLongValue = lA03.longValue();
            if (jLongValue >= 0) {
                if (!jsonObject.containsKey("minutes_before")) {
                    throw C60Q.A0U(strA0k, ".minutes_before is required (e.g. 15, 30, 60)");
                }
                Object obj2 = jsonObject.get("minutes_before");
                if (!(obj2 instanceof JsonPrimitive) || (jsonPrimitive2 = (JsonPrimitive) obj2) == null || (numA02 = C9oY.A02(jsonPrimitive2)) == null || (iIntValue = numA02.intValue()) < 0) {
                    throw C60Q.A0U(strA0k, ".minutes_before must be a non-negative integer");
                }
                if (jsonObject.containsKey("replace")) {
                    Object obj3 = jsonObject.get("replace");
                    if (!(obj3 instanceof JsonPrimitive) || (jsonPrimitive3 = (JsonPrimitive) obj3) == null || (boolA01 = C9oY.A01(jsonPrimitive3)) == null) {
                        throw C60Q.A0U(strA0k, ".replace must be a boolean");
                    }
                    zBooleanValue = boolA01.booleanValue();
                } else {
                    zBooleanValue = true;
                }
                return new CalendarReminderSetRequest(jLongValue, iIntValue, zBooleanValue);
            }
        }
        throw C60Q.A0U(strA0k, ".event_id must be a positive integer");
    }
}
