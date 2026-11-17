package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.DOq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5021DOq<K, V> extends DOe<K, Collection<V>> {
    public final /* synthetic */ C5022DOr A00;

    public C5021DOq(final C5022DOr this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
        return new F4F(new F5N(this, 4), this.A00.A00.keySet().iterator(), 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object o) {
        if (!contains(o)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) o;
        entry.getClass();
        C5022DOr c5022DOr = this.A00;
        c5022DOr.A00.keySet().remove(entry.getKey());
        return true;
    }
}
