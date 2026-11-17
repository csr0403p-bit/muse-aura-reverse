package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Cel, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3802Cel implements Map, Serializable {
    public static final C3802Cel A05 = new C3802Cel(0, new Object[0]);
    public transient AbstractC3806Cep A00;
    public transient AbstractC3805Ceo A01;
    public transient AbstractC3805Ceo A02;
    public final transient int A03;
    public final transient Object[] A04;

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        AbstractC3806Cep c3801Cek = this.A00;
        if (c3801Cek == null) {
            c3801Cek = new C3801Cek(this.A04, 1, this.A03);
            this.A00 = c3801Cek;
        }
        return c3801Cek.contains(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set entrySet() {
        AbstractC3805Ceo abstractC3805Ceo = this.A01;
        if (abstractC3805Ceo != null) {
            return abstractC3805Ceo;
        }
        C3807Ceq c3807Ceq = new C3807Ceq(this, this.A04, this.A03);
        this.A01 = c3807Ceq;
        return c3807Ceq;
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
        AbstractC3805Ceo c3807Ceq = this.A01;
        if (c3807Ceq == null) {
            c3807Ceq = new C3807Ceq(this, this.A04, this.A03);
            this.A01 = c3807Ceq;
        }
        Iterator it = c3807Ceq.iterator();
        int iA01 = 0;
        while (it.hasNext()) {
            iA01 += C60R.A01(it.next());
        }
        return iA01;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC3805Ceo abstractC3805Ceo = this.A02;
        if (abstractC3805Ceo != null) {
            return abstractC3805Ceo;
        }
        C3803Cem c3803Cem = new C3803Cem(new C3801Cek(this.A04, 0, this.A03), this);
        this.A02 = c3803Cem;
        return c3803Cem;
    }

    @Override // java.util.Map
    public final int size() {
        return this.A03;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        AbstractC3806Cep abstractC3806Cep = this.A00;
        if (abstractC3806Cep != null) {
            return abstractC3806Cep;
        }
        C3801Cek c3801Cek = new C3801Cek(this.A04, 1, this.A03);
        this.A00 = c3801Cek;
        return c3801Cek;
    }

    public C3802Cel() {
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

    public C3802Cel(int i, Object[] objArr) {
        this.A04 = objArr;
        this.A03 = i;
    }
}
