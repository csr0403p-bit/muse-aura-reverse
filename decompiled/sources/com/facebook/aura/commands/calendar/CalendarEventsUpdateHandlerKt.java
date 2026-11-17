package com.facebook.aura.commands.calendar;

import X.AbstractC0885AGm;
import X.AnonymousClass003;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C9oY;
import X.F60;
import X.FGI;
import com.facebook.aura.feed.repo.FeedRepositoryKt;
import com.facebook.aura.json.JsonObjectParamsKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class CalendarEventsUpdateHandlerKt {
    public static final String PARAM_UPDATES = "updates";
    public static final String PARAM_UPDATES_JSON = "updates_json";
    public static final String TAG = "CalendarEventsUpdateHandler";

    public static final CalendarEventUpdateRequest parseUpdateRequest(int i, JsonObject jsonObject) {
        String strA04;
        String strA042;
        String strA043;
        String strA044;
        Integer numA02;
        String strA045;
        String strA046;
        String strA047;
        Boolean boolValueOf;
        Long lA03;
        JsonPrimitive jsonPrimitive;
        JsonPrimitive jsonPrimitive2;
        Boolean boolA01;
        JsonPrimitive jsonPrimitive3;
        JsonPrimitive jsonPrimitive4;
        JsonPrimitive jsonPrimitive5;
        JsonPrimitive jsonPrimitive6;
        JsonPrimitive jsonPrimitive7;
        JsonPrimitive jsonPrimitive8;
        JsonPrimitive jsonPrimitive9;
        JsonPrimitive jsonPrimitive10;
        JsonPrimitive jsonPrimitive11;
        JsonPrimitive jsonPrimitive12;
        String strA0k = C60Q.A0k("updates_json[", i);
        if (!jsonObject.containsKey("event_id")) {
            throw C60Q.A0U(strA0k, ".event_id is required. Get it from the `events` array of the `calendar` data source.");
        }
        Object obj = jsonObject.get("event_id");
        String strA048 = (!(obj instanceof JsonPrimitive) || (jsonPrimitive12 = (JsonPrimitive) obj) == null) ? null : C9oY.A04(jsonPrimitive12);
        if (strA048 == null) {
            strA048 = "";
        }
        CalendarEventTarget calendarEventTarget = CalendarEventTargetKt.parseCalendarEventTarget(strA048);
        if (calendarEventTarget == null) {
            throw C60Q.A0U(strA0k, ".event_id is not a valid event id (expected a number or '<id>#<occurrence ISO date>')");
        }
        Object obj2 = jsonObject.get("scope");
        boolean zEquals = "all_events".equals((!(obj2 instanceof JsonPrimitive) || (jsonPrimitive11 = (JsonPrimitive) obj2) == null) ? null : C9oY.A04(jsonPrimitive11));
        Object obj3 = jsonObject.get("start_time");
        if (!(obj3 instanceof JsonPrimitive) || (jsonPrimitive10 = (JsonPrimitive) obj3) == null || (strA04 = C9oY.A04(jsonPrimitive10)) == null) {
            strA04 = "";
        }
        if (strA04.length() == 0) {
            strA04 = null;
        }
        Object obj4 = jsonObject.get("end_time");
        if (!(obj4 instanceof JsonPrimitive) || (jsonPrimitive9 = (JsonPrimitive) obj4) == null || (strA042 = C9oY.A04(jsonPrimitive9)) == null) {
            strA042 = "";
        }
        if (strA042.length() == 0) {
            strA042 = null;
        }
        Object obj5 = jsonObject.get("rrule");
        if (!(obj5 instanceof JsonPrimitive) || (jsonPrimitive8 = (JsonPrimitive) obj5) == null || (strA043 = C9oY.A04(jsonPrimitive8)) == null) {
            strA043 = "";
        }
        if (strA043.length() == 0) {
            strA043 = null;
        }
        if (strA043 != null && strA042 != null) {
            throw C60Q.A0U(strA0k, " cannot combine 'rrule' with 'end_time'; a recurring event uses 'duration' (ISO-8601, e.g. 'PT1H') instead.");
        }
        Object obj6 = jsonObject.get("duration");
        if (!(obj6 instanceof JsonPrimitive) || (jsonPrimitive7 = (JsonPrimitive) obj6) == null || (strA044 = C9oY.A04(jsonPrimitive7)) == null) {
            strA044 = "";
        }
        if (strA044.length() == 0) {
            strA044 = null;
        }
        if (strA044 != null && strA043 == null) {
            throw C60Q.A0U(strA0k, ".duration only applies to a recurring event; pass 'rrule' alongside it.");
        }
        if (jsonObject.containsKey("reminder_minutes")) {
            Object obj7 = jsonObject.get("reminder_minutes");
            if (!(obj7 instanceof JsonPrimitive) || (jsonPrimitive6 = (JsonPrimitive) obj7) == null || (numA02 = C9oY.A02(jsonPrimitive6)) == null) {
                throw C60Q.A0U(strA0k, ".reminder_minutes must be an integer");
            }
        } else {
            numA02 = null;
        }
        Object obj8 = jsonObject.get("title");
        if (!(obj8 instanceof JsonPrimitive) || (jsonPrimitive5 = (JsonPrimitive) obj8) == null || (strA045 = C9oY.A04(jsonPrimitive5)) == null) {
            strA045 = "";
        }
        if (strA045.length() == 0) {
            strA045 = null;
        }
        Long lValueOf = strA04 != null ? Long.valueOf(parseUpdateInstantMillis(strA04, FGI.A0M(strA0k, ".start_time"))) : null;
        Long lValueOf2 = strA042 != null ? Long.valueOf(parseUpdateInstantMillis(strA042, FGI.A0M(strA0k, ".end_time"))) : null;
        Object obj9 = jsonObject.get(HatchWebPageParserKt.DESCRIPTION);
        if (!(obj9 instanceof JsonPrimitive) || (jsonPrimitive4 = (JsonPrimitive) obj9) == null || (strA046 = C9oY.A04(jsonPrimitive4)) == null) {
            strA046 = "";
        }
        if (strA046.length() == 0) {
            strA046 = null;
        }
        Object obj10 = jsonObject.get(MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL);
        if (!(obj10 instanceof JsonPrimitive) || (jsonPrimitive3 = (JsonPrimitive) obj10) == null || (strA047 = C9oY.A04(jsonPrimitive3)) == null) {
            strA047 = "";
        }
        if (strA047.length() == 0) {
            strA047 = null;
        }
        if (jsonObject.containsKey("all_day")) {
            Object obj11 = jsonObject.get("all_day");
            boolValueOf = Boolean.valueOf((!(obj11 instanceof JsonPrimitive) || (jsonPrimitive2 = (JsonPrimitive) obj11) == null || (boolA01 = C9oY.A01(jsonPrimitive2)) == null) ? false : boolA01.booleanValue());
        } else {
            boolValueOf = null;
        }
        String strA0g = C60R.A0g(FeedRepositoryKt.TIMEZONE_PARAM, jsonObject);
        if (strA0g.length() == 0) {
            strA0g = null;
        }
        Object obj12 = jsonObject.get("calendar_id");
        if (!(obj12 instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj12) == null || (lA03 = C9oY.A03(jsonPrimitive)) == null || lA03.longValue() < 0) {
            lA03 = null;
        }
        return new CalendarEventUpdateRequest(calendarEventTarget, zEquals, strA045, lValueOf, lValueOf2, strA046, strA047, boolValueOf, strA043, strA044, strA0g, lA03, numA02);
    }

    public static final long parseUpdateInstantMillis(String str, String str2) {
        try {
            return C60Q.A05(str);
        } catch (DateTimeParseException unused) {
            throw C60Q.A0U(str2, " must be valid ISO 8601");
        }
    }

    public static final List<CalendarEventUpdateRequest> parseUpdateRequests(String str) {
        try {
            List<JsonObject> listObjectListParam = JsonObjectParamsKt.objectListParam(C60Q.A13(str), "updates_json", "updates");
            if (listObjectListParam == null) {
                throw C60O.A0i("updates_json is required");
            }
            if (listObjectListParam.isEmpty()) {
                throw C60O.A0i("updates_json must contain at least one update");
            }
            ArrayList arrayListA0i = AnonymousClass003.A0i(listObjectListParam);
            int i = 0;
            for (JsonObject jsonObject : listObjectListParam) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                arrayListA0i.add(parseUpdateRequest(i, jsonObject));
                i = i2;
            }
            return arrayListA0i;
        } catch (Exception unused) {
            throw C60O.A0i("Could not parse parameters JSON");
        }
    }
}
