package X;

import com.google.common.base.Objects;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class DOe<K, V> extends AbstractC5014DOf<Map.Entry<K, V>> {
    private final Map<K, V> A00() {
        return this instanceof C5021DOq ? ((C5021DOq) this).A00 : ((C5017DOm) this).A00;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object o) {
        V v;
        if (!(o instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) o;
        Object key = entry.getKey();
        Map<K, V> mapA00 = A00();
        mapA00.getClass();
        try {
            v = mapA00.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            v = null;
        }
        if (Objects.equal(v, entry.getValue())) {
            return v != null || mapA00.containsKey(key);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        A00().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return A00().isEmpty();
    }

    @Override // X.AbstractC5014DOf, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> c) {
        try {
            c.getClass();
            return super.removeAll(c);
        } catch (UnsupportedOperationException unused) {
            Iterator<?> it = c.iterator();
            boolean zRemove = false;
            while (it.hasNext()) {
                zRemove |= remove(it.next());
            }
            return zRemove;
        }
    }

    @Override // X.AbstractC5014DOf, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> c) {
        int iA00;
        try {
            c.getClass();
            return super.retainAll(c);
        } catch (UnsupportedOperationException unused) {
            int size = c.size();
            if (size < 3) {
                AbstractC3830CfJ.A00(size, "expectedSize");
                iA00 = size + 1;
            } else {
                iA00 = BV8.A00(size);
            }
            HashSet hashSet = new HashSet(iA00);
            Iterator<?> it = c.iterator();
            while (it.hasNext()) {
                BV8.A1U(this, hashSet, it);
            }
            return A00().keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return A00().size();
    }
}
