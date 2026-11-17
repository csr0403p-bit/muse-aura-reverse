package X;

import java.util.Arrays;

/* renamed from: X.Aaj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1119Aaj extends Ab1 {
    public C1119Aaj() {
        super(16);
    }

    public static final void A00(C1119Aaj c1119Aaj, int i) {
        int[] iArr = c1119Aaj.A01;
        int length = iArr.length;
        if (length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i, (length * 3) / 2));
            C7384Etj.A0U(iArrCopyOf);
            c1119Aaj.A01 = iArrCopyOf;
        }
    }

    public final void A02(int i) {
        A00(this, this.A00 + 1);
        int[] iArr = this.A01;
        int i2 = this.A00;
        iArr[i2] = i;
        this.A00 = i2 + 1;
    }

    public final void A03(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.A00)) {
            throw new IndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.A01;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(iArr, i3, iArr, i, i2 - i3);
        }
        this.A00--;
    }

    public final void A04(int i, int i2) {
        if (i < 0 || i >= this.A00) {
            throw new IndexOutOfBoundsException("Index must be between 0 and size");
        }
        this.A01[i] = i2;
    }
}
