package X;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class BBQ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public boolean A07;
    public Object[] A08;
    public final int A09;
    public final int A0A;
    public final BBW A0B;
    public final int[] A0C;
    public final AKU A0D;

    public final void A09() {
        this.A06 = true;
        BBW bbw = this.A0B;
        int i = bbw.A01;
        if (i <= 0) {
            BBL.A01("Unexpected reader close()");
            throw F60.createAndThrow();
        }
        bbw.A01 = i - 1;
        this.A08 = new Object[0];
    }

    public static final Object A00(BBQ bbq, int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) != 0) {
            return bbq.A08[iArr[i2 + 4] + Integer.bitCount(i3 >> 30)];
        }
        return null;
    }

    public final int A01() {
        int i = this.A01;
        if (i < this.A00) {
            return this.A0C[i * 5];
        }
        return 0;
    }

    public final int A02() {
        if (this.A04 != 0) {
            BBL.A01("Cannot skip while in an empty region");
            throw F60.createAndThrow();
        }
        int[] iArr = this.A0C;
        int i = this.A01;
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) == 0 ? i3 & 67108863 : 1;
        this.A01 = i + iArr[i2 + 3];
        return i4;
    }

    public final BCR A03(int i) {
        ArrayList<BCR> arrayList = this.A0B.A05;
        int iA00 = BCA.A00(arrayList, i, this.A09);
        if (iA00 >= 0) {
            return arrayList.get(iA00);
        }
        BCR bcr = new BCR();
        bcr.A00 = i;
        arrayList.add(-(iA00 + 1), bcr);
        return bcr;
    }

    public final Object A04() {
        int i = this.A01;
        if (i >= this.A00) {
            return 0;
        }
        int[] iArr = this.A0C;
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) == 0) {
            return C78N.A00;
        }
        Object[] objArr = this.A08;
        int length = iArr.length;
        if (i2 < length) {
            length = iArr[i2 + 4] + Integer.bitCount(i3 >> 29);
        }
        return objArr[length];
    }

    public final Object A05() {
        int i;
        if (this.A04 > 0 || (i = this.A02) >= this.A03) {
            this.A07 = false;
            return C78N.A00;
        }
        this.A07 = true;
        Object[] objArr = this.A08;
        this.A02 = i + 1;
        return objArr[i];
    }

    public final Object A06(int i) {
        int[] iArr = this.A0C;
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) == 0) {
            return C78N.A00;
        }
        Object[] objArr = this.A08;
        int length = iArr.length;
        if (i2 < length) {
            length = iArr[i2 + 4] + Integer.bitCount(i3 >> 29);
        }
        return objArr[length];
    }

    public final Object A07(int i) {
        int[] iArr = this.A0C;
        int i2 = i * 5;
        if ((iArr[i2 + 1] & 1073741824) != 0) {
            return this.A08[iArr[i2 + 4]];
        }
        return null;
    }

    public final Object A08(int i, int i2) {
        int[] iArr = this.A0C;
        int i3 = i * 5;
        int iBitCount = iArr[i3 + 4] + Integer.bitCount(iArr[i3 + 1] >> 28);
        int i4 = i + 1;
        int i5 = iBitCount + i2;
        return i5 < (i4 < this.A09 ? iArr[(i4 * 5) + 4] : this.A0A) ? this.A08[i5] : C78N.A00;
    }

    public final void A0A() {
        if (this.A04 == 0) {
            if (this.A01 != this.A00) {
                BBL.A01("endGroup() not called at the end of a group");
                throw F60.createAndThrow();
            }
            int[] iArr = this.A0C;
            int i = iArr[(this.A05 * 5) + 2];
            this.A05 = i;
            this.A00 = i < 0 ? this.A09 : iArr[(i * 5) + 3] + i;
            AKU aku = this.A0D;
            int[] iArr2 = aku.A01;
            int i2 = aku.A00 - 1;
            aku.A00 = i2;
            int i3 = iArr2[i2];
            if (i3 < 0) {
                this.A02 = 0;
                this.A03 = 0;
            } else {
                this.A02 = i3;
                this.A03 = i >= this.A09 - 1 ? this.A0A : iArr[((i + 1) * 5) + 4];
            }
        }
    }

    public final void A0B() {
        if (this.A04 != 0) {
            BBL.A01("Cannot skip the enclosing group while in an empty region");
            throw F60.createAndThrow();
        }
        this.A01 = this.A00;
        this.A02 = 0;
        this.A03 = 0;
    }

    public final void A0C() {
        if (this.A04 <= 0) {
            int i = this.A05;
            int i2 = this.A01;
            int[] iArr = this.A0C;
            if (iArr[(i2 * 5) + 2] != i) {
                throw C60O.A0i("Invalid slot table detected");
            }
            AKU aku = this.A0D;
            int i3 = this.A02;
            int i4 = this.A03;
            if (i3 == 0 && i4 == 0) {
                i3 = -1;
            }
            aku.A00(i3);
            this.A05 = i2;
            int i5 = i2 * 5;
            this.A00 = iArr[i5 + 3] + i2;
            int i6 = i2 + 1;
            this.A01 = i6;
            this.A02 = iArr[i5 + 4] + Integer.bitCount(iArr[i5 + 1] >> 28);
            this.A03 = i2 >= this.A09 - 1 ? this.A0A : iArr[(i6 * 5) + 4];
        }
    }

    public final void A0D(int i) {
        if (this.A04 != 0) {
            BBL.A01("Cannot reposition while in an empty region");
            throw F60.createAndThrow();
        }
        this.A01 = i;
        int i2 = this.A09;
        int i3 = i < i2 ? this.A0C[(i * 5) + 2] : -1;
        if (i3 != this.A05) {
            this.A05 = i3;
            if (i3 >= 0) {
                i2 = i3 + this.A0C[(i3 * 5) + 3];
            }
            this.A00 = i2;
            this.A02 = 0;
            this.A03 = 0;
        }
    }

    public final boolean A0E(int i) {
        return (this.A0C[(i * 5) + 1] & 536870912) != 0;
    }

    public final boolean A0F(int i) {
        return (this.A0C[(i * 5) + 1] & 1073741824) != 0;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("SlotReader(current=");
        sbA0x.append(this.A01);
        sbA0x.append(", key=");
        sbA0x.append(A01());
        sbA0x.append(", parent=");
        sbA0x.append(this.A05);
        sbA0x.append(", end=");
        return C8j5.A0X(sbA0x, this.A00);
    }

    public BBQ(BBW bbw) {
        this.A0B = bbw;
        this.A0C = bbw.A08;
        int i = bbw.A00;
        this.A09 = i;
        this.A08 = bbw.A09;
        this.A0A = bbw.A02;
        this.A00 = i;
        this.A05 = -1;
        this.A0D = new AKU();
    }
}
