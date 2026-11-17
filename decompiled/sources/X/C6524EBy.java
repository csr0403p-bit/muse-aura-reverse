package X;

import android.util.SparseIntArray;

/* renamed from: X.EBy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6524EBy extends EBt implements InterfaceC6523EBx {
    public final int[] A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6524EBy(EC1 ec1, C7139Egv c7139Egv, InterfaceC3590CVw interfaceC3590CVw) {
        super(ec1, c7139Egv, interfaceC3590CVw);
        AnonymousClass005.A0x(ec1, c7139Egv, interfaceC3590CVw);
        SparseIntArray sparseIntArray = c7139Egv.A01;
        this.A00 = new int[sparseIntArray.size()];
        int size = sparseIntArray.size();
        for (int i = 0; i < size; i++) {
            this.A00[i] = sparseIntArray.keyAt(i);
        }
        this.A01.registerMemoryTrimmable(this);
    }
}
