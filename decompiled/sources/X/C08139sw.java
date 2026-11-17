package X;

/* renamed from: X.9sw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C08139sw {
    public static final long[] A04 = new long[0];
    public long A00;
    public final G0V<C9iZ, Integer, Boolean> A01;
    public final C9iZ A02;
    public final long[] A03;

    /* JADX WARN: Incorrect types in method signature: (LX/9iZ;LX/G0V<-LX/9iZ;-Ljava/lang/Integer;Ljava/lang/Boolean;>;)V */
    public C08139sw(G0V g0v, C9iZ c9iZ) {
        long[] jArr;
        this.A02 = c9iZ;
        this.A01 = g0v;
        int iAF6 = c9iZ.AF6();
        if (iAF6 <= 64) {
            this.A00 = iAF6 != 64 ? (-1) << iAF6 : 0L;
            jArr = A04;
        } else {
            this.A00 = 0L;
            int i = (iAF6 - 1) >>> 6;
            jArr = new long[i];
            if ((iAF6 & 63) != 0) {
                jArr[i - 1] = (-1) << iAF6;
            }
        }
        this.A03 = jArr;
    }
}
