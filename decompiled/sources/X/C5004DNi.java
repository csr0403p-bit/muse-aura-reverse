package X;

import com.google.common.collect.AbstractMapBasedMultimap;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: X.DNi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5004DNi<V> implements Iterator<V> {
    public final Collection<V> A00;
    public final Iterator<V> A01;
    public final /* synthetic */ DNh A02;

    public C5004DNi(final DNh this$1) {
        this.A02 = this$1;
        Collection<V> collection = this$1.A00;
        this.A00 = collection;
        this.A01 = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public static final void A00(C5004DNi c5004DNi) {
        DNh dNh = c5004DNi.A02;
        dNh.A01();
        if (dNh.A00 != c5004DNi.A00) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A01.remove();
        DNh dNh = this.A02;
        AbstractMapBasedMultimap abstractMapBasedMultimap = dNh.A04;
        abstractMapBasedMultimap.A00--;
        dNh.A02();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        A00(this);
        return this.A01.hasNext();
    }

    @Override // java.util.Iterator
    public final V next() {
        A00(this);
        return this.A01.next();
    }

    public C5004DNi(final DNh this$1, Iterator<V> delegateIterator) {
        this.A02 = this$1;
        this.A00 = this$1.A00;
        this.A01 = delegateIterator;
    }
}
