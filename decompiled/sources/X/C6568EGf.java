package X;

/* renamed from: X.EGf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6568EGf {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public final /* synthetic */ EGe A09;

    public C6568EGf(EGe eGe, int i, int i2) {
        this.A09 = eGe;
        this.A00 = i;
        this.A08 = i2;
        A00(this);
    }

    public static final void A00(C6568EGf c6568EGf) {
        EGe eGe = c6568EGf.A09;
        int[] iArr = eGe.A02;
        int[] iArr2 = eGe.A03;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MIN_VALUE;
        int i7 = 0;
        for (int i8 = c6568EGf.A00; i8 <= c6568EGf.A08; i8++) {
            int i9 = iArr[i8];
            i7 += iArr2[i9];
            int i10 = (i9 >> 10) & 31;
            int i11 = (i9 >> 5) & 31;
            int i12 = i9 & 31;
            if (i10 > i4) {
                i4 = i10;
            }
            if (i10 < i) {
                i = i10;
            }
            if (i11 > i5) {
                i5 = i11;
            }
            if (i11 < i2) {
                i2 = i11;
            }
            if (i12 > i6) {
                i6 = i12;
            }
            if (i12 < i3) {
                i3 = i12;
            }
        }
        c6568EGf.A06 = i;
        c6568EGf.A03 = i4;
        c6568EGf.A05 = i2;
        c6568EGf.A02 = i5;
        c6568EGf.A04 = i3;
        c6568EGf.A01 = i6;
        c6568EGf.A07 = i7;
    }
}
