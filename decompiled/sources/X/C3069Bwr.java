package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Bwr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3069Bwr extends AbstractCollection {
    public final Map A00;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C7450EwS(AnonymousClass002.A0n(this.A00));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return super.removeAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            HashSet hashSetA13 = C60O.A13();
            Map map = this.A00;
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                BV8.A1V(hashSetA13, collection, itA0n);
            }
            return map.keySet().removeAll(hashSetA13);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            HashSet hashSetA13 = C60O.A13();
            Map map = this.A00;
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                BV8.A1V(hashSetA13, collection, itA0n);
            }
            return map.keySet().retainAll(hashSetA13);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.A00.size();
    }

    public C3069Bwr(Map map) {
        this.A00 = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            Map map = this.A00;
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                if (AbstractC10554Hsh.A00(obj, entryA0l.getValue())) {
                    map.remove(entryA0l.getKey());
                    return true;
                }
            }
            return false;
        }
    }
}
