package X;

import com.google.common.base.Objects;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.DMo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C4998DMo<K, V> extends AbstractCollection<V> {
    public final Map<K, V> A00;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object o) {
        return this.A00.containsValue(o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new F4E(AnonymousClass002.A0n(this.A00), 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.A00.size();
    }

    public C4998DMo(Map<K, V> map) {
        this.A00 = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object o) {
        try {
            return super.remove(o);
        } catch (UnsupportedOperationException unused) {
            Map<K, V> map = this.A00;
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                if (Objects.equal(o, entryA0l.getValue())) {
                    map.remove(entryA0l.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> c) {
        try {
            c.getClass();
            return super.removeAll(c);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSetA13 = C60O.A13();
            Map<K, V> map = this.A00;
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                BV8.A1V(hashSetA13, c, itA0n);
            }
            return map.keySet().removeAll(hashSetA13);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> c) {
        try {
            c.getClass();
            return super.retainAll(c);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSetA13 = C60O.A13();
            Map<K, V> map = this.A00;
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                BV8.A1V(hashSetA13, c, itA0n);
            }
            return map.keySet().retainAll(hashSetA13);
        }
    }
}
