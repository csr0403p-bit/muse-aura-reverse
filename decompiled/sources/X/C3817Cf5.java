package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Cf5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3817Cf5 implements Map, Serializable {
    public static final C3817Cf5 A05 = new C3817Cf5(0, new Object[0]);
    public transient AbstractC3821Cf9 A00;
    public transient AbstractC3822CfA A01;
    public transient AbstractC3822CfA A02;
    public final transient int A03;
    public final transient Object[] A04;

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        AbstractC3821Cf9 cf4 = this.A00;
        if (cf4 == null) {
            cf4 = new Cf4(this.A04, 1, this.A03);
            this.A00 = cf4;
        }
        return cf4.contains(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        AbstractC3822CfA abstractC3822CfA = this.A01;
        if (abstractC3822CfA != null) {
            return abstractC3822CfA;
        }
        C3819Cf7 c3819Cf7 = new C3819Cf7(this, this.A04, this.A03);
        this.A01 = c3819Cf7;
        return c3819Cf7;
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

    @Override // java.util.Map
    public final Object get(Object obj) {
        return BV8.A0p(obj, this.A04, this.A03);
    }

    @Override // java.util.Map
    public final int hashCode() {
        AbstractC3822CfA c3819Cf7 = this.A01;
        if (c3819Cf7 == null) {
            c3819Cf7 = new C3819Cf7(this, this.A04, this.A03);
            this.A01 = c3819Cf7;
        }
        Iterator it = c3819Cf7.iterator();
        int iA01 = 0;
        while (it.hasNext()) {
            iA01 += C60R.A01(it.next());
        }
        return iA01;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC3822CfA abstractC3822CfA = this.A02;
        if (abstractC3822CfA != null) {
            return abstractC3822CfA;
        }
        C3825CfD c3825CfD = new C3825CfD(new Cf4(this.A04, 0, this.A03), this);
        this.A02 = c3825CfD;
        return c3825CfD;
    }

    @Override // java.util.Map
    public final int size() {
        return this.A03;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        AbstractC3821Cf9 abstractC3821Cf9 = this.A00;
        if (abstractC3821Cf9 != null) {
            return abstractC3821Cf9;
        }
        Cf4 cf4 = new Cf4(this.A04, 1, this.A03);
        this.A00 = cf4;
        return cf4;
    }

    public C3817Cf5() {
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
            throw C60O.A0i(FGI.A0S("size", " cannot be negative but was: ", size));
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

    public C3817Cf5(int i, Object[] objArr) {
        this.A04 = objArr;
        this.A03 = i;
    }
}
