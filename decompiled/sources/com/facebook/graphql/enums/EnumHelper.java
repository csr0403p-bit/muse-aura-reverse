package com.facebook.graphql.enums;

import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class EnumHelper {
    public static <T extends Enum<T>> T A00(String str, T t) {
        if (str != null && str.length() != 0) {
            try {
                return (T) Enum.valueOf(t.getDeclaringClass(), str.toUpperCase(Locale.US));
            } catch (IllegalArgumentException unused) {
            }
        }
        return t;
    }
}
