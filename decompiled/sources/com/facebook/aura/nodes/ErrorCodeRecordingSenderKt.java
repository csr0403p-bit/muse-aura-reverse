package com.facebook.aura.nodes;

import X.C10571Hud;
import X.C3cG;
import X.C9oY;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import com.facebook.aura.nodes.core.NodeWireJsonKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class ErrorCodeRecordingSenderKt {
    public static final String ERROR_PAYLOAD_PREFIX = "{\"status\":\"error\"";
    public static final String UNCODED_HANDLER_ERROR = "handler_error";

    public static final String handlerErrorCode(JsonObject jsonObject) {
        String strA04;
        Object objA0s;
        String strOptStringOrNull;
        Object obj = jsonObject.get("payload_json");
        JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
        if (jsonPrimitive == null || (strA04 = C9oY.A04(jsonPrimitive)) == null || !strA04.startsWith(ERROR_PAYLOAD_PREFIX)) {
            return null;
        }
        try {
            Object objA04 = NodeWireJsonKt.NodeJson.A04(strA04);
            objA0s = objA04 instanceof JsonObject ? (JsonObject) objA04 : null;
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        JsonObject jsonObject2 = (JsonObject) (objA0s instanceof C10571Hud ? null : objA0s);
        return (jsonObject2 == null || (strOptStringOrNull = JsonObjectExtensionsKt.optStringOrNull(jsonObject2, "error_code")) == null) ? UNCODED_HANDLER_ERROR : strOptStringOrNull;
    }
}
