package X;

import com.google.common.collect.CompactHashMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes5.dex */
public final class DQU<K> extends AbstractSet<K> {
    public final /* synthetic */ CompactHashMap A00;

    public DQU(final CompactHashMap this$0) {
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        CompactHashMap compactHashMap = this.A00;
        Map mapA06 = compactHashMap.A06();
        return mapA06 != null ? BV5.A11(mapA06) : new DQY(compactHashMap);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object o) {
        CompactHashMap compactHashMap = this.A00;
        Map mapA06 = compactHashMap.A06();
        return mapA06 != null ? mapA06.keySet().remove(o) : AnonymousClass006.A1Z(CompactHashMap.A02(compactHashMap, o), CompactHashMap.A09);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A00.size();
    }
}
