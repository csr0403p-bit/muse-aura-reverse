package X;

import android.util.SparseArray;

/* renamed from: X.Dkb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5558Dkb implements InterfaceC6413E4p {
    public final InterfaceC5564Dkh A00;
    public final SparseArray<InterfaceC5563Dkg> A01 = BV4.A0B();
    public final InterfaceC6413E4p A02;

    @Override // X.InterfaceC6413E4p
    public final void AAe() {
        this.A02.AAe();
    }

    @Override // X.InterfaceC6413E4p
    public final void AcM(InterfaceC5509Djl interfaceC5509Djl) {
        this.A02.AcM(interfaceC5509Djl);
    }

    @Override // X.InterfaceC6413E4p
    public final InterfaceC5563Dkg AhC(int i, int i2) {
        SparseArray<InterfaceC5563Dkg> sparseArray = this.A01;
        InterfaceC5563Dkg interfaceC5563Dkg = sparseArray.get(i);
        if (interfaceC5563Dkg != null) {
            return interfaceC5563Dkg;
        }
        C5560Dkd c5560Dkd = new C5560Dkd(this.A02.AhC(i, i2), this, i, i2);
        sparseArray.put(i, c5560Dkd);
        return c5560Dkd;
    }

    public C5558Dkb(InterfaceC6413E4p interfaceC6413E4p, InterfaceC5564Dkh interfaceC5564Dkh) {
        this.A02 = interfaceC6413E4p;
        this.A00 = interfaceC5564Dkh;
    }
}
