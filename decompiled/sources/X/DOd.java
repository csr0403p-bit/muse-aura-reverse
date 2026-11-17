package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public class DOd<K, V> extends AbstractC5014DOf<K> {
    public final Map<K, V> A00;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object o) {
        return this.A00.containsKey(o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new F4E(AnonymousClass002.A0n(this.A00), 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }

    public DOd(Map<K, V> map) {
        map.getClass();
        this.A00 = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object o) {
        if (!contains(o)) {
            return false;
        }
        this.A00.remove(o);
        return true;
    }
}
