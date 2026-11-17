package X;

/* renamed from: X.Arq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1826Arq {
    public static final void A00(AT3 at3, C1958Aux c1958Aux, float f, long j, long j2) {
        float alpha = f;
        long jADn = j;
        C1870Ask c1870Ask = c1958Aux.A04;
        C1824Aro c1824Aro = c1870Ask.A04.A02;
        C1780Aqg c1780Aqg = c1824Aro.A03;
        BG3 bg3 = c1824Aro.A0C;
        C16b c16b = c1824Aro.A04;
        InterfaceC1279AgP interfaceC1279AgPAEq = at3.AEq();
        AaI aaI = (AaI) interfaceC1279AgPAEq;
        AW9 aw9 = aaI.A02.A02;
        long jA00 = AW9.A00(aw9);
        try {
            AT2 at2 = aaI.A01;
            at2.AhL(AnonymousClass001.A00(j2), AnonymousClass001.A01(4294967295L, j2));
            if (c1958Aux.A0A() && c1870Ask.A01 != 3) {
                long j3 = c1958Aux.A02;
                at2.A6N(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L), 1);
            }
            InterfaceC1829Art interfaceC1829Art = c1824Aro.A0D;
            C1EQ c1eqAD4 = interfaceC1829Art.AD4();
            if (c1eqAD4 == null || jADn != 16) {
                C1956Auv c1956Auv = c1958Aux.A03;
                InterfaceC1327AhE interfaceC1327AhE = aw9.A01;
                if (jADn == 16) {
                    jADn = interfaceC1829Art.ADn();
                }
                c1956Auv.A0D(interfaceC1327AhE, c1780Aqg, c16b, bg3, AbstractC1783Aqj.A00(jADn, alpha));
            } else {
                C1956Auv c1956Auv2 = c1958Aux.A03;
                InterfaceC1327AhE interfaceC1327AhE2 = aw9.A01;
                if (Float.isNaN(alpha)) {
                    alpha = interfaceC1829Art.getAlpha();
                }
                AbstractC1955Aut.A00(c1eqAD4, interfaceC1327AhE2, c1780Aqg, c16b, c1956Auv2, bg3, alpha);
            }
        } finally {
            AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
        }
    }
}
