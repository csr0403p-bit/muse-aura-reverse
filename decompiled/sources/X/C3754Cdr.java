package X;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Cdr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3754Cdr extends AbstractMap {
    public transient Collection A00;
    public transient Set A01;
    public final transient Map A02;
    public final /* synthetic */ AbstractC3759Cdw A03;

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.A02;
        AbstractC3759Cdw abstractC3759Cdw = this.A03;
        Map map2 = abstractC3759Cdw.A01;
        if (map != map2) {
            C3756Cdt c3756Cdt = new C3756Cdt(this);
            while (c3756Cdt.hasNext()) {
                c3756Cdt.next();
                c3756Cdt.remove();
            }
            return;
        }
        Iterator itA10 = BV5.A10(map2);
        while (itA10.hasNext()) {
            ((Collection) itA10.next()).clear();
        }
        map2.clear();
        abstractC3759Cdw.A00 = 0;
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
        C3755Cds c3755Cds = new C3755Cds(this);
        this.A01 = c3755Cds;
        return c3755Cds;
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
        AbstractC3759Cdw abstractC3759Cdw = this.A03;
        Set set = ((AbstractC3753Cdq) abstractC3759Cdw).A01;
        if (set != null) {
            return set;
        }
        C3757Cdu c3757Cdu = new C3757Cdu(abstractC3759Cdw, abstractC3759Cdw.A01);
        ((AbstractC3753Cdq) abstractC3759Cdw).A01 = c3757Cdu;
        return c3757Cdu;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.A02.remove(obj);
        if (collection == null) {
            return null;
        }
        AbstractC3759Cdw abstractC3759Cdw = this.A03;
        ArrayList arrayListA11 = C60O.A11(3);
        arrayListA11.addAll(collection);
        abstractC3759Cdw.A00 -= collection.size();
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
        C3068Bwq c3068Bwq = new C3068Bwq(this);
        this.A00 = c3068Bwq;
        return c3068Bwq;
    }

    public C3754Cdr() {
    }

    public C3754Cdr(AbstractC3759Cdw abstractC3759Cdw, Map map) {
        this.A03 = abstractC3759Cdw;
        this.A02 = map;
    }
}
