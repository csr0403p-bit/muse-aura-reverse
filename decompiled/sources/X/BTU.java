package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BTU implements Ht9, G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                BFM bfm = (BFM) obj;
                AbstractC1130Abe.A00((InterfaceC1129Abd) this.A02, bfm, this.A03, this.A04, this.A00, AnonymousClass011.A00(this.A01));
                break;
            case 1:
                BFM bfm2 = (BFM) obj;
                Aej.A00((A4A) this.A03, bfm2, this.A02, (G0V) this.A04, this.A00, AnonymousClass011.A00(this.A01));
                break;
            default:
                BRg bRg = (BRg) this.A02;
                G0U g0u = (G0U) this.A03;
                G0V g0v = (G0V) this.A04;
                int i = this.A00;
                Ar2.A01((BFM) obj, bRg, g0u, g0v, AnonymousClass011.A00(i), this.A01);
                break;
        }
        return Unit.INSTANCE;
    }

    public BTU(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.$t = i3;
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = i;
        this.A04 = obj3;
        this.A01 = i2;
    }
}
