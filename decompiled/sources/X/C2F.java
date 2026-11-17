package X;

import java.util.Map;

/* loaded from: classes5.dex */
public abstract class C2F {
    public static final Map<String, String> A00 = C60O.A1C();

    public static String A00(Object obj) {
        String name;
        Class<?> cls = obj.getClass();
        try {
            name = (String) cls.getDeclaredField("__redex_internal_original_name").get(cls);
        } catch (NoSuchFieldException unused) {
            name = cls.getName();
        } catch (Exception e) {
            throw new Error(e);
        }
        int iA0B = BV6.A0B(name);
        if (iA0B == -1) {
            return name;
        }
        if (iA0B == name.length()) {
            throw new Error(FGI.A0U("Unexpected string ", name, " in __redex_internal_original_name"));
        }
        try {
            return name.substring(iA0B + 1);
        } catch (Exception e2) {
            throw new Error(e2);
        }
    }
}
