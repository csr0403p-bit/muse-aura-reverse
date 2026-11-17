package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes5.dex */
public final class DTC<K, V> extends E8S<K, V>.AbstractCacheSet<Map.Entry<K, V>> {
    public final /* synthetic */ E8S A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DTC(final E8S this$0) {
        super(this$0);
        this.A00 = this$0;
    }

    public final boolean contains(Object o) {
        Map.Entry entry;
        Object key;
        E8S e8s;
        V v;
        return (o instanceof Map.Entry) && (key = (entry = (Map.Entry) o).getKey()) != null && (v = (e8s = this.A00).get(key)) != null && e8s.A0A.equivalent(entry.getValue(), v);
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return new DTB(this.A00);
    }

    public final boolean remove(Object o) {
        Map.Entry entry;
        Object key;
        return (o instanceof Map.Entry) && (key = (entry = (Map.Entry) o).getKey()) != null && this.A00.remove(key, entry.getValue());
    }
}
