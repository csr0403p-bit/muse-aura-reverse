package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [K] */
/* loaded from: classes5.dex */
public final class DTF<K> implements Iterator<K> {
    public K A00;
    public final Iterator<K> A01;
    public final /* synthetic */ DTL A02;

    public DTF(DTL dtl) {
        this.A02 = dtl;
        this.A01 = BV5.A11(dtl.data);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    @Override // java.util.Iterator
    public final K next() {
        K next = this.A01.next();
        this.A00 = next;
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        K k = this.A00;
        boolean zA1X = AnonymousClass002.A1X(k);
        int i = DTL.A04;
        if (!zA1X) {
            throw BV4.A0T();
        }
        this.A02.remove(k);
        this.A00 = null;
    }
}
