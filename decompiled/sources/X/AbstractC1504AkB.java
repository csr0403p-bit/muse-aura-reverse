package X;

/* renamed from: X.AkB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1504AkB {
    public static final long A00(AaC aaC, AaC aaC2, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (i == 3) {
            f = aaC.A01;
            f2 = aaC2.A02;
        } else if (i == 4) {
            f = aaC2.A01;
            f2 = aaC.A02;
        } else if (i == 5) {
            f = aaC.A03;
            f2 = aaC2.A00;
        } else {
            if (i != 6) {
                throw C3cG.A0Q("This function should only be used for 2-D focus search");
            }
            f = aaC2.A03;
            f2 = aaC.A00;
        }
        float f7 = f - f2;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        long j = (long) f7;
        if (i == 3 || i == 4) {
            float f8 = aaC.A03;
            f3 = 2.0f;
            f4 = f8 + ((aaC.A00 - f8) / 2.0f);
            f5 = aaC2.A03;
            f6 = aaC2.A00;
        } else {
            float f9 = aaC.A01;
            f3 = 2.0f;
            f4 = f9 + ((aaC.A02 - f9) / 2.0f);
            f5 = aaC2.A01;
            f6 = aaC2.A02;
        }
        long j2 = (long) (f4 - (f5 + ((f6 - f5) / f3)));
        return (13 * j * j) + (j2 * j2);
    }

    public static final C1506AkD A01(C0910AHm<C1506AkD> c0910AHm, AaC aaC, int i) {
        AaC aaCA02;
        if (AnonymousClass002.A1Q(i, 3)) {
            aaCA02 = aaC.A02((aaC.A02 - aaC.A01) + 1.0f, 0.0f);
        } else if (i == 4) {
            aaCA02 = aaC.A02(-((aaC.A02 - aaC.A01) + 1.0f), 0.0f);
        } else if (i == 5) {
            aaCA02 = aaC.A02(0.0f, (aaC.A00 - aaC.A03) + 1.0f);
        } else {
            if (i != 6) {
                throw C3cG.A0Q("This function should only be used for 2-D focus search");
            }
            aaCA02 = aaC.A02(0.0f, -((aaC.A00 - aaC.A03) + 1.0f));
        }
        C1506AkD[] c1506AkDArr = c0910AHm.A01;
        int i2 = c0910AHm.A00;
        C1506AkD c1506AkD = null;
        for (int i3 = 0; i3 < i2; i3++) {
            C1506AkD c1506AkD2 = c1506AkDArr[i3];
            if (AbstractC1485Ajs.A03(c1506AkD2)) {
                AaC aaCA022 = AbstractC1485Ajs.A02(c1506AkD2);
                if (A09(aaCA022, aaCA02, aaC, i)) {
                    c1506AkD = c1506AkD2;
                    aaCA02 = aaCA022;
                }
            }
        }
        return c1506AkD;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AkD;LX/AaC;ILX/G0U<-LX/AkD;Ljava/lang/Boolean;>;)Z */
    public static final boolean A05(C1506AkD c1506AkD, AaC aaC, G0U g0u, int i) {
        if (A04(c1506AkD, aaC, g0u, i)) {
            return true;
        }
        Boolean bool = (Boolean) AbstractC1217Aev.A00(c1506AkD, new C2342BUq(AbstractC1414Aij.A01(c1506AkD).ACD(), c1506AkD, aaC, g0u, i, 1), i);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A07(X.AaC r4, X.AaC r5, int r6) {
        /*
            r0 = 3
            boolean r0 = X.AnonymousClass002.A1Q(r6, r0)
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L26
            r0 = 4
            if (r6 == r0) goto L26
            r0 = 5
            if (r6 == r0) goto L19
            r0 = 6
            if (r6 == r0) goto L19
            java.lang.String r0 = "This function should only be used for 2-D focus search"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        L19:
            float r1 = r4.A02
            float r0 = r5.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L37
            float r1 = r4.A01
            float r0 = r5.A02
            goto L32
        L26:
            float r1 = r4.A00
            float r0 = r5.A03
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L37
            float r1 = r4.A03
            float r0 = r5.A00
        L32:
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L37
            return r3
        L37:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1504AkB.A07(X.AaC, X.AaC, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A08(X.AaC r4, X.AaC r5, int r6) {
        /*
            r0 = 3
            boolean r0 = X.AnonymousClass002.A1Q(r6, r0)
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L20
            float r0 = r5.A02
            float r1 = r4.A02
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L17
            float r0 = r5.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L66
        L17:
            float r1 = r5.A01
            float r0 = r4.A01
        L1b:
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L66
            return r3
        L20:
            r0 = 4
            if (r6 != r0) goto L3a
            float r0 = r5.A01
            float r1 = r4.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L31
            float r0 = r5.A02
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L66
        L31:
            float r1 = r5.A02
            float r0 = r4.A02
        L35:
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L66
            return r3
        L3a:
            r0 = 5
            if (r6 != r0) goto L50
            float r0 = r5.A00
            float r1 = r4.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L4b
            float r0 = r5.A03
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L66
        L4b:
            float r1 = r5.A03
            float r0 = r4.A03
            goto L1b
        L50:
            r0 = 6
            if (r6 != r0) goto L67
            float r0 = r5.A03
            float r1 = r4.A03
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L61
            float r0 = r5.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L66
        L61:
            float r1 = r5.A00
            float r0 = r4.A00
            goto L35
        L66:
            return r2
        L67:
            java.lang.String r0 = "This function should only be used for 2-D focus search"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1504AkB.A08(X.AaC, X.AaC, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0024, code lost:
    
        X.AbstractC1414Aij.A09(r5, r6);
     */
    /* JADX WARN: Incorrect types in method signature: (LX/1Z3;LX/AHm<LX/AkD;>;)V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C0910AHm r8, X.C1Z3 r9) {
        /*
            r7 = 1024(0x400, float:1.435E-42)
            X.Aj8 r9 = (X.AbstractC1439Aj8) r9
            X.Aj8 r6 = r9.node
            boolean r0 = r6.isAttached
            if (r0 != 0) goto L14
            java.lang.String r0 = "visitChildren called on an unattached node"
            X.ASP.A01(r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L14:
            r0 = 16
            X.Aj8[] r1 = new X.AbstractC1439Aj8[r0]
            r0 = 0
            X.AHm r5 = X.C0910AHm.A02(r1, r0)
            X.Aj8 r0 = r6.child
            if (r0 == 0) goto L32
            r5.A0G(r0)
        L24:
            int r0 = r5.A00
            if (r0 == 0) goto L96
            r4 = 1
            X.Aj8 r6 = X.C0910AHm.A03(r5, r0)
            int r0 = r6.aggregateChildKindSet
            r0 = r0 & r7
            if (r0 != 0) goto L38
        L32:
            X.AbstractC1414Aij.A09(r5, r6)
            goto L24
        L36:
            if (r6 == 0) goto L24
        L38:
            int r0 = r6.kindSet
            r0 = r0 & r7
            if (r0 == 0) goto L93
            r3 = 0
        L3e:
            boolean r0 = r6 instanceof X.C1506AkD
            if (r0 == 0) goto L66
            X.AkD r6 = (X.C1506AkD) r6
            boolean r0 = r6.isAttached
            if (r0 == 0) goto L5b
            X.AjM r0 = X.AbstractC1414Aij.A04(r6)
            boolean r0 = r0.A0R
            if (r0 != 0) goto L5b
            X.AkT r0 = r6.A02()
            boolean r0 = r0.A0B
            if (r0 == 0) goto L62
            r8.A0G(r6)
        L5b:
            X.Aj8 r6 = X.AbstractC1414Aij.A00(r3)
        L5f:
            if (r6 == 0) goto L24
            goto L3e
        L62:
            A03(r8, r6)
            goto L5b
        L66:
            int r0 = r6.kindSet
            r0 = r0 & r7
            if (r0 == 0) goto L5b
            boolean r0 = r6 instanceof X.AbstractC1437Aj6
            if (r0 == 0) goto L5b
            r0 = r6
            X.Aj6 r0 = (X.AbstractC1437Aj6) r0
            X.Aj8 r2 = r0.A00
            r1 = 0
        L75:
            if (r2 == 0) goto L90
            int r0 = r2.kindSet
            r0 = r0 & r7
            if (r0 == 0) goto L81
            int r1 = r1 + 1
            if (r1 != r4) goto L84
            r6 = r2
        L81:
            X.Aj8 r2 = r2.child
            goto L75
        L84:
            X.AHm r3 = X.C8j4.A0W(r3)
            X.Aj8 r6 = X.C8j4.A0X(r3, r6)
            r3.A0G(r2)
            goto L81
        L90:
            if (r1 != r4) goto L5b
            goto L5f
        L93:
            X.Aj8 r6 = r6.child
            goto L36
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1504AkB.A03(X.AHm, X.1Z3):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0026, code lost:
    
        X.AbstractC1414Aij.A09(r7, r8);
     */
    /* JADX WARN: Incorrect types in method signature: (LX/AkD;LX/AaC;ILX/G0U<-LX/AkD;Ljava/lang/Boolean;>;)Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A04(X.C1506AkD r10, X.AaC r11, X.G0U r12, int r13) {
        /*
            r0 = 16
            X.AkD[] r0 = new X.C1506AkD[r0]
            r4 = 0
            X.AHm r3 = X.C0910AHm.A02(r0, r4)
            r9 = 1024(0x400, float:1.435E-42)
            X.Aj8 r8 = r10.node
            boolean r0 = r8.isAttached
            if (r0 != 0) goto L1b
            java.lang.String r0 = "visitChildren called on an unattached node"
            X.ASP.A01(r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L1b:
            X.AHm r7 = X.C0910AHm.A00()
            X.Aj8 r0 = r8.child
            if (r0 == 0) goto L34
            r7.A0G(r0)
        L26:
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L85
            X.Aj8 r8 = X.C0910AHm.A03(r7, r0)
            int r0 = r8.aggregateChildKindSet
            r0 = r0 & r9
            if (r0 != 0) goto L3a
        L34:
            X.AbstractC1414Aij.A09(r7, r8)
            goto L26
        L38:
            if (r8 == 0) goto L26
        L3a:
            int r0 = r8.kindSet
            r0 = r0 & r9
            if (r0 == 0) goto L7f
            r6 = 0
        L40:
            boolean r0 = r8 instanceof X.C1506AkD
            if (r0 == 0) goto L52
            boolean r0 = r8.isAttached
            if (r0 == 0) goto L4b
            r3.A0G(r8)
        L4b:
            X.Aj8 r8 = X.AbstractC1414Aij.A00(r6)
        L4f:
            if (r8 == 0) goto L26
            goto L40
        L52:
            int r0 = r8.kindSet
            r0 = r0 & r9
            if (r0 == 0) goto L4b
            boolean r0 = r8 instanceof X.AbstractC1437Aj6
            if (r0 == 0) goto L4b
            r0 = r8
            X.Aj6 r0 = (X.AbstractC1437Aj6) r0
            X.Aj8 r2 = r0.A00
            r1 = 0
        L61:
            if (r2 == 0) goto L7c
            int r0 = r2.kindSet
            r0 = r0 & r9
            if (r0 == 0) goto L6d
            int r1 = r1 + 1
            if (r1 != r5) goto L70
            r8 = r2
        L6d:
            X.Aj8 r2 = r2.child
            goto L61
        L70:
            X.AHm r6 = X.C8j4.A0W(r6)
            X.Aj8 r8 = X.C8j4.A0X(r6, r8)
            r6.A0G(r2)
            goto L6d
        L7c:
            if (r1 != r5) goto L4b
            goto L4f
        L7f:
            X.Aj8 r8 = r8.child
            goto L38
        L82:
            r3.A0I(r1)
        L85:
            int r0 = r3.A00
            if (r0 == 0) goto L9b
            X.AkD r1 = A01(r3, r11, r13)
            if (r1 == 0) goto L9b
            X.AkT r0 = r1.A02()
            boolean r0 = r0.A0B
            if (r0 == 0) goto L9c
            boolean r4 = X.AnonymousClass003.A1X(r1, r12)
        L9b:
            return r4
        L9c:
            boolean r0 = A05(r1, r11, r12, r13)
            if (r0 == 0) goto L82
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1504AkB.A04(X.AkD, X.AaC, X.G0U, int):boolean");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AkD;ILX/G0U<-LX/AkD;Ljava/lang/Boolean;>;)Z */
    public static final boolean A06(C1506AkD c1506AkD, G0U g0u, int i) {
        float f;
        float f2;
        Object objA01;
        C0910AHm c0910AHmA02 = C0910AHm.A02(new C1506AkD[16], 0);
        A03(c0910AHmA02, c1506AkD);
        int i2 = c0910AHmA02.A00;
        if (i2 > 1) {
            if (i == 7) {
                i = 4;
            } else {
                if (i != 4 && i != 6) {
                    if (i != 3 && i != 5) {
                        throw C3cG.A0Q("This function should only be used for 2-D focus search");
                    }
                    AaC aaCA02 = AbstractC1485Ajs.A02(c1506AkD);
                    f = aaCA02.A02;
                    f2 = aaCA02.A00;
                }
                objA01 = A01(c0910AHmA02, new AaC(f, f2, f, f2), i);
            }
            AaC aaCA022 = AbstractC1485Ajs.A02(c1506AkD);
            f = aaCA022.A01;
            f2 = aaCA022.A03;
            objA01 = A01(c0910AHmA02, new AaC(f, f2, f, f2), i);
        } else {
            if (i2 == 0) {
                return false;
            }
            objA01 = c0910AHmA02.A01[0];
        }
        if (objA01 != null) {
            return AnonymousClass003.A1X(objA01, g0u);
        }
        return false;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AkD;ILX/AaC;LX/G0U<-LX/AkD;Ljava/lang/Boolean;>;)Ljava/lang/Boolean; */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Boolean A02(X.C1506AkD r6, X.AaC r7, X.G0U r8, int r9) {
        /*
            int r0 = X.C1506AkD.A00(r6)
            r5 = 3
            r4 = 0
            r1 = 1
            if (r0 == r1) goto L28
            if (r0 == r4) goto L23
            if (r0 != r5) goto L6d
            X.AkT r0 = r6.A02()
            boolean r0 = r0.A0B
            if (r0 == 0) goto L1c
            java.lang.Object r1 = r8.invoke(r6)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        L1b:
            return r1
        L1c:
            if (r7 == 0) goto L23
            boolean r0 = A04(r6, r7, r8, r9)
            goto L68
        L23:
            boolean r0 = A06(r6, r8, r9)
            goto L68
        L28:
            X.AkD r3 = X.AbstractC1485Ajs.A01(r6)
            java.lang.String r2 = "ActiveParent must have a focusedChild"
            if (r3 == 0) goto L83
            int r0 = X.C1506AkD.A00(r3)
            if (r0 == r1) goto L46
            if (r0 == r4) goto L3f
            if (r0 == r5) goto L72
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L3f:
            if (r7 != 0) goto L64
            X.AaC r7 = X.AbstractC1485Ajs.A02(r3)
            goto L64
        L46:
            java.lang.Boolean r1 = A02(r3, r7, r8, r9)
            boolean r0 = X.AnonymousClass002.A1b(r1, r4)
            if (r0 == 0) goto L1b
            if (r7 != 0) goto L64
            X.AjC r1 = r3.A03()
            X.AjC r0 = X.EnumC1443AjC.A03
            if (r1 != r0) goto L7c
            X.AkD r0 = X.AbstractC1485Ajs.A00(r3)
            if (r0 == 0) goto L77
            X.AaC r7 = X.AbstractC1485Ajs.A02(r0)
        L64:
            boolean r0 = A05(r6, r7, r8, r9)
        L68:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        L6d:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L72:
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r2)
            throw r0
        L77:
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r2)
            throw r0
        L7c:
            java.lang.String r0 = "Searching for active node in inactive hierarchy"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        L83:
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1504AkB.A02(X.AkD, X.AaC, X.G0U, int):java.lang.Boolean");
    }

    public static final boolean A09(AaC aaC, AaC aaC2, AaC aaC3, int i) {
        return A08(aaC, aaC3, i) && (!A08(aaC2, aaC3, i) || A0A(aaC3, aaC, aaC2, i) || (!A0A(aaC3, aaC2, aaC, i) && A00(aaC3, aaC, i) < A00(aaC3, aaC2, i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0A(X.AaC r6, X.AaC r7, X.AaC r8, int r9) {
        /*
            boolean r0 = A07(r8, r6, r9)
            r5 = 0
            if (r0 != 0) goto L72
            boolean r0 = A07(r7, r6, r9)
            if (r0 == 0) goto L72
            r0 = 3
            r2 = 3
            if (r9 != r0) goto L4d
            float r1 = r6.A01
            float r0 = r8.A02
        L15:
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L69
        L19:
            r0 = 1
        L1a:
            r4 = 1
            if (r0 == 0) goto L42
            if (r9 == r2) goto L42
            r0 = 4
            if (r9 == r0) goto L42
            r1 = 5
            if (r9 != r1) goto L48
            float r3 = r6.A03
            float r0 = r7.A00
        L29:
            float r3 = r3 - r0
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L30
            r3 = 0
        L30:
            if (r9 != r1) goto L43
            float r2 = r6.A03
            float r0 = r8.A03
        L36:
            float r2 = r2 - r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L3e
            r1 = r2
        L3e:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L72
        L42:
            return r4
        L43:
            float r2 = r8.A00
            float r0 = r6.A00
            goto L36
        L48:
            float r3 = r7.A03
            float r0 = r6.A00
            goto L29
        L4d:
            r0 = 4
            if (r9 != r0) goto L59
            float r1 = r6.A02
            float r0 = r8.A01
        L54:
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L69
            goto L19
        L59:
            r0 = 5
            if (r9 != r0) goto L61
            float r1 = r6.A03
            float r0 = r8.A00
            goto L15
        L61:
            r0 = 6
            if (r9 != r0) goto L6b
            float r1 = r6.A00
            float r0 = r8.A03
            goto L54
        L69:
            r0 = 0
            goto L1a
        L6b:
            java.lang.String r0 = "This function should only be used for 2-D focus search"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        L72:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1504AkB.A0A(X.AaC, X.AaC, X.AaC, int):boolean");
    }
}
