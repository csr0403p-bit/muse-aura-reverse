package X;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class AI1 extends AI0 {
    public AI1() {
        this.A01 = new long[16];
    }

    public final void A00(long j) {
        int i = this.A00 + 1;
        long[] jArrCopyOf = this.A01;
        int length = jArrCopyOf.length;
        if (length < i) {
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i, (length * 3) / 2));
            C7384Etj.A0U(jArrCopyOf);
            this.A01 = jArrCopyOf;
        }
        int i2 = this.A00;
        jArrCopyOf[i2] = j;
        this.A00 = i2 + 1;
    }
}
