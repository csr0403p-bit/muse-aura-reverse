package X;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes5.dex */
public final class DUU<K, V> implements Iterator<Map.Entry<K, V>> {
    public int A00 = -1;
    public Iterator<Map.Entry<K, V>> A01;
    public boolean A02;
    public final /* synthetic */ DUQ A03;

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.A02 = true;
        int i = this.A00 + 1;
        this.A00 = i;
        DUQ duq = this.A03;
        if (i < duq.A00.size()) {
            return duq.A00.get(this.A00);
        }
        Iterator<Map.Entry<K, V>> itA0n = this.A01;
        if (itA0n == null) {
            itA0n = AnonymousClass002.A0n(duq.A01);
            this.A01 = itA0n;
        }
        return itA0n.next();
    }

    public DUU(DUQ duq) {
        this.A03 = duq;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.A00 + 1;
        DUQ duq = this.A03;
        if (i >= duq.A00.size()) {
            if (duq.A01.isEmpty()) {
                return false;
            }
            Iterator<Map.Entry<K, V>> itA0n = this.A01;
            if (itA0n == null) {
                itA0n = AnonymousClass002.A0n(duq.A01);
                this.A01 = itA0n;
            }
            if (!itA0n.hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.A02) {
            throw C3cG.A0Q("remove() was called before next()");
        }
        this.A02 = false;
        DUQ duq = this.A03;
        DUQ.A03(duq);
        if (this.A00 < duq.A00.size()) {
            int i = this.A00;
            this.A00 = i - 1;
            DUQ.A01(duq, i);
        } else {
            Iterator<Map.Entry<K, V>> itA0n = this.A01;
            if (itA0n == null) {
                itA0n = AnonymousClass002.A0n(duq.A01);
                this.A01 = itA0n;
            }
            itA0n.remove();
        }
    }
}
