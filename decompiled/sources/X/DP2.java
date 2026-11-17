package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Add missing generic type declarations: [E] */
/* loaded from: classes5.dex */
public final class DP2<E> implements Iterator<E> {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public final DP1<E> A04;
    public final E[] A05;
    public final /* synthetic */ DP1 A06;

    public DP2(DP1 dp1, DP1<E> dp12) {
        this.A06 = dp1;
        this.A04 = dp12;
        this.A05 = (E[]) dp12.A02;
        this.A01 = dp12.A00;
        int iA00 = DP1.A00(dp12, -1);
        this.A00 = iA00;
        this.A02 = iA00;
        this.A03 = false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00 >= 0;
    }

    @Override // java.util.Iterator
    public final E next() {
        if (this.A01 != this.A04.A00) {
            throw new ConcurrentModificationException();
        }
        int i = this.A00;
        if (i < 0) {
            throw new NoSuchElementException();
        }
        E[] eArr = this.A05;
        E e = eArr[i];
        if (e == DP1.A03) {
            e = null;
        }
        this.A02 = i;
        this.A03 = true;
        while (true) {
            i++;
            if (i >= eArr.length) {
                i = -1;
                break;
            }
            if (eArr[i] != null) {
                break;
            }
        }
        this.A00 = i;
        return e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.A01;
        DP1<E> dp1 = this.A04;
        if (i != dp1.A00) {
            throw new ConcurrentModificationException();
        }
        if (!this.A03) {
            throw BV4.A0T();
        }
        this.A03 = false;
        E[] eArr = this.A05;
        dp1.remove(eArr[this.A02]);
        this.A01++;
        int i2 = this.A02;
        while (true) {
            if (i2 >= eArr.length) {
                i2 = -1;
                break;
            } else if (eArr[i2] != null) {
                break;
            } else {
                i2++;
            }
        }
        this.A00 = i2;
    }
}
