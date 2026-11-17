package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.DaD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5129DaD extends Db1 {
    public final /* synthetic */ C5130DaE A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5129DaD(C5130DaE c5130DaE, int i) {
        super(i);
        this.A00 = c5130DaE;
    }

    @Override // X.InterfaceC5172Db5
    public final int[] AcT() {
        Da3 da3 = new Da3();
        C5130DaE c5130DaE = this.A00;
        AtomicReferenceFieldUpdater<C5130DaE, AbstractC5140DaU> atomicReferenceFieldUpdater = C5130DaE.A07;
        DZy dZy = c5130DaE.A04;
        int iA00 = DZx.A00(dZy, 10);
        int[] iArr = new int[iA00];
        for (int i = 0; i < iA00; i++) {
            Da3 da32 = da3;
            int iA07 = dZy.A07(10);
            if (iA07 != 0) {
                DZx.A04(dZy, da3, iA07, i);
            } else {
                da32 = null;
            }
            iArr[i] = DZx.A02(da32, 6);
        }
        return iArr;
    }
}
