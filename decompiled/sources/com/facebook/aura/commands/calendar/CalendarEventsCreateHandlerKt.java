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
public abstract class CalendarEventsCreateHandlerKt {
    public static final String PARAM_EVENTS = "events";
    public static final String PARAM_EVENTS_JSON = "events_json";
    public static final String TAG = "CalendarEventsCreateHandler";

    public static /* synthetic */ long parseCreateInstantMillis$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        return parseCreateInstantMillis(str, str2, str3);
    }

    public static final CalendarEventCreateRequest parseCreateRequest(int i, JsonObject jsonObject) {
        String strA04;
        Long lA03;
        String strA042;
        int iIntValue;
        String strA043;
        String strA044;
        String strA045;
        String strA046;
        JsonPrimitive jsonPrimitive;
        Boolean boolA01;
        JsonPrimitive jsonPrimitive2;
        JsonPrimitive jsonPrimitive3;
        JsonPrimitive jsonPrimitive4;
        JsonPrimitive jsonPrimitive5;
        JsonPrimitive jsonPrimitive6;
        Integer numA02;
        JsonPrimitive jsonPrimitive7;
        JsonPrimitive jsonPrimitive8;
        JsonPrimitive jsonPrimitive9;
        JsonPrimitive jsonPrimitive10;
        String strA0k = C60Q.A0k("events_json[", i);
        Object obj = jsonObject.get("title");
        String strA047 = (!(obj instanceof JsonPrimitive) || (jsonPrimitive10 = (JsonPrimitive) obj) == null) ? null : C9oY.A04(jsonPrimitive10);
        if (strA047 == null) {
            strA047 = "";
        }
        if (strA047.length() == 0) {
            throw C60Q.A0U(strA0k, ".title is required");
        }
        Object obj2 = jsonObject.get("start_time");
        if (!(obj2 instanceof JsonPrimitive) || (jsonPrimitive9 = (JsonPrimitive) obj2) == null || (strA04 = C9oY.A04(jsonPrimitive9)) == null) {
            strA04 = "";
        }
        if (strA04.length() == 0) {
            throw C60Q.A0U(strA0k, ".start_time is required (ISO 8601 format)");
        }
        Object obj3 = jsonObject.get("calendar_id");
        if (!(obj3 instanceof JsonPrimitive) || (jsonPrimitive8 = (JsonPrimitive) obj3) == null || (lA03 = C9oY.A03(jsonPrimitive8)) == null || lA03.longValue() < 0) {
            lA03 = null;
        }
        Object obj4 = jsonObject.get("end_time");
        if (!(obj4 instanceof JsonPrimitive) || (jsonPrimitive7 = (JsonPrimitive) obj4) == null || (strA042 = C9oY.A04(jsonPrimitive7)) == null) {
            strA042 = "";
        }
        if (jsonObject.containsKey("reminder_minutes")) {
            Object obj5 = jsonObject.get("reminder_minutes");
            if (!(obj5 instanceof JsonPrimitive) || (jsonPrimitive6 = (JsonPrimitive) obj5) == null || (numA02 = C9oY.A02(jsonPrimitive6)) == null) {
                throw C60Q.A0U(strA0k, ".reminder_minutes must be an integer");
            }
            iIntValue = numA02.intValue();
        } else {
            iIntValue = -1;
        }
        Object obj6 = jsonObject.get("rrule");
        if (!(obj6 instanceof JsonPrimitive) || (jsonPrimitive5 = (JsonPrimitive) obj6) == null || (strA043 = C9oY.A04(jsonPrimitive5)) == null) {
            strA043 = "";
        }
        if (strA043.length() == 0) {
            strA043 = null;
        }
        Object obj7 = jsonObject.get("duration");
        if (!(obj7 instanceof JsonPrimitive) || (jsonPrimitive4 = (JsonPrimitive) obj7) == null || (strA044 = C9oY.A04(jsonPrimitive4)) == null) {
            strA044 = "";
        }
        if (strA044.length() == 0) {
            strA044 = null;
        }
        if (strA043 != null && strA042.length() > 0) {
            throw C60Q.A0U(strA0k, " cannot combine 'rrule' with 'end_time'; a recurring event uses 'duration' (ISO-8601, e.g. 'PT1H') instead.");
        }
        long createInstantMillis = parseCreateInstantMillis(strA04, FGI.A0M(strA0k, ".start_time"), " (e.g. '2025-01-15T15:00:00Z')");
        Long lValueOf = strA042.length() > 0 ? Long.valueOf(parseCreateInstantMillis(strA042, FGI.A0M(strA0k, ".end_time"), "")) : null;
        Object obj8 = jsonObject.get(HatchWebPageParserKt.DESCRIPTION);
        if (!(obj8 instanceof JsonPrimitive) || (jsonPrimitive3 = (JsonPrimitive) obj8) == null || (strA045 = C9oY.A04(jsonPrimitive3)) == null) {
            strA045 = "";
        }
        if (strA045.length() == 0) {
            strA045 = null;
        }
        Object obj9 = jsonObject.get(MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL);
        if (!(obj9 instanceof JsonPrimitive) || (jsonPrimitive2 = (JsonPrimitive) obj9) == null || (strA046 = C9oY.A04(jsonPrimitive2)) == null) {
            strA046 = "";
        }
        if (strA046.length() == 0) {
            strA046 = null;
        }
        Object obj10 = jsonObject.get("all_day");
        boolean zBooleanValue = (!(obj10 instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj10) == null || (boolA01 = C9oY.A01(jsonPrimitive)) == null) ? false : boolA01.booleanValue();
        String strA0g = C60R.A0g(FeedRepositoryKt.TIMEZONE_PARAM, jsonObject);
        return new CalendarEventCreateRequest(strA047, createInstantMillis, lA03, lValueOf, strA045, strA046, zBooleanValue, strA0g.length() != 0 ? strA0g : null, iIntValue, strA043, strA044);
    }

    public static final long parseCreateInstantMillis(String str, String str2, String str3) {
        try {
            return C60Q.A05(str);
        } catch (DateTimeParseException unused) {
            throw C60Q.A0V(str2, " must be valid ISO 8601", str3);
        }
    }

    public static final List<CalendarEventCreateRequest> parseCreateRequests(String str) {
        try {
            List<JsonObject> listObjectListParam = JsonObjectParamsKt.objectListParam(C60Q.A13(str), PARAM_EVENTS_JSON, PARAM_EVENTS);
            if (listObjectListParam == null) {
                throw C60O.A0i("events_json is required");
            }
            if (listObjectListParam.isEmpty()) {
                throw C60O.A0i("events_json must contain at least one event");
            }
            ArrayList arrayListA0i = AnonymousClass003.A0i(listObjectListParam);
            int i = 0;
            for (JsonObject jsonObject : listObjectListParam) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                arrayListA0i.add(parseCreateRequest(i, jsonObject));
                i = i2;
            }
            return arrayListA0i;
        } catch (Exception unused) {
            throw C60O.A0i("Could not parse parameters JSON");
        }
    }
}
