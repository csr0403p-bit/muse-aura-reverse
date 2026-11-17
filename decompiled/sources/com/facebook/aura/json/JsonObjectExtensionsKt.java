package com.facebook.aura.json;

import X.AnonymousClass003;
import X.C3cF;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C9oY;
import X.F60;
import X.G0U;
import kotlin.Unit;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class JsonObjectExtensionsKt {
    public static final /* synthetic */ <T> T decodeHatchJsonOrNull(String str) {
        if (str != null && !C7BY.A0j(str)) {
            try {
                C7384Etj.A0Q();
                throw F60.createAndThrow();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static final boolean optBoolean(JsonObject jsonObject, String str, boolean z) {
        JsonPrimitive jsonPrimitive;
        Boolean boolA01;
        C7384Etj.A0Y(jsonObject, 0);
        C7384Etj.A0Y(str, 1);
        Object obj = jsonObject.get(str);
        return (!(obj instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj) == null || (boolA01 = C9oY.A01(jsonPrimitive)) == null) ? z : boolA01.booleanValue();
    }

    public static final JsonArray optJsonArray(JsonObject jsonObject, String str) {
        C7384Etj.A0Y(jsonObject, 0);
        C7384Etj.A0Y(str, 1);
        Object obj = jsonObject.get(str);
        if (obj instanceof JsonArray) {
            return (JsonArray) obj;
        }
        return null;
    }

    public static final JsonObject optJsonObject(JsonObject jsonObject, String str) {
        C7384Etj.A0Y(jsonObject, 0);
        C7384Etj.A0Y(str, 1);
        Object obj = jsonObject.get(str);
        if (obj instanceof JsonObject) {
            return (JsonObject) obj;
        }
        return null;
    }

    public static final long optLong(JsonObject jsonObject, String str, long j) {
        JsonPrimitive jsonPrimitive;
        Long lA03;
        C7384Etj.A0Y(jsonObject, 0);
        C7384Etj.A0Y(str, 1);
        Object obj = jsonObject.get(str);
        return (!(obj instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj) == null || (lA03 = C9oY.A03(jsonPrimitive)) == null) ? j : lA03.longValue();
    }

    public static final String optString(JsonObject jsonObject, String str, String str2) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        C7384Etj.A0Y(jsonObject, 0);
        C7384Etj.A0Y(str, 1);
        C7384Etj.A0Y(str2, 2);
        Object obj = jsonObject.get(str);
        return (!(obj instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj) == null || (strA04 = C9oY.A04(jsonPrimitive)) == null) ? str2 : strA04;
    }

    public static final String optStringOrNull(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitive;
        C7384Etj.A0Y(jsonObject, 0);
        C7384Etj.A0Y(str, 1);
        Object obj = jsonObject.get(str);
        if (!(obj instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj) == null) {
            return null;
        }
        return C9oY.A04(jsonPrimitive);
    }

    public static final JsonObject toJsonObject(JSONObject jSONObject) {
        C7384Etj.A0Y(jSONObject, 0);
        JsonElement jsonElementA04 = HatchJsonKt.HatchJson.A04(C60O.A0o(jSONObject));
        C7384Etj.A0Z(jsonElementA04, C3cF.A00(45));
        return (JsonObject) jsonElementA04;
    }

    public static final JsonObject unwrapResultOrSelf(JsonObject jsonObject) {
        C7384Etj.A0Y(jsonObject, 0);
        JsonObject jsonObjectOptJsonObject = optJsonObject(jsonObject, "result");
        return jsonObjectOptJsonObject == null ? jsonObject : jsonObjectOptJsonObject;
    }

    public static final JsonArray asJsonArrayOrNull(JsonElement jsonElement) {
        if (jsonElement instanceof JsonArray) {
            return (JsonArray) jsonElement;
        }
        return null;
    }

    public static final JsonObject asJsonObjectOrNull(JsonElement jsonElement) {
        if (jsonElement instanceof JsonObject) {
            return (JsonObject) jsonElement;
        }
        return null;
    }

    public static final JsonPrimitive asJsonPrimitiveOrNull(JsonElement jsonElement) {
        if (jsonElement instanceof JsonPrimitive) {
            return (JsonPrimitive) jsonElement;
        }
        return null;
    }

    public static /* synthetic */ long optLong$default(JsonObject jsonObject, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return optLong(jsonObject, str, j);
    }

    public static /* synthetic */ String optString$default(JsonObject jsonObject, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return optString(jsonObject, str, str2);
    }

    public static final boolean has(JsonObject jsonObject, String str) {
        AnonymousClass003.A0u(jsonObject, str);
        return jsonObject.containsKey(str);
    }

    public static final int optInt(JsonObject jsonObject, String str, int i) {
        JsonPrimitive jsonPrimitive;
        Integer numA02;
        AnonymousClass003.A0u(jsonObject, str);
        Object obj = jsonObject.get(str);
        return (!(obj instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj) == null || (numA02 = C9oY.A02(jsonPrimitive)) == null) ? i : numA02.intValue();
    }

    public static final /* synthetic */ <T> T decodeHatchJsonOrNull(JsonElement jsonElement, G0U<? super Throwable, Unit> g0u) {
        C7384Etj.A0Y(g0u, 1);
        if (jsonElement != null) {
            try {
                C7384Etj.A0Q();
                throw F60.createAndThrow();
            } catch (Throwable th) {
                g0u.invoke(th);
            }
        }
        return null;
    }
}
