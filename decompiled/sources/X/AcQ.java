package X;

/* loaded from: classes4.dex */
public abstract class AcQ {
    public static final InterfaceC04981Yd A01 = new BST(3);
    public static final InterfaceC04981Yd A00 = new BST(2);
    public static final InterfaceC1185Ado A06 = new C1149AcW();
    public static final InterfaceC1185Ado A05 = new BHh();
    public static final C02i A02 = new AcR();
    public static final C02i A04 = new AcT();
    public static final C02i A03 = new AcS();

    public static final void A03(int[] iArr, int[] iArr2, int i, boolean z) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = (i - i3) / 2.0f;
        if (z) {
            for (int i5 = length - 1; -1 < i5; i5--) {
                int i6 = iArr[i5];
                iArr2[i5] = Math.round(f);
                f += i6;
            }
            return;
        }
        int i7 = 0;
        while (i2 < length) {
            int i8 = iArr[i2];
            iArr2[i7] = Math.round(f);
            f += i8;
            i2++;
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(int[] r8, int[] r9, int r10, boolean r11) {
        /*
            int r5 = r8.length
            if (r5 == 0) goto L46
            r7 = 0
            r1 = 0
            r2 = 0
        L6:
            r0 = r8[r1]
            int r2 = r2 + r0
            int r1 = r1 + 1
            if (r1 < r5) goto L6
            int r0 = r5 + (-1)
            r1 = 1
            int r0 = java.lang.Math.max(r0, r1)
            int r10 = r10 - r2
            float r6 = (float) r10
            float r0 = (float) r0
            float r6 = r6 / r0
            if (r11 == 0) goto L1d
            r4 = r6
            if (r5 == r1) goto L21
        L1d:
            r4 = 0
            r3 = 0
            if (r11 == 0) goto L33
        L21:
            int r5 = r5 - r1
        L22:
            r0 = -1
            if (r0 >= r5) goto L46
            r1 = r8[r5]
            int r0 = java.lang.Math.round(r4)
            r9[r5] = r0
            float r0 = (float) r1
            float r0 = r0 + r6
            float r4 = r4 + r0
            int r5 = r5 + (-1)
            goto L22
        L33:
            r2 = r8[r7]
            int r1 = r3 + 1
            int r0 = java.lang.Math.round(r4)
            r9[r3] = r0
            float r0 = (float) r2
            float r0 = r0 + r6
            float r4 = r4 + r0
            int r7 = r7 + 1
            r3 = r1
            if (r7 >= r5) goto L46
            goto L33
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AcQ.A04(int[], int[], int, boolean):void");
    }

    public static final void A05(int[] iArr, int[] iArr2, int i, boolean z) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = (i - i3) / (length + 1);
        float f2 = f;
        if (z) {
            for (int i5 = length - 1; -1 < i5; i5--) {
                int i6 = iArr[i5];
                iArr2[i5] = Math.round(f2);
                f2 += i6 + f;
            }
            return;
        }
        float f3 = f;
        int i7 = 0;
        while (i2 < length) {
            int i8 = iArr[i2];
            iArr2[i7] = Math.round(f3);
            f3 += i8 + f;
            i2++;
            i7++;
        }
    }

    public static final C9m9 A00(float f) {
        return new C9m9(new C9mA() { // from class: X.AYg
            @Override // X.C9mA
            public final int A4B(EnumC1820Arj enumC1820Arj, int i) {
                return C2VU.A02.A4E(enumC1820Arj, 0, i);
            }
        }, f, true);
    }

    public static final C9m9 A01(final C3TH c3th, float f) {
        return new C9m9(new C9mA() { // from class: X.AcU
            @Override // X.C9mA
            public final int A4B(EnumC1820Arj enumC1820Arj, int i) {
                return c3th.A4E(enumC1820Arj, 0, i);
            }
        }, f, true);
    }

    public static final C9m9 A02(final C1AC c1ac, float f) {
        return new C9m9(new C9mA() { // from class: X.AcV
            @Override // X.C9mA
            public final int A4B(EnumC1820Arj enumC1820Arj, int i) {
                return c1ac.A4A(0, i);
            }
        }, f, false);
    }
}
