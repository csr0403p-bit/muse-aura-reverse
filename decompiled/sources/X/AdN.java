package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class AdN {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Ad0[] A03;
    public final C04991Ye A04;
    public final List<C1VW> A05;
    public final boolean A06;

    public final Ad0[] A00(int i, int i2, int i3) {
        int i4;
        int i5;
        Ad0[] ad0Arr = this.A03;
        int length = ad0Arr.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < length) {
            Ad0 ad0 = ad0Arr[i6];
            int i9 = i7 + 1;
            int i10 = (int) this.A05.get(i7).A00;
            int i11 = this.A04.A00[i8];
            if (this.A06) {
                i4 = this.A00;
                i5 = i8;
            } else {
                i4 = i8;
                i5 = this.A00;
            }
            ad0.A00(i, i11, i2, i3, i4, i5);
            i8 += i10;
            i6++;
            i7 = i9;
        }
        return ad0Arr;
    }

    /* JADX WARN: Incorrect types in method signature: (I[LX/Ad0;LX/1Ye;Ljava/util/List<LX/1VW;>;ZI)V */
    public AdN(C04991Ye c04991Ye, List list, Ad0[] ad0Arr, int i, int i2, boolean z) {
        this.A00 = i;
        this.A03 = ad0Arr;
        this.A04 = c04991Ye;
        this.A05 = list;
        this.A06 = z;
        int iMax = 0;
        for (Ad0 ad0 : ad0Arr) {
            iMax = Math.max(iMax, ad0.A09);
        }
        this.A01 = iMax;
        int i3 = iMax + i2;
        this.A02 = i3 < 0 ? 0 : i3;
    }
}
