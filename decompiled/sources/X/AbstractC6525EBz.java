package X;

import android.util.SparseIntArray;

/* renamed from: X.EBz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6525EBz extends EBt<EC0> {
    public final int[] A00;

    public AbstractC6525EBz(EC1 ec1, C7139Egv c7139Egv, InterfaceC3590CVw interfaceC3590CVw) {
        super(ec1, c7139Egv, interfaceC3590CVw);
        SparseIntArray sparseIntArray = c7139Egv.A01;
        this.A00 = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.A00;
            if (i >= iArr.length) {
                this.A01.registerMemoryTrimmable(this);
                return;
            } else {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            }
        }
    }
}
