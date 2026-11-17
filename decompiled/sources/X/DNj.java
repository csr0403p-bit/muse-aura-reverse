package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes5.dex */
public final class DNj<V> extends AbstractMapBasedMultimap<K, V>.WrappedCollection.WrappedIterator implements ListIterator<V> {
    public final /* synthetic */ DNk A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DNj(final DNk this$1) {
        super(this$1);
        this.A00 = this$1;
    }

    @Override // java.util.ListIterator
    public final void add(V value) {
        DNk dNk = this.A00;
        boolean zIsEmpty = dNk.isEmpty();
        C5004DNi.A00(this);
        ((ListIterator) this.A01).add(value);
        dNk.A00.A00++;
        if (zIsEmpty) {
            dNk.A00();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        C5004DNi.A00(this);
        return ((ListIterator) this.A01).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        C5004DNi.A00(this);
        return ((ListIterator) this.A01).nextIndex();
    }

    @Override // java.util.ListIterator
    public final V previous() {
        C5004DNi.A00(this);
        return (V) ((ListIterator) this.A01).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        C5004DNi.A00(this);
        return ((ListIterator) this.A01).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(V value) {
        C5004DNi.A00(this);
        ((ListIterator) this.A01).set(value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DNj(final DNk this$1, int index) {
        super(this$1, ((List) this$1.A00).listIterator(index));
        this.A00 = this$1;
    }
}
