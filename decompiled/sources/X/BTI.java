package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BTI implements Ht9, G0V {
    public final int $t;
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public BTI(Object obj, int i, Object obj2, int i2, int i3) {
        this.$t = i3;
        this.A02 = obj;
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = i2;
    }

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$t;
        Object obj3 = this.A02;
        switch (i) {
            case 0:
                BFM bfm = (BFM) obj;
                ((AdR) obj3).A2d(bfm, this.A03, this.A00, AnonymousClass011.A00(this.A01));
                break;
            case 1:
                BFM bfm2 = (BFM) obj;
                ((AdP) obj3).A2d(bfm2, this.A03, this.A00, AnonymousClass011.A00(this.A01));
                break;
            case 2:
                BFM bfm3 = (BFM) obj;
                ((C1168AdQ) obj3).A2d(bfm3, this.A03, this.A00, AnonymousClass011.A00(this.A01));
                break;
            case 3:
                G0V g0v = (G0V) this.A03;
                int i2 = this.A00;
                Ar2.A02((BRg) obj3, g0v, (BFM) obj, AnonymousClass011.A00(i2), this.A01);
                break;
            case 4:
                G0V g0v2 = (G0V) this.A03;
                int i3 = this.A00;
                Ar1.A01((BRg) obj3, g0v2, (BFM) obj, AnonymousClass011.A00(i3), this.A01);
                break;
            default:
                C76X c76x = (C76X) this.A03;
                int i4 = this.A00;
                BFM bfm4 = (BFM) obj;
                C72k.A00(bfm4, (C76B) obj3, c76x, AnonymousClass011.A00(i4), this.A01);
                break;
        }
        return Unit.INSTANCE;
    }
}
