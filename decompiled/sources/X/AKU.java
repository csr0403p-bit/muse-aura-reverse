package X;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class AKU {
    public int A00;
    public int[] A01 = new int[10];

    public final void A00(int i) {
        int[] iArrCopyOf = this.A01;
        int i2 = this.A00;
        int length = iArrCopyOf.length;
        if (i2 >= length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, length * 2);
            C7384Etj.A0U(iArrCopyOf);
            this.A01 = iArrCopyOf;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArrCopyOf[i3] = i;
    }
}
