package com.facebook.aura.localbrowser;

import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes2.dex */
public abstract class LocalBrowserNodeHandlerKt {
    public static final String string(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitive;
        Object obj = jsonObject.get(str);
        if (!(obj instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj) == null) {
            return null;
        }
        return jsonPrimitive.A00();
    }
}
