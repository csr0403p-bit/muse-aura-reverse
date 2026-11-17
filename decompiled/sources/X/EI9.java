package X;

/* loaded from: classes5.dex */
public final class EI9 implements InterfaceC6578EHw {
    public final /* synthetic */ EI6 A00;

    public EI9(EI6 ei6) {
        this.A00 = ei6;
    }

    @Override // X.InterfaceC6578EHw
    public final void A5H(EIB eib) {
        EI6 ei6 = this.A00;
        int length = ei6.A02.length;
        for (int i = 1; i < length; i++) {
            int i2 = ei6.A02[i];
            if (i2 == 1) {
                eib.A5C(i, ei6.A03[i]);
            } else if (i2 == 2) {
                eib.A5B(i, ei6.A01[i]);
            } else if (i2 == 3) {
                String str = ei6.A04[i];
                C7384Etj.A0X(str);
                eib.A5E(i, str);
            } else if (i2 == 4) {
                byte[] bArr = ei6.A05[i];
                C7384Etj.A0X(bArr);
                eib.A5A(i, bArr);
            } else if (i2 == 5) {
                eib.A5D(i);
            }
        }
    }

    @Override // X.InterfaceC6578EHw
    public final String AKr() {
        return ((EIA) this.A00).A02;
    }
}
