package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: X.AIv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0942AIv extends C0941AIu implements Iterator, BOA {
    public int A00;
    public E A01;
    public boolean A02;
    public final C0944AIx<E> A03;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0942AIv(C0944AIx<E> c0944AIx) {
        Object obj = c0944AIx.A00;
        C0955AJi<E, C0945AIy> c0955AJi = c0944AIx.A03;
        super(obj, c0955AJi);
        this.A03 = c0944AIx;
        this.A00 = c0955AJi.A00;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [E, java.lang.Object] */
    @Override // X.C0941AIu, java.util.Iterator
    public final E next() {
        if (this.A03.A03.A00 != this.A00) {
            throw new ConcurrentModificationException();
        }
        ?? next = super.next();
        this.A01 = next;
        this.A02 = true;
        return next;
    }
}
