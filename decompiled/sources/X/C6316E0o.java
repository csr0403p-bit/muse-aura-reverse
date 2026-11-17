package X;

import java.util.Arrays;

/* renamed from: X.E0o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6316E0o {
    public int A00;
    public long[] A01 = new long[32];

    public final long A00(int i) {
        if (i < 0 || i >= this.A00) {
            throw C8j3.A0y("Invalid index ", ", size is ", i, this.A00);
        }
        return this.A01[i];
    }

    public final void A01(long j) {
        int i = this.A00;
        long[] jArrCopyOf = this.A01;
        if (i == jArrCopyOf.length) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i * 2);
            this.A01 = jArrCopyOf;
        }
        int i2 = this.A00;
        this.A00 = i2 + 1;
        jArrCopyOf[i2] = j;
    }

    public final void A02(long[] jArr) {
        int i = this.A00;
        int length = jArr.length;
        int i2 = i + length;
        long[] jArrCopyOf = this.A01;
        int length2 = jArrCopyOf.length;
        if (i2 > length2) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(length2 * 2, i2));
            this.A01 = jArrCopyOf;
        }
        System.arraycopy(jArr, 0, jArrCopyOf, this.A00, length);
        this.A00 = i2;
    }
}
