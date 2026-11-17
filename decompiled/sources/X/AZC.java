package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AZC implements Ht9, G0W {
    public final int $t;

    public AZC(int i) {
        this.$t = i;
    }

    @Override // X.G0W
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        G0V g0v = (G0V) obj;
        BFM bfm = (BFM) obj2;
        int iA0F = AnonymousClass001.A0F(obj3);
        if ((iA0F & 6) == 0) {
            iA0F |= AnonymousClass004.A0T(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0F), bfm, iA0F)) {
            AnonymousClass003.A13(bfm, g0v, iA0F);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }
}
