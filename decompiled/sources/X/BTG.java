package X;

import androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1;
import androidx.collection.MutableSetWrapper$iterator$1$iterator$1;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class BTG implements Iterator, BOA {
    public final int $t;
    public int A00;
    public final Object A01;
    public final Object A02;

    public BTG(AGW<E> agw) {
        this.$t = 1;
        this.A02 = agw;
        this.A00 = -1;
        this.A01 = BL3.A0C(new MutableSetWrapper$iterator$1$iterator$1(agw, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        A3d a3d;
        if (2 - this.$t != 0) {
            return ((Iterator) this.A01).hasNext();
        }
        while (true) {
            int i = this.A00;
            a3d = (A3d) this.A02;
            if (i >= a3d.A01) {
                break;
            }
            Iterator it = (Iterator) this.A01;
            if (!it.hasNext()) {
                break;
            }
            it.next();
            this.A00++;
        }
        return this.A00 < a3d.A00 && ((Iterator) this.A01).hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [E, java.lang.Object] */
    @Override // java.util.Iterator
    public final E next() {
        A3d a3d;
        if (2 - this.$t == 0) {
            while (true) {
                int i = this.A00;
                a3d = (A3d) this.A02;
                if (i >= a3d.A01) {
                    break;
                }
                Iterator it = (Iterator) this.A01;
                if (!it.hasNext()) {
                    break;
                }
                it.next();
                this.A00++;
            }
            int i2 = this.A00;
            if (i2 >= a3d.A00) {
                throw C8j3.A1D();
            }
            this.A00 = i2 + 1;
        }
        return ((Iterator) this.A01).next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        switch (this.$t) {
            case 0:
                int i2 = this.A00;
                i = -1;
                if (i2 != -1) {
                    ((AIQ) this.A02).A00.A06(i2);
                    break;
                } else {
                    return;
                }
            case 1:
                int i3 = this.A00;
                i = -1;
                if (i3 != -1) {
                    ((AGW) this.A02).A00.A07(i3);
                    break;
                } else {
                    return;
                }
            default:
                throw C8j4.A10();
        }
        this.A00 = i;
    }

    public BTG(AIQ<E> aiq) {
        this.$t = 0;
        this.A02 = aiq;
        this.A00 = -1;
        this.A01 = BL3.A0C(new MutableOrderedSetWrapper$iterator$1$iterator$1(aiq, this, null));
    }

    public BTG(A3d<T> a3d) {
        this.$t = 2;
        this.A02 = a3d;
        this.A01 = a3d.A02.iterator();
    }
}
