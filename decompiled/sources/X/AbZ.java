package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class AbZ implements AbM {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final Object A06;
    public final List<AZE> A07;
    public final boolean A08;
    public final boolean A09;
    public final int[] A0A;
    public final C3TH A0B;
    public final C1AC A0C;
    public final EnumC1820Arj A0D;

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(int r6) {
        /*
            r5 = this;
            int r0 = r5.A01
            int r0 = r0 + r6
            r5.A01 = r0
            int[] r4 = r5.A0A
            int r3 = r4.length
            r2 = 0
        L9:
            if (r2 >= r3) goto L21
            boolean r0 = r5.A08
            if (r0 == 0) goto L17
            int r1 = r2 % 2
            r0 = 1
            if (r1 == r0) goto L1b
        L14:
            int r2 = r2 + 1
            goto L9
        L17:
            int r0 = r2 % 2
            if (r0 != 0) goto L14
        L1b:
            r0 = r4[r2]
            int r0 = r0 + r6
            r4[r2] = r0
            goto L14
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbZ.A00(int):void");
    }

    public final void A01(int i, int i2, int i3) {
        String str;
        int i4;
        this.A01 = i;
        boolean z = this.A08;
        int i5 = i2;
        if (z) {
            i5 = i3;
        }
        this.A00 = i5;
        List<AZE> list = this.A07;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            AZE aze = list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.A0A;
            if (z) {
                C3TH c3th = this.A0B;
                if (c3th == null) {
                    str = "null horizontalAlignment";
                    throw C60O.A0i(str);
                }
                iArr[i7] = c3th.A4E(this.A0D, aze.A01, i2);
                iArr[i7 + 1] = i;
                i4 = aze.A00;
                i += i4;
            } else {
                iArr[i7] = i;
                int i8 = i7 + 1;
                C1AC c1ac = this.A0C;
                if (c1ac == null) {
                    str = "null verticalAlignment";
                    throw C60O.A0i(str);
                }
                iArr[i8] = c1ac.A4A(aze.A00, i3);
                i4 = aze.A01;
                i += i4;
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (IILjava/util/List<+LX/AZE;>;JLjava/lang/Object;LX/AYu;LX/3TH;LX/1AC;LX/Arj;Z)V */
    public AbZ(EnumC1108AYu enumC1108AYu, C3TH c3th, C1AC c1ac, EnumC1820Arj enumC1820Arj, Object obj, List list, int i, int i2, long j, boolean z) {
        this.A03 = i;
        this.A04 = i2;
        this.A07 = list;
        this.A05 = j;
        this.A06 = obj;
        this.A0B = c3th;
        this.A0C = c1ac;
        this.A0D = enumC1820Arj;
        this.A09 = z;
        this.A08 = AnonymousClass002.A1Z(enumC1108AYu, EnumC1108AYu.A03);
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            AZE aze = (AZE) list.get(i3);
            iMax = Math.max(iMax, !this.A08 ? aze.A00 : aze.A01);
        }
        this.A02 = iMax;
        this.A0A = new int[this.A07.size() * 2];
        this.A00 = Integer.MIN_VALUE;
    }
}
