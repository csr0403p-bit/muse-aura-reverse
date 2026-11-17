package com.facebook.aura.shopping.repo;

import X.AnonymousClass002;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class HatchProductDetailsJsonKt {
    public static final String stringOrNull(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        if ((jsonElement instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) jsonElement) != null && jsonPrimitive.A01()) {
            return jsonPrimitive.A00();
        }
        return null;
    }

    public static final Integer parseSwatchRgb(String str) {
        char c;
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() == 7) {
            if (strA0l.charAt(0) == '#') {
                String strSubstring = strA0l.substring(1);
                for (int i = 0; i < strSubstring.length(); i++) {
                    char cCharAt = strSubstring.charAt(i);
                    if ('0' <= cCharAt) {
                        if (cCharAt >= ':') {
                            if ('a' <= cCharAt) {
                                c = 'g';
                            } else if ('A' <= cCharAt) {
                                c = 'G';
                            }
                            if (cCharAt < c) {
                            }
                        }
                    }
                }
                return Integer.valueOf(Integer.parseInt(strSubstring, 16));
            }
        }
        return null;
    }
}
