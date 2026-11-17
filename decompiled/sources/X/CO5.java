package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class CO5 implements Map, Serializable {
    public static final Map.Entry[] A01 = new Map.Entry[0];
    public transient CO8 A00;

    @Override // java.util.Map
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final CO8 entrySet() {
        CO8 co6 = this.A00;
        if (co6 == null) {
            COB cob = (COB) this;
            co6 = cob.isEmpty() ? CO7.A02 : new CO6(cob);
            this.A00 = co6;
        }
        return co6;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return ((COB) this).A00.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            X.COB r3 = (X.COB) r3
            X.COC r0 = r3.A01
            r2 = -1
            if (r4 == 0) goto L11
            X.COO r1 = r0.A01     // Catch: java.lang.ClassCastException -> L11
            java.util.Comparator r0 = r0.A02     // Catch: java.lang.ClassCastException -> L11
            int r1 = java.util.Collections.binarySearch(r1, r4, r0)     // Catch: java.lang.ClassCastException -> L11
            if (r1 >= 0) goto L12
        L11:
            r1 = -1
        L12:
            if (r1 != r2) goto L16
            r0 = 0
            return r0
        L16:
            X.COO r0 = r3.A00
            java.lang.Object r0 = r0.get(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CO5.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        return ((COB) this).A01;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return ((COB) this).A00;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw C8j3.A17();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return AnonymousClass002.A1X(get(obj));
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iA01 = 0;
        while (it.hasNext()) {
            iA01 += C60R.A01(it.next());
        }
        return iA01;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return AnonymousClass002.A1M(size());
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw C8j3.A17();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw C8j3.A17();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw C8j3.A17();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw BV5.A0Q("size cannot be negative but was: ", size);
        }
        StringBuilder sbA11 = BV8.A11(size);
        Iterator it = entrySet().iterator();
        boolean z = true;
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            if (!z) {
                C8j3.A1K(sbA11);
            }
            BV8.A1R(sbA11, entryA0l);
            z = false;
        }
        return C8j3.A15(sbA11);
    }
}
