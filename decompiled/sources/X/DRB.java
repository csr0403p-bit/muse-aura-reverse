package X;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class DRB implements Iterator {
    public final Collection A00;
    public final Iterator A01;
    public final /* synthetic */ DR9 A02;

    public DRB(DR9 dr9) {
        this.A02 = dr9;
        Collection collection = dr9.A00;
        this.A00 = collection;
        this.A01 = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public final void A00() {
        DR9 dr9 = this.A02;
        dr9.A01();
        if (dr9.A00 != this.A00) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A01.remove();
        DR9 dr9 = this.A02;
        AbstractC3759Cdw abstractC3759Cdw = dr9.A04;
        abstractC3759Cdw.A00--;
        dr9.A02();
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

    public DRB(DR9 dr9, Iterator it) {
        this.A02 = dr9;
        this.A00 = dr9.A00;
        this.A01 = it;
    }
}
