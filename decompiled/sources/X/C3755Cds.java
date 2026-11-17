package X;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Cds, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3755Cds extends AbstractC7401Euf {
    public final /* synthetic */ C3754Cdr A00;

    public C3755Cds(C3754Cdr c3754Cdr) {
        this.A00 = c3754Cdr;
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
        return new C3756Cdt(this.A00);
    }

    @Override // X.AbstractC7401Euf, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return F1I.A00(collection, this);
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

    @Override // X.AbstractC7401Euf, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
            AbstractC3759Cdw abstractC3759Cdw = this.A00.A03;
            Set c3757Cdu = ((AbstractC3753Cdq) abstractC3759Cdw).A01;
            if (c3757Cdu == null) {
                c3757Cdu = new C3757Cdu(abstractC3759Cdw, abstractC3759Cdw.A01);
                ((AbstractC3753Cdq) abstractC3759Cdw).A01 = c3757Cdu;
            }
            return c3757Cdu.retainAll(hashSet);
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
        AbstractC3759Cdw abstractC3759Cdw = this.A00.A03;
        Object key = entry.getKey();
        Map map = abstractC3759Cdw.A01;
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
        abstractC3759Cdw.A00 -= size;
        return true;
    }

    public C3755Cds() {
    }
}
