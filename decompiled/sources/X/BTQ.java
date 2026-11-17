package X;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class BTQ implements Iterator, BOA {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public final Object A03;

    public BTQ(B3i<T> b3i) {
        this.$t = 0;
        this.A03 = b3i;
        this.A01 = b3i.A01.iterator();
        this.A00 = -1;
    }

    private final void A00() {
        int i;
        while (true) {
            Iterator it = (Iterator) this.A01;
            if (!it.hasNext()) {
                i = 0;
                break;
            }
            Object next = it.next();
            B3i b3i = (B3i) this.A03;
            if (b3i.A00.invoke(next).booleanValue() == b3i.A02) {
                this.A02 = next;
                i = 1;
                break;
            }
        }
        this.A00 = i;
    }

    private final boolean A01() {
        Iterator it;
        Iterator it2 = (Iterator) this.A01;
        if (it2 == null || !it2.hasNext()) {
            do {
                Iterator it3 = (Iterator) this.A02;
                if (!it3.hasNext()) {
                    this.A00 = 2;
                    this.A01 = null;
                    return false;
                }
                Object next = it3.next();
                AGX agx = (AGX) this.A03;
                it = (Iterator) agx.A00.invoke(agx.A01.invoke(next));
            } while (!it.hasNext());
            this.A01 = it;
        }
        this.A00 = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.$t == 0) {
            if (this.A00 == -1) {
                A00();
            }
            return this.A00 == 1;
        }
        int i = this.A00;
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return A01();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    @Override // java.util.Iterator
    public final T next() {
        if (this.$t == 0) {
            if (this.A00 == -1) {
                A00();
            }
            if (this.A00 == 0) {
                throw C8j3.A1D();
            }
            ?? r2 = this.A02;
            this.A02 = null;
            this.A00 = -1;
            return r2;
        }
        int i = this.A00;
        if (i == 2) {
            throw C8j3.A1D();
        }
        if (i == 0 && !A01()) {
            throw C8j3.A1D();
        }
        this.A00 = 0;
        Iterator it = (Iterator) this.A01;
        C7384Etj.A0X(it);
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.$t;
        throw C8j4.A10();
    }

    public BTQ(AGX<T, R, E> agx) {
        this.$t = 1;
        this.A03 = agx;
        this.A02 = agx.A02.iterator();
    }
}
