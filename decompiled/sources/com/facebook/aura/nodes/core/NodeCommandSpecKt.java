package com.facebook.aura.nodes.core;

import X.AnonymousClass003;
import X.C9oY;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes.dex */
public abstract class NodeCommandSpecKt {
    public static final String stringOrEmpty(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        AnonymousClass003.A0u(jsonObject, str);
        Object obj = jsonObject.get(str);
        return (!(obj instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj) == null || (strA04 = C9oY.A04(jsonPrimitive)) == null) ? "" : strA04;
    }
}
