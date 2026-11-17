package X;

import java.util.Arrays;

/* renamed from: X.GtN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10263GtN {
    public final int A00;
    public final int A01;
    public final C10307GuI A02;
    public static final C10307GuI A03 = new C10307GuI();
    public static final int[] A06 = new int[0];
    public static final C10264GtS A04 = new C10264GtS(-1, -1, -1);
    public static final C10263GtN A05 = new C10263GtN();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C10263GtN c10263GtN = (C10263GtN) obj;
                if (this.A01 != c10263GtN.A01 || this.A00 != c10263GtN.A00) {
                }
            }
            return false;
        }
        return true;
    }

    private C10264GtS A00(int i) {
        C10307GuI c10307GuI = this.A02;
        int iBinarySearch = Arrays.binarySearch(c10307GuI.A01, 0, c10307GuI.A00, i);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        int i2 = iBinarySearch + 2;
        int i3 = i;
        int iBinarySearch2 = Arrays.binarySearch(c10307GuI.A01, 0, c10307GuI.A00, i);
        if (iBinarySearch2 >= 0 || (-iBinarySearch2) - 2 != -1) {
            i3 = i - c10307GuI.A01[iBinarySearch2];
        }
        return new C10264GtS(i, i2, i3 + 1);
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C10263GtN() {
        this.A02 = A03;
        this.A01 = -1;
        this.A00 = -1;
    }

    public final String toString() {
        StringBuilder sbA0t = AbstractC7609F5w.A0t();
        int i = this.A01;
        sbA0t.append(i == -1 ? A04 : A00(i));
        sbA0t.append('-');
        int i2 = this.A00;
        sbA0t.append(i2 == -1 ? A04 : A00(i2));
        return Gt5.A01(sbA0t);
    }

    public C10263GtN(C10307GuI c10307GuI, int i, int i2) {
        this.A02 = c10307GuI;
        if (i >= 0 && i2 >= 0) {
            this.A01 = i;
            this.A00 = i2;
            return;
        }
        throw C60O.A0i("Range positions must be non-negative");
    }
}
