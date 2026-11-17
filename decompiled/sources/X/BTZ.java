package X;

import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BTZ implements Ht9, G0V {
    public final int $t;
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                BRg bRg = (BRg) this.A01;
                BFM bfm = (BFM) obj;
                Ar0.A01(bfm, (AKH) this.A02, bRg, (G0V) this.A04, (G2k) this.A03, AnonymousClass011.A00(this.A00));
                break;
            case 1:
                B1U.A06((BFM) obj, (B1U) this.A01, this.A02, this.A03, this.A04, AnonymousClass011.A01(this.A00) | 1);
                break;
            default:
                BPW.A02((BFM) obj, (List) this.A01, (List) this.A02, (Set) this.A03, (Set) this.A04, AnonymousClass011.A00(this.A00));
                break;
        }
        return Unit.INSTANCE;
    }

    public BTZ(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.$t = i2;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj4;
        this.A04 = obj3;
        this.A00 = i;
    }
}
