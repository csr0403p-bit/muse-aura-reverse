package X;

import java.util.List;

/* renamed from: X.AdL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1166AdL {
    public final int A00;
    public final int A01;
    public final AdA A02;
    public final C04991Ye A03;
    public final AdM A04;
    public final boolean A05;
    public final /* synthetic */ C04991Ye A06;
    public final /* synthetic */ boolean A07;

    public final AdN A01(int i) {
        C1184Adn c1184AdnA03 = this.A04.A03(i);
        List<C1VW> list = c1184AdnA03.A01;
        int size = list.size();
        int i2 = (size == 0 || c1184AdnA03.A00 + size == this.A00) ? 0 : this.A01;
        Ad0[] ad0Arr = new Ad0[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = (int) list.get(i4).A00;
            Ad0 ad0A02 = this.A02.A02(c1184AdnA03.A00 + i4, i3, i5, i2, A00(i3, i5));
            i3 += i5;
            ad0Arr[i4] = ad0A02;
        }
        return new AdN(this.A06, list, ad0Arr, i, i2, this.A07);
    }

    public C1166AdL(AdA adA, C04991Ye c04991Ye, AdM adM, int i, int i2, boolean z) {
        this.A07 = z;
        this.A06 = c04991Ye;
        this.A05 = z;
        this.A03 = c04991Ye;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = adA;
        this.A04 = adM;
    }

    public final long A00(int i, int i2) {
        int i3;
        C04991Ye c04991Ye = this.A03;
        if (i2 == 1) {
            i3 = c04991Ye.A01[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr = c04991Ye.A00;
            i3 = (iArr[i4] + c04991Ye.A01[i4]) - iArr[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        return this.A05 ? AYL.A06(i3, i3, 0, Integer.MAX_VALUE) : AYL.A06(0, Integer.MAX_VALUE, i3, i3);
    }
}
