package X;

import com.google.common.collect.MapMakerInternalMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes5.dex */
public final class DUV<K, V> extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ MapMakerInternalMap A00;

    public DUV(final MapMakerInternalMap this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object o) {
        Map.Entry entry;
        Object key;
        MapMakerInternalMap mapMakerInternalMap;
        V v;
        return (o instanceof Map.Entry) && (key = (entry = (Map.Entry) o).getKey()) != null && (v = (mapMakerInternalMap = this.A00).get(key)) != null && mapMakerInternalMap.A05.AiG().A00().equivalent(entry.getValue(), v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new DR6(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object o) {
        Map.Entry entry;
        Object key;
        return (o instanceof Map.Entry) && (key = (entry = (Map.Entry) o).getKey()) != null && this.A00.remove(key, entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }
}
