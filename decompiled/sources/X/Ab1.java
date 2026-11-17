package X;

/* loaded from: classes4.dex */
public abstract class Ab1 {
    public int A00;
    public int[] A01;

    public final int A01(int i) {
        if (i < 0 || i >= this.A00) {
            throw new IndexOutOfBoundsException("Index must be between 0 and size");
        }
        return this.A01[i];
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Ab1)) {
            return false;
        }
        Ab1 ab1 = (Ab1) obj;
        int i = ab1.A00;
        int i2 = this.A00;
        if (i != i2) {
            return false;
        }
        int[] iArr = this.A01;
        int[] iArr2 = ab1.A01;
        ADq aDqA0C = ATD.A0C(0, i2);
        int i3 = aDqA0C.A00;
        int i4 = aDqA0C.A01;
        if (i3 <= i4) {
            while (iArr[i3] == iArr2[i3]) {
                if (i3 != i4) {
                    i3++;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int[] iArr = this.A01;
        int i = this.A00;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3] * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append((CharSequence) "[");
        int[] iArr = this.A01;
        int i = this.A00;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            int i3 = iArr[i2];
            if (i2 != 0) {
                sbA0w.append((CharSequence) ", ");
                if (i2 == -1) {
                    sbA0w.append((CharSequence) "...");
                    break;
                }
            }
            sbA0w.append(i3);
            i2++;
        }
        sbA0w.append((CharSequence) "]");
        return sbA0w.toString();
    }

    public Ab1(int i) {
        this.A01 = i == 0 ? Ac1.A00 : new int[i];
    }
}
