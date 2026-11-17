package X;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes5.dex */
public final class DRE extends DRF implements ListIterator {
    public final /* synthetic */ DRC A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DRE(DRC drc) {
        super(drc);
        this.A00 = drc;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        DRC drc = this.A00;
        boolean zIsEmpty = drc.isEmpty();
        A00();
        ((ListIterator) this.A01).add(obj);
        drc.A00.A00++;
        if (zIsEmpty) {
            drc.A00();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        A00();
        return ((ListIterator) this.A01).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        A00();
        return ((ListIterator) this.A01).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        A00();
        return ((ListIterator) this.A01).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        A00();
        return ((ListIterator) this.A01).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        A00();
        ((ListIterator) this.A01).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DRE(DRC drc, int i) {
        super(drc, ((List) ((DRD) drc).A00).listIterator(i));
        this.A00 = drc;
    }
}
