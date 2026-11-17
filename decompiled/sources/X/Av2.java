package X;

/* loaded from: classes4.dex */
public abstract class Av2 {
    public static final float A00(C1958Aux c1958Aux, int i) {
        if (i < 0 || C1870Ask.A00(c1958Aux) == 0) {
            return 0.0f;
        }
        C1956Auv c1956Auv = c1958Aux.A03;
        int iMin = Math.min(c1956Auv.A09(i), Math.min(c1956Auv.A03 - 1, c1956Auv.A02 - 1));
        if (i > c1956Auv.A0A(iMin, false)) {
            return 0.0f;
        }
        C1960Auz c1960AuzA02 = C1956Auv.A02(c1956Auv, iMin);
        InterfaceC2006AwF interfaceC2006AwF = c1960AuzA02.A06;
        int i2 = iMin - c1960AuzA02.A03;
        C1999Aw8 c1999Aw8 = ((C1957Auw) interfaceC2006AwF).A01;
        return c1999Aw8.A03(i2) - c1999Aw8.A04(i2);
    }
}
