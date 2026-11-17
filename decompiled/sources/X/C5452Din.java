package X;

import android.util.SparseArray;

/* renamed from: X.Din, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5452Din<V> {
    public int A00;
    public final SparseArray<V> A01;
    public final InterfaceC5344Dgn<V> A02;

    public final V A00(int i) {
        SparseArray<V> sparseArray;
        int i2 = this.A00;
        if (i2 == -1) {
            i2 = 0;
            this.A00 = 0;
        }
        while (i2 > 0 && i < this.A01.keyAt(i2)) {
            i2 = this.A00 - 1;
            this.A00 = i2;
        }
        while (true) {
            int i3 = this.A00;
            sparseArray = this.A01;
            if (i3 >= sparseArray.size() - 1 || i < sparseArray.keyAt(i3 + 1)) {
                break;
            }
            this.A00++;
        }
        return sparseArray.valueAt(this.A00);
    }

    public C5452Din(InterfaceC5344Dgn<V> interfaceC5344Dgn) {
        this.A01 = BV4.A0B();
        this.A02 = interfaceC5344Dgn;
        this.A00 = -1;
    }

    public C5452Din() {
        this(new C7575F4o(1));
    }
}
