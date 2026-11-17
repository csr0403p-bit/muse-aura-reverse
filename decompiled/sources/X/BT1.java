package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BT1 implements Ht9, G0U {
    public final int $t;
    public final long A00;
    public final Object A01;

    public BT1(Object obj, long j, int i) {
        this.$t = i;
        this.A00 = j;
        this.A01 = obj;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        float f;
        if (this.$t != 0) {
            long j = this.A00;
            C3TQ c3tq = (C3TQ) this.A01;
            C16Z c16z = (C16Z) obj;
            AbstractC045819r abstractC045819r = AbstractC045819r.$redex_init_class;
            float fA00 = AnonymousClass001.A00(j);
            if (fA00 > 0.0f) {
                float fAh4 = c16z.Ah4(4.0f);
                float fAh42 = c16z.Ah4(c3tq.A5k(c16z.getLayoutDirection())) - fAh4;
                float f2 = fA00 + fAh42 + (fAh4 * 2.0f);
                if (c16z.getLayoutDirection().ordinal() == 1) {
                    float fA002 = AnonymousClass001.A00(c16z.AKb());
                    f = fA002 - f2;
                    if (fAh42 < 0.0f) {
                        fAh42 = 0.0f;
                    }
                    f2 = fA002 - fAh42;
                } else {
                    f = fAh42;
                    if (fAh42 < 0.0f) {
                        f = 0.0f;
                    }
                }
                float fA003 = AnonymousClass004.A00(j);
                float f3 = (-fA003) / 2.0f;
                float f4 = fA003 / 2.0f;
                InterfaceC1279AgP interfaceC1279AgPAEq = c16z.AEq();
                AaI aaI = (AaI) interfaceC1279AgPAEq;
                AW9 aw9 = aaI.A02.A02;
                long jA00 = AW9.A00(aw9);
                try {
                    aaI.A01.A6N(f, f3, f2, f4, 0);
                    c16z.A9O();
                } finally {
                    AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
                }
            } else {
                c16z.A9O();
            }
        } else {
            C1073AWe c1073AWe = (C1073AWe) this.A01;
            c1073AWe.A0E.Af8(C8j3.A0l(C2ae.A01(((C2ae) ((AT5) obj).A04.A05.getValue()).A00, this.A00)));
            c1073AWe.A0F.invoke();
        }
        return Unit.INSTANCE;
    }
}
