package X;

import android.util.SparseArray;

/* renamed from: X.Dkc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5559Dkc implements InterfaceC6413E4p {
    public final InterfaceC6413E4p A01;
    public final InterfaceC5564Dkh A02;
    public final String A04;
    public final SparseArray<InterfaceC5563Dkg> A00 = BV4.A0B();
    public final C5565Dkj A03 = new C5565Dkj();

    @Override // X.InterfaceC6413E4p
    public final void AAe() {
        this.A01.AAe();
    }

    @Override // X.InterfaceC6413E4p
    public final void AcM(InterfaceC5509Djl interfaceC5509Djl) {
        this.A01.AcM(interfaceC5509Djl);
    }

    @Override // X.InterfaceC6413E4p
    public final InterfaceC5563Dkg AhC(int i, int i2) {
        SparseArray<InterfaceC5563Dkg> sparseArray = this.A00;
        InterfaceC5563Dkg interfaceC5563Dkg = sparseArray.get(i);
        if (interfaceC5563Dkg != null) {
            return interfaceC5563Dkg;
        }
        C5561Dke c5561Dke = new C5561Dke(this.A01.AhC(i, i2), this.A02, this.A03, this.A04, i, i2);
        sparseArray.put(i, c5561Dke);
        return c5561Dke;
    }

    public C5559Dkc(InterfaceC6413E4p interfaceC6413E4p, InterfaceC5564Dkh interfaceC5564Dkh, String str) {
        this.A01 = interfaceC6413E4p;
        this.A02 = interfaceC5564Dkh;
        this.A04 = str;
    }
}
