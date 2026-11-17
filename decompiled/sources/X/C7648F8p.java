package X;

import java.util.Arrays;

/* renamed from: X.F8p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7648F8p {
    public static final C7648F8p A02 = new C7648F8p(new int[0]);
    public final int A00;
    public final int[] A01;

    public final C7648F8p A01(int i) {
        if (i == this.A00) {
            return this;
        }
        int[] iArr = this.A01;
        AbstractC0886AGn.A01(i, iArr.length);
        int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, 0, i);
        C7384Etj.A0U(iArrCopyOfRange);
        return new C7648F8p(iArrCopyOfRange);
    }

    public final C7648F8p A00(int i) {
        int[] iArr = this.A01;
        int length = iArr.length;
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            iArr2[i3] = i3 < length ? iArr[i3] : i;
            i3++;
        }
        return new C7648F8p(iArr2);
    }

    public final C7648F8p A02(Integer num) {
        if (num == null) {
            return this;
        }
        int iIntValue = num.intValue() - 1;
        return iIntValue <= 0 ? A02 : A01(Math.min(iIntValue, this.A01.length));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C7648F8p) && Arrays.equals(this.A01, ((C7648F8p) obj).A01);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A01);
    }

    public final String toString() {
        String string = Arrays.toString(this.A01);
        C7384Etj.A0U(string);
        return string;
    }

    public C7648F8p(int[] iArr) {
        this.A01 = iArr;
        this.A00 = iArr.length;
    }
}
