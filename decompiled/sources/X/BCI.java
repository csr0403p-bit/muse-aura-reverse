package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class BCI implements Iterator, BOA {
    public int A00;
    public final int A01;
    public final BBW A02;
    public final int A03;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1T(this.A00, this.A03);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        BBW bbw = this.A02;
        int i = bbw.A03;
        int i2 = this.A01;
        if (i != i2) {
            throw new ConcurrentModificationException();
        }
        int i3 = this.A00;
        this.A00 = bbw.A08[(i3 * 5) + 3] + i3;
        return new BCH(bbw, i3, i2);
    }

    public BCI(BBW bbw, int i, int i2) {
        this.A02 = bbw;
        this.A03 = i2;
        this.A00 = i;
        this.A01 = bbw.A03;
        if (bbw.A07) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j4.A10();
    }
}
