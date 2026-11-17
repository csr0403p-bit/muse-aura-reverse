package X;

import java.util.ListIterator;

/* loaded from: classes5.dex */
public final class DRG implements ListIterator<String> {
    public ListIterator<String> A00;
    public final /* synthetic */ HwJ A01;

    public DRG(HwJ hwJ, int i) {
        this.A01 = hwJ;
        this.A00 = hwJ.A00.listIterator(i);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.A00.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A00.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.A00.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A00.previousIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(String str) {
        throw C8j3.A17();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw C8j3.A17();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(String str) {
        throw C8j3.A17();
    }
}
