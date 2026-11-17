package X;

/* renamed from: X.AgJ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1273AgJ {
    public int A00;
    public final int A01;
    public final Integer A02;
    public final boolean A03;
    public final float[] A04;
    public final float[] A05;
    public final float[] A06;
    public final BGi[] A07;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float A00(float r22) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1273AgJ.A00(float):float");
    }

    public final void A01(long j, float f) {
        int i = (this.A00 + 1) % 20;
        this.A00 = i;
        BGi[] bGiArr = this.A07;
        BGi bGi = bGiArr[i];
        if (bGi != null) {
            bGi.A01 = j;
            bGi.A00 = f;
        } else {
            BGi bGi2 = new BGi();
            bGi2.A01 = j;
            bGi2.A00 = f;
            bGiArr[i] = bGi2;
        }
    }

    public C1273AgJ(boolean z, Integer num) {
        this.A03 = z;
        this.A02 = num;
        if (z && num.equals(C79.A00)) {
            throw C3cG.A0Q("Lsq2 not (yet) supported for differential axes");
        }
        this.A01 = num.intValue() != 1 ? 3 : 2;
        this.A07 = new BGi[20];
        this.A04 = new float[20];
        this.A05 = new float[20];
        this.A06 = new float[3];
    }

    public C1273AgJ() {
        this(false, C79.A00);
    }
}
