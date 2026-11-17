package X;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class GN8 extends GNF {
    public final transient GNB A00;
    public final transient GN6 A01;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return AnonymousClass002.A1X(this.A01.get(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.A00.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A01.A03;
    }

    public GN8(GNB gnb, GN6 gn6) {
        this.A01 = gn6;
        this.A00 = gnb;
    }
}
