package X;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class GGN {
    public static final GGN A05;
    public int A01 = -1;
    public int A00 = 0;
    public int[] A03 = new int[8];
    public Object[] A04 = new Object[8];
    public boolean A02 = true;

    static {
        GGN ggn = new GGN();
        ggn.A01 = -1;
        ggn.A00 = 0;
        ggn.A03 = new int[0];
        ggn.A04 = new Object[0];
        ggn.A02 = false;
        A05 = ggn;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof GGN)) {
                GGN ggn = (GGN) obj;
                int i = this.A00;
                if (i == ggn.A00) {
                    int[] iArr = this.A03;
                    int[] iArr2 = ggn.A03;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= i) {
                            Object[] objArr = this.A04;
                            Object[] objArr2 = ggn.A04;
                            for (int i3 = 0; i3 < i; i3++) {
                                if (objArr[i3].equals(objArr2[i3])) {
                                }
                            }
                        } else {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        int iA06;
        int iA04;
        int iA062;
        int i = this.A01;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.A00; i3++) {
            int i4 = this.A03[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    iA062 = GHG.A06(i5) + 8;
                } else if (i6 == 2) {
                    AbstractC9309GDl abstractC9309GDl = (AbstractC9309GDl) this.A04[i3];
                    boolean z = GGI.A02;
                    iA06 = GHG.A06(i5);
                    int iA01 = abstractC9309GDl.A01();
                    iA04 = GGI.A03(iA01) + iA01;
                } else if (i6 == 3) {
                    iA06 = GHG.A06(i5) * 2;
                    iA04 = ((GGN) this.A04[i3]).A00();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(AbstractC7608F5v.A0G());
                    }
                    iA062 = GHG.A06(i5) + 4;
                }
                i2 += iA062;
            } else {
                long jA05 = C3cG.A05(this.A04[i3]);
                iA06 = GHG.A06(i5);
                iA04 = GGI.A04(jA05);
            }
            iA062 = iA06 + iA04;
            i2 += iA062;
        }
        this.A01 = i2;
        return i2;
    }

    public final void A01(int i, Object obj) {
        if (!this.A02) {
            throw C8j3.A17();
        }
        int i2 = this.A00;
        int[] iArr = this.A03;
        if (i2 == iArr.length) {
            int i3 = i2 >> 1;
            if (i2 < 4) {
                i3 = 8;
            }
            int i4 = i2 + i3;
            this.A03 = Arrays.copyOf(iArr, i4);
            this.A04 = Arrays.copyOf(this.A04, i4);
        }
        int[] iArr2 = this.A03;
        int i5 = this.A00;
        iArr2[i5] = i;
        this.A04[i5] = obj;
        this.A00 = i5 + 1;
    }

    public final void A02(InterfaceC9378GGq interfaceC9378GGq) {
        if (this.A00 != 0) {
            for (int i = 0; i < this.A00; i++) {
                int i2 = this.A03[i];
                Object obj = this.A04[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    ((GGL) interfaceC9378GGq).A00.A0A(i3, C3cG.A05(obj));
                } else if (i4 == 1) {
                    ((GGL) interfaceC9378GGq).A00.A09(i3, C3cG.A05(obj));
                } else if (i4 == 2) {
                    GGI ggi = ((GGL) interfaceC9378GGq).A00;
                    GHG.A09(ggi, i3);
                    ggi.A0B((AbstractC9309GDl) obj);
                } else if (i4 == 3) {
                    GGI ggi2 = ((GGL) interfaceC9378GGq).A00;
                    int i5 = i3 << 3;
                    ggi2.A06(i5 | 3);
                    ((GGN) obj).A02(interfaceC9378GGq);
                    ggi2.A06(i5 | 4);
                } else {
                    if (i4 != 5) {
                        throw BV4.A0e(AbstractC7608F5v.A0G());
                    }
                    GGL.A00(interfaceC9378GGq, i3, AnonymousClass001.A0F(obj));
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.A00;
        int iA02 = AbstractC7608F5v.A02(i);
        int[] iArr = this.A03;
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        int i4 = (iA02 + i2) * 31;
        Object[] objArr = this.A04;
        int iA0G = 17;
        for (int i5 = 0; i5 < i; i5++) {
            iA0G = AnonymousClass005.A0G(objArr[i5], iA0G * 31);
        }
        return i4 + iA0G;
    }
}
