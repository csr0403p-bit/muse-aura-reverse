package X;

/* renamed from: X.Ea0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6791Ea0 extends C6788EZx {
    public final transient int[] A00;
    public final transient byte[][] A01;

    @Override // X.C6788EZx
    public final boolean A0D(C6788EZx c6788EZx, int i, int i2, int i3) {
        C7384Etj.A0Y(c6788EZx, 1);
        if (i >= 0 && i <= A0C() - i3) {
            int i4 = i3 + i;
            int iA03 = A03(this, i);
            while (i < i4) {
                int i5 = iA03 == 0 ? 0 : this.A00[iA03 - 1];
                int[] iArr = this.A00;
                int i6 = iArr[iA03] - i5;
                byte[][] bArr = this.A01;
                int i7 = iArr[bArr.length + iA03];
                int iMin = Math.min(i4, i6 + i5) - i;
                if (c6788EZx.A0E(bArr[iA03], i2, i7 + (i - i5), iMin)) {
                    i2 += iMin;
                    i += iMin;
                    iA03++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.C6788EZx
    public final boolean A0E(byte[] bArr, int i, int i2, int i3) {
        C7384Etj.A0Y(bArr, 1);
        if (i >= 0 && i <= A0C() - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
            int i4 = i3 + i;
            int iA03 = A03(this, i);
            while (i < i4) {
                int i5 = iA03 == 0 ? 0 : this.A00[iA03 - 1];
                int[] iArr = this.A00;
                int i6 = iArr[iA03] - i5;
                byte[][] bArr2 = this.A01;
                int i7 = iArr[bArr2.length + iA03];
                int iMin = Math.min(i4, i6 + i5) - i;
                int i8 = i7 + (i - i5);
                byte[] bArr3 = bArr2[iA03];
                C7384Etj.A0Y(bArr3, 0);
                for (int i9 = 0; i9 < iMin; i9++) {
                    if (bArr3[i9 + i8] == bArr[i9 + i2]) {
                    }
                }
                i2 += iMin;
                i += iMin;
                iA03++;
            }
            return true;
        }
        return false;
    }

    @Override // X.C6788EZx
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C6788EZx) {
                C6788EZx c6788EZx = (C6788EZx) obj;
                int iA0C = c6788EZx.A0C();
                int iA0C2 = A0C();
                if (iA0C != iA0C2 || !A0D(c6788EZx, 0, 0, iA0C2)) {
                }
            }
            return false;
        }
        return true;
    }

    public C6791Ea0(int[] iArr, byte[][] bArr) {
        super(C6788EZx.A02.data);
        this.A01 = bArr;
        this.A00 = iArr;
    }

    public static final int A03(C6791Ea0 c6791Ea0, int i) {
        int i2;
        int[] iArr = c6791Ea0.A00;
        int i3 = i + 1;
        int length = c6791Ea0.A01.length;
        int i4 = 0;
        C7384Etj.A0Y(iArr, 0);
        int i5 = length - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = (-i4) - 1;
                break;
            }
        }
        return i2 < 0 ? i2 ^ (-1) : i2;
    }

    @Override // X.C6788EZx
    public final byte A0B(int i) {
        int[] iArr = this.A00;
        byte[][] bArr = this.A01;
        int length = bArr.length;
        AbstractC6789EZy.A01(iArr[length - 1], i, 1L);
        int iA03 = A03(this, i);
        return bArr[iA03][(i - (iA03 == 0 ? 0 : iArr[iA03 - 1])) + iArr[length + iA03]];
    }

    @Override // X.C6788EZx
    public final int A0C() {
        return this.A00[this.A01.length - 1];
    }

    @Override // X.C6788EZx
    public final int hashCode() {
        int i = super.A00;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.A01;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            int[] iArr = this.A00;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        super.A00 = i4;
        return i4;
    }

    public static final C6788EZx A04(C6791Ea0 c6791Ea0) {
        byte[] bArr = new byte[c6791Ea0.A0C()];
        byte[][] bArr2 = c6791Ea0.A01;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = c6791Ea0.A00;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            byte[] bArr3 = bArr2[i];
            int i6 = i5 - i2;
            C7384Etj.A0Y(bArr3, 0);
            System.arraycopy(bArr3, i4, bArr, i3, (i4 + i6) - i4);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return new C6788EZx(bArr);
    }

    private final Object writeReplace() {
        return A04(this);
    }

    @Override // X.C6788EZx
    public final String toString() {
        return A04(this).toString();
    }
}
