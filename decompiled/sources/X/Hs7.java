package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class Hs7 extends LinkedHashMap {
    public static final Hs7 A00;
    public boolean a = true;

    static {
        Hs7 hs7 = new Hs7();
        A00 = hs7;
        hs7.a = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (!this.a) {
            throw C8j3.A17();
        }
        super.clear();
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

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (!this.a) {
            throw C8j3.A17();
        }
        byte[] bArr = AbstractC9307GDj.A00;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        if (!this.a) {
            throw C8j3.A17();
        }
        Iterator itA11 = BV5.A11(map);
        while (itA11.hasNext()) {
            Object next = itA11.next();
            byte[] bArr = AbstractC9307GDj.A00;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (this.a) {
            return super.remove(obj);
        }
        throw C8j3.A17();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iHashCode;
        Iterator itA0i = C3cG.A0i(this);
        int i = 0;
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            Object key = entryA0l.getKey();
            int iHashCode2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                byte[] bArr2 = AbstractC9307GDj.A00;
                iHashCode = bArr.length;
                for (byte b : bArr) {
                    iHashCode = (iHashCode * 31) + b;
                }
                if (iHashCode == 0) {
                    iHashCode = 1;
                }
            } else {
                if (key instanceof GIT) {
                    throw C8j3.A17();
                }
                iHashCode = key.hashCode();
            }
            Object value = entryA0l.getValue();
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = AbstractC9307GDj.A00;
                int length = bArr3.length;
                for (byte b2 : bArr3) {
                    length = (length * 31) + b2;
                }
                if (length != 0) {
                    iHashCode2 = length;
                }
            } else {
                if (value instanceof GIT) {
                    throw C8j3.A17();
                }
                iHashCode2 = value.hashCode();
            }
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }
}
