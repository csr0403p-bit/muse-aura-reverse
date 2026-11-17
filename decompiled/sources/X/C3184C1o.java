package X;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.C1o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3184C1o {
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, Set<String>>> A00 = C60O.A1C();
    public final Object[] A01;

    public C3184C1o() {
        Object[] objArr = new Object[32];
        int i = 0;
        do {
            objArr[i] = C3cG.A0T();
            i++;
        } while (i < 32);
        this.A01 = objArr;
    }

    public final void A00(String str, String str2, String str3) {
        Set<String> setPutIfAbsent;
        ConcurrentHashMap<String, Set<String>> concurrentHashMapPutIfAbsent;
        AnonymousClass005.A0x(str, str2, str3);
        synchronized (this.A01[str.hashCode() & 31]) {
            ConcurrentHashMap<String, ConcurrentHashMap<String, Set<String>>> concurrentHashMap = this.A00;
            ConcurrentHashMap<String, Set<String>> concurrentHashMapA1C = concurrentHashMap.get(str);
            if (concurrentHashMapA1C == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(str, (concurrentHashMapA1C = C60O.A1C()))) != null) {
                concurrentHashMapA1C = concurrentHashMapPutIfAbsent;
            }
            ConcurrentHashMap<String, Set<String>> concurrentHashMap2 = concurrentHashMapA1C;
            C7384Etj.A0X(concurrentHashMap2);
            Set<String> setA0k = concurrentHashMap2.get(str2);
            if (setA0k == null && (setPutIfAbsent = concurrentHashMap2.putIfAbsent(str2, (setA0k = C3cG.A0k()))) != null) {
                setA0k = setPutIfAbsent;
            }
            setA0k.add(str3);
        }
    }
}
