package X;

/* renamed from: X.1DE, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1DE implements C1DM, APS {
    public final C1D5 A00;
    public final C1D5 A01;
    public final C1D5 A02;
    public final C1D5 A03;

    @Override // X.C1DM
    /* renamed from: createOutline-Pq9zytI, reason: not valid java name */
    public final AbstractC1555AlK mo2createOutlinePq9zytI(long j, EnumC1820Arj enumC1820Arj, AXN axn) {
        float fMo1toPxTmRCtEA = this.A03.mo1toPxTmRCtEA(j, axn);
        float fMo1toPxTmRCtEA2 = this.A02.mo1toPxTmRCtEA(j, axn);
        float fMo1toPxTmRCtEA3 = this.A00.mo1toPxTmRCtEA(j, axn);
        float fMo1toPxTmRCtEA4 = this.A01.mo1toPxTmRCtEA(j, axn);
        float fA01 = AWA.A01(j);
        float f = fMo1toPxTmRCtEA + fMo1toPxTmRCtEA4;
        if (f > fA01) {
            float f2 = fA01 / f;
            fMo1toPxTmRCtEA *= f2;
            fMo1toPxTmRCtEA4 *= f2;
        }
        float f3 = fMo1toPxTmRCtEA2 + fMo1toPxTmRCtEA3;
        if (f3 > fA01) {
            float f4 = fA01 / f3;
            fMo1toPxTmRCtEA2 *= f4;
            fMo1toPxTmRCtEA3 *= f4;
        }
        if (fMo1toPxTmRCtEA < 0.0f || fMo1toPxTmRCtEA2 < 0.0f || fMo1toPxTmRCtEA3 < 0.0f || fMo1toPxTmRCtEA4 < 0.0f) {
            StringBuilder sb = new StringBuilder("Corner size in Px can't be negative(topStart = ");
            sb.append(fMo1toPxTmRCtEA);
            sb.append(", topEnd = ");
            sb.append(fMo1toPxTmRCtEA2);
            sb.append(", bottomEnd = ");
            sb.append(fMo1toPxTmRCtEA3);
            sb.append(", bottomStart = ");
            sb.append(fMo1toPxTmRCtEA4);
            AbstractC1061ATk.A00(AnonymousClass001.A0v(")!", sb));
            throw F60.createAndThrow();
        }
        if (fMo1toPxTmRCtEA + fMo1toPxTmRCtEA2 + fMo1toPxTmRCtEA3 + fMo1toPxTmRCtEA4 == 0.0f) {
            return new C1097AYh(C2J7.A00(0L, j));
        }
        AaC aaCA00 = C2J7.A00(0L, j);
        EnumC1820Arj enumC1820Arj2 = EnumC1820Arj.A02;
        float f5 = fMo1toPxTmRCtEA2;
        if (enumC1820Arj == enumC1820Arj2) {
            f5 = fMo1toPxTmRCtEA;
        }
        long jFloatToRawIntBits = Float.floatToRawIntBits(f5);
        long j2 = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits & 4294967295L);
        if (enumC1820Arj == enumC1820Arj2) {
            fMo1toPxTmRCtEA = fMo1toPxTmRCtEA2;
        }
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fMo1toPxTmRCtEA);
        long j3 = (jFloatToRawIntBits2 & 4294967295L) | (jFloatToRawIntBits2 << 32);
        float f6 = fMo1toPxTmRCtEA4;
        if (enumC1820Arj == enumC1820Arj2) {
            f6 = fMo1toPxTmRCtEA3;
        }
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(f6);
        long j4 = (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits3 & 4294967295L);
        if (enumC1820Arj == enumC1820Arj2) {
            fMo1toPxTmRCtEA3 = fMo1toPxTmRCtEA4;
        }
        long jFloatToRawIntBits4 = Float.floatToRawIntBits(fMo1toPxTmRCtEA3);
        return new AW6(new AW7(aaCA00.A01, aaCA00.A03, aaCA00.A02, aaCA00.A00, j2, j3, j4, (4294967295L & jFloatToRawIntBits4) | (jFloatToRawIntBits4 << 32)));
    }

    public C1DE(C1D5 c1d5, C1D5 c1d52, C1D5 c1d53, C1D5 c1d54) {
        this.A03 = c1d5;
        this.A02 = c1d52;
        this.A00 = c1d53;
        this.A01 = c1d54;
    }
}
