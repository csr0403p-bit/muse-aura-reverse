package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.AMq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0985AMq<K, V> {
    public int A00;
    public Map.Entry<? extends K, ? extends V> A01;
    public Map.Entry<? extends K, ? extends V> A02;
    public final C0981AMm<K, V> A03;
    public final Iterator<Map.Entry<K, V>> A04;

    public final void A00() {
        this.A01 = this.A02;
        Iterator<Map.Entry<K, V>> it = this.A04;
        this.A02 = it.hasNext() ? C3cH.A0l(it) : null;
    }

    public final boolean hasNext() {
        return AnonymousClass002.A1X(this.A02);
    }

    public final void remove() {
        C0981AMm<K, V> c0981AMm = this.A03;
        if (((C0987AMs) BDh.A07(c0981AMm, c0981AMm.A00)).A00 != this.A00) {
            throw new ConcurrentModificationException();
        }
        Map.Entry<? extends K, ? extends V> entry = this.A01;
        if (entry == null) {
            throw new IllegalStateException();
        }
        c0981AMm.remove(entry.getKey());
        this.A01 = null;
        this.A00 = ((C0987AMs) BDh.A07(c0981AMm, c0981AMm.A00)).A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC0985AMq(C0981AMm<K, V> c0981AMm, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        this.A03 = c0981AMm;
        this.A04 = it;
        this.A00 = ((C0987AMs) BDh.A07(c0981AMm, c0981AMm.A00)).A00;
        A00();
    }
}
