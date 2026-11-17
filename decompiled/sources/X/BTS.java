package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BTS implements Ht9, G0U {
    public final int $t;
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    @Override // X.G0U
    public final Object invoke(Object obj) {
        AZE aze;
        AYU ayu;
        int iRound;
        float f;
        float f2;
        switch (this.$t) {
            case 0:
                C1906AtR c1906AtR = (C1906AtR) this.A01;
                C3TF c3tf = (C3TF) this.A02;
                aze = (AZE) this.A03;
                int i = this.A00;
                ayu = (AYU) obj;
                int i2 = c1906AtR.A00;
                C1YX c1yx = c1906AtR.A02;
                C1924Atl c1924AtlInvoke = c1906AtR.A03.invoke();
                C1958Aux c1958Aux = c1924AtlInvoke != null ? c1924AtlInvoke.A02 : null;
                boolean zA1Z = AnonymousClass002.A1Z(c3tf.getLayoutDirection(), EnumC1820Arj.A03);
                int i3 = aze.A01;
                AaC aaCA06 = c1958Aux != null ? c1958Aux.A06(c1yx.A01.originalToTransformed(i2)) : AaC.A04;
                int iA01 = ASU.A01(ayu, 2.0f);
                if (zA1Z) {
                    f2 = i3 - aaCA06.A01;
                    f = f2 - iA01;
                } else {
                    f = aaCA06.A01;
                    f2 = iA01 + f;
                }
                AaC aaCA0f = C8j3.A0f(f, aaCA06.A03, f2, aaCA06.A00);
                AZ0 az0 = c1906AtR.A01;
                az0.A00(EnumC1108AYu.A02, aaCA0f, i, aze.A01);
                iRound = Math.round(-az0.A03.AFn());
                break;
            case 1:
                C1864Asd c1864Asd = (C1864Asd) this.A01;
                int i4 = this.A00;
                aze = (AZE) this.A02;
                ayu = (AYU) obj;
                C1864Asd.A01(c1864Asd, ayu, ((C3TF) this.A03).getLayoutDirection(), i4, aze.A01, At0.A01(c1864Asd.A07));
                iRound = -c1864Asd.A02.A04.AGd();
                break;
            case 2:
                C1864Asd c1864Asd2 = (C1864Asd) this.A01;
                int i5 = this.A00;
                AZE aze2 = (AZE) this.A02;
                AYU ayu2 = (AYU) obj;
                C1864Asd.A01(c1864Asd2, ayu2, ((C3TF) this.A03).getLayoutDirection(), i5, aze2.A00, At0.A01(c1864Asd2.A07));
                AYU.A04(ayu2, aze2, 0, -c1864Asd2.A02.A04.AGd());
                return Unit.INSTANCE;
            default:
                Object obj2 = this.A01;
                B8p b8p = (B8p) this.A02;
                AeA aeA = (AeA) this.A03;
                int i6 = this.A00;
                if (obj == obj2) {
                    throw C3cG.A0Q("A derived state calculation cannot read itself");
                }
                if (obj instanceof BDs) {
                    int i7 = b8p.A00 - i6;
                    int iA04 = aeA.A04(obj);
                    aeA.A07(obj, Math.min(i7, iA04 >= 0 ? aeA.A02[iA04] : Integer.MAX_VALUE));
                }
                return Unit.INSTANCE;
        }
        AYU.A04(ayu, aze, iRound, 0);
        return Unit.INSTANCE;
    }

    public BTS(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$t = i2;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
        this.A00 = i;
    }
}
