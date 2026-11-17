package X;

import java.util.Arrays;

/* renamed from: X.GtF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10261GtF {
    public C10307GuI A04 = C10263GtN.A03;
    public int A03 = -1;
    public int A02 = -1;
    public int A01 = -1;
    public int A00 = -1;
    public int[] A05 = C10263GtN.A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C10261GtF c10261GtF = (C10261GtF) obj;
                if (this.A03 != c10261GtF.A03 || this.A02 != c10261GtF.A02 || this.A01 != c10261GtF.A01 || this.A00 != c10261GtF.A00 || !Arrays.equals(this.A05, c10261GtF.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(C10307GuI c10307GuI, C10261GtF c10261GtF) {
        C10307GuI c10307GuI2 = c10261GtF.A04;
        if (c10307GuI2 == C10263GtN.A03) {
            c10261GtF.A04 = c10307GuI;
        } else if (c10307GuI2 != c10307GuI) {
            throw C60O.A0i("Source ranges must come from the same parse");
        }
    }

    public final C10261GtF A01() {
        C10261GtF c10261GtF = new C10261GtF();
        c10261GtF.A04 = this.A04;
        c10261GtF.A03 = this.A03;
        c10261GtF.A02 = this.A02;
        c10261GtF.A01 = this.A01;
        c10261GtF.A00 = this.A00;
        int[] iArr = this.A05;
        c10261GtF.A05 = iArr.length == 0 ? C10263GtN.A06 : (int[]) iArr.clone();
        return c10261GtF;
    }

    public final void A02(C10307GuI c10307GuI, int i, int i2, int i3, int i4, int i5) {
        if (i2 < 0 || i3 < 0 || i4 < 0 || i5 < 0) {
            throw C60O.A0i("Attribute range positions must be non-negative");
        }
        A00(c10307GuI, this);
        int i6 = i * 4;
        int i7 = i6 + 2;
        int i8 = i7 + 2;
        int[] iArr = this.A05;
        int length = iArr.length;
        if (length < i8) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i8);
            this.A05 = iArrCopyOf;
            Arrays.fill(iArrCopyOf, length, iArrCopyOf.length, -1);
        }
        int[] iArr2 = this.A05;
        iArr2[i6] = i2;
        iArr2[i6 + 1] = i3;
        iArr2[i7] = i4;
        iArr2[i7 + 1] = i5;
    }

    public final int hashCode() {
        return (Arrays.hashCode(new Object[]{Integer.valueOf(this.A03), Integer.valueOf(this.A02), Integer.valueOf(this.A01), Integer.valueOf(this.A00)}) * 31) + Arrays.hashCode(this.A05);
    }
}
