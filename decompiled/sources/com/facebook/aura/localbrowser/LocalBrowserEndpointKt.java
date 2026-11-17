package com.facebook.aura.localbrowser;

import X.AGH;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.C7BY;
import X.C9jH;
import X.C9oY;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes2.dex */
public abstract class LocalBrowserEndpointKt {
    public static final String optionalString(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitive;
        AnonymousClass003.A0u(jsonObject, str);
        Object obj = jsonObject.get(str);
        if ((obj instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj) != null && jsonPrimitive.A01()) {
            return jsonPrimitive.A00();
        }
        return null;
    }

    public static final String requiredId(JsonObject jsonObject, String str) {
        int length;
        boolean zA1b = AnonymousClass004.A1b(jsonObject, str);
        String strOptionalString = optionalString(jsonObject, str);
        if (strOptionalString != null && !C7BY.A0j(strOptionalString) && (length = strOptionalString.length()) <= 512) {
            for (int i = 0; i < length; i++) {
                if (strOptionalString.charAt(i) >= ' ') {
                }
            }
            return strOptionalString;
        }
        C9jH c9jHA0E = AGH.A0E();
        throw new LocalBrowserEndpointFailure("invalid_arguments", zA1b, null, null, c9jHA0E, c9jHA0E);
    }

    public static final long requiredLong(JsonObject jsonObject, String str) throws LocalBrowserEndpointFailure {
        JsonPrimitive jsonPrimitive;
        Long lA03;
        boolean zA1b = AnonymousClass004.A1b(jsonObject, str);
        Object obj = jsonObject.get(str);
        if ((obj instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) obj) != null && !jsonPrimitive.A01() && (lA03 = C9oY.A03(jsonPrimitive)) != null) {
            long jLongValue = lA03.longValue();
            if (jLongValue > 0) {
                return jLongValue;
            }
        }
        C9jH c9jHA0E = AGH.A0E();
        throw new LocalBrowserEndpointFailure("invalid_arguments", zA1b, null, null, c9jHA0E, c9jHA0E);
    }
}
