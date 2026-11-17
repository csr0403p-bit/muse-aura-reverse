package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.DOm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5017DOm<K, V> extends DOe<K, Collection<V>> {
    public final /* synthetic */ C5016DOk A00;

    public C5017DOm(final C5016DOk this$1) {
        this.A00 = this$1;
    }

    @Override // X.DOe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object o) {
        Set<Map.Entry<K, Collection<V>>> setEntrySet = this.A00.A00.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(o);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
        return new C5018DOn(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object o) {
        Collection<V> collectionRemove;
        if (!contains(o)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) o;
        entry.getClass();
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A00.A01;
        Object key = entry.getKey();
        Map<K, Collection<V>> map = abstractMapBasedMultimap.A01;
        map.getClass();
        try {
            collectionRemove = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            collectionRemove = null;
        }
        Collection<V> collection = collectionRemove;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        abstractMapBasedMultimap.A00 -= size;
        return true;
    }
}
