package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: X.DNg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5003DNg<V> extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements SortedSet<V> {
    public final /* synthetic */ AbstractMapBasedMultimap A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/SortedSet<TV;>;Lcom/google/common/collect/AbstractMapBasedMultimap<TK;TV;>.WrappedCollection;)V */
    public C5003DNg(final DNh this$0, AbstractMapBasedMultimap key, Object delegate, SortedSet ancestor) {
        super(this$0, key, delegate, ancestor);
        this.A00 = key;
    }

    @Override // java.util.SortedSet
    public final Comparator<? super V> comparator() {
        return ((SortedSet) this.A00).comparator();
    }

    @Override // java.util.SortedSet
    public final V first() {
        A01();
        return (V) ((SortedSet) this.A00).first();
    }

    @Override // java.util.SortedSet
    public final SortedSet<V> headSet(V toElement) {
        A01();
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A00;
        K k = this.A02;
        SortedSet sortedSetHeadSet = ((SortedSet) this.A00).headSet(toElement);
        DNh dNh = this.A01;
        if (dNh == null) {
            dNh = this;
        }
        return new C5003DNg(dNh, abstractMapBasedMultimap, k, sortedSetHeadSet);
    }

    @Override // java.util.SortedSet
    public final V last() {
        A01();
        return (V) ((SortedSet) this.A00).last();
    }

    @Override // java.util.SortedSet
    public final SortedSet<V> subSet(V fromElement, V toElement) {
        A01();
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A00;
        K k = this.A02;
        SortedSet sortedSetSubSet = ((SortedSet) this.A00).subSet(fromElement, toElement);
        DNh dNh = this.A01;
        if (dNh == null) {
            dNh = this;
        }
        return new C5003DNg(dNh, abstractMapBasedMultimap, k, sortedSetSubSet);
    }

    @Override // java.util.SortedSet
    public final SortedSet<V> tailSet(V fromElement) {
        A01();
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.A00;
        K k = this.A02;
        SortedSet sortedSetTailSet = ((SortedSet) this.A00).tailSet(fromElement);
        DNh dNh = this.A01;
        if (dNh == null) {
            dNh = this;
        }
        return new C5003DNg(dNh, abstractMapBasedMultimap, k, sortedSetTailSet);
    }
}
