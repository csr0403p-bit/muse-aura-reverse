package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [V] */
/* loaded from: classes5.dex */
public final class DTH<V> implements Iterator<V> {
    public DTP<K, V> A00;
    public final Iterator<DTP<K, V>> A01;
    public final /* synthetic */ DTL A02;

    public DTH(DTL dtl) {
        this.A02 = dtl;
        this.A01 = BV5.A10(dtl.data);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    @Override // java.util.Iterator
    public final V next() {
        DTP<K, V> dtp = (DTP) this.A01.next();
        this.A00 = dtp;
        return ((DTW) dtp.get()).A01;
    }

    @Override // java.util.Iterator
    public final void remove() {
        DTP<K, V> dtp = this.A00;
        boolean zA1X = AnonymousClass002.A1X(dtp);
        int i = DTL.A04;
        if (!zA1X) {
            throw BV4.A0T();
        }
        this.A02.remove(dtp.key);
        this.A00 = null;
    }
}
