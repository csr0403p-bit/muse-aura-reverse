package X;

import com.google.common.collect.MapMakerInternalMap;
import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes5.dex */
public final class DR5<K> extends AbstractSet<K> {
    public final /* synthetic */ MapMakerInternalMap A00;

    public DR5(final MapMakerInternalMap this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
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
    public final Iterator<K> iterator() {
        return new DR4(this.A00);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object o) {
        return AnonymousClass002.A1X(this.A00.remove(o));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }
}
