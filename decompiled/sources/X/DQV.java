package X;

import com.google.common.collect.CompactHashMap;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes5.dex */
public final class DQV<V> extends AbstractCollection<V> {
    public final /* synthetic */ CompactHashMap A00;

    public DQV(final CompactHashMap this$0) {
        this.A00 = this$0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.A00.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        CompactHashMap compactHashMap = this.A00;
        Map mapA06 = compactHashMap.A06();
        return mapA06 != null ? BV5.A10(mapA06) : new DQW(compactHashMap);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.A00.size();
    }
}
