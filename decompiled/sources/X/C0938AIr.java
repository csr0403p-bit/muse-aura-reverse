package X;

import java.util.Arrays;

/* renamed from: X.AIr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0938AIr {
    public int A00 = -1;
    public C0937AIq A01;
    public final long[] A02;

    public final void A00(long j) {
        long[] jArr = this.A02;
        C0937AIq c0937AIq = this.A01;
        if (jArr == null) {
            if (c0937AIq == null) {
                c0937AIq = new C0937AIq(5, 0.75f);
            }
            c0937AIq.A00(j);
            if (this.A01 == null) {
                this.A01 = c0937AIq;
                return;
            }
            return;
        }
        if (c0937AIq == null) {
            int i = this.A00 + 1;
            this.A00 = i;
            if (i < jArr.length && jArr[i] == j) {
                return;
            }
            c0937AIq = new C0937AIq(5, 0.75f);
            for (int i2 = 0; i2 < i; i2++) {
                c0937AIq.A00(jArr[i2]);
            }
            this.A01 = c0937AIq;
        }
        c0937AIq.A00(j);
    }

    public final long[] A01() {
        long[] jArr;
        long[] jArrCopyOfRange;
        C0937AIq c0937AIq = this.A01;
        if (c0937AIq != null) {
            int i = c0937AIq.A03;
            if (i == 0) {
                return new long[0];
            }
            jArrCopyOfRange = Arrays.copyOf(c0937AIq.A05, i);
        } else {
            int i2 = this.A00;
            if (i2 == -1 || (jArr = this.A02) == null) {
                return null;
            }
            int length = jArr.length;
            if (i2 >= length - 1) {
                return jArr;
            }
            int i3 = i2 + 1;
            AbstractC0886AGn.A01(i3, length);
            jArrCopyOfRange = Arrays.copyOfRange(jArr, 0, i3);
        }
        C7384Etj.A0U(jArrCopyOfRange);
        return jArrCopyOfRange;
    }

    public C0938AIr(long[] jArr) {
        this.A02 = jArr;
    }
}
