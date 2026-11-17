package X;

/* renamed from: X.Arr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1827Arr {
    public static final void A00(InterfaceC1327AhE interfaceC1327AhE, C1958Aux c1958Aux) {
        boolean z;
        if (!c1958Aux.A0A() || c1958Aux.A04.A01 == 3) {
            z = false;
        } else {
            z = true;
            long j = c1958Aux.A02;
            AaC aaCA00 = C2J7.A00(0L, AnonymousClass005.A0M((int) (j >> 32), (int) (j & 4294967295L)));
            interfaceC1327AhE.Ac2();
            interfaceC1327AhE.A6O(aaCA00, 1);
        }
        C1824Aro c1824Aro = c1958Aux.A04.A04.A02;
        BG3 bg3 = c1824Aro.A0C;
        if (bg3 == null) {
            bg3 = BG3.A02;
        }
        C1780Aqg c1780Aqg = c1824Aro.A03;
        if (c1780Aqg == null) {
            c1780Aqg = C1780Aqg.A03;
        }
        C16b c16b = c1824Aro.A04;
        if (c16b == null) {
            c16b = C16a.A00;
        }
        try {
            InterfaceC1829Art interfaceC1829Art = c1824Aro.A0D;
            C1EQ c1eqAD4 = interfaceC1829Art.AD4();
            if (c1eqAD4 != null) {
                AbstractC1955Aut.A00(c1eqAD4, interfaceC1327AhE, c1780Aqg, c16b, c1958Aux.A03, bg3, interfaceC1829Art != C1839AsC.A00 ? interfaceC1829Art.getAlpha() : 1.0f);
            } else {
                c1958Aux.A03.A0D(interfaceC1327AhE, c1780Aqg, c16b, bg3, interfaceC1829Art != C1839AsC.A00 ? interfaceC1829Art.ADn() : B6A.A01);
            }
        } finally {
            if (z) {
                interfaceC1327AhE.Abc();
            }
        }
    }
}
