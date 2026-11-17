package X;

/* loaded from: classes4.dex */
public abstract class AZ1 {
    public static final C1133Abh A00;
    public static final C1088AXy A01;

    static {
        C1088AXy c1088AXy = new C1088AXy();
        A01 = c1088AXy;
        C0881AGi c0881AGi = C0881AGi.A00;
        A00 = new C1133Abh(EnumC1108AYu.A02, AnonymousClass105.A00, null, null, new BSX(3), c1088AXy, c0881AGi, c0881AGi, c0881AGi, Hxb.A02(C6ys.A00), 0.0f, 0, 0, 0, 0, 0, 0, 0, AYL.A06(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE), false, false, false);
    }

    public static final long A00(AZ2 az2, int i) {
        C1133Abh c1133Abh = (C1133Abh) az2;
        int i2 = c1133Abh.A05;
        int i3 = c1133Abh.A04;
        int i4 = -c1133Abh.A07;
        long j = (((i * (i2 + i3)) + i4) + c1133Abh.A01) - i2;
        EnumC1108AYu enumC1108AYu = c1133Abh.A09;
        EnumC1108AYu enumC1108AYu2 = EnumC1108AYu.A02;
        InterfaceC1134Abi interfaceC1134Abi = c1133Abh.A0D;
        int iA0E = (int) C8j5.A0E(C8j3.A0T(interfaceC1134Abi.getWidth(), interfaceC1134Abi.getHeight()), enumC1108AYu, enumC1108AYu2);
        long jA04 = j - (iA0E - ATD.A04(c1133Abh.A0A.AY9(iA0E, i3, i4, r5), 0, iA0E));
        if (jA04 < 0) {
            return 0L;
        }
        return jA04;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C9kj A01(X.BFM r8, kotlin.jvm.functions.Function0 r9, int r10, int r11, int r12) {
        /*
            r0 = r12 & 1
            r4 = 0
            if (r0 == 0) goto L6
            r10 = 0
        L6:
            r7 = 0
            java.lang.Object[] r3 = new java.lang.Object[r4]
            X.AFs<X.9kj, ?> r2 = X.C9kj.A01
            r0 = r11 & 14
            r0 = r0 ^ 6
            r1 = 4
            r6 = 1
            if (r0 <= r1) goto L19
            boolean r0 = r8.A63(r10)
            if (r0 != 0) goto L1e
        L19:
            r0 = r11 & 6
            r5 = 0
            if (r0 != r1) goto L1f
        L1e:
            r5 = 1
        L1f:
            boolean r0 = r8.A62(r7)
            boolean r0 = X.C8j3.A1S(r0)
            r5 = r5 | r0
            r0 = r11 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r1 = 256(0x100, float:3.59E-43)
            if (r0 <= r1) goto L36
            boolean r0 = r8.A65(r9)
            if (r0 != 0) goto L3b
        L36:
            r0 = r11 & 384(0x180, float:5.38E-43)
            if (r0 == r1) goto L3b
            r6 = 0
        L3b:
            r5 = r5 | r6
            java.lang.Object r1 = r8.AaT()
            if (r5 != 0) goto L46
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L4e
        L46:
            X.BT3 r1 = new X.BT3
            r1.<init>(r9, r10, r4)
            r8.Ai0(r1)
        L4e:
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r1 = X.AFz.A01(r8, r2, r1, r3)
            X.9kj r1 = (X.C9kj) r1
            androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<java.lang.Integer>> r0 = r1.A00
            r0.Af8(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AZ1.A01(X.BFM, kotlin.jvm.functions.Function0, int, int, int):X.9kj");
    }
}
