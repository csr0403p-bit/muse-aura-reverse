package X;

import java.util.Iterator;

/* renamed from: X.ElA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7332ElA<P> implements Iterator<P> {
    public final Iterator<P> A00;
    public final Iterator<P> A01;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00.hasNext() || this.A01.hasNext();
    }

    @Override // java.util.Iterator
    public final P next() {
        Iterator<P> it = this.A00;
        if (!it.hasNext()) {
            it = this.A01;
        }
        return it.next();
    }

    public C7332ElA(Iterator<P> it0, Iterator<P> it1) {
        this.A00 = it0;
        this.A01 = it1;
    }
}
