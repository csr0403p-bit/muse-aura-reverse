package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Cev, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3812Cev implements Map, Serializable {
    public static final C3812Cev A05 = new C3812Cev(0, new Object[0]);
    public transient AbstractC3816Cez A00;
    public transient Cf0 A01;
    public transient Cf0 A02;
    public final transient int A03;
    public final transient Object[] A04;

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        AbstractC3816Cez c3811Ceu = this.A00;
        if (c3811Ceu == null) {
            c3811Ceu = new C3811Ceu(this.A04, 1, this.A03);
            this.A00 = c3811Ceu;
        }
        return c3811Ceu.contains(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        Cf0 cf0 = this.A01;
        if (cf0 != null) {
            return cf0;
        }
        C3814Cex c3814Cex = new C3814Cex(this, this.A04, this.A03);
        this.A01 = c3814Cex;
        return c3814Cex;
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
        Cf0 c3814Cex = this.A01;
        if (c3814Cex == null) {
            c3814Cex = new C3814Cex(this, this.A04, this.A03);
            this.A01 = c3814Cex;
        }
        Iterator it = c3814Cex.iterator();
        int iA01 = 0;
        while (it.hasNext()) {
            iA01 += C60R.A01(it.next());
        }
        return iA01;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        Cf0 cf0 = this.A02;
        if (cf0 != null) {
            return cf0;
        }
        Cf3 cf3 = new Cf3(new C3811Ceu(this.A04, 0, this.A03), this);
        this.A02 = cf3;
        return cf3;
    }

    @Override // java.util.Map
    public final int size() {
        return this.A03;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        AbstractC3816Cez abstractC3816Cez = this.A00;
        if (abstractC3816Cez != null) {
            return abstractC3816Cez;
        }
        C3811Ceu c3811Ceu = new C3811Ceu(this.A04, 1, this.A03);
        this.A00 = c3811Ceu;
        return c3811Ceu;
    }

    public C3812Cev() {
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

    public C3812Cev(int i, Object[] objArr) {
        this.A04 = objArr;
        this.A03 = i;
    }
}
