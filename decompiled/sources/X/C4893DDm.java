package X;

/* renamed from: X.DDm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4893DDm {
    public final long A00;
    public final long A01;
    public final long[] A02;
    public final long[] A03;

    public C4893DDm(long[] jArr, long[] jArr2, long j, long j2) {
        int length;
        if (j < 0 || j2 < 0 || (length = jArr.length) != jArr2.length) {
            throw C60O.A0i("Invalid segment timing boundaries");
        }
        long j3 = j - 1;
        int i = 0;
        long j4 = j2;
        while (i < length) {
            long j5 = jArr[i];
            if (j5 > j3) {
                long j6 = jArr2[i];
                if (j6 > j4) {
                    i++;
                    j4 = j6;
                    j3 = j5;
                }
            }
            throw C60O.A0i("Segment timing boundaries must increase");
        }
        this.A00 = j;
        this.A01 = j2;
        this.A03 = (long[]) jArr.clone();
        this.A02 = (long[]) jArr2.clone();
    }
}
