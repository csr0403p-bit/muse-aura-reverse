package X;

/* renamed from: X.Ak3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1496Ak3 {
    public static final AaC A00(InterfaceC1497Ak4 interfaceC1497Ak4, boolean z) {
        float f;
        InterfaceC1497Ak4 interfaceC1497Ak4A01 = A01(interfaceC1497Ak4);
        long jAKd = interfaceC1497Ak4A01.AKd();
        float f2 = (int) (jAKd >> 32);
        float f3 = (int) (jAKd & 4294967295L);
        AaC aaCAPk = interfaceC1497Ak4A01.APk(interfaceC1497Ak4, z);
        float f4 = aaCAPk.A01;
        if (z) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            }
            if (f4 > f2) {
                f4 = f2;
            }
        }
        float f5 = aaCAPk.A03;
        if (z) {
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            if (f5 > f3) {
                f5 = f3;
            }
            float f6 = aaCAPk.A02;
            if (f6 < 0.0f) {
                f6 = 0.0f;
            }
            if (f6 <= f2) {
                f2 = f6;
            }
            float f7 = aaCAPk.A00;
            f = f7 >= 0.0f ? f7 : 0.0f;
            if (f <= f3) {
            }
            if (f4 != f2 || f5 == f3) {
                return AaC.A04;
            }
            long jA0P = C8j3.A0P(f4) << 32;
            long jA0P2 = C8j3.A0P(f5) & 4294967295L;
            long jAPr = interfaceC1497Ak4A01.APr(jA0P | jA0P2);
            long jA0K = C8j4.A0K(f2);
            long jAPr2 = interfaceC1497Ak4A01.APr(jA0K | jA0P2);
            long jA0P3 = C8j3.A0P(f3) & 4294967295L;
            long jAPr3 = interfaceC1497Ak4A01.APr(jA0K | jA0P3);
            long jAPr4 = interfaceC1497Ak4A01.APr(jA0P3 | jA0P);
            float fA00 = AnonymousClass001.A00(jAPr);
            float fA002 = AnonymousClass001.A00(jAPr2);
            float fA003 = AnonymousClass001.A00(jAPr4);
            float fA004 = AnonymousClass001.A00(jAPr3);
            float fMin = Math.min(fA00, Math.min(fA002, Math.min(fA003, fA004)));
            float fMax = Math.max(fA00, Math.max(fA002, Math.max(fA003, fA004)));
            float fA01 = AnonymousClass001.A01(jAPr, 4294967295L);
            float fA012 = AnonymousClass001.A01(jAPr2, 4294967295L);
            float fA013 = AnonymousClass001.A01(jAPr4, 4294967295L);
            float fA014 = AnonymousClass001.A01(jAPr3, 4294967295L);
            return C8j3.A0f(fMin, Math.min(fA01, Math.min(fA012, Math.min(fA013, fA014))), fMax, Math.max(fA01, Math.max(fA012, Math.max(fA013, fA014))));
        }
        f2 = aaCAPk.A02;
        f = aaCAPk.A00;
        f3 = f;
        if (f4 != f2) {
        }
        return AaC.A04;
    }

    public static final InterfaceC1497Ak4 A01(InterfaceC1497Ak4 interfaceC1497Ak4) {
        InterfaceC1497Ak4 interfaceC1497Ak42;
        AbstractC1387AiH abstractC1387AiH;
        InterfaceC1497Ak4 interfaceC1497Ak4AIa = interfaceC1497Ak4.AIa();
        while (true) {
            interfaceC1497Ak42 = interfaceC1497Ak4;
            interfaceC1497Ak4 = interfaceC1497Ak4AIa;
            if (interfaceC1497Ak4AIa == null) {
                break;
            }
            interfaceC1497Ak4AIa = interfaceC1497Ak4AIa.AIa();
        }
        if ((interfaceC1497Ak42 instanceof AbstractC1387AiH) && (abstractC1387AiH = (AbstractC1387AiH) interfaceC1497Ak42) != null) {
            AbstractC1387AiH abstractC1387AiH2 = abstractC1387AiH.A09;
            while (true) {
                interfaceC1497Ak42 = abstractC1387AiH;
                abstractC1387AiH = abstractC1387AiH2;
                if (abstractC1387AiH2 == null) {
                    break;
                }
                abstractC1387AiH2 = abstractC1387AiH2.A09;
            }
        }
        return interfaceC1497Ak42;
    }
}
