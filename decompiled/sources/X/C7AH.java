package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [R] */
/* renamed from: X.7AH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7AH<R> implements Iterator<R>, BOA {
    public final Iterator<T> A00;
    public final /* synthetic */ C7AG<T, R> A01;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException(C8j2.A00(0));
    }

    public C7AH(C7AG<T, R> c7ag) {
        this.A01 = c7ag;
        this.A00 = c7ag.A01.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    @Override // java.util.Iterator
    public final R next() {
        return this.A01.A00.invoke(this.A00.next());
    }
}
