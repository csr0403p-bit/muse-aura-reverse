package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class DOv<K, V> extends AbstractCollection<Map.Entry<K, V>> {
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        ((C5025DOz) this).A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object o) {
        if (o instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) o;
            AbstractC5024DOu abstractC5024DOu = ((C5025DOz) this).A00;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection<V> collection = abstractC5024DOu.A4n().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object o) {
        if (o instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) o;
            AbstractC5024DOu abstractC5024DOu = ((C5025DOz) this).A00;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection<V> collection = abstractC5024DOu.A4n().get(key);
            if (collection != null && collection.remove(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return ((C5025DOz) this).A00.size();
    }
}
