package X;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes5.dex */
public final class DRA extends DRB implements ListIterator {
    public final /* synthetic */ DR8 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DRA(DR8 dr8) {
        super(dr8);
        this.A00 = dr8;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        DR8 dr8 = this.A00;
        boolean zIsEmpty = dr8.isEmpty();
        A00();
        ((ListIterator) this.A01).add(obj);
        dr8.A00.A00++;
        if (zIsEmpty) {
            dr8.A00();
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
    public DRA(DR8 dr8, int i) {
        super(dr8, ((List) ((DR9) dr8).A00).listIterator(i));
        this.A00 = dr8;
    }
}
