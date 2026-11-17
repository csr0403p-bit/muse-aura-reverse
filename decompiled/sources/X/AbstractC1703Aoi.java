package X;

/* renamed from: X.Aoi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1703Aoi {
    public static final AaC A00 = new AaC(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final AaC A00(InterfaceC1497Ak4 interfaceC1497Ak4) {
        AaC aaCA00 = AbstractC1496Ak3.A00(interfaceC1497Ak4, true);
        long jAiR = interfaceC1497Ak4.AiR(AnonymousClass005.A0J(aaCA00.A01, aaCA00.A03));
        float f = aaCA00.A02;
        float f2 = aaCA00.A00;
        long jA0P = C8j3.A0P(f);
        long jAiR2 = interfaceC1497Ak4.AiR((C8j3.A0P(f2) & 4294967295L) | (jA0P << 32));
        return C8j3.A0f(AnonymousClass001.A00(jAiR), AnonymousClass001.A01(jAiR, 4294967295L), AnonymousClass001.A00(jAiR2), AnonymousClass001.A01(jAiR2, 4294967295L));
    }

    public static final boolean A01(AaC aaC, long j) {
        float f = aaC.A01;
        float f2 = aaC.A02;
        float fA03 = AnonymousClass003.A03(j);
        if (f <= fA03 && fA03 <= f2) {
            float f3 = aaC.A03;
            float f4 = aaC.A00;
            float fA00 = AnonymousClass004.A00(j);
            if (f3 <= fA00 && fA00 <= f4) {
                return true;
            }
        }
        return false;
    }
}
