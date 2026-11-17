package X;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Hxw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10599Hxw<K, V> extends LinkedHashMap<K, V> {
    public static final C10599Hxw<?, ?> A00;
    public boolean isMutable = true;

    static {
        C10599Hxw<?, ?> c10599Hxw = new C10599Hxw<>();
        A00 = c10599Hxw;
        c10599Hxw.isMutable = false;
    }

    public static int A00(Object a) {
        if (!(a instanceof byte[])) {
            if (a instanceof HrV) {
                throw C8j3.A17();
            }
            return a.hashCode();
        }
        byte[] bArr = (byte[]) a;
        Charset charset = AbstractC9352GFl.A04;
        int length = bArr.length;
        for (byte b : bArr) {
            length = (length * 31) + b;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (!this.isMutable) {
            throw C8j3.A17();
        }
        super.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object object) {
        if (!(object instanceof Map)) {
            return false;
        }
        Map map = (Map) object;
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
            Object obj = map.get(entryA0l.getKey());
            if (!(((value instanceof byte[]) && (obj instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj) : value.equals(obj))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        if (!this.isMutable) {
            throw C8j3.A17();
        }
        Charset charset = AbstractC9352GFl.A04;
        k.getClass();
        v.getClass();
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> m) {
        if (!this.isMutable) {
            throw C8j3.A17();
        }
        Iterator itA11 = BV5.A11(m);
        while (itA11.hasNext()) {
            Object next = itA11.next();
            Charset charset = AbstractC9352GFl.A04;
            next.getClass();
            m.get(next).getClass();
        }
        super.putAll(m);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        if (this.isMutable) {
            return (V) super.remove(obj);
        }
        throw C8j3.A17();
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
    public final X.C10599Hxw<K, V> A01() {
        /*
            r2 = this;
            boolean r0 = r2.isEmpty()
            X.Hxw r1 = new X.Hxw
            if (r0 == 0) goto Lc
            r1.<init>()
            return r1
        Lc:
            r1.<init>(r2)
            r0 = 1
            r1.isMutable = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10599Hxw.A01():X.Hxw");
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator itA0i = C3cG.A0i(this);
        int iA00 = 0;
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            iA00 += A00(entryA0l.getValue()) ^ A00(entryA0l.getKey());
        }
        return iA00;
    }
}
