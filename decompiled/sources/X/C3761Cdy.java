package X;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Cdy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3761Cdy extends AbstractMap {
    public transient Collection A00;
    public transient Set A01;
    public final transient Map A02;
    public final /* synthetic */ Ce3 A03;

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.A02;
        Ce3 ce3 = this.A03;
        Map map2 = ce3.A01;
        if (map != map2) {
            C3763Ce0 c3763Ce0 = new C3763Ce0(this);
            while (c3763Ce0.hasNext()) {
                c3763Ce0.next();
                c3763Ce0.remove();
            }
            return;
        }
        Iterator itA10 = BV5.A10(map2);
        while (itA10.hasNext()) {
            ((Collection) itA10.next()).clear();
        }
        map2.clear();
        ce3.A00 = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.A02;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.A01;
        if (set != null) {
            return set;
        }
        C3762Cdz c3762Cdz = new C3762Cdz(this);
        this.A01 = c3762Cdz;
        return c3762Cdz;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.A02.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Object obj2;
        Map map = this.A02;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        return this.A03.A00(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.A02.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Ce3 ce3 = this.A03;
        Set set = ((AbstractC3760Cdx) ce3).A01;
        if (set != null) {
            return set;
        }
        C3764Ce1 c3764Ce1 = new C3764Ce1(ce3, ce3.A01);
        ((AbstractC3760Cdx) ce3).A01 = c3764Ce1;
        return c3764Ce1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.A02.remove(obj);
        if (collection == null) {
            return null;
        }
        Ce3 ce3 = this.A03;
        ArrayList arrayListA11 = C60O.A11(3);
        arrayListA11.addAll(collection);
        ce3.A00 -= collection.size();
        collection.clear();
        return arrayListA11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.A02.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.A02.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.A00;
        if (collection != null) {
            return collection;
        }
        C3069Bwr c3069Bwr = new C3069Bwr(this);
        this.A00 = c3069Bwr;
        return c3069Bwr;
    }

    public C3761Cdy() {
    }

    public C3761Cdy(Ce3 ce3, Map map) {
        this.A03 = ce3;
        this.A02 = map;
    }
}
