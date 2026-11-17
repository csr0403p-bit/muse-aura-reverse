package com.facebook.aura.status.repo;

import X.A3q;
import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.BFI;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C9tI;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.gateway.ConnectorOrderCheckoutKt;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import com.facebook.aura.model.ReplyAttributionSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class ActivityDataSourceJsonKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.A3q] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
    public static final GoalActionsDelta goalActionsDelta(JsonObject jsonObject) {
        ?? A0k;
        JsonPrimitive jsonPrimitive;
        String contentOrNull;
        JsonPrimitive jsonPrimitive2;
        String strA00;
        C7384Etj.A0Y(jsonObject, 0);
        JsonObject jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObject, "details");
        Long lA0s = null;
        if (jsonObjectOptJsonObject == null || !"upsert".equals(C60O.A0u(jsonObjectOptJsonObject, "goal_actions_update"))) {
            return null;
        }
        Object obj = jsonObjectOptJsonObject.get("goal_actions_base_seq");
        if ((obj instanceof JsonPrimitive) && (jsonPrimitive2 = (JsonPrimitive) obj) != null && (strA00 = jsonPrimitive2.A00()) != null) {
            lA0s = C9tI.A0s(strA00);
        }
        JsonArray jsonArrayOptJsonArray = JsonObjectExtensionsKt.optJsonArray(jsonObjectOptJsonObject, "goal_actions_removed");
        if (jsonArrayOptJsonArray != null) {
            A0k = C3cG.A0k();
            Iterator<JsonElement> it = jsonArrayOptJsonArray.iterator();
            while (it.hasNext()) {
                JsonElement jsonElementA11 = C60Q.A11(it);
                if ((jsonElementA11 instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) jsonElementA11) != null && (contentOrNull = getContentOrNull(jsonPrimitive)) != null) {
                    A0k.add(contentOrNull);
                }
            }
        } else {
            A0k = A3q.A00;
        }
        return new GoalActionsDelta(lA0s, A0k);
    }

    public static final ActivityDetails toActivityDetails(JsonObject jsonObject) {
        ArrayList arrayListA0i;
        ArrayList arrayListA0i2;
        ArrayList arrayListA0i3;
        ArrayList arrayListA0i4;
        ArrayList arrayListA0h;
        JsonPrimitive jsonPrimitive;
        String strA00;
        JsonPrimitive jsonPrimitive2;
        String contentOrNull;
        ActivityFile activityFile;
        String contentOrNull2;
        JsonPrimitive jsonPrimitive3;
        String contentOrNull3;
        JsonPrimitive jsonPrimitive4;
        String contentOrNull4;
        C7384Etj.A0Y(jsonObject, 0);
        Set setA0H = BFI.A0H(new String[]{"tool", "query", "action", ConnectorOrderCheckoutKt.ITEMS_KEY, "tasks", "files", "commit", ReplyAttributionSerializer.TYPE_GOAL, "goal_actions", "activities", "finish_message", "created_files", "goal_action_count", "goal_actions_has_more", "goal_actions_lazy", "goal_actions_update", "goal_actions_base_seq", "goal_actions_removed", "goal_actions_refresh_required"});
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (!setA0H.contains(key) && (value instanceof JsonPrimitive) && (contentOrNull4 = getContentOrNull((JsonPrimitive) value)) != null) {
                linkedHashMapA0j.put(key, contentOrNull4);
            }
        }
        JsonArray jsonArrayOptJsonArray = JsonObjectExtensionsKt.optJsonArray(jsonObject, "files");
        if (jsonArrayOptJsonArray != null) {
            arrayListA0i = AnonymousClass003.A0i(jsonArrayOptJsonArray);
            Iterator<JsonElement> it = jsonArrayOptJsonArray.iterator();
            while (it.hasNext()) {
                Object obj = (JsonElement) it.next();
                String str = "";
                if (obj instanceof JsonArray) {
                    List list = (List) obj;
                    Object objA0A = AbstractC0878AGe.A0A(0, list);
                    if (!(objA0A instanceof JsonPrimitive) || (jsonPrimitive4 = (JsonPrimitive) objA0A) == null || (contentOrNull2 = getContentOrNull(jsonPrimitive4)) == null) {
                        contentOrNull2 = "";
                    }
                    Object objA0A2 = AbstractC0878AGe.A0A(1, list);
                    if ((objA0A2 instanceof JsonPrimitive) && (jsonPrimitive3 = (JsonPrimitive) objA0A2) != null && (contentOrNull3 = getContentOrNull(jsonPrimitive3)) != null) {
                        str = contentOrNull3;
                    }
                    activityFile = new ActivityFile(contentOrNull2, str);
                } else {
                    activityFile = obj instanceof JsonObject ? toActivityFile((JsonObject) obj) : new ActivityFile("", "");
                }
                arrayListA0i.add(activityFile);
            }
        } else {
            arrayListA0i = null;
        }
        JsonArray jsonArrayOptJsonArray2 = JsonObjectExtensionsKt.optJsonArray(jsonObject, "goal_actions");
        if (jsonArrayOptJsonArray2 == null) {
            jsonArrayOptJsonArray2 = JsonObjectExtensionsKt.optJsonArray(jsonObject, "activities");
        }
        String strOptStringOrNull = JsonObjectExtensionsKt.optStringOrNull(jsonObject, "tool");
        String strOptStringOrNull2 = JsonObjectExtensionsKt.optStringOrNull(jsonObject, "query");
        String strOptStringOrNull3 = JsonObjectExtensionsKt.optStringOrNull(jsonObject, "action");
        JsonArray jsonArrayOptJsonArray3 = JsonObjectExtensionsKt.optJsonArray(jsonObject, ConnectorOrderCheckoutKt.ITEMS_KEY);
        if (jsonArrayOptJsonArray3 != null) {
            ArrayList arrayListA0h2 = C3cG.A0h();
            Iterator<JsonElement> it2 = jsonArrayOptJsonArray3.iterator();
            while (it2.hasNext()) {
                JsonElement next = it2.next();
                if ((next instanceof JsonObject) && next != null) {
                    arrayListA0h2.add(next);
                }
            }
            arrayListA0i2 = AnonymousClass003.A0i(arrayListA0h2);
            Iterator it3 = arrayListA0h2.iterator();
            while (it3.hasNext()) {
                arrayListA0i2.add(((ActivityDetailItemJson) HatchJsonKt.HatchJson.A01(ActivityDetailItemJson$$serializer.INSTANCE, (JsonElement) it3.next())).toDomain());
            }
        } else {
            arrayListA0i2 = null;
        }
        JsonArray jsonArrayOptJsonArray4 = JsonObjectExtensionsKt.optJsonArray(jsonObject, "tasks");
        if (jsonArrayOptJsonArray4 != null) {
            ArrayList arrayListA0h3 = C3cG.A0h();
            Iterator<JsonElement> it4 = jsonArrayOptJsonArray4.iterator();
            while (it4.hasNext()) {
                JsonElement next2 = it4.next();
                if ((next2 instanceof JsonObject) && next2 != null) {
                    arrayListA0h3.add(next2);
                }
            }
            arrayListA0i3 = AnonymousClass003.A0i(arrayListA0h3);
            Iterator it5 = arrayListA0h3.iterator();
            while (it5.hasNext()) {
                arrayListA0i3.add(((ActivityDetailTaskJson) HatchJsonKt.HatchJson.A01(ActivityDetailTaskJson$$serializer.INSTANCE, (JsonElement) it5.next())).toDomain());
            }
        } else {
            arrayListA0i3 = null;
        }
        String strOptStringOrNull4 = JsonObjectExtensionsKt.optStringOrNull(jsonObject, "commit");
        JsonObject jsonObjectOptJsonObject = JsonObjectExtensionsKt.optJsonObject(jsonObject, ReplyAttributionSerializer.TYPE_GOAL);
        ActivityGoal domain = jsonObjectOptJsonObject != null ? ((ActivityGoalJson) HatchJsonKt.HatchJson.A01(ActivityGoalJson$$serializer.INSTANCE, jsonObjectOptJsonObject)).toDomain() : null;
        if (jsonArrayOptJsonArray2 != null) {
            ArrayList arrayListA0h4 = C3cG.A0h();
            Iterator<JsonElement> it6 = jsonArrayOptJsonArray2.iterator();
            while (it6.hasNext()) {
                JsonElement next3 = it6.next();
                if ((next3 instanceof JsonObject) && next3 != null) {
                    arrayListA0h4.add(next3);
                }
            }
            arrayListA0i4 = AnonymousClass003.A0i(arrayListA0h4);
            Iterator it7 = arrayListA0h4.iterator();
            while (it7.hasNext()) {
                arrayListA0i4.add(((ActivityGoalActionJson) HatchJsonKt.HatchJson.A01(ActivityGoalActionJson$$serializer.INSTANCE, (JsonElement) it7.next())).toDomain());
            }
        } else {
            arrayListA0i4 = null;
        }
        String strOptStringOrNull5 = JsonObjectExtensionsKt.optStringOrNull(jsonObject, "finish_message");
        JsonArray jsonArrayOptJsonArray5 = JsonObjectExtensionsKt.optJsonArray(jsonObject, "created_files");
        if (jsonArrayOptJsonArray5 != null) {
            arrayListA0h = C3cG.A0h();
            Iterator<JsonElement> it8 = jsonArrayOptJsonArray5.iterator();
            while (it8.hasNext()) {
                JsonElement next4 = it8.next();
                if ((next4 instanceof JsonPrimitive) && (jsonPrimitive2 = (JsonPrimitive) next4) != null && (contentOrNull = getContentOrNull(jsonPrimitive2)) != null) {
                    arrayListA0h.add(contentOrNull);
                }
            }
        } else {
            arrayListA0h = null;
        }
        Object obj2 = jsonObject.get("goal_action_count");
        return new ActivityDetails(strOptStringOrNull, strOptStringOrNull2, strOptStringOrNull3, arrayListA0i2, arrayListA0i3, arrayListA0i, strOptStringOrNull4, domain, arrayListA0i4, strOptStringOrNull5, arrayListA0h, linkedHashMapA0j, (!(obj2 instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj2) == null || (strA00 = jsonPrimitive.A00()) == null) ? null : C9tI.A0s(strA00), JsonObjectExtensionsKt.optBoolean(jsonObject, "goal_actions_has_more", false), JsonObjectExtensionsKt.optBoolean(jsonObject, "goal_actions_lazy", false));
    }

    public static final ActivityFile toActivityFile(JsonObject jsonObject) {
        C7384Etj.A0Y(jsonObject, 0);
        return new ActivityFile(JsonObjectExtensionsKt.optString(jsonObject, AuraDeeplinkRouteMapper.STATUS_ROUTE, ""), JsonObjectExtensionsKt.optString(jsonObject, "path", ""));
    }

    public static final String getContentOrNull(JsonPrimitive jsonPrimitive) {
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.A00();
    }
}
