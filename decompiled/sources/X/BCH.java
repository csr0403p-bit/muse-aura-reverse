package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class BCH implements Iterable, InterfaceC1656Anf, BOA {
    public final int A00;
    public final BBW A01;
    public final int A02;

    public final boolean equals(Object obj) {
        if (obj instanceof BCH) {
            BCH bch = (BCH) obj;
            if (bch.A02 == this.A02 && bch.A00 == this.A00 && bch.A01.equals(this.A01)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.A02 + AnonymousClass005.A0E(this.A01);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        BBW bbw = this.A01;
        if (bbw.A03 != this.A00) {
            throw new ConcurrentModificationException();
        }
        int i = this.A02;
        bbw.A03(i);
        return new BCI(bbw, i + 1, i + bbw.A08[(i * 5) + 3]);
    }

    public BCH(BBW bbw, int i, int i2) {
        this.A01 = bbw;
        this.A02 = i;
        this.A00 = i2;
    }
}
