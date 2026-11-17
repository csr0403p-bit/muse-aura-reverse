package X;

import java.util.AbstractMap;

/* renamed from: X.Hyc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10605Hyc {
    public static <K, V> C10599Hxw<K, V> A00(Object destMapField, Object srcMapField) {
        C10599Hxw<K, V> c10599HxwA01 = (C10599Hxw) destMapField;
        AbstractMap abstractMap = (AbstractMap) srcMapField;
        if (!abstractMap.isEmpty()) {
            if (!c10599HxwA01.isMutable) {
                c10599HxwA01 = c10599HxwA01.A01();
            }
            if (!c10599HxwA01.isMutable) {
                throw C8j3.A17();
            }
            AbstractC7609F5w.A1R(abstractMap, c10599HxwA01);
        }
        return c10599HxwA01;
    }
}
