package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Add missing generic type declarations: [K] */
/* renamed from: X.DOp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5020DOp<K> extends AbstractMapBasedMultimap<K, V>.KeySet implements SortedSet<K> {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5020DOp(final AbstractMapBasedMultimap this$0, SortedMap<K, Collection<V>> subMap) {
        super(this$0, subMap);
        this.A00 = this$0;
    }

    @Override // java.util.SortedSet
    public final Comparator<? super K> comparator() {
        return ((SortedMap) this.A00).comparator();
    }

    @Override // java.util.SortedSet
    public final K first() {
        return (K) ((SortedMap) this.A00).firstKey();
    }

    @Override // java.util.SortedSet
    public final SortedSet<K> headSet(K toElement) {
        return this instanceof DOl ? ((DOl) this).headSet(toElement, false) : new C5020DOp(this.A00, ((SortedMap) this.A00).headMap(toElement));
    }

    @Override // java.util.SortedSet
    public final K last() {
        return (K) ((SortedMap) this.A00).lastKey();
    }

    @Override // java.util.SortedSet
    public final SortedSet<K> subSet(K fromElement, K toElement) {
        return this instanceof DOl ? ((DOl) this).subSet(fromElement, true, toElement, false) : new C5020DOp(this.A00, ((SortedMap) this.A00).subMap(fromElement, toElement));
    }

    @Override // java.util.SortedSet
    public final SortedSet<K> tailSet(K fromElement) {
        return this instanceof DOl ? ((DOl) this).tailSet(fromElement, true) : new C5020DOp(this.A00, ((SortedMap) this.A00).tailMap(fromElement));
    }
}
