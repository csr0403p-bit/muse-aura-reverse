package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.DaC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5128DaC extends Db1<Da6> {
    public final /* synthetic */ C5130DaE A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5128DaC(C5130DaE c5130DaE, int i) {
        super(i);
        this.A00 = c5130DaE;
    }

    @Override // X.InterfaceC5172Db5
    public final int[] AcT() {
        C5125Da9 c5125Da9 = new C5125Da9();
        C5130DaE c5130DaE = this.A00;
        AtomicReferenceFieldUpdater<C5130DaE, AbstractC5140DaU> atomicReferenceFieldUpdater = C5130DaE.A07;
        DZy dZy = c5130DaE.A04;
        int iA00 = DZx.A00(dZy, 8);
        int[] iArr = new int[iA00];
        for (int i = 0; i < iA00; i++) {
            C5125Da9 c5125Da92 = c5125Da9;
            int iA07 = dZy.A07(8);
            if (iA07 != 0) {
                DZx.A04(dZy, c5125Da9, iA07, i);
            } else {
                c5125Da92 = null;
            }
            iArr[i] = DZx.A02(c5125Da92, 4);
        }
        return iArr;
    }
}
