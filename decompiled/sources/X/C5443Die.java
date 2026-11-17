package X;

import android.util.SparseArray;

/* renamed from: X.Die, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5443Die implements InterfaceC6413E4p, InterfaceC5417DiD {
    public static final C5542DkK A09 = new C5542DkK();
    public InterfaceC5509Djl A00;
    public C6154Dwx[] A01;
    public long A02;
    public InterfaceC5529Dk6 A03;
    public boolean A04;
    public final InterfaceC5458Dit A05;
    public final int A06;
    public final SparseArray<C5570Dko> A07 = BV4.A0B();
    public final C6154Dwx A08;

    @Override // X.InterfaceC6413E4p
    public final void AAe() {
        SparseArray<C5570Dko> sparseArray = this.A07;
        C6154Dwx[] c6154DwxArr = new C6154Dwx[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            C6154Dwx c6154Dwx = sparseArray.valueAt(i).A00;
            C1G.A05(c6154Dwx);
            c6154DwxArr[i] = c6154Dwx;
        }
        this.A01 = c6154DwxArr;
    }

    @Override // X.InterfaceC5417DiD
    public final void ANa(InterfaceC5529Dk6 interfaceC5529Dk6, long j, long j2) {
        this.A03 = interfaceC5529Dk6;
        this.A02 = j2;
        boolean z = this.A04;
        InterfaceC5458Dit interfaceC5458Dit = this.A05;
        if (!z) {
            interfaceC5458Dit.ANb(this);
            if (j != -9223372036854775807L) {
                interfaceC5458Dit.AcL(0L, j);
            }
            this.A04 = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        interfaceC5458Dit.AcL(0L, j);
        int i = 0;
        while (true) {
            SparseArray<C5570Dko> sparseArray = this.A07;
            if (i >= sparseArray.size()) {
                return;
            }
            sparseArray.valueAt(i).A00(interfaceC5529Dk6, j2);
            i++;
        }
    }

    @Override // X.InterfaceC6413E4p
    public final InterfaceC5563Dkg AhC(int i, int i2) {
        SparseArray<C5570Dko> sparseArray = this.A07;
        C5570Dko c5570Dko = sparseArray.get(i);
        if (c5570Dko != null) {
            return c5570Dko;
        }
        C1G.A08(AnonymousClass002.A1Y(this.A01));
        C5570Dko c5570Dko2 = new C5570Dko(i2 == this.A06 ? this.A08 : null, i, i2);
        c5570Dko2.A00(this.A03, this.A02);
        sparseArray.put(i, c5570Dko2);
        return c5570Dko2;
    }

    public C5443Die(C6154Dwx c6154Dwx, InterfaceC5458Dit interfaceC5458Dit, int i) {
        this.A05 = interfaceC5458Dit;
        this.A06 = i;
        this.A08 = c6154Dwx;
    }

    @Override // X.InterfaceC6413E4p
    public final void AcM(InterfaceC5509Djl interfaceC5509Djl) {
        this.A00 = interfaceC5509Djl;
    }
}
