package X;

import java.util.Iterator;

/* renamed from: X.Ezz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7534Ezz implements Iterator, BOA {
    public int A00;
    public int A01;
    public boolean A02;

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    public T A00(int i) {
        return this instanceof DQg ? ((DQg) this).A00.A07(i) : ((C5041DQf) this).A00.A05(i);
    }

    public void A01(int i) {
        (this instanceof DQg ? ((DQg) this).A00 : ((C5041DQf) this).A00).A06(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1T(this.A01, this.A00);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.A02) {
            throw C3cG.A0Q("Call next() before removing an element.");
        }
        int i = this.A01 - 1;
        this.A01 = i;
        A01(i);
        this.A00--;
        this.A02 = false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw C8j3.A1D();
        }
        ?? A00 = A00(this.A01);
        this.A01++;
        this.A02 = true;
        return A00;
    }
}
