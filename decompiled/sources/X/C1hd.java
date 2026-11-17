package X;

/* renamed from: X.1hd, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1hd extends C06G {
    public final float A00;
    public final float A01;
    public final int A02;
    public final C1824Aro A03;
    public final C1822Arm A04;

    public C1hd(C1824Aro c1824Aro, C1822Arm c1822Arm, float f, float f2) {
        this.A04 = c1822Arm;
        this.A02 = 3;
        this.A03 = c1824Aro;
        this.A00 = f;
        this.A01 = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1hd) {
                C1hd c1hd = (C1hd) obj;
                if (!C7384Etj.areEqual(this.A04, c1hd.A04) || this.A02 != c1hd.A02 || !C7384Etj.areEqual(this.A03, c1hd.A03) || !C1DG.A08(this.A00, c1hd.A00) || !C1DG.A08(this.A01, c1hd.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A02(AnonymousClass005.A0F(this.A03, (AnonymousClass005.A0E(this.A04) + this.A02) * 31), this.A00) + Float.floatToIntBits(this.A01);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1hd(C1824Aro c1824Aro, C1822Arm c1822Arm, C06H c06h, float f, float f2, int i, int i2) {
        long jA03 = C19U.A03(17);
        long jA032 = C19U.A03(26);
        long j = B6A.A01;
        C1822Arm c1822Arm2 = C1822Arm.A03;
        long j2 = C1809ArT.A01;
        long j3 = B6A.A07;
        this(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, 2516583433L << 32, j2, j2, j3), new C1822Arm(null, null, C1736ApY.A04, 0, 0, 4279308562L << 32, jA03, j2, j3, jA032), 4.0f, 12.0f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C1hd() {
        float f = 0.0f;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        this(null, objArr, objArr2, f, f, 0, 31);
    }
}
