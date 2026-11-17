package X;

import android.util.SparseArray;

/* renamed from: X.Dxf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6195Dxf implements InterfaceC6413E4p {
    public boolean A00;
    public final SparseArray<C6170DxD> A01 = BV4.A0B();
    public final InterfaceC6413E4p A02;
    public final InterfaceC5885DrL A03;

    @Override // X.InterfaceC6413E4p
    public final InterfaceC5563Dkg AhC(int i, int i2) {
        if (i2 != 3) {
            this.A00 = true;
            return this.A02.AhC(i, i2);
        }
        SparseArray<C6170DxD> sparseArray = this.A01;
        C6170DxD c6170DxD = sparseArray.get(i);
        if (c6170DxD != null) {
            return c6170DxD;
        }
        C6170DxD c6170DxD2 = new C6170DxD(this.A02.AhC(i, i2), this.A03);
        sparseArray.put(i, c6170DxD2);
        return c6170DxD2;
    }

    @Override // X.InterfaceC6413E4p
    public final void AAe() {
        this.A02.AAe();
        if (!this.A00) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray<C6170DxD> sparseArray = this.A01;
            if (i >= sparseArray.size()) {
                return;
            }
            sparseArray.valueAt(i).A01 = true;
            i++;
        }
    }

    @Override // X.InterfaceC6413E4p
    public final void AcM(InterfaceC5509Djl interfaceC5509Djl) {
        this.A02.AcM(interfaceC5509Djl);
    }

    public C6195Dxf(InterfaceC6413E4p interfaceC6413E4p, InterfaceC5885DrL interfaceC5885DrL) {
        this.A02 = interfaceC6413E4p;
        this.A03 = interfaceC5885DrL;
    }
}
