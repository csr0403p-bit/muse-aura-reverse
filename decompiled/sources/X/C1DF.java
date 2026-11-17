package X;

/* renamed from: X.1DF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DF implements C1DM {
    public static final C1DF A00 = new C1DF();

    @Override // X.C1DM
    /* renamed from: createOutline-Pq9zytI */
    public final AbstractC1555AlK mo2createOutlinePq9zytI(long j, EnumC1820Arj enumC1820Arj, AXN axn) {
        long jFloatToRawIntBits = Float.floatToRawIntBits(AWA.A01(j) / 2.0f);
        long jA0G = AnonymousClass002.A0G(jFloatToRawIntBits, jFloatToRawIntBits << 32);
        AaC aaCA00 = C2J7.A00(0L, j);
        return new AW6(new AW7(aaCA00.A01, aaCA00.A03, aaCA00.A02, aaCA00.A00, jA0G, jA0G, jA0G, jA0G));
    }
}
