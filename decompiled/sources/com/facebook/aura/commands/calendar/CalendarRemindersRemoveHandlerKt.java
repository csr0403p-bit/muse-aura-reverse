package com.facebook.aura.commands.calendar;

import X.C60Q;
import X.C9oY;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class CalendarRemindersRemoveHandlerKt {
    public static final String PARAM_TARGETS = "targets";
    public static final String PARAM_TARGETS_JSON = "targets_json";
    public static final String TAG = "CalendarRemindersRemoveHandler";

    public static final CalendarReminderRemoveRequest parseRemoveTarget(int i, JsonObject jsonObject) {
        JsonPrimitive jsonPrimitive;
        Long lA03;
        JsonPrimitive jsonPrimitive2;
        String strA0k = C60Q.A0k("targets_json[", i);
        Object obj = jsonObject.get("event_id");
        Integer numA02 = null;
        if ((obj instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj) != null && (lA03 = C9oY.A03(jsonPrimitive)) != null) {
            long jLongValue = lA03.longValue();
            if (jLongValue >= 0) {
                if (jsonObject.containsKey("minutes_before")) {
                    Object obj2 = jsonObject.get("minutes_before");
                    if (!(obj2 instanceof JsonPrimitive) || (jsonPrimitive2 = (JsonPrimitive) obj2) == null || (numA02 = C9oY.A02(jsonPrimitive2)) == null) {
                        throw C60Q.A0U(strA0k, ".minutes_before must be an integer");
                    }
                }
                return new CalendarReminderRemoveRequest(jLongValue, numA02);
            }
        }
        throw C60Q.A0U(strA0k, ".event_id is required and must be a positive integer");
    }
}
