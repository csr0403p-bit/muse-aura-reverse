package X;

import kotlin.Unit;

/* renamed from: X.8i5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8i5 implements Ht9, G0U {
    public final int $t;
    public final Object A00;

    public C8i5(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String strValueOf;
        String str;
        switch (this.$t) {
            case 0:
                ((HxO) this.A00).AhZ(null);
                break;
            case 1:
                return Boolean.valueOf(AnonymousClass002.A1L(obj instanceof C75V ? 1 : 0));
            case 2:
                C78M c78m = (C78M) this.A00;
                synchronized (c78m.A04) {
                    c78m.A00 = 5;
                    c78m.A02 = null;
                    break;
                }
            case 3:
                ((HoC) this.A00).A5w(null);
                break;
            case 4:
                C07107nn c07107nn = (C07107nn) obj;
                C7384Etj.A0Y(c07107nn, 1);
                Integer num = c07107nn.A00;
                if (num == null) {
                    return "*";
                }
                C9uE c9uE = c07107nn.A01;
                BFU bfu = c9uE instanceof BFU ? (BFU) c9uE : null;
                if (bfu == null || (strValueOf = BFU.A00(bfu, true)) == null) {
                    strValueOf = String.valueOf(c9uE);
                }
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    return strValueOf;
                }
                if (iIntValue == 1) {
                    str = "in ";
                } else {
                    if (iIntValue != 2) {
                        throw C3cG.A0q();
                    }
                    str = "out ";
                }
                return FGI.A0M(str, strValueOf);
            case 5:
                return ((C06857lE) this.A00).A0E(AnonymousClass001.A0F(obj));
            default:
                HtJ htJ = (HtJ) this.A00;
                Unit unit = Unit.INSTANCE;
                htJ.resumeWith(unit);
                return unit;
        }
        return Unit.INSTANCE;
    }
}
