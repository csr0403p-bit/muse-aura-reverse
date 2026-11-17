package X;

/* loaded from: classes4.dex */
public abstract class AI0 {
    public int A00;
    public long[] A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AI0)) {
            return false;
        }
        AI0 ai0 = (AI0) obj;
        int i = ai0.A00;
        int i2 = this.A00;
        if (i != i2) {
            return false;
        }
        long[] jArr = this.A01;
        long[] jArr2 = ai0.A01;
        ADq aDqA0C = ATD.A0C(0, i2);
        int i3 = aDqA0C.A00;
        int i4 = aDqA0C.A01;
        if (i3 <= i4) {
            while (jArr[i3] == jArr2[i3]) {
                if (i3 != i4) {
                    i3++;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long[] jArr = this.A01;
        int i = this.A00;
        int iA01 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iA01 += C3cI.A01(jArr[i2]);
        }
        return iA01;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append((CharSequence) "[");
        long[] jArr = this.A01;
        int i = this.A00;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long j = jArr[i2];
            if (i2 != 0) {
                sbA0w.append((CharSequence) ", ");
                if (i2 == -1) {
                    sbA0w.append((CharSequence) "...");
                    break;
                }
            }
            sbA0w.append(j);
            i2++;
        }
        sbA0w.append((CharSequence) "]");
        return sbA0w.toString();
    }
}
