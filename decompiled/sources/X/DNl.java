package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes5.dex */
public final class DNl<V> extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements Set<V> {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DNl(final AbstractMapBasedMultimap this$0, K key, Set<V> delegate) {
        super(null, this$0, key, delegate);
        this.A00 = this$0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> c) {
        if (c.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zA04 = DNa.A04(c, (Set) this.A00);
        if (!zA04) {
            return zA04;
        }
        int size2 = this.A00.size();
        this.A00.A00 += size2 - size;
        A02();
        return zA04;
    }
}
