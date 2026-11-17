package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes5.dex */
public class DOh<K, V> extends DOd<K, Collection<V>> {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DOh(final AbstractMapBasedMultimap this$0, final Map<K, Collection<V>> subMap) {
        super(subMap);
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> c) {
        return super.A00.keySet().containsAll(c);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object object) {
        return this == object || super.A00.keySet().equals(object);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return super.A00.keySet().hashCode();
    }

    @Override // X.DOd, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new F5P(this, AnonymousClass002.A0n(super.A00));
    }

    @Override // X.DOd, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object key) {
        Collection collection = (Collection) super.A00.remove(key);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        this.A00.A00 -= size;
        return size > 0;
    }

    @Override // X.DOd, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator<K> it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
