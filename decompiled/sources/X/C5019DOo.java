package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: X.DOo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5019DOo<K, V> extends AbstractMapBasedMultimap<K, V>.AsMap implements SortedMap<K, Collection<V>> {
    public SortedSet<K> A00;
    public final /* synthetic */ AbstractMapBasedMultimap A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5019DOo(final AbstractMapBasedMultimap this$0, SortedMap<K, Collection<V>> submap) {
        super(this$0, submap);
        this.A01 = this$0;
    }

    @Override // java.util.SortedMap, java.util.Map
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public SortedSet<K> keySet() {
        SortedSet<K> c5020DOp = this.A00;
        if (c5020DOp == null) {
            if (this instanceof C5015DOj) {
                C5015DOj c5015DOj = (C5015DOj) this;
                c5020DOp = new DOl<>(c5015DOj.A00, (NavigableMap) ((SortedMap) c5015DOj.A00));
            } else {
                c5020DOp = new C5020DOp<>(this.A01, (SortedMap) this.A00);
            }
            this.A00 = c5020DOp;
        }
        return c5020DOp;
    }

    @Override // java.util.SortedMap
    public final Comparator<? super K> comparator() {
        return ((SortedMap) this.A00).comparator();
    }

    @Override // java.util.SortedMap
    public final K firstKey() {
        return (K) ((SortedMap) this.A00).firstKey();
    }

    @Override // java.util.SortedMap
    public final SortedMap<K, Collection<V>> headMap(K toKey) {
        return this instanceof C5015DOj ? ((C5015DOj) this).headMap(toKey, false) : new C5019DOo(this.A01, ((SortedMap) this.A00).headMap(toKey));
    }

    @Override // java.util.SortedMap
    public final K lastKey() {
        return (K) ((SortedMap) this.A00).lastKey();
    }

    @Override // java.util.SortedMap
    public final SortedMap<K, Collection<V>> subMap(K fromKey, K toKey) {
        return this instanceof C5015DOj ? ((C5015DOj) this).subMap(fromKey, true, toKey, false) : new C5019DOo(this.A01, ((SortedMap) this.A00).subMap(fromKey, toKey));
    }

    @Override // java.util.SortedMap
    public final SortedMap<K, Collection<V>> tailMap(K fromKey) {
        return this instanceof C5015DOj ? ((C5015DOj) this).tailMap(fromKey, true) : new C5019DOo(this.A01, ((SortedMap) this.A00).tailMap(fromKey));
    }
}
