package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Htm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10564Htm<K, V> extends LinkedHashMap<K, V> {
    public static final C10564Htm A00;
    public boolean isMutable = true;

    static {
        C10564Htm c10564Htm = new C10564Htm();
        A00 = c10564Htm;
        c10564Htm.isMutable = false;
    }

    public static void A00(C10564Htm c10564Htm) {
        if (!c10564Htm.isMutable) {
            throw C8j3.A17();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator itA0i = C3cG.A0i(this);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            if (!map.containsKey(entryA0l.getKey())) {
                return false;
            }
            Object value = entryA0l.getValue();
            Object obj2 = map.get(entryA0l.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final X.C10564Htm<K, V> A01() {
        /*
            r2 = this;
            boolean r0 = r2.isEmpty()
            X.Htm r1 = new X.Htm
            if (r0 == 0) goto Lc
            r1.<init>()
            return r1
        Lc:
            r1.<init>(r2)
            r0 = 1
            r1.isMutable = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10564Htm.A01():X.Htm");
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        A00(this);
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        Iterator itA0i = C3cG.A0i(this);
        int i = 0;
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            Object key = entryA0l.getKey();
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                Charset charset = GGV.A03;
                iHashCode = bArr.length;
                for (byte b : bArr) {
                    iHashCode = (iHashCode * 31) + b;
                }
                if (iHashCode == 0) {
                    iHashCode = 1;
                }
            } else {
                iHashCode = key.hashCode();
            }
            Object value = entryA0l.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                Charset charset2 = GGV.A03;
                iHashCode2 = bArr2.length;
                for (byte b2 : bArr2) {
                    iHashCode2 = (iHashCode2 * 31) + b2;
                }
                if (iHashCode2 == 0) {
                    iHashCode2 = 1;
                }
            } else {
                iHashCode2 = value.hashCode();
            }
            i += iHashCode2 ^ iHashCode;
        }
        return i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        A00(this);
        Charset charset = GGV.A03;
        k.getClass();
        v.getClass();
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        A00(this);
        Iterator itA11 = BV5.A11(map);
        while (itA11.hasNext()) {
            Object next = itA11.next();
            Charset charset = GGV.A03;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        A00(this);
        return (V) super.remove(obj);
    }
}
