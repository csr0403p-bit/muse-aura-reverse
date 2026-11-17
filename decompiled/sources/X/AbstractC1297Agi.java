package X;

/* renamed from: X.Agi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1297Agi {
    public static final long A00(EnumC1108AYu enumC1108AYu, C1309Agu c1309Agu, C1298Agj c1298Agj) {
        long j;
        long jA0P;
        int iFloatToRawIntBits;
        if (enumC1108AYu != null) {
            int i = c1309Agu.A00;
            if (AnonymousClass002.A1Q(i, 1)) {
                j = c1298Agj.A02 >> 32;
            } else if (i == 2) {
                j = c1298Agj.A02 & 4294967295L;
            }
            float fA05 = C8j3.A05(j);
            if (enumC1108AYu == EnumC1108AYu.A02) {
                jA0P = C8j3.A0P(fA05);
                iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            } else {
                jA0P = C8j3.A0P(0.0f);
                iFloatToRawIntBits = Float.floatToRawIntBits(fA05);
            }
            return (jA0P << 32) | (iFloatToRawIntBits & 4294967295L);
        }
        return c1298Agj.A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C1302Agn r11, X.EnumC1108AYu r12, X.C1309Agu r13, X.C1298Agj r14, X.C3UT r15, long r16) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1297Agi.A01(X.Agn, X.AYu, X.Agu, X.Agj, X.3UT, long):void");
    }
}
