package X;

/* renamed from: X.Agl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1300Agl {
    public long A00;
    public EnumC1108AYu A01;

    public static C1300Agl A00(EnumC1108AYu enumC1108AYu) {
        C1300Agl c1300Agl = new C1300Agl();
        c1300Agl.A01 = enumC1108AYu;
        c1300Agl.A00 = 0L;
        return c1300Agl;
    }

    public final long A01(float f, long j, boolean z) {
        long jA0P;
        int iFloatToRawIntBits;
        long j2 = this.A00;
        long jA05 = AWx.A05(j2, j);
        if (z) {
            this.A00 = jA05;
            j2 = jA05;
        }
        EnumC1108AYu enumC1108AYu = this.A01;
        if ((enumC1108AYu == null ? AWx.A00(jA05) : Math.abs(C8j3.A05(C8j5.A0E(jA05, enumC1108AYu, EnumC1108AYu.A02)))) < f) {
            return 9205357640488583168L;
        }
        if (enumC1108AYu == null) {
            float fA00 = AWx.A00(j2);
            return AWx.A04(j2, AWx.A02(AnonymousClass005.A0L(AnonymousClass001.A00(j2) / fA00, AnonymousClass001.A01(j2, 4294967295L) / fA00), f));
        }
        EnumC1108AYu enumC1108AYu2 = EnumC1108AYu.A02;
        float fA05 = C8j3.A05(C8j5.A0E(j2, enumC1108AYu, enumC1108AYu2));
        float fSignum = fA05 - (Math.signum(fA05) * f);
        float fA052 = C8j3.A05(C8j5.A0F(j2, enumC1108AYu, enumC1108AYu2));
        if (enumC1108AYu == enumC1108AYu2) {
            jA0P = C8j3.A0P(fSignum);
            iFloatToRawIntBits = Float.floatToRawIntBits(fA052);
        } else {
            jA0P = C8j3.A0P(fA052);
            iFloatToRawIntBits = Float.floatToRawIntBits(fSignum);
        }
        return (jA0P << 32) | (4294967295L & iFloatToRawIntBits);
    }
}
