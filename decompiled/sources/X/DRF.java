package X;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class DRF implements Iterator {
    public final Collection A00;
    public final Iterator A01;
    public final /* synthetic */ DRD A02;

    public DRF(DRD drd) {
        this.A02 = drd;
        Collection collection = drd.A00;
        this.A00 = collection;
        this.A01 = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public final void A00() {
        DRD drd = this.A02;
        drd.A01();
        if (drd.A00 != this.A00) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A01.remove();
        DRD drd = this.A02;
        Ce3 ce3 = drd.A04;
        ce3.A00--;
        drd.A02();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        A00();
        return this.A01.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        A00();
        return this.A01.next();
    }

    public DRF(DRD drd, Iterator it) {
        this.A02 = drd;
        this.A00 = drd.A00;
        this.A01 = it;
    }
}
