package X;

import com.android.billingclient.u6;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class GI4 {
    public static final GI4 A05 = new GI4(new int[0], new Object[0], 0, false);
    public int A00;
    public int A01 = -1;
    public boolean A02;
    public int[] A03;
    public Object[] A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof GI4)) {
                GI4 gi4 = (GI4) obj;
                int i = this.A00;
                if (i == gi4.A00) {
                    int[] iArr = this.A03;
                    int[] iArr2 = gi4.A03;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= i) {
                            Object[] objArr = this.A04;
                            Object[] objArr2 = gi4.A04;
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
        int iA0G;
        int i = this.A01;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.A00; i3++) {
            int i4 = this.A03[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                iA0G = AbstractC7610F5x.A0G(C3cG.A05(this.A04[i3]), GI5.A00(i5));
            } else if (i6 == 1) {
                this.A04[i3].getClass();
                iA0G = GI5.A00(i5) + 8;
            } else if (i6 == 2) {
                AbstractC9330GEn abstractC9330GEn = (AbstractC9330GEn) this.A04[i3];
                int iA00 = GI5.A00(i5);
                int iA01 = abstractC9330GEn.A01();
                iA0G = AbstractC7609F5w.A05(iA01) + iA01 + iA00;
            } else if (i6 == 3) {
                iA0G = ((GI4) this.A04[i3]).A00() + (GI5.A00(i5) * 2);
            } else {
                if (i6 != 5) {
                    throw new IllegalStateException(new u6());
                }
                this.A04[i3].getClass();
                iA0G = GI5.A00(i5) + 4;
            }
            i2 = iA0G + i2;
        }
        this.A01 = i2;
        return i2;
    }

    public final void A01(int i) {
        int[] iArr = this.A03;
        if (i > iArr.length) {
            int i2 = this.A00;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.A03 = Arrays.copyOf(iArr, i);
            this.A04 = Arrays.copyOf(this.A04, i);
        }
    }

    public final void A02(int i, Object obj) {
        if (!this.A02) {
            throw C8j3.A17();
        }
        A01(this.A00 + 1);
        int[] iArr = this.A03;
        int i2 = this.A00;
        iArr[i2] = i;
        this.A04[i2] = obj;
        this.A00 = i2 + 1;
    }

    public final void A03(GIQ giq) {
        if (this.A00 != 0) {
            for (int i = 0; i < this.A00; i++) {
                int i2 = this.A03[i];
                Object obj = this.A04[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    GI5.A04(giq.A00, i3, C3cG.A05(obj));
                } else if (i4 == 1) {
                    GI5.A05(giq.A00, i3, C3cG.A05(obj));
                } else if (i4 == 2) {
                    giq.A00.A0C((AbstractC9330GEn) obj, i3);
                } else if (i4 == 3) {
                    GI5 gi5 = giq.A00;
                    int i5 = i3 << 3;
                    gi5.A09(i5 | 3);
                    ((GI4) obj).A03(giq);
                    gi5.A09(i5 | 4);
                } else {
                    if (i4 != 5) {
                        throw BV4.A0e(new u6());
                    }
                    GI5.A03(giq.A00, i3, AnonymousClass001.A0F(obj));
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.A00;
        int i2 = (i + 527) * 31;
        int[] iArr = this.A03;
        int iA0G = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.A04;
        for (int i6 = 0; i6 < i; i6++) {
            iA0G = AnonymousClass005.A0G(objArr[i6], iA0G * 31);
        }
        return i5 + iA0G;
    }

    public GI4(int[] iArr, Object[] objArr, int i, boolean z) {
        this.A00 = i;
        this.A03 = iArr;
        this.A04 = objArr;
        this.A02 = z;
    }
}
