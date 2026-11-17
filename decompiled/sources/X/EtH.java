package X;

/* loaded from: classes5.dex */
public abstract class EtH {
    public static final InterfaceC7824FGf A00(FDW fdw, long j) {
        InterfaceC7824FGf c7373EtG;
        int i = fdw.A05;
        if (i == 16598) {
            return new C7375EtJ(BV9.A02(fdw, j), Hus.A00(fdw.A0F(38), 0.0f, 0.0f));
        }
        if (i == 16588) {
            c7373EtG = new EtF(Hus.A00(fdw.A0F(41), 0.0f, 0.0f), fdw.A06(42, 0.0f), fdw.A06(40, 0.0f), BV9.A02(fdw, j), fdw.A0L(38, true));
        } else if (i == 16597) {
            String strA0F = fdw.A0F(38);
            float fA03 = AnonymousClass003.A03(j);
            float fA00 = Hus.A00(strA0F, 0.0f, fA03);
            String strA0F2 = fdw.A0F(40);
            float fA002 = AnonymousClass004.A00(j);
            c7373EtG = new C7374EtI(AbstractC5463Diy.A01(fA00, Hus.A00(strA0F2, 0.0f, fA002)), AbstractC5463Diy.A01(BV6.A01(fdw, fA03, 36), BV6.A01(fdw, fA002, 35)));
        } else if (i == 16604) {
            String strA0F3 = fdw.A0F(38);
            float fA032 = AnonymousClass003.A03(j);
            float fA003 = Hus.A00(strA0F3, 0.0f, fA032);
            String strA0F4 = fdw.A0F(40);
            float fA004 = AnonymousClass004.A00(j);
            c7373EtG = new HyK(AbstractC5463Diy.A01(fA003, Hus.A00(strA0F4, 0.0f, fA004)), BV8.A0L(fdw, fA032, fA004, 35));
        } else {
            if (i != 16601) {
                if (i == 16593) {
                    return Et8.A00(fdw, j);
                }
                throw C60O.A0i("Unknown canvas shape.");
            }
            String strA0F5 = fdw.A0F(40);
            float fA033 = AnonymousClass003.A03(j);
            float fA005 = Hus.A00(strA0F5, 0.0f, fA033);
            String strA0F6 = fdw.A0F(41);
            float fA006 = AnonymousClass004.A00(j);
            c7373EtG = new C7373EtG(AbstractC5463Diy.A01(fA005, Hus.A00(strA0F6, 0.0f, fA006)), BV8.A0L(fdw, fA033, fA006, 38), Hus.A00(fdw.A0F(35), 0.0f, 0.0f));
        }
        return c7373EtG;
    }
}
