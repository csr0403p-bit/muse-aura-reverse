package com.facebook.aura.commands.calendar;

import X.C60Q;
import X.C9oY;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class CalendarRemindersListHandlerKt {
    public static final String PARAM_TARGETS = "targets";
    public static final String PARAM_TARGETS_JSON = "targets_json";
    public static final String TAG = "CalendarRemindersListHandler";

    public static final long parseListTarget(int i, JsonObject jsonObject) {
        JsonPrimitive jsonPrimitive;
        Long lA03;
        String strA0k = C60Q.A0k("targets_json[", i);
        Object obj = jsonObject.get("event_id");
        if ((obj instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj) != null && (lA03 = C9oY.A03(jsonPrimitive)) != null) {
            long jLongValue = lA03.longValue();
            if (jLongValue >= 0) {
                return jLongValue;
            }
        }
        throw C60Q.A0U(strA0k, ".event_id is required and must be a positive integer");
    }
}
