package X;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Cdz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3762Cdz extends AbstractC7400Eue {
    public final /* synthetic */ C3761Cdy A00;

    public C3762Cdz(C3761Cdy c3761Cdy) {
        this.A00 = c3761Cdy;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.A00.A02.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C3763Ce0(this.A00);
    }

    @Override // X.AbstractC7400Eue, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return F1H.A00(collection, this);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean zRemove = false;
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
            return zRemove;
        }
    }

    @Override // X.AbstractC7400Eue, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int iA00;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size >= 3) {
                iA00 = BV8.A00(size);
            } else {
                if (size < 0) {
                    throw C60O.A0i(FGI.A0S("expectedSize", " cannot be negative but was: ", size));
                }
                iA00 = size + 1;
            }
            HashSet hashSet = new HashSet(iA00);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                BV8.A1U(this, hashSet, it);
            }
            Ce3 ce3 = this.A00.A03;
            Set c3764Ce1 = ((AbstractC3760Cdx) ce3).A01;
            if (c3764Ce1 == null) {
                c3764Ce1 = new C3764Ce1(ce3, ce3.A01);
                ((AbstractC3760Cdx) ce3).A01 = c3764Ce1;
            }
            return c3764Ce1.retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object objRemove;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        Ce3 ce3 = this.A00.A03;
        Object key = entry.getKey();
        Map map = ce3.A01;
        map.getClass();
        try {
            objRemove = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        ce3.A00 -= size;
        return true;
    }

    public C3762Cdz() {
    }
}
