package X;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMapBasedMultiset;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class DQ4<T> implements Iterator<T> {
    public int A00;
    public int A01;
    public int A02;
    public final /* synthetic */ AbstractMapBasedMultiset A03;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DQ4(final com.google.common.collect.AbstractMapBasedMultiset r4) {
        /*
            r3 = this;
            r3.A03 = r4
            r3.<init>()
            X.DPt<E> r2 = r4.A01
            boolean r0 = r2 instanceof X.DQ3
            if (r0 == 0) goto L1e
            r0 = r2
            X.DQ3 r0 = (X.DQ3) r0
            int r1 = r0.A00
            r0 = -2
            if (r1 != r0) goto L14
        L13:
            r1 = -1
        L14:
            r3.A00 = r1
            r0 = -1
            r3.A02 = r0
            int r0 = r2.A01
            r3.A01 = r0
            return
        L1e:
            int r0 = r2.A02
            r1 = 0
            if (r0 != 0) goto L14
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DQ4.<init>(com.google.common.collect.AbstractMapBasedMultiset):void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A03.A01.A01 == this.A01) {
            return C8j3.A1Q(this.A00);
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMapBasedMultiset abstractMapBasedMultiset = this.A03;
        if (abstractMapBasedMultiset.A01.A01 != this.A01) {
            throw new ConcurrentModificationException();
        }
        Preconditions.checkState(AnonymousClass002.A1P(this.A02, -1), "no calls to next() since the last call to remove()");
        abstractMapBasedMultiset.A00 -= abstractMapBasedMultiset.A01.A03(this.A02);
        C5034DPt<E> c5034DPt = abstractMapBasedMultiset.A01;
        int i = this.A00;
        int i2 = this.A02;
        if (!(c5034DPt instanceof DQ3)) {
            i--;
        } else if (i == c5034DPt.A02) {
            i = i2;
        }
        this.A00 = i;
        this.A02 = -1;
        this.A01 = c5034DPt.A01;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t;
        if (!hasNext()) {
            throw C8j3.A1D();
        }
        int i = this.A00;
        if (this instanceof DQ6) {
            C5034DPt<E> c5034DPt = ((DQ6) this).A00.A01;
            Preconditions.checkElementIndex(i, c5034DPt.A02);
            t = (T) new C5030DPp(c5034DPt, i);
        } else {
            C5034DPt<E> c5034DPt2 = ((C5033DPs) this).A00.A01;
            Preconditions.checkElementIndex(i, c5034DPt2.A02);
            t = (T) c5034DPt2.A07[i];
        }
        int i2 = this.A00;
        this.A02 = i2;
        this.A00 = this.A03.A01.A02(i2);
        return t;
    }
}
