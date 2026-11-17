package com.facebook.aura.gateway;

import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes2.dex */
public abstract class HatchAiIdentityHandlerJsonKt {
    public static final String stringOrNull(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        String strA00;
        if (!(jsonElement instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) jsonElement) == null || !jsonPrimitive.A01() || (strA00 = jsonPrimitive.A00()) == null || strA00.length() <= 0) {
            return null;
        }
        return strA00;
    }
}
