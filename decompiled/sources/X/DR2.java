package X;

import com.google.common.collect.MapMakerInternalMap;
import java.util.AbstractCollection;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes5.dex */
public final class DR2<V> extends AbstractCollection<V> {
    public final /* synthetic */ MapMakerInternalMap A00;

    public DR2(final MapMakerInternalMap this$0) {
        this.A00 = this$0;
    }

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
        return new DR3(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.A00.size();
    }
}
